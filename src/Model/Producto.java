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
import java.util.ArrayList;

/**
 *
 * @author nicolas
 */

public class Producto {

    // atributos de la clase
    protected int id_producto;
    protected String nombreProducto;
    protected String descripcion;
    protected double precio;
    protected int cantidadStock;
    protected String categoria;
    protected int id_categoria;
    protected int estadoProducto;
    protected String provedor;
    protected int id_provedor;

    /*
     * constructor general con todos los atributos de la clase
     */
    public Producto(int id_producto, String nombreProducto, String descripcion, double precio, int cantidadStock,
            String categoria, int id_categoria, int estadoProducto, String provedor, int id_provedor) {
        this.id_producto = id_producto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.categoria = categoria;
        this.id_categoria = id_categoria;
        this.estadoProducto = estadoProducto;
        this.provedor = provedor;
        this.id_provedor = id_provedor;
    }

    /*
     * Constructor para insertar productos productos a la base de datos,
     * no entra variable id_producto, id_categoria, id_proveedor, ya que estas son
     * autoincremental ingresadas "desde" la db
     * no "hacia" la db.
     */
    public Producto(String nombreProducto, String descripcion, double precio, int cantidadStock, String categoria,
            int estadoProducto, String provedor) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.categoria = categoria;
        this.estadoProducto = estadoProducto;
        this.provedor = provedor;
    }

    public Producto() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public int getEstadoProducto() {
        return estadoProducto;
    }

    public String getProvedor() {
        return provedor;
    }

    public int getId_provedor() {
        return id_provedor;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setEstadoProducto(int estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }

    /*
     * metodo con el que se buscan los productos a través de una consulta sql en la
     * base de datos, se abre una conexion,
     * despues se obtienen los datos de la vista y posteriomente se realiza la
     * consulta, si esta encuentra retorna la lista de productos
     */
    public static ArrayList<Producto> buscarTablaProducto() throws SQLException {

        ArrayList<Producto> tablaProductos = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection conn = null;

        if (!conexion.abrir()) {
            throw new SQLException("No se pudo abrir base de datos");
        }

        conn = conexion.enlace;

        try {

            String consultaSQL = "SELECT * FROM producto ";
            PreparedStatement statement = conn.prepareStatement(consultaSQL);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setId_producto(resultado.getInt("id_producto"));
                producto.setNombreProducto(resultado.getString("nombreProducto"));
                producto.setDescripcion(resultado.getString("descripcion"));
                producto.setPrecio(resultado.getInt("precio"));
                producto.setCantidadStock(resultado.getInt("cantidadStock"));
                producto.setCategoria(resultado.getString("categoria"));
                producto.setEstadoProducto(resultado.getInt("estadoProducto"));
                producto.setProvedor(resultado.getString("provedor"));
                producto.setId_provedor(resultado.getInt("id_provedor"));
                tablaProductos.add(producto);
            }
        } finally {
            conexion.cerrar();
        }
        return tablaProductos;
    }

    /* Insertar producto hacia la base de datos */
    public static boolean insertarProducto(Producto producto) throws SQLException {
        if (producto == null) {
            throw new IllegalArgumentException("El objeto producto no puede ser null");
        }

        Conexion conexion = new Conexion();

        if (!conexion.abrir()) {
            throw new SQLException("Error: conexion no establecida");
        }
        String sql = "INSERT INTO producto nombreProducto,descripcion,precio,cantidadStock,categoria,estadoProducto,proveedor"
                +
                "VALUES = ?,?,?,?,?,?,?";

        try (PreparedStatement stmt = conexion.enlace.prepareStatement(sql)) {
            stmt.setString(1, producto.getNombreProducto());
            stmt.setString(2, producto.getDescripcion());
            stmt.setDouble(3, producto.getPrecio());
            stmt.setInt(4, producto.getCantidadStock());
            stmt.setString(5, producto.getCategoria());
            stmt.setInt(6, producto.getEstadoProducto());
            stmt.setString(7, producto.getProvedor());

            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0;
        } finally {
            conexion.cerrar();
        }
    }

    /* Eliminar producto */
    public static void eliminarProducto(Producto producto) throws SQLException {
        if (producto == null) {
            throw new IllegalArgumentException("Error: producto ingresado no puede ser tipo null");
        }

        Conexion conexion = new Conexion();

        if (conexion.abrir()) {
            String sql = "DELETE FROM producto WHERE id_producto =?";
            try (PreparedStatement stmt = conexion.enlace.prepareStatement(sql)) {
                stmt.setInt(1, producto.getId_producto());
                stmt.executeUpdate();
            } finally {
                conexion.cerrar();
            }
        }
    }

    public static void modificarProductoPorId(Producto vista) throws SQLException {
        // Variable pasada a Integer para poder ser comparad con null
        Integer id = vista.getId_producto();
        Conexion conexion = new Conexion();

        if (id == null || vista == null || id <= 0) {
            throw new IllegalArgumentException("Error, id ingresado no valido");
        }

        if (vista == null) {
            throw new IllegalArgumentException("Error, el producto no puede der null");
        }

        if (!conexion.abrir()) {
            throw new SQLException("Error: no se pudo establecer conexion con la base de datos");
        }
        String sql = "UPDATE producto SET nombreProducto=?, descripcion=?,precio=?,cantidadStock=?,categoria=?,estadoProducto=?,proveedor=? WHERE Id_producto = ?";
        try (PreparedStatement stmt = conexion.enlace.prepareStatement(sql)) {
            stmt.setString(1, vista.getNombreProducto());
            stmt.setString(2, vista.getDescripcion());
            stmt.setDouble(3, vista.getPrecio());
            stmt.setInt(4, vista.getCantidadStock());
            stmt.setString(5, vista.getCategoria());
            stmt.setInt(6, vista.getEstadoProducto());
            stmt.setString(7, vista.getProvedor());
            stmt.setInt(8, vista.getId_producto());
            // Ejecutar la actualizacion
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas == 0) {
                throw new SQLException("Error: no se encontro un producto con el ID especificado");
            }
        } finally {
            conexion.cerrar();
        }
    }

}
