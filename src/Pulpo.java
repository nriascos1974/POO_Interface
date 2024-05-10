import Interface.iAlimentable;
import Interface.iComunicable;

public class Pulpo extends AnimalMarino implements iComunicable, iAlimentable  {

    public Pulpo(String nombre) {
        super(nombre);

    }

    @Override
    void nadar() {
        System.out.println("El "+nombre+" nada moviendo los tentaculos");
    }

    @Override
    public void comunicarse() {
        System.out.println("El "+nombre+" se comuica lanzando tinta azul");
 
    }
    
    @Override
    public void alimentar() {
        System.out.println("El "+nombre+" se alimenta con algas");
 
    }

}
