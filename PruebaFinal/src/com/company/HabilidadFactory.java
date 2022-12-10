package com.company;

public class HabilidadFactory {
    private static HabilidadFactory instancia;

    public final static String SIMPLES= "S";
    public final static String COMBINADAS= "C";
    public HabilidadFactory(){}



    public static HabilidadFactory obtenerInstancia(){
        if (instancia == null){
            instancia = new HabilidadFactory();
        }
        return instancia;
    }

    public Habilidad crearHabilidad(String codigo, String nombre, String desc){
        switch (codigo){
            case "S":
                return new Simples(nombre,desc);
            case "C":
                return new Combinadas(nombre,desc);

        }
        return null;

    }
}
