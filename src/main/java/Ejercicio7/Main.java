package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Electronico laptop = new Electronico(1200.0, 10);
        Ropa camisa = new Ropa(25.0, 50);
        Alimento leche = new Alimento(1.5, 30, "2025-06-01");

        inventario.agregarProducto(laptop);
        inventario.agregarProducto(camisa);
        inventario.agregarProducto(leche);

        inventario.mostrarInventario();

        leche.guardarEnBodega();
        leche.retirarDeBodega();
    }
}
