package Ejercicio1;

public class Pelicula implements Reproducible{
    String nombrePelicula;
    int duracion;

    public Pelicula(String nombrePelicula, int duracion){
        this.nombrePelicula=nombrePelicula;
        this.duracion=duracion;
    }
    @Override
    public void reproducir() {
        System.out.println();
    }

    @Override
    public void pausar() {
        System.out.println();
    }

    @Override
    public void detener() {
        System.out.println();
    }
}
