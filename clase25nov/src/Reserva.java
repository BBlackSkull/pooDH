public class Reserva {
    private String codigo;
    private int cantPasajeros;
    private Recorrido recorrido;

    public Reserva(String codigo, int cantPasajeros) {
        this.codigo = codigo;
        this.cantPasajeros = cantPasajeros;
    }

    public double calcularPrecioReserva()
    {
        return 0;
    }
    public double recaudacionTotal()
    {
        return 0;
    }
}
