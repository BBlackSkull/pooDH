public class Perro {
    private Boolean enAdopcion;
    private String raza;
    private static int anioNacido;
    private Double peso;
    private Boolean chipeado;
    private Boolean lastimado;
    private String nombre;


    public Perro(Boolean enAdopcion, String raza, int anioNacido, Double peso, Boolean chipeado, String nombre) {
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.anioNacido = anioNacido;
        this.peso = peso;
        this.chipeado = chipeado;
        this.nombre = nombre;


    }
    public void Perro (String nombre, Boolean lastimado){
        this.lastimado= lastimado;
        this.nombre= nombre;

    }

    public Boolean getEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(Boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacido() {
        return anioNacido;
    }

    public void setAnioNacido(int anioNacido) {
        this.anioNacido = anioNacido;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getChipeado() {
        return chipeado;
    }

    public void setChipeado(Boolean chipeado) {
        this.chipeado = chipeado;
    }

    public Boolean getLastimado() {
        return lastimado;
    }

    public void setLastimado(Boolean lastimado) {
        this.lastimado = lastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String esRastreale(){
        if(chipeado){
            return "No se pierde, lo podemos rastrear";
        }else {
            return "no tiene chip, es dificil de encontrar";
        }
    }
    public int consultarEdad(){

        return Perro.anioNacido - 2022;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "enAdopcion=" + enAdopcion +
                ", raza='" + raza + '\'' +
                ", anioNacido=" + anioNacido +
                ", peso=" + peso +
                ", chipeado=" + chipeado +
                ", lastimado=" + lastimado +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
