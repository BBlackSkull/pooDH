public class Sed {
    Tamagotchi t;
    public Sed(Tamagotchi t){
        this.t = t;
        System.out.println("Esta Sediento");
    }

    public void come() {
        t.come();
    }

    public void toma() {
        t.toma();
    }

    public void mimo() {
        t.mimo();
    }
}
