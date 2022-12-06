package com.company;

import java.util.ArrayList;

public class Combo extends ItemCompra{

    private double descuento;
    private ArrayList<ItemCompra> items;
    public Combo(String nombre, double descuento) {
        super(nombre);
        items=new ArrayList<>();
        this.descuento=descuento;
    }

    public double calcularDescuento(double total){
        return total*descuento/100;
    }

    @Override
    public double consultarPrecio() {
        double totalCombo= 0.0;
        for(ItemCompra itemCompra: items){
            totalCombo+=itemCompra.consultarPrecio();
        }
        return totalCombo- calcularDescuento(totalCombo);
    }

    public String mostrar(){
    String todos ="";
        for(ItemCompra itemCompra: items){
            todos+=itemCompra.mostrar() + "\n";
        }
        return todos;
    }
    public void agregarItems(ItemCompra item){
        items.add(item);
    }


}
