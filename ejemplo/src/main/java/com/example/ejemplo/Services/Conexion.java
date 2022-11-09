package com.example.ejemplo.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection openDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
            + "database=Northwind;"
            + "user:sa;"
            + "password=12345678;"
            + "loginTimeout=30";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (SQLException E) {
            // TODO: handle exception
            System.out.println("ERROR DE CONEXION xd");
            int x = 1;
        }
        catch(ClassNotFoundException cnfex){
            int x = 1;
        }
        return null;
    }
}