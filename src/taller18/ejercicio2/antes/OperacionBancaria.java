package ejercicio2.antes;

public interface OperacionBancaria {
    void transferir(String destino, double monto);

    void retirar(double monto);

    void pagarFactura(String factura, double monto);
}
