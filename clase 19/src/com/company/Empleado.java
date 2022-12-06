package com.company;

public abstract class  Empleado {
    private String nombre;
    private String apellido;
    private int legajo;

    abstract double calcularSueldo(int dias);
}
