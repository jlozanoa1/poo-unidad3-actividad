package ejercicio1.antes;

public interface ServicioAutenticacionGordo {
    boolean autenticar(String usuario, String credencial);

    void registrarUsuario(String usuario, String password);

    void cambiarPassword(String usuario, String nuevaPassword);
}
