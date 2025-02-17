package Ejercicio4;

public class TarjetaCredito implements MetodoPago{
@Override
public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con Tarjeta de Crédito.");
        }
}
