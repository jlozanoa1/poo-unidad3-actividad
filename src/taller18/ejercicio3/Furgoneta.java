package ejercicio3;

public class Furgoneta implements Conducible, TransportadorCarga {
    @Override
    public void conducir() {
        System.out.println("La furgoneta circula por la ciudad.");
    }

    @Override
    public void cargarMercancia(double kilos) {
        System.out.println("Furgoneta cargada con " + kilos + " kg");
    }
}
