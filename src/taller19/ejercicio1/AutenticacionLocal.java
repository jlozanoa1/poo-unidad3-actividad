package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class AutenticacionLocal implements ServicioAutenticacion, Registrable {
    private final Map<String, String> usuarios = new HashMap<>();

    @Override
    public void registrarUsuario(String usuario, String password) {
        usuarios.put(usuario, password);
    }

    @Override
    public boolean autenticar(String usuario, String password) {
        return password != null && password.equals(usuarios.get(usuario));
    }
}
