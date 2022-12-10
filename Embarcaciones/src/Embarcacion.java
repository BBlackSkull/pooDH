public abstract class Embarcacion {
    private double precioBase;
    private double precioAdicional;
    private double eslora;
    private int añoFabricante;

    public static final int EMBARCACION_NUEVA = 2020;

    public Embarcacion(double precioBase, double precioAdicional, double eslora, int añoFabricante) {
        this.precioBase = precioBase;
        this.precioAdicional = precioAdicional;
        this.eslora = eslora;
        this.añoFabricante = añoFabricante;
    }

    public abstract double montoAlquiler();
}
