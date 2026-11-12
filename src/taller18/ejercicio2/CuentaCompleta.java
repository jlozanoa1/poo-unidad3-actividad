package ejercicio2;

public class CuentaCompleta implements Transferible, Retirable, PagadorFacturas {
    private double saldo;

    public CuentaCompleta(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void transferir(String destino, double monto) {
        validar(monto);
        saldo -= monto;
        System.out.printf("Transferido $%.2f a %s. Saldo: $%.2f%n", monto, destino, saldo);
    }

    @Override
    public void retirar(double monto) {
        validar(monto);
        saldo -= monto;
        System.out.printf("Retirado $%.2f. Saldo: $%.2f%n", monto, saldo);
    }

    @Override
    public void pagarFactura(String factura, double monto) {
        validar(monto);
        saldo -= monto;
        System.out.printf("Factura %s pagada ($%.2f). Saldo: $%.2f%n", factura, monto, saldo);
    }

    private void validar(double monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("Monto inválido");
        if (monto > saldo)
            throw new IllegalStateException("Fondos insuficientes");
    }
}
