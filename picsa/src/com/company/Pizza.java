package com.company;

public abstract class Pizza {
    private String nombre;
    private String desc;

    public Pizza(String nombre, String desc) {
        this.nombre = nombre;
        this.desc = desc;
    }

    public abstract double calcularPrecio();

    public String mostrar(){
        return "Precio: " + nombre + " ";
    }
}
