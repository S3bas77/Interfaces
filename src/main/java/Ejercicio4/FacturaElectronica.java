package Ejercicio4;

public class FacturaElectronica implements Facturable{
    @Override
    public void generarFactura() {
        System.out.println("Factura electrónica generada y enviada por email.");
    }
}
