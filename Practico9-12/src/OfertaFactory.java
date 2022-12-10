public class OfertaFactory {
    private static OfertaFactory instancia;
    public final static String CURSO = "C";

    public final static String PROGRAMA_INTENSIVO = "PI";

    public static OfertaFactory obtenerInstancia(){
        if(instancia==null)
            instancia = new OfertaFactory();
        return instancia;
    }
    public Oferta crearOferta(String codigo, String nombre, String descripcion){

        switch (codigo){
            case "C":
                return new Curso(nombre, descripcion);
            case "PI":
                return new ProgramaIntensivo(nombre, descripcion);


        }
        return null;
    }
}
