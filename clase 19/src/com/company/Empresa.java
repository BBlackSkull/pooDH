package com.company;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;
    private String razonSocial;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }
    public void agregarEmpelado(Empleado empleado ){
        empleados.add(empleado);

    }
    public double calcularTotal(int dias){
        double total = 0;
        for (Empleado empleados:empleados)
            total += empleados.calcularTotal(dias);
        return total;
    }
}
