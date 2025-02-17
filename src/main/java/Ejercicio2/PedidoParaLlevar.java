package Ejercicio2;

public class PedidoParaLlevar implements Pedido{
    @Override
    public void preparar() {
        System.out.println("preparando pedido para llevar");
    }

    @Override
    public void entregar() {
        System.out.println("entregando pedido");
    }
}
