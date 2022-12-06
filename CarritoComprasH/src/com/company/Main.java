package com.company;

public class Main {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("hamburguesa", 300);
        ItemCompra papas = new Producto("papas fritas", 150);
        Producto gaseosa = new Producto("gaseosa", 80);
        ItemCompra combo1 = new Combo("combo1",10);
        ((Combo)combo1).agregarItems(hamburguesa);
        ((Combo)combo1).agregarItems(papas);
        ((Combo)combo1).agregarItems(hamburguesa);
        ((Combo)combo1).agregarItems(papas);
        ((Combo)combo1).agregarItems(gaseosa);

        Carrito miCompra = new Carrito();
        miCompra.agregarItems(combo1);

        System.out.println(miCompra.mostrarItems());

        System.out.println("Total compra: " + miCompra.calcularTotal());
    }
}