public abstract class Motor {

    private int cilindrada;
    private int potencia;
    private String marca;
    private String estado;

    private Mecanico mecanico;

    public Motor(int cilindrada, int potencia, String marca, String estado, Mecanico mecanico) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.marca = marca;
        this.estado = estado;
        this.mecanico = mecanico;

    }

    public boolean reparar(){
        return estado != "GASTADO" && potencia >200;
    }


    @Override
    public String toString() {
        return "Motor{" +
                "cilindrada=" + cilindrada +
                ", potencia=" + potencia +
                ", marca='" + marca + '\'' +
                ", estado='" + estado + '\'' +
                ", mecanico=" + mecanico +
                '}';
    }

    public int getPotencia() {
        return potencia;
    }
}
