

public class Nafta extends Motor implements Comparable<Nafta>{

    private boolean encendidoElectrico;
    private String descripcion;
    private int cantValvulas;



    public Nafta(int cilindrada, int potencia, String marca, String estado, Mecanico mecanico,boolean encendidoElectrico, int cantValvulas,
                 String descripcion) {
        super(cilindrada, potencia, marca, estado, mecanico);
        this.encendidoElectrico = encendidoElectrico;
        this.descripcion = descripcion;
        this.cantValvulas = cantValvulas;

    }

    @Override
    public int compareTo(Nafta o) {
        return getPotencia() - o.getPotencia();
    }

    @Override
    public String toString() {
        return super.toString() + "Nafta{" +
                "encendidoElectrico=" + encendidoElectrico +
                ", descripcion='" + descripcion + '\'' +
                ", cantValvulas=" + cantValvulas +
                '}';
    }
}
