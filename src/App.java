public class App {
    public static void main(String[] args) throws Exception {
        
        Delfin delfin = new Delfin("Flipper");
        Pulpo pulpo= new Pulpo("Octopus");

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();
    }
}
