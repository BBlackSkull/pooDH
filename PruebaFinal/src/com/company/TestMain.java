package com.company;

public class TestMain {
    public static void main(String[] args) {

        Personaje pj = new Personaje("John");
        HabilidadFactory fabrica = HabilidadFactory.obtenerInstancia();
        Habilidad habilidad1 = (Habilidad)fabrica.crearHabilidad(HabilidadFactory.SIMPLES, "saltar","saltar");
        System.out.println(habilidad1.mostrar());
        Habilidad habilidad2 = (Habilidad)fabrica.crearHabilidad(HabilidadFactory.COMBINADAS,"Saltar y disparar","attaque");
        System.out.println(habilidad2.mostrar());
    }
}