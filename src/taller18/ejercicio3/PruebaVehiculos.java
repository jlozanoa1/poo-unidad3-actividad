package ejercicio3;

import java.util.List;

public class PruebaVehiculos {
    public static void main(String[] args) {
        List<Conducible> conducibles = List.of(
                new Bicicleta(), new Camion(5000), new Furgoneta());
        for (Conducible c : conducibles) {
            c.conducir();
        }

        List<TransportadorCarga> flotaCarga = List.of(new Camion(5000), new Furgoneta());
        for (TransportadorCarga t : flotaCarga) {
            t.cargarMercancia(800);
        }
    }
}
