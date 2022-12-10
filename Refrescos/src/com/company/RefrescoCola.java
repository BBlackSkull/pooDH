package com.company;

public class RefrescoCola extends Refresco{
    String nombre = "Coca";

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void abrir() {
        super.abrir();
    }
}
