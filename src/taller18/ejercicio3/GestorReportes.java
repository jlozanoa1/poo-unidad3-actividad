package ejercicio3;

public class GestorReportes {
    private final GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public String crearReporte(String titulo) {
        String reporte = generador.generar(titulo);
        System.out.println("Reporte generado -> " + reporte);
        return reporte;
    }
}
