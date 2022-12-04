import java.security.ProtectionDomain;
import java.util.ArrayList;

public class Carrito {
     Estado e;
    ArrayList<Producto> productos = new ArrayList<Producto>();
    public Carrito(){
         setEstado(new Vacio(this));

    }

    public void setEstado(Estado e) {
        this.e = e;
    }

    public void agregar(Producto p){
        productos.add(p);
        System.out.println("Agregando producto");
        setEstado(new Cargado(this));

    }
    public void cancelar(){
    setEstado(new Vacio(this));


    }
    public void volver(){


        }

    public void pasar(){

    }

    
}
