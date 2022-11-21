public class ProjectManager {
    private String nombre;
    private String apellido;
    private String legajo;
    private String dni;

    public ProjectManager(String nombre, String apellido, String legajo, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
