package com.example.ejemplo.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.ejemplo.Modelos.Empleados;

public class EmpleadosDB {
    Connection _cn;
    public EmpleadosDB(){
        _cn = new Conexion().openDB();
    }

    public List<Empleados> obtenerEmpleados(){
        try {
            Statement stnt = _cn.createStatement();
            String query = "SELECT * FROM Employees";

            List<Empleados> empleados = new ArrayList<>();

            ResultSet result = stnt.executeQuery(query);

            while(result.next()){
                Empleados empleado = new Empleados();{
                    result.getString("Nombre");
                    result.getString("Apellido");
                    result.getString("Titulo");
                    result.getString("ID");
                }

                empleados.add(empleado);
            }
            result.close();
            stnt.close();
            return empleados;
        } catch (Exception e) {
            int x = 1;
        }

        return null;
    }
}
