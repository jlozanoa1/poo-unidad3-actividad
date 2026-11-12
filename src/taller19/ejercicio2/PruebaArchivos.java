package ejercicio2;

public class PruebaArchivos {
    public static void main(String[] args) {
        GestorArchivos gestorLocal = new GestorArchivos(new AlmacenamientoLocal());
        gestorLocal.guardarArchivo("notas.txt", "Apuntes de POO");
        gestorLocal.mostrarArchivo("notas.txt");
        gestorLocal.mostrarArchivo("otro.txt");

        AlmacenamientoNube nube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(nube);
        gestorNube.guardarArchivo("foto.png", "datos-binarios");
        gestorNube.mostrarArchivo("foto.png");

        // La capacidad extra se usa solo donde existe
        Sincronizable s = nube;
        s.sincronizar();
    }
}
