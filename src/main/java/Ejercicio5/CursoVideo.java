package Ejercicio5;

public class CursoVideo implements Curso{
    @Override
    public void iniciar() {
        System.out.println("Reproduciendo video del curso...");
    }

    @Override
    public void completar() {
        System.out.println("Curso en video completado.");
    }
}
