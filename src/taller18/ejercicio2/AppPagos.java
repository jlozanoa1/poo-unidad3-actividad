package ejercicio2;

public class AppPagos implements Transferible, PagadorFacturas {
    @Override
    public void transferir(String destino, double monto) {
        System.out.printf("App: transferencia de $%.2f a %s%n", monto, destino);
    }

    @Override
    public void pagarFactura(String factura, double monto) {
        System.out.printf("App: factura %s pagada por $%.2f%n", factura, monto);
    }
}
