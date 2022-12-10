import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<Oferta> ofertas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertas = new ArrayList<>();
    }
    public  String generarInforme(){
        String datos ="Instituto" + nombre + "\n";
        for (Oferta oferta : ofertas)
            datos+=oferta.mostrar() + "\n";

        return datos;
    }
    public void agregarOferta(Oferta oferta){
        ofertas.add(oferta);
    }
}
