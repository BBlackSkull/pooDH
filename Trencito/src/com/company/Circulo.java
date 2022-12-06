package com.company;

public class Circulo implements Figura{

    private double radio;
    private static final double PI = 3.1416;


    @Override
    public double calcularArea() {
        double area;
        area = radio * radio * PI;
        return area;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
}
