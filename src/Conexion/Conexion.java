package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion { 
    public Connection enlace; 
    private String jdbc;
    private String userMysql;
    private String passUserMysql;
    private String db;
    //Atributos necesarios para realizar la conexion de sql 
    
    public Conexion() // constructor 
    {
        this.db = "IntegrApp";
        this.jdbc = "jdbc:mysql://localhost:3306/" + this.db;
        this.userMysql = "root";
        this.passUserMysql = "";
    }
    
    
    
    public boolean abrir() throws SQLException //metodo con el que se abre la conexion 
    {
        this.enlace = DriverManager.getConnection(this.jdbc, this.userMysql, this.passUserMysql);
        return this.enlace != null;
    }
    
    public boolean cerrar() throws SQLException //metodo con el que se cierra la conexion 
    {
        this.enlace.close();
        this.enlace = null;
        return this.enlace == null;
    }
}