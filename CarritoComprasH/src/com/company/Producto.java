package com.company;

public class Producto extends ItemCompra {

     private double precio;

     public Producto(String nombre, double precio) {
          super(nombre);
          this.precio = precio;
     }

     @Override
     public double consultarPrecio() {
          return 0;
     }
}
