package com.example.ejemplo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejemplo.Modelos.Empleados;

import java.util.*;

@RestController
public class EmpleadosController {

    @GetMapping("/empleados/all")
    public List<Empleados> ObtenerTodosEmpleados() {
        return null;
    }
}
