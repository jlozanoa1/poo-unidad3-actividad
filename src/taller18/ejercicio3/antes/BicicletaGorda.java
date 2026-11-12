package ejercicio3.antes;

public class BicicletaGorda implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Pedaleando");
    }

    // Una bicicleta de paseo no transporta mercancías
    @Override
    public void cargarMercancia(double kilos) {
        throw new UnsupportedOperationException("La bicicleta no carga mercancía");
    }
}
