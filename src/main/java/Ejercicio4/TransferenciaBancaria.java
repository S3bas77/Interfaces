package Ejercicio4;

public class TransferenciaBancaria implements MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con Transferencia Bancaria.");
    }
}
