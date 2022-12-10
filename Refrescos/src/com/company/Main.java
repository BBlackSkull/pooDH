package com.company;

public class Main {
    public static void main(String[] args) {
        Refresco refresco1 = RefrescoFactory.construir("C");
        refresco1.abrir();
    }
}