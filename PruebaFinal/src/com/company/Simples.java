package com.company;

public class Simples extends Habilidad {
    private double puntaje;

    public Simples(String nombre, String decripcion) {
        super(nombre, decripcion);
    }

    @Override
    public double calcularPuntos() {
       if (getNombre() == "Disparar"){
           return puntaje + 5;
       }else{
           return puntaje;
       }
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " " + "Puntos: " + calcularPuntos();
    }

}
