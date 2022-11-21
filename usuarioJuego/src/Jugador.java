public class Jugador {
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;


    public Jugador(String nombre, String clave, Double puntaje, int nivel) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = puntaje;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", puntaje=" + puntaje +
                ", nivel='" + nivel + '\'';};


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public Double setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public int setNivel() {
        return nivel++;
    }
}
