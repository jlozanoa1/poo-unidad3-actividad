package ejercicio3;

public class PruebaReportes {
    public static void main(String[] args) {
        ReportePDF pdf = new ReportePDF();
        GestorReportes gestorPdf = new GestorReportes(pdf);
        String reporte = gestorPdf.crearReporte("Ventas de octubre");
        pdf.imprimir(reporte); // solo el PDF es Imprimible

        GestorReportes gestorExcel = new GestorReportes(new ReporteExcel());
        gestorExcel.crearReporte("Inventario");
    }
}
