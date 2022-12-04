public class Tamagotchi {
    private Estado estado;
    public Tamagotchi(){
        this.setEstado(new Hambre(this));
    }
    public void come(){
        getEstado().come();
    }
    public void toma(){
        getEstado().toma();
    }
    public void mimo(){
    getEstado().mimos();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
