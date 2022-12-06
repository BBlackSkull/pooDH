package com.company;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("DH");
        Empleado  empleado;
        EmpleadoContratado contratado;
        EmpleadoFactory empleadoFactory;
        empleadoFactory =EmpleadoFactory.obtenerInstancia();
        contratado = (EmpleadoContratado)empleadoFactory.crearEmpleado(EmpleadoFactory.CONTRATADO);
        contratado.setImporteHora(7);
        empleado = empleadoFactory.crearEmpleado(empleadoFactory.DEPENDENCIA);


        empresa.agregarEmpelado(contratado);
        empresa.agregarEmpelado(empleado);

    }
}