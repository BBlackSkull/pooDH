package com.company;

public abstract class Cuenta {

    private Double saldo;
    private String numeroCuenta;

    public Cuenta(Double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    /*Cuentas: las cuentas de nuestro banco permiten depositar, extraer efectivo e informar
saldo. Una cuenta tiene un cliente asociado.*/

    public abstract void extraer(Double monto);

    public void depositar(Double monto) {
        this.saldo += monto;
    }
    public Double consularSaldo(){
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}
