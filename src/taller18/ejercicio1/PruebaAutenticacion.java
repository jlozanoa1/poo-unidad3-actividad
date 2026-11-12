package ejercicio1;

public class PruebaAutenticacion {
    public static void main(String[] args) {
        AutenticacionLocal local = new AutenticacionLocal();
        local.registrarUsuario("ana", "clave123");

        GestorAutenticacion gestorLocal = new GestorAutenticacion(local);
        gestorLocal.iniciarSesion("ana", "clave123");
        gestorLocal.iniciarSesion("ana", "incorrecta");

        GestorAutenticacion gestorOAuth = new GestorAutenticacion(new AutenticacionOAuth());
        gestorOAuth.iniciarSesion("luis", "token-abc");
        gestorOAuth.iniciarSesion("luis", "xyz");
    }
}
