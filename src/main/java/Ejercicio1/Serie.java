package Ejercicio1;

public class Serie implements Reproducible {
    String nombreSerie;
    int numCapitulos;
    public Serie (String nombreSerie, int numCapitulos){
        this.nombreSerie=nombreSerie;
        this.numCapitulos=numCapitulos;
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
