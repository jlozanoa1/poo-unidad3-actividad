package ejercicio2.antes;

public class CajeroAutomaticoGordo implements OperacionBancaria {
    @Override
    public void retirar(double monto) {
        System.out.println("Entregando $" + monto);
    }

    // Este cajero solo entrega efectivo
    @Override
    public void transferir(String destino, double monto) {
        throw new UnsupportedOperationException("El cajero no transfiere");
    }

    @Override
    public void pagarFactura(String factura, double monto) {
    } // vacío
}
