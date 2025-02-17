package Ejercicio4;

public class Compra {
    private MetodoPago metodoPago;
    private Facturable factura;
    private double monto;

    public Compra(MetodoPago metodoPago, Facturable factura, double monto) {
        this.metodoPago = metodoPago;
        this.factura = factura;
        this.monto = monto;
    }

    public void realizarCompra() {
        metodoPago.procesarPago(monto);
        factura.generarFactura();
        System.out.println("Compra completada con éxito.");
    }
}