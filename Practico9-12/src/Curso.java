public class Curso extends Oferta{
    private double precioHora;
    private int cargaHoraria;
    private int duracionMeses;


    public Curso(String nombre, String descripcion) {
        super(nombre, descripcion);

    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    @Override
    public double calcularPrecio() {
        return cargaHoraria*duracionMeses*precioHora;
    }

    @Override
    public String mostrar() {
        return super.mostrar() +"Precio: "+ calcularPrecio();
    }
}
