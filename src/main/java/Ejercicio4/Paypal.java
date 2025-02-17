package Ejercicio4;

public class Paypal implements MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con PayPal.");
    }
}
