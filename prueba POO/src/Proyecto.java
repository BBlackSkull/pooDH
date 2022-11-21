
public abstract class Proyecto {
    private String fechaInicio;
    private String fechaPlanificada;
    private String fechaDeFin;
    private String fechaDeInicioReal;
    private String Status;
    ProjectManager projectManager;
    private int agil;


    public Proyecto(String fechaInicio, String fechaPlanificada, String fechaDeFin,
                    String fechaDeInicioReal, String status, ProjectManager projectManager) {
        this.fechaInicio = fechaInicio;
        this.fechaPlanificada = fechaPlanificada;
        this.fechaDeFin = fechaDeFin;
        this.fechaDeInicioReal = fechaDeInicioReal;
        this.Status = status;
        this.projectManager = projectManager;
    }
    public String proyectoFinalizado(){
        if(true){
            return "si esta finalizado";
        }else{
            return "El proyecto esta en progreso";
        }

    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", fechaPlanificada='" + fechaPlanificada + '\'' +
                ", fechaDeFin='" + fechaDeFin + '\'' +
                ", fechaDeInicioReal='" + fechaDeInicioReal + '\'' +
                ", Status='" + Status + '\'' +
                ", projectManager=" + projectManager +
                '}';
    }

    protected int getAgil() {
        return agil;
    }
}
