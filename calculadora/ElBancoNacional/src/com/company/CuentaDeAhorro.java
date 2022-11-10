package com.company;

public abstract class CuentaDeAhorro extends Cuenta {

    private Double tasaInteres;

    public CuentaDeAhorro(String numeroCliente, Double saldo) {
        super(saldo, numeroCliente);

    }

    @Override
    public void extraer(Double monto) {
        if(getSaldo() > monto){
            setSaldo(getSaldo() - monto);
        }

    }

    @Override
    public void depositar(Double monto) {
        setSaldo(getSaldo() + monto);
    }

    @Override
    public Double consularSaldo() {
        return getSaldo();
    }
    public void cobrarInteres(){
        setSaldo(getSaldo() + (getSaldo() * tasaInteres));
    }

}
