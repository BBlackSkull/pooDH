package com.company;

import java.util.ArrayList;

public class Combinadas extends Habilidad{

    private int multiplicador;
    private ArrayList<Habilidad> habilidades;


    public Combinadas(String nombre, String decripcion) {
        super(nombre, decripcion);
        habilidades= new ArrayList<>();
    }
    public void agregarHabilidad(Habilidad habilidad){
              habilidades.add(habilidad);
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + "Puntos: " + calcularPuntos();
    }

    @Override
    public double calcularPuntos() {
      double puntos = 0;
      for (Habilidad h: habilidades){
          puntos =h.calcularPuntos();
        }
      return puntos;
    }
}
