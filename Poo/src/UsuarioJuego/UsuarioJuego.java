package UsuarioJuego;

public class UsuarioJuego {
    private String nombre;
    private String clave;

    @Override
    public String toString() {
        return "UsuarioJego{" + "nombre='" + nombre + '\'' + "}" +
                ", clave='" + clave + '\'' +
                ", nivel=" + nivel +
                ", puntaje=" + puntaje +
                '}';
    }
    private Integer nivel;
    private Double puntaje;

    public UsuarioJuego(String Nombre, String clave){
        this.nombre = nombre;
        this.clave= clave;
        this.nivel = 1;
        this.puntaje = 0.0;

    }

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

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }
    public void aumentarPuntaje() {
        puntaje++;
    }
    public void subirNivel() {
        nivel++;
    }
    public void bonus(int valor){
        puntaje = puntaje + (double) valor;
    }
}
