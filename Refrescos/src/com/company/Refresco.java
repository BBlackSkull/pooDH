package com.company;

public abstract class Refresco {

        private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void abrir(){
        System.out.println("Abriste una refrescante gaseosa de " + getNombre());

    }
}
