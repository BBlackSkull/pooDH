package com.company;

import java.util.ArrayList;

public class Pizzeria {
    private String nombre;

    private ArrayList<Pizza> pizzaCatalogo;

    public Pizzeria(String nombre) {

        this.nombre = nombre;

        pizzaCatalogo = new ArrayList<Pizza>();
    }
    public void incorporarPizza(Pizza pizza){
        pizzaCatalogo.add(pizza);
    }
    public String mostrarCatalogo() {
        String catalogo = "nombre: "+nombre+ "n";
    }
}
