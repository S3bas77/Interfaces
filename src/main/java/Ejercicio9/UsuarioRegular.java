package Ejercicio9;
import java.util.*;

public class UsuarioRegular implements Recomendable {
    private List<Producto> historialBusqueda;

    public UsuarioRegular(List<Producto> historialBusqueda) {
        this.historialBusqueda = historialBusqueda;
    }

    @Override
    public List<Producto> obtenerRecomendaciones() {
        // Recomendaciones basadas en búsquedas recientes
        List<Producto> recomendaciones = new ArrayList<>();
        for (Producto p : historialBusqueda) {
            recomendaciones.add(new Producto("Alternativa de " + p.getNombre(), p.getCategoria(), p.getPrecio() * 0.9));
        }
        return recomendaciones;
    }
}
