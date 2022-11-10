package com.company;

public class Cliente {

    private Double numeroDeCliente;
    private String apellido;
    private int dni;
    private int cuit;



    public Cliente(Double numeroDeCliente, String apellido, int dni, int cuit) {
        this.numeroDeCliente = numeroDeCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public Double getNumeroDeCliente() {
        return numeroDeCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroDeCliente=" + numeroDeCliente +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", cuit=" + cuit +
                '}';
    }
}
