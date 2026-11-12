package ejercicio1.antes;

public class LimpiadorGordo implements Mantenimiento {
    @Override
    public void limpiarArea(String area) {
        System.out.println("Limpiando " + area);
    }

    // Un limpiador no repara equipos
    @Override
    public void repararEquipo(String equipo) {
        throw new UnsupportedOperationException("El limpiador no repara equipos");
    }
}
