package ejercicio3;

public class ReporteExcel implements GeneradorReporte {

    @Override
    public String generar(String titulo) {
        return "Excel: " + titulo;
    }
}
