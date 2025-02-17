package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Pedido pedido1 = new PedidoParaLlevar();
        Pedido pedido2 = new PedidoEnMesa();
        Pedido pedido3 = new PedidoDomicilio(new Motorizado());
        Pedido pedido4 = new PedidoDomicilio(new Ciclista());

        restaurante.agregarPedido(pedido1);
        restaurante.agregarPedido(pedido2);
        restaurante.agregarPedido(pedido3);
        restaurante.agregarPedido(pedido4);

        restaurante.procesarPedidos();
    }
}
