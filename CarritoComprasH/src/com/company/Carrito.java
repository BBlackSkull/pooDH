package com.company;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<ItemCompra> compra;

    public Carrito (){

        compra = new ArrayList<>();
    }
    public void agregarItems(ItemCompra item){
        compra.add(item);
    }
    public double calcularTotal(){
        double total =0;
        for (ItemCompra item : compra){
            total += item.consultarPrecio();
        }
        return total;
    }
    public String mostrarItems(){
        String todos = "";
        for (ItemCompra item : compra){
            todos += item.mostrar() + " precio: " + item.consultarPrecio() + "\n";
        }
        todos+= "Total compra: " + calcularTotal();
        return todos;
    }
}
