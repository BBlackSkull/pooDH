package com.company;

import java.util.ArrayList;

public class Combo extends ItemCompra{

    private double descuento;
    private ArrayList<ItemCompra> item;
    public Combo(String nombre, double descuento) {
        super(nombre);
        item=new ArrayList<>();
        this.descuento=descuento;
    }

    public String mostrar(){
    String todos ="";
        for(ItemCompra itemCompra: item){
            todos+=itemCompra.mostrar() + "\n";
        }
        return todos;
    }
    public void agregarItems(ItemCompra item){

    }

    @Override
    public double consultarPrecio() {
        double totalCombo= 0.0;
        for(ItemCompra itemCompra: item){
            totalCombo+=itemCompra.consultarPrecio();
        }
        return totalCombo;
    }
}
