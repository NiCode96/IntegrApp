/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nicolas
 */
public class Proveedor {
   int id_provedor;
   String nombreProvedor;
   String direccion;
   String telefono;
   int estadoProvedor;

    public Proveedor(int id_provedor, String nombreProvedor, String direccion, String telefono, int estadoProvedor) { //constructor con todos los atributos 
        this.id_provedor = id_provedor;
        this.nombreProvedor = nombreProvedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estadoProvedor = estadoProvedor;
    }

    public Proveedor() {
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
   
   
   
}
