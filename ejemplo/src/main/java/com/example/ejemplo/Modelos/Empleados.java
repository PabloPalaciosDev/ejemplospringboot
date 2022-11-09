package com.example.ejemplo.Modelos;

public class Empleados {
    private String nombre,apellido,titulo;
    private int identificador;
    public Empleados(String nombre, String apellido, String titulo, int identificador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.identificador = identificador;
    }
   
   
   
    public Empleados() {
    }




    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
