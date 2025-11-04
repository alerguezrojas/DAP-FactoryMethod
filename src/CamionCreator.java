public class CamionCreator extends CreadorEnvio {
    @Override
    protected Transporte crearTransporte() {
        return new Camion();
    }
}
