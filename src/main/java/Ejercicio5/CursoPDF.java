package Ejercicio5;

public class CursoPDF implements Curso {
    @Override
    public void iniciar() {
        System.out.println("Abriendo PDF interactivo...");
    }

    @Override
    public void completar() {
        System.out.println("Curso en PDF completado.");
    }
}
