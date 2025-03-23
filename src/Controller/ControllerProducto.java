/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Producto;
import VistaController.ProductosView;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ControllerProducto {
    
    private ProductosView view;
    
    
    public boolean insertarProducto(String nombreProducto, String descripcion, double precio, int cantidadStock, String categoria, int estadoProducto, String provedor) throws SQLException {
        
        Producto producto = new Producto(nombreProducto,descripcion,precio,cantidadStock,categoria,estadoProducto,provedor);
        
        try{
            Producto.insertarProducto(producto);
            return true;
        }catch(SQLException e){
            System.err.println("Error al insertar producto en la base de datos: " + e);
            return false;
        }
    }
    
    public boolean modificarProducto(int id,Producto producto) throws SQLException{
        try{
            Producto.modificarProductoPorId(id,producto);
            return true;
        }catch(SQLException e){
            System.err.println("Error al modificar producto: " + e);
            return false;
        }
    }
    
    public boolean eliminarProducto(int id) throws SQLException{
        try{
            Producto.eliminarProducto(id);
            return true;
        }catch(SQLException e){
            System.err.println("Error al eliminar producto: " + e);
            return false;
        }
    }
    
    public void cargarIdCmbModificar(){
        try{
            //obtener los id desde la base de datos
            List<Integer> id_productos = Producto.obtenerIdProductos();
            //Si la lista de id no esta vacia, cargamos los datos al comboBox
            if(!id_productos.isEmpty() && id_productos != null){
                view.getCmbId_modificar().removeAllItems();
                for(Integer id : id_productos){
                    view.getCmbId_modificar().addItem(String.valueOf(id));//Añadir id al comboBox
                }
            }else{
                System.out.println("No se encontraron los id");
            }
        }catch(SQLException e){
            System.out.println("Error: No se pudo cargar el id de los productos: " + e);
            //Identificar en que parte del programa ocurrio la exception
            e.printStackTrace();
        }
    }
    
    public void cargarIdCmbEliminar(){
        try{
            //Obtener los id desde la base de datos
            List<Integer> id_productos = Producto.obtenerIdProductos();
            //Si la lista de id no esta vacia, cargamos los datos al comboBox
            if(!id_productos.isEmpty() && id_productos != null){
                view.getCmbId_eliminar().removeAllItems();
                for(Integer id : id_productos){
                    view.getCmbId_eliminar().addItem(String.valueOf(id));
                }
            }else{
                System.out.println("No se encontraron los id");
            }
        }catch(SQLException e){
            System.out.println("Error: No se pudo cargar el id de los productos: " + e);
            //Identificar en que parte del programa ocurrio la exception
            e.printStackTrace();
        }
    }
    
    //Metodo para buscar un producto por su id y llenar tabla en apartado "eliminar producto"
    public static List<Producto> tablaEliminar(int id){
        try{
            return Producto.buscarTablaProducto(id);
        }catch(SQLException e){
            System.out.println("Error al buscar producto: " + e);
            return null;
        }
    }
}
