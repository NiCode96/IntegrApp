/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author nicolas
 */
public class Venta {
    ArrayList <String> productosVendidos = new ArrayList<>();
    protected String cliente;
    protected int fecha;

    public Venta() {
    }

    public Venta(String cliente, int fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public ArrayList<String> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<String> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    public void procesarVenta(){ 
    
    }
    
    public String darFactura(){
        return ""; 
    }
}
