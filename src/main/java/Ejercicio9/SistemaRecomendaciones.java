package Ejercicio9;

public class SistemaRecomendaciones {
    public static void mostrarRecomendaciones(Recomendable usuario) {
        System.out.println("Recomendaciones:");
        for (Producto p : usuario.obtenerRecomendaciones()) {
            System.out.println(p);
        }
    }
}
