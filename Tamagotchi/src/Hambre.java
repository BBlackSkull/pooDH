public class Hambre {
    Tamagotchi t;
    public Hambre (Tamagotchi t){
        this.t=t;
        System.out.println("estoy Bien");
    }
    public void come(){
        t.setEstado(new Feliz(t));

    }
    public void toma(){
        t.setEstado( new Triste(t));
    }

    public void mimo (){

    }
}
