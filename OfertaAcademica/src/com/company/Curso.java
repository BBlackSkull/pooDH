package com.company;

public class Curso extends OfertaAcademica{


    private int cargaHoraria;

    private int duracion;

    private double precioHora;

    public Curso(String nombre, String descripcion, int cargaHoraria, int duracion, double precioHora) {
        super(nombre, descripcion);
        this.cargaHoraria = cargaHoraria;
        this.duracion = duracion;
        this.precioHora = precioHora;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }


    @Override
    public String mostrar() {
        return null;
    }
}
