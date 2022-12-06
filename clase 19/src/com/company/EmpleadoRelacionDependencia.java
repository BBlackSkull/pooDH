package com.company;

public class EmpleadoRelacionDependencia extends Empleado {
    private double sueldoMensual;
    @Override
    double calcularSueldo(int dias) {
        return sueldoMensual;
    }
}
