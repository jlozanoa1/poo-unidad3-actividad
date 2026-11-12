package ejercicio3;

public class ReportePDF implements GeneradorReporte, Imprimible {

    @Override
    public String generar(String titulo) {
        return "PDF: " + titulo;
    }

    @Override
    public void imprimir(String reporte) {
        System.out.println("Imprimiendo -> " + reporte);
    }
}
