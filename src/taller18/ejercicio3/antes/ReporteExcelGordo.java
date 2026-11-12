package ejercicio3.antes;

public class ReporteExcelGordo implements GeneradorReporteGordo {

    @Override
    public String generar(String titulo) {
        return "Hoja de cálculo: " + titulo;
    }

    // Un archivo Excel de este sistema no se imprime ni se envía directamente
    @Override
    public void imprimir(String reporte) {
        throw new UnsupportedOperationException("Excel no se imprime desde aquí");
    }

    @Override
    public void enviarPorCorreo(String reporte, String destinatario) {
    }
}
