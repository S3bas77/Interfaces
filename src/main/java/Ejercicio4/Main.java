package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        MetodoPago pago = new TarjetaCredito();
        Facturable factura = new FacturaElectronica();
        Compra compra = new Compra(pago, factura, 100.50);

        compra.realizarCompra();
    }
}
