public abstract class CreadorEnvio {
    // Factory Method
    protected abstract Transporte crearTransporte();

    // Lógica común que usa el producto abstracto
    public String planEntrega() {
        Transporte t = crearTransporte();
        return "Plan generado → " + t.entregar();
    }
}
