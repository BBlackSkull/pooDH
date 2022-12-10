package com.company;

public class OfertaAcademicaFactory {

    private OfertaAcademicaFactory instancia;
    private final static String FROTEEND = "FD";
    private final static String BACKEND = "BE";
    private final static String FULLSTACK = "FE";


    public OfertaAcademicaFactory obtenerInstancia() {
        if (instancia == null) {
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }

}
