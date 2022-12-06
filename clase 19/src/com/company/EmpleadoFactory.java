package com.company;

public class EmpleadoFactory {

    private static EmpleadoFactory instancia;

    public final static String CONTRATADO = "C";
    public final static String DEPENDENCIA = "D";
    private EmpleadoFactory(){

    }
    public static EmpleadoFactory obtenerInstancia(){
        if (instancia == null)
            instancia = new EmpleadoFactory();
        return instancia;
    }
    public Empleado crearEmpleado(String codigo){

        Empleado empleado;
        switch (codigo){
                case "C":
                return new EmpleadoContratado();
                case "D":
                    return new EmpleadoRelacionDependencia();

        }
        return null;
    }

}
