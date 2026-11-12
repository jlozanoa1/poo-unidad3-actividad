package ejercicio2.antes;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocalGordo implements AlmacenamientoGordo {
    private final Map<String, String> disco = new HashMap<>();

    @Override
    public void guardar(String nombre, String contenido) {
        disco.put(nombre, contenido);
    }

    @Override
    public String recuperar(String nombre) {
        return disco.get(nombre);
    }

    // Métodos vacíos: el disco local no los necesita
    @Override
    public void sincronizar() {
    }

    @Override
    public void cambiarPlanDeAlmacenamiento() {
        throw new UnsupportedOperationException("El disco local no tiene planes");
    }
}
