package ejercicio1;

public class TecnicoIntegral implements Reparable, Limpiable {
    @Override
    public void repararEquipo(String equipo) {
        System.out.println("Técnico integral reparando " + equipo);
    }

    @Override
    public void limpiarArea(String area) {
        System.out.println("Técnico integral limpiando " + area);
    }
}
