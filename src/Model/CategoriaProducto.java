/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nicolas
 */
public class CategoriaProducto { // atributos de la clase 
    int id_categoria;
    String nombreCategoria;
    int estadoCategoria;

    public CategoriaProducto() { //constructor vacío
        
    }
    
    

    public int getId_categoria() { 
        return id_categoria;
    } 

    public String getNombreCategoria() { 
        return nombreCategoria;
    }

    public int getEstadoCategoria() {
        return estadoCategoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setEstadoCategoria(int estadoCategoria) {
        this.estadoCategoria = estadoCategoria;
    }
    
    
    
}
