package Ejercicio1;

public class Documental implements Reproducible {
    String nombre;
    String temaDocumental;

    public Documental(String nombre, String temaDocumental) {
        this.nombre = nombre;
        this.temaDocumental = temaDocumental;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo el documental: " + nombre);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando el documental: " + nombre);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo el documental: " + nombre);
    }
}