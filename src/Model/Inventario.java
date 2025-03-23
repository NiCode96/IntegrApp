/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Conexion.Conexion;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Inventario {
    
    public static List<Producto> mostrarTodos() throws SQLException{
        
        List<Producto> productos = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection conn = null;
        
        if(!conexion.abrir()){
            throw new SQLException("Error: no se pudo establecer conexion con la base de datos");
        }
        
        conn = conexion.enlace;
        String sql = "SELECT * FROM tbl_productos";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            int id = rs.getInt("id_producto");
            String nombre = rs.getString("nombre_producto");
            String descripcion = rs.getString("descripcion");
            double precio = rs.getDouble("precio");
            int stock = rs.getInt("stock");
            String categoria = rs.getString("categoria");
            String proveedor = rs.getString("proveedor");
            
            //AgregarProductos a la ArrayList;
            productos.add(new Producto(id,nombre,descripcion,precio,stock,categoria,0,proveedor));
            
        }finally{
            conexion.cerrar();
        }
        return productos;
    }
    
    public static List<Producto> mostrarMaxPrecio() throws SQLException{
        
        List<Producto> productos = new ArrayList();
        Conexion conexion = new Conexion();
        Connection conn = null;
        
        if(!conexion.abrir()){
            throw new SQLException("Error: No se pudo establecer conexion con la base de datos");
        }
        
        conn = conexion.enlace;
        String sql = "SELECT * FROM tbl_producto ORDER BY precio DESC";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            int id = rs.getInt("id_producto");
            String nombre = rs.getString("nombre_producto");
            String descripcion = rs.getString("descripcion");
            double precio = rs.getDouble("precio");
            int stock = rs.getInt("stock");
            String categoria = rs.getString("categoria");
            String proveedor = rs.getString("proveedor");
            
            //Agregamos productos a la arrayList
            productos.add(new Producto(id,nombre,descripcion,precio,stock,categoria,0,proveedor));
        }finally{
            conexion.cerrar();
        }
        return productos;
    }
    
    public static List<Producto> mostrarMinPrecio() throws SQLException{
        
        List<Producto> productos = new ArrayList();
        Conexion conexion = new Conexion();
        Connection conn = null;
        
        if(!conexion.abrir()){
            throw new SQLException("Error: No se pudo establecer conexion con la base de datos");
        }
        
        conn = conexion.enlace;
        String sql = "SELECT * FROM tbl_producto ORDER BY precio";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            int id = rs.getInt("id_producto");
            String nombre = rs.getString("nombre_producto");
            String descripcion = rs.getString("descripcion");
            double precio = rs.getDouble("precio");
            int stock = rs.getInt("stock");
            String categoria = rs.getString("categoria");
            String proveedor = rs.getString("proveedor");
            
            //Agregamos productos a la arrayList
            productos.add(new Producto(id,nombre,descripcion,precio,stock,categoria,0,proveedor));
        }finally{
            conexion.cerrar();
        }
        return productos;
    }
    
    public static List<Producto> mostrarMaxStock() throws SQLException{
        
        List<Producto> productos = new ArrayList();
        Conexion conexion = new Conexion();
        Connection conn = null;
        
        if(!conexion.abrir()){
            throw new SQLException("Error: No se pudo establecer conexion con la base de datos");
        }
        
        conn = conexion.enlace;
        String sql = "SELECT * FROM tbl_producto ORDER BY stock DESC";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            int id = rs.getInt("id_producto");
            String nombre = rs.getString("nombre_producto");
            String descripcion = rs.getString("descripcion");
            double precio = rs.getDouble("precio");
            int stock = rs.getInt("stock");
            String categoria = rs.getString("categoria");
            String proveedor = rs.getString("proveedor");
            
            //Agregamos productos a la arrayList
            productos.add(new Producto(id,nombre,descripcion,precio,stock,categoria,0,proveedor));
        }finally{
            conexion.cerrar();
        }
        return productos;
    }
    
    public static List<Producto> mostrarMinStock() throws SQLException{
        
        List<Producto> productos = new ArrayList();
        Conexion conexion = new Conexion();
        Connection conn = null;
        
        if(!conexion.abrir()){
            throw new SQLException("Error: No se pudo establecer conexion con la base de datos");
        }
        
        conn = conexion.enlace;
        String sql = "SELECT * FROM tbl_producto ORDER BY stock";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            int id = rs.getInt("id_producto");
            String nombre = rs.getString("nombre_producto");
            String descripcion = rs.getString("descripcion");
            double precio = rs.getDouble("precio");
            int stock = rs.getInt("stock");
            String categoria = rs.getString("categoria");
            String proveedor = rs.getString("proveedor");
            
            //Agregamos productos a la arrayList
            productos.add(new Producto(id,nombre,descripcion,precio,stock,categoria,0,proveedor));
        }finally{
            conexion.cerrar();
        }
        return productos;
    }
}
