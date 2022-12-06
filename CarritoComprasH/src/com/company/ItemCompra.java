package com.company;

public abstract class ItemCompra {

    public String nombre;

    public ItemCompra(String nombre) {
        this.nombre = nombre;
    }
    public abstract double consultarPrecio();

    public String mostrar() {

        return "nombre: " + nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
