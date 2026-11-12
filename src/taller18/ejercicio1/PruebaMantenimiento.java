package ejercicio1;

import java.util.List;

public class PruebaMantenimiento {
    public static void main(String[] args) {
        // Los clientes dependen solo del rol que necesitan
        List<Reparable> reparadores = List.of(new Tecnico(), new TecnicoIntegral());
        for (Reparable r : reparadores) {
            r.repararEquipo("Aire acondicionado");
        }

        List<Limpiable> limpiadores = List.of(new Limpiador(), new TecnicoIntegral());
        for (Limpiable l : limpiadores) {
            l.limpiarArea("Oficina 3");
        }
    }
}
