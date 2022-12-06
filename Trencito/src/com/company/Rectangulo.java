package com.company;

public class Rectangulo implements Figura{

    private double alto;
    private double largo;
    @Override
    public double calcularArea() {
        double area;
        area = alto * largo;
        return area;
    }

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }
}
