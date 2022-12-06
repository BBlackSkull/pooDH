package com.company;

public class EmpleadoContratado extends Empleado{
    private double importeHora;
    private double retencionImpuesto;

    public double calcularRetencion(double total){
        return total*retencionImpuesto/100;
    }
    @Override
    double calcularSueldo(int dias) {
        double total = dias* importeHora;
        return total-calcularRetencion(total);
    }

    public double getImporteHora() {
        return importeHora;
    }

    public void setImporteHora(double importeHora) {
        this.importeHora = importeHora;
    }

    public double getRetencionImpuesto() {
        return retencionImpuesto;
    }

    public void setRetencionImpuesto(double retencionImpuesto) {
        this.retencionImpuesto = retencionImpuesto;
    }
}
