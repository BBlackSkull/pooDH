package com.company;

public abstract class Habilidad {
    private String nombre;
    private String decripcion;

    public Habilidad(String nombre, String decripcion) {
        this.nombre = nombre;
        this.decripcion = decripcion;
    }

    public abstract double calcularPuntos();

    public String mostrar(){
        return "Habilidad: " + nombre;

    }

    public String getNombre() {
        return nombre;
    }


}
