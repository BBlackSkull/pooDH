package com.company;
import java.util.*;
public class Tren implements Figura {

    private ArrayList<Figura> figuras;

    public Tren() {
        figuras = new ArrayList<Figura>();

    }

    public void addFigura(Figura figura) {
        figuras.add(figura);
    }


    @Override
    public double calcularArea() {
        double area = 0d;
        for (Figura figura : figuras) {
            area += figura.calcularArea();
        }
        return area;
    }

    @Override
    public String toString() {
        return "Area del vagon es: " + calcularArea();
    }
}
