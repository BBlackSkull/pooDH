public class Agil extends Proyecto implements Comparable<Agil> {
    private String cantidadSprints;
    private String cantidadActual;
    private String descripcionTiempoEstimado;


    public Agil(String fechaInicio, String fechaPlanificada, String fechaDeFin, String fechaDeInicioReal, String status, ProjectManager projectManager,
                String cantidadSprints, String cantidadActual, String descripcionTiempoEstimado) {
        super(fechaInicio, fechaPlanificada, fechaDeFin, fechaDeInicioReal, status, projectManager);

        this.cantidadSprints = cantidadSprints;
        this.cantidadActual = cantidadActual;
        this.descripcionTiempoEstimado = descripcionTiempoEstimado;

    }

    @Override
    public String toString() {
        return super.toString() + "Agil{" +
                "cantidadSprints='" + cantidadSprints + '\'' +
                ", cantidadActual='" + cantidadActual + '\'' +
                ", descripcionTiempoEstimado='" + descripcionTiempoEstimado + '\'' +
                '}';
    }

    @Override
    public int compareTo(Agil o) {
        return getAgil() -o.getAgil();
    }
}
