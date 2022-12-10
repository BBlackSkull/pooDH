public class Main {
    public static void main(String[] args) {

        Instituto instituto = new Instituto("DH");

        OfertaFactory fabrica =OfertaFactory.obtenerInstancia();
        Curso curso1 = (Curso)fabrica.crearOferta(OfertaFactory.CURSO, "FrontEnd","Manco");
        curso1.setCargaHoraria(16);
        curso1.setPrecioHora(1000);
        curso1.setDuracionMeses(2);
        instituto.agregarOferta(curso1);
        Curso curso2=(Curso)fabrica.crearOferta(OfertaFactory.CURSO, "BackEnd", "Intermedio");
        curso2.setDuracionMeses(2);
        curso2.setPrecioHora(900);
        curso2.setCargaHoraria(20);
        instituto.agregarOferta(curso2);
        ProgramaIntensivo programa=(ProgramaIntensivo)fabrica.crearOferta(OfertaFactory.PROGRAMA_INTENSIVO,"FullStack", "Avanzado");
        programa.setDescuento(20);
        programa.agregarOferta(curso1);
        programa.agregarOferta(curso2);
        instituto.agregarOferta(programa);
        System.out.println();



    }
}