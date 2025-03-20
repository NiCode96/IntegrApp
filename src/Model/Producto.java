/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Conexion.Conexion;
import java.awt.List;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author nicolas
 */
public class Producto { //atributos de la clase
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

    public Producto(int id_producto, String nombreProducto, String descripcion, double precio, int cantidadStock, String categoria, int id_categoria, int estadoProducto, String provedor, int id_provedor) {
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
    } //constructor general con todos los atributos de la clase 

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

    
    
    public static ArrayList <Producto> buscarTablaProducto() throws SQLException{ //metodo con el que se buscn los productos a través de una consulta sql en la base de datos, se abre una conexion, despues se obtienen los datos de la vista y posteriomente se realiza la consulta, si esta encuentra retorna la lista de productos
    
    ArrayList <Producto> tablaProductos = new ArrayList<>();
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


}
