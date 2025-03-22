/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Producto;
import java.sql.SQLException;

public class ControllerProducto {
    public boolean insertarProducto(String nombreProducto, String descripcion, double precio, int cantidadStock,
            String categoria, int estadoProducto, String provedor) throws SQLException {

        Producto producto = new Producto(nombreProducto, descripcion, precio, cantidadStock, categoria, estadoProducto,
                provedor);

        try {
            Producto.insertarProducto(producto);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar producto en la base de datos: " + e);
            return false;
        }
    }

    public boolean modificarProducto(Producto producto) throws SQLException {
        try {
            Producto.modificarProductoPorId(producto);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al modificar producto: " + e);
            return false;
        }
    }

    public boolean eliminarProducto(Producto producto) throws SQLException {
        try {
            Producto.eliminarProducto(producto);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al eliminar producto: " + e);
            return false;
        }
    }

    public boolean insertarProducto(String nombreProducto, String descripcion, double precio, int cantidadStock,
            String categoria, int estadoProducto, String provedor) throws SQLException {

        Producto producto = new Producto(nombreProducto, descripcion, precio, cantidadStock, categoria, estadoProducto,
                provedor);

        try {
            Producto.insertarProducto(producto);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar producto en la base de datos: " + e);
            return false;
        }
    }

    public boolean modificarProducto(Producto producto) throws SQLException {
        try {
            Producto.modificarProductoPorId(producto);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al modificar producto: " + e);
            return false;
        }
    }

    public boolean eliminarProducto(Producto producto) throws SQLException {
        try {
            Producto.eliminarProducto(producto);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al eliminar producto: " + e);
            return false;
        }
    }
}
