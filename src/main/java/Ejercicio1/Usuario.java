package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    String nombre;
    List<Reproducible> favoritos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.favoritos = new ArrayList<>();
    }

    public void agregarAFavoritos(Reproducible contenido) {
        favoritos.add(contenido);
        System.out.println("Se ha agregado a favoritos.");
        System.out.println(favoritos);
    }

    public void reproducirContenido(Reproducible contenido) {
        contenido.reproducir();
    }
}