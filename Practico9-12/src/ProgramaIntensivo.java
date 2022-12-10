import java.util.ArrayList;

public class ProgramaIntensivo extends Oferta {

    private double descuento;

    private ArrayList<Oferta> materias;

    public ProgramaIntensivo(String nombre, String descripcion) {

        super(nombre, descripcion);
        materias = new ArrayList<>();
    }

    public double calcularDescuento(double precio){
        return precio*descuento/100;

    }
    @Override
    public double calcularPrecio() {
        double total = 0;
        for(Oferta oferta : materias){
            total += oferta.calcularPrecio();
            return total-calcularDescuento(total);

        }
        return total;
    }

    public void  agregarOferta(Oferta oferta){
        materias.add(oferta);
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + "Precio: " + calcularPrecio();
    }
}
