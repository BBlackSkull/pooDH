package com.company;

public class Producto extends ItemCompra {

     private double precio;

     public Producto(String nombre, double precio) {
          super(nombre);
          this.precio = precio;
     }

     @Override
     public double consultarPrecio() {
          return precio;
     }

     @Override
     public String toString() {
          return "Producto{" + super.getNombre() +
                  "precio=" + precio +  '}';
     }
}
