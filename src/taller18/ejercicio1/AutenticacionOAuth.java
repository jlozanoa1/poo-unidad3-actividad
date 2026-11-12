package ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String token) {
        // Un proveedor externo validaría el token
        return token != null && token.startsWith("token-");
    }
}
