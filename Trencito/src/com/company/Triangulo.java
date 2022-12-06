package com.company;

public class Triangulo implements Figura{

    private double base;
    private double altura;


    @Override
    public double calcularArea() {
        double area;
        area = (base * altura) /2;
        return area;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
