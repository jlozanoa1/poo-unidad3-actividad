package ejercicio1.antes;

public class AutenticacionOAuthGorda implements ServicioAutenticacionGordo {

    @Override
    public boolean autenticar(String usuario, String token) {
        return token.startsWith("token-");
    }

    // OAuth delega las cuentas en un proveedor externo: estos métodos no aplican
    @Override
    public void registrarUsuario(String usuario, String password) {
        throw new UnsupportedOperationException("OAuth no registra usuarios locales");
    }

    @Override
    public void cambiarPassword(String usuario, String nuevaPassword) {
        throw new UnsupportedOperationException("OAuth no gestiona contraseñas");
    }
}
