package ejercicio2;

public class CajeroAutomatico implements Retirable {
    @Override
    public void retirar(double monto) {
        System.out.printf("Cajero entregando $%.2f%n", monto);
    }
}
