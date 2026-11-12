package ejercicio2;

public class GestorArchivos {
    private final Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public void mostrarArchivo(String nombre) {
        String contenido = almacenamiento.recuperar(nombre);
        System.out.println(nombre + " -> " + (contenido != null ? contenido : "no encontrado"));
    }
}
