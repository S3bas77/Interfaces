package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos");
        Foto foto = new Foto("Vacaciones en la playa");
        Video video = new Video("Tutorial de programación");
        Articulo articulo = new Articulo("Los mejores hábitos para la productividad");

        usuario.interactuar(foto, "¡Hermosa foto!", "Me gusta");
        usuario.interactuar(video, "Muy útil, gracias!", "Me encanta");
        usuario.interactuar(articulo, "Interesante artículo", "Me gusta");
    }
}