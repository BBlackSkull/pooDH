public class Hambre implements Estado{
    Tamagotchi t;
    public Hambre (Tamagotchi t){
        this.t=t;
        System.out.println("estoy Bien");
    }

    @Override
    public void come() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void toma() {
        t.setEstado((Estado) new Triste(t));
    }

    @Override
    public void mimos() {

    }


}
