/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicolas
 */
public class Proveedor {
   protected int id_provedor;
   protected String nombreProvedor;
   protected String direccion;
   protected String telefono;
   protected int estadoProvedor;

    public Proveedor(int id_provedor, String nombreProvedor, String direccion, String telefono, int estadoProvedor) { //constructor con todos los atributos 
        this.id_provedor = id_provedor;
        this.nombreProvedor = nombreProvedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estadoProvedor = estadoProvedor;
    }

    public Proveedor() {
    }

    public Proveedor(String nombreProvedor, String direccion, String telefono, int estadoProvedor) {
        this.nombreProvedor = nombreProvedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estadoProvedor = estadoProvedor;     
    }

    public Proveedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }
    
   
    public int getId_provedor() {
        return id_provedor;
    }

    public String getNombreProvedor() {
        return nombreProvedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEstadoProvedor() {
        return estadoProvedor;
    }

    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }

    public void setNombreProvedor(String nombreProvedor) {
        this.nombreProvedor = nombreProvedor;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEstadoProvedor(int estadoProvedor) {
        this.estadoProvedor = estadoProvedor;
    }
   
    
     public static boolean insertarProveedor(Proveedor proveedor) throws SQLException{
        if(proveedor == null){
            throw new IllegalArgumentException("El objeto producto no puede ser null");
        }
        
        Conexion conexion = new Conexion();
        
        if(!conexion.abrir()){
            throw new SQLException("Error: conexion no establecida");
        }
        String sql = "INSERT INTO provedor (nombreProvedor,direccion,telefono,estadoProvedor)" + 
                    "VALUES (?,?,?,?)";
            
        try(PreparedStatement stmt = conexion.enlace.prepareStatement(sql)){
            stmt.setString(1,proveedor.getNombreProvedor());
            stmt.setString(2,proveedor.getDireccion());
            stmt.setString(3,proveedor.getTelefono());
            stmt.setInt(4,proveedor.getEstadoProvedor());
                
            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0;
        }finally{
            conexion.cerrar();
        }
    }
     
    public static void modificarProveedor(Proveedor proveedor) throws SQLException{
        if(proveedor == null){
            throw new IllegalArgumentException("Error, proveedor ingresado no puede ser tipo null");
        }
        
        Conexion conexion = new Conexion();
        
        if(conexion.abrir()){
            String sql = "UPDATE provedor Set nombreProvedor=?, direccion = ?, telefono = ?,estadoProvedor = ?"
                    + " WHERE Id_provedor = ?";
            try(PreparedStatement stmt = conexion.enlace.prepareStatement(sql)){
                stmt.setString(1,proveedor.getNombreProvedor());
                stmt.setString(2,proveedor.getDireccion());
                stmt.setString(3,proveedor.getTelefono());
                stmt.setInt(4,proveedor.getEstadoProvedor());
                stmt.setInt(5, proveedor.getId_provedor());
                
                stmt.executeUpdate();
            }finally{
                conexion.cerrar();
            }
        }
    }
    
    public static void eliminarProveedor(int id_provedor) throws SQLException{

        if (id_provedor <= 0) {
            throw new IllegalArgumentException("El proveedor no puede ser nulo o vacío.");
        }

        Conexion conexion = new Conexion();

        if (conexion.abrir()) {
            String sql = "UPDATE provedor SET estadoProvedor = 0 WHERE id_provedor = ?";
            try (PreparedStatement stmt = conexion.enlace.prepareStatement(sql)) {
                stmt.setInt(1, id_provedor);
                stmt.executeUpdate();
            } finally {
                conexion.cerrar();
            }
        }
    }
    
        public static List<Proveedor> obtenerProveedorPorId(int id_provedor) throws SQLException {
        if (id_provedor <= 0) {
            throw new IllegalArgumentException("El proveedor no puede ser nulo o vacío.");
        }

        List<Proveedor> proveedores = new ArrayList<>();
        Conexion conexion = new Conexion();

        if (conexion.abrir()) {
            String sql = "SELECT nombreProvedor, direccion, telefono, estadoProvedor FROM provedor WHERE id_provedor = ?";
            try (PreparedStatement stmt = conexion.enlace.prepareStatement(sql)) {
                stmt.setInt(1, id_provedor);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    String nombre = rs.getString("nombreProvedor");
                    String direccion = rs.getString("direccion");
                    String telefono = rs.getString("telefono");
                    int estadoProvedor = rs.getInt("estadoProvedor");

                    proveedores.add(new Proveedor(id_provedor, nombre, direccion, telefono, estadoProvedor));
                }
            } finally {
                conexion.cerrar();
            }
        }
        return proveedores;
    }
        
        public static List<Proveedor> obtenerId() throws SQLException {
        List<Proveedor> idProveedores = new ArrayList<>();
        Conexion conexion = new Conexion();

        if (conexion.abrir()) {
            String sql = "SELECT id_ provedorFROM pais";
            try (Statement stmt = conexion.enlace.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    int id_provedor = rs.getInt("id_provedor");
                    idProveedores.add(new Proveedor(id_provedor));
                }
            } finally {
                conexion.cerrar();
            }
        }
        return idProveedores;
    }
        public static ArrayList <Proveedor> buscarTablaProveedor() throws SQLException{ 
    
        ArrayList <Proveedor> tablaProv = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection conn = null;
    
        if (!conexion.abrir()) {
            throw new SQLException("No se pudo abrir base de datos");
        } 
                 
        conn = conexion.enlace;
        
        try {
            
            String consultaSQL = "SELECT * FROM provedor ";
            PreparedStatement statement = conn.prepareStatement(consultaSQL);
            ResultSet resultado = statement.executeQuery();
            
            while (resultado.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setId_provedor(resultado.getInt("id_provedor"));
                proveedor.setNombreProvedor(resultado.getString("nombreProvedor"));
                proveedor.setDireccion(resultado.getString("direccion"));
                proveedor.setTelefono(resultado.getString("telefono"));
                proveedor.setEstadoProvedor(resultado.getInt("estadoProvedor"));
                tablaProv.add(proveedor);      
            }
        } finally {
            conexion.cerrar();
        }
    return tablaProv;
    }
   
   
}
