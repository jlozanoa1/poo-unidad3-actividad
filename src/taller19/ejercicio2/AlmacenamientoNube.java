package ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoNube implements Almacenamiento, Sincronizable {
    private final Map<String, String> servidor = new HashMap<>();

    @Override
    public void guardar(String nombre, String contenido) {
        servidor.put(nombre, contenido);
        System.out.println("[Nube] Subido: " + nombre);
    }

    @Override
    public String recuperar(String nombre) {
        return servidor.get(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("[Nube] Sincronizando " + servidor.size() + " archivo(s)...");
    }
}
