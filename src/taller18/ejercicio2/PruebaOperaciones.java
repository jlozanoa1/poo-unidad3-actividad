package ejercicio2;

public class PruebaOperaciones {
    public static void main(String[] args) {
        CuentaCompleta cuenta = new CuentaCompleta(1000);
        cuenta.retirar(100);
        cuenta.transferir("Luis", 200);
        cuenta.pagarFactura("F-001", 150);

        Retirable cajero = new CajeroAutomatico();
        cajero.retirar(50);

        AppPagos app = new AppPagos();
        app.transferir("Ana", 80);
        app.pagarFactura("F-002", 60);
    }
}
