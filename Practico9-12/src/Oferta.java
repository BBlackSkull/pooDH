public abstract class Oferta {
    private String nombre;
    private String descripcion;

    public abstract double calcularPrecio();

    public Oferta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String mostrar(){
        return nombre;

    }
}
