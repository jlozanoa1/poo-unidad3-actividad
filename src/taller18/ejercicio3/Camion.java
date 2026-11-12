package ejercicio3;

public class Camion implements Conducible, TransportadorCarga {
    private final double capacidad;

    public Camion(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void conducir() {
        System.out.println("El camión circula por la autopista.");
    }

    @Override
    public void cargarMercancia(double kilos) {
        if (kilos > capacidad) {
            System.out.println("Carga excede la capacidad (" + capacidad + " kg)");
        } else {
            System.out.println("Camión cargado con " + kilos + " kg");
        }
    }
}
