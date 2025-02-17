package Ejercicio7;

public class Alimento implements Producto, Almacenable {
    private double precio;
    private int stock;
    private String fechaCaducidad;

    public Alimento(double precio, int stock, String fechaCaducidad) {
        this.precio = precio;
        this.stock = stock;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public int obtenerStock() {
        return stock;
    }

    @Override
    public void guardarEnBodega() {
        System.out.println("Alimento almacenado en bodega. Fecha de caducidad: " + fechaCaducidad);
    }

    @Override
    public void retirarDeBodega() {
        System.out.println("Alimento retirado de bodega.");
    }
}
