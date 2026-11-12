package ejercicio1;

public class GestorAutenticacion {
    private final ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String credencial) {
        if (servicio.autenticar(usuario, credencial)) {
            System.out.println("Bienvenido, " + usuario);
        } else {
            System.out.println("Acceso denegado para " + usuario);
        }
    }
}
