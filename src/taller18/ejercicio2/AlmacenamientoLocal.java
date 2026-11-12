package ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {
    private final Map<String, String> disco = new HashMap<>();

    @Override
    public void guardar(String nombre, String contenido) {
        disco.put(nombre, contenido);
        System.out.println("[Local] Guardado: " + nombre);
    }

    @Override
    public String recuperar(String nombre) {
        return disco.get(nombre);
    }
}
