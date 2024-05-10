import Interface.iAlimentable;
import Interface.iComunicable;

public class Delfin extends AnimalMarino implements iComunicable, iAlimentable {

    public Delfin(String nombre){
        super(nombre);
    }

    @Override
    void nadar(){
        System.out.println("El "+nombre+" nada moviendo la cola y saltando");
    }

    @Override
    public void comunicarse() {
        System.out.println("El "+nombre+" se comuica emitiendo chirridos");
 
    }

    @Override
    public void alimentar() {
        System.out.println("El "+nombre+" se alimenta con peces");
 
    }
}
