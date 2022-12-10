package com.company;

public class Simple extends Pizza{
    public Simple(String nombre, String desc) {
        super(nombre, desc);
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
