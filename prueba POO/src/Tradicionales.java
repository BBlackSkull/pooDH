public class Tradicionales extends Proyecto {
    private boolean fase;


    public Tradicionales(String fechaInicio, String fechaPlanificada, String fechaDeFin, String fechaDeInicioReal,
                         String status, ProjectManager projectManager, boolean fase) {
        super(fechaInicio, fechaPlanificada, fechaDeFin, fechaDeInicioReal, status, projectManager);
        this.fase = fase;
    }
    public String enFaseDeDisenio(){
        if(true){
            return "esta en fase de disenio";

        }else{
            return "ya salio de fase de disenio";
        }
    }

    public void setFase(boolean fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return super.toString() + "Tradicionales{" +
                "fase='" + fase + '\'' +
                '}';
    }
}
