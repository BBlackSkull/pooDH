package com.company;
import java.util.ArrayList;
public class Combinada extends Pizza{

    private ArrayList<Pizza> pizzas;
    public Combinada(String nombre, String desc) {
        super(nombre, desc);
        pizzas = new ArrayList<>();
    }
    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    @Override
    public double calcularPrecio() {
        double masCara = 0.0;
        for (int i = 0; i< this.pizzas.size(); i++){
            if(masCara < pizzas.get(i).calcularPrecio()){
                masCara = pizzas.get(i).calcularPrecio();
            }

        }
        return masCara;
    }

}
