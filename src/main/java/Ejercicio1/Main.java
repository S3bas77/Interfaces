package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("REPRODUCCION DE TV");
        Usuario user = new Usuario("Juan");
        Documental doc = new Documental("Nuestro Planeta", "Naturaleza");
        Serie serie = new Serie("La casa de Papel", 29);
        Pelicula peli = new Pelicula("Batman", 120);

        user.agregarAFavoritos(doc);
        user.reproducirContenido(doc);
        doc.detener();
        user.agregarAFavoritos(serie);
        user.agregarAFavoritos(peli);
    }
}