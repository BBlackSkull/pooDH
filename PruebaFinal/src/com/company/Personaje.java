package com.company;

import java.util.ArrayList;

public class Personaje {
    private String nombre;

    private ArrayList<Habilidad> habilidades;

    public Personaje(String nombre) {
        this.nombre = nombre;
        habilidades = new ArrayList<>();
    }
    public String mostrarHabilidad(){
        String H = "Habilidad: " + nombre + "\n";
        for(Habilidad h : habilidades) H += h.mostrar();
        return H;
    }
    public void agragarHabilidad(Habilidad habilidad){
        habilidades.add(habilidad);
    }

}
