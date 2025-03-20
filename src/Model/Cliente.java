/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nicolas
 */
public class Cliente { //atributos de la clase 
    protected int id_cliente;
    protected String nombreCliente;
    protected String rut;
    protected String estadoCliente;

    public Cliente() {
    }
    
    

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getRut() {
        return rut;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    
    
    
}
