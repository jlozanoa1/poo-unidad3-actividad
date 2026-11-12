package ejercicio3.antes;

public interface GeneradorReporteGordo {
    String generar(String titulo);

    void imprimir(String reporte);

    void enviarPorCorreo(String reporte, String destinatario);
}
