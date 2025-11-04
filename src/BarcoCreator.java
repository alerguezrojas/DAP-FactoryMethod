public class BarcoCreator extends CreadorEnvio {
    @Override
    protected Transporte crearTransporte() {
        return new Barco();
    }
}
