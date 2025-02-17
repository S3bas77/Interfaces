package Ejercicio2;

public class PedidoDomicilio implements Pedido{
    private Repartidor repartidor;

    public PedidoDomicilio(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    @Override
    public void preparar() {

    }

    @Override
    public void entregar() {
        System.out.println("repartidor en camino");
        repartidor.repartir();
    }
}
