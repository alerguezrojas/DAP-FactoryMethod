public class Main {
    public static void main(String[] args) {
        CreadorEnvio envioCarretera = new CamionCreator();
        CreadorEnvio envioMar = new BarcoCreator();

        System.out.println(envioCarretera.planEntrega());
        System.out.println(envioMar.planEntrega());
    }
}
