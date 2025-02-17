package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan");

        Curso cursoVideo = new CursoVideo();
        Curso cursoPDF = new CursoPDF();
        CursoExamen cursoExamen = new CursoExamen();

        estudiante.inscribirse(cursoVideo);
        estudiante.completarCurso(cursoVideo);

        estudiante.inscribirse(cursoPDF);
        estudiante.completarCurso(cursoPDF);

        estudiante.inscribirse(cursoExamen);
        estudiante.completarCurso(cursoExamen);
        cursoExamen.calificar(85);
    }
}
