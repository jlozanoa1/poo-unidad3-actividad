package ejercicio1;

public class Limpiador implements Limpiable {
    @Override
    public void limpiarArea(String area) {
        System.out.println("Limpiador limpiando " + area);
    }
}
