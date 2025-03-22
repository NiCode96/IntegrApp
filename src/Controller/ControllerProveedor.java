/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Proveedor;
import Conexion.Conexion;
import VistaController.ProveedorView;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author nicolas
 */
public class ControllerProveedor {
    private ProveedorView vista;

    public ControllerProveedor(ProveedorView vista) {
        this.vista = vista;
    }

    
    public static boolean insertarProveedor(Proveedor proveedor) {
        try {
            Proveedor.insertarProveedor(proveedor);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar el proveedor: " + e.getMessage());
            return false;
        }
    }
    
    public boolean modificarProveedor(Proveedor proveedor) {
        try {
            Proveedor.modificarProveedor(proveedor);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al actualizar el país: " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminarProveedor(int id_provedor) {
        try {
            Proveedor.eliminarProveedor(id_provedor);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al eliminar el proveedor: " + e.getMessage());
            return false;
        }
    }
    
    public List<Proveedor> obtenerProveedorPorId(int id_provedor) {
        try {
            return Proveedor.obtenerProveedorPorId(id_provedor);
        } catch (SQLException e) {
            System.err.println("Error al obtener los proveedores: " + e.getMessage());
            return null;
        }
    }
    
    public List<Proveedor> buscarTablaProveedor() {
        try {
            return Proveedor.buscarTablaProveedor();
        } catch (SQLException e) {
            System.err.println("Error al obtener los proveedores: " + e.getMessage());
            return null;
        }
    }

   
    
    
    
    
}
