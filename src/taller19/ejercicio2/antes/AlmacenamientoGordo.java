package ejercicio2.antes;

public interface AlmacenamientoGordo {
    void guardar(String nombre, String contenido);

    String recuperar(String nombre);

    void sincronizar(); // solo tiene sentido en la nube

    void cambiarPlanDeAlmacenamiento(); // solo tiene sentido en la nube
}
