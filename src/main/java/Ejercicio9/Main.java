package Ejercicio9;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Producto> comprasPremium = Arrays.asList(
                new Producto("Laptop", "Tecnología", 1200.00),
                new Producto("Smartphone", "Tecnología", 800.00)
        );
        UsuarioPremium premium = new UsuarioPremium(comprasPremium);

        List<Producto> busquedasRegular = Arrays.asList(
                new Producto("Zapatillas", "Moda", 50.00),
                new Producto("Camisa", "Moda", 30.00)
        );
        UsuarioRegular regular = new UsuarioRegular(busquedasRegular);

        System.out.println("Usuario Premium:");
        SistemaRecomendaciones.mostrarRecomendaciones(premium);

        System.out.println("\nUsuario Regular:");
        SistemaRecomendaciones.mostrarRecomendaciones(regular);
    }
}