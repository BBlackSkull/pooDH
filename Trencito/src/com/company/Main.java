package com.company;

public class Main {
    public static void main(String[] args) {

        Tren vagon = new Tren();
        Figura rectangulo1 = new Rectangulo(5d, 5d);
        Figura circulo = new Circulo(2d);
        Figura triangulo = new Triangulo(3d,2);

        vagon.addFigura(rectangulo1);
        vagon.addFigura(circulo);
        vagon.addFigura(circulo);
        vagon.calcularArea();
        System.out.println("vagon area: " + vagon);

    }
}