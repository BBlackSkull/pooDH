public class Diesel extends Motor{
    private boolean turbo;
    public Diesel(int cilindrada, int potencia, String marca, String estado, Mecanico mecanico, boolean turbo) {
        super(cilindrada, potencia, marca, estado, mecanico);
        this.turbo = turbo;
    }

    public boolean tieneTurbo(){
        return this.turbo;
    }

    @Override
    public String toString() {
        return super.toString() + "Diesel{" +
                "turbo=" + turbo +
                '}';
    }
}
