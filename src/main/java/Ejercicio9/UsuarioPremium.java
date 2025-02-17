package Ejercicio9;
import java.util.*;
public class UsuarioPremium implements Recomendable {
    private List<Producto> historialCompras;

    public UsuarioPremium(List<Producto> historialCompras) {
        this.historialCompras = historialCompras;
    }

    @Override
    public List<Producto> obtenerRecomendaciones() {
        // Recomendaciones basadas en categoría de compras previas
        Set<String> categoriasFavoritas = new HashSet<>();
        for (Producto p : historialCompras) {
            categoriasFavoritas.add(p.getCategoria());
        }

        List<Producto> recomendaciones = new ArrayList<>();
        for (String categoria : categoriasFavoritas) {
            recomendaciones.add(new Producto("Producto Premium de " + categoria, categoria, 99.99));
        }
        return recomendaciones;
    }
}

