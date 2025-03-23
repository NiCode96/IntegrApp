/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Inventario;
import Model.Producto;
import java.util.List;
import java.sql.SQLException;
/**
 *
 * @author Cakri
 */
public class ControllerInventario {
    
    public static List<Producto> mostrarTodo(){
        try{
            return Inventario.mostrarTodos();
        }catch(SQLException e){
            System.out.println("Error: Productos no cargados en la tabla " + e);
            return null;
        }
    }
    
    public static List<Producto> mostrarMaxPrecios(){
        try{
            return Inventario.mostrarMaxPrecio();
        }catch(SQLException e){
            System.out.println("Error: Productos no cargados en la tabla");
            return null;
        }
    }
    
    public static List<Producto> mostrarMinPrecios(){
        try{
            return Inventario.mostrarMinPrecio();
        }catch(SQLException e){
            System.out.println("Error: Productos no cargados en la tabla");
            return null;
        }
    }
    
    public static List<Producto> mostrarMaxStocks(){
        try{
            return Inventario.mostrarMaxStock();
        }catch(SQLException e){
            System.out.println("Error: Productos no cargados en la tabla");
            return null;
        }
    }
    
    public static List<Producto> mostrarMinStocks(){
        try{
            return Inventario.mostrarMinStock();
        }catch(SQLException e){
            System.out.println("Error: Productos no cargados en la tabla");
            return null;
        }
    }
}
