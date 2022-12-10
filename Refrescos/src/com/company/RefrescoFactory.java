package com.company;

public class RefrescoFactory {
    public final static String REFRESCO_LIMA = "L";
    public final static String REFRESCO_COLA = "C";
    public static Refresco construir(String tipo){

        switch(tipo){
            case "L":
                return new RefrescoLima();
            case "C":
                return new RefrescoCola();
            default:
                System.out.println("Refresco no encontrado");
                return null;
        }
    }
}
