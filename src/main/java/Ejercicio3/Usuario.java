package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void interactuar(Interactuable publicacion, String comentario, String reaccion) {
        publicacion.comentar(comentario);
        publicacion.reaccionar(reaccion);
        publicacion.compartir();
    }
}