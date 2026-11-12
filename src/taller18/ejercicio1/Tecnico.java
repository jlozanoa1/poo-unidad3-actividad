package ejercicio1;

public class Tecnico implements Reparable {
    @Override
    public void repararEquipo(String equipo) {
        System.out.println("Técnico reparando " + equipo);
    }
}
