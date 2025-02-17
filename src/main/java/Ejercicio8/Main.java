package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Administrativo admin = new Administrativo(3000.0);
        Tecnico tecnico = new Tecnico(2500.0, 10, 20.0);
        Gerente gerente = new Gerente(5000.0, 15);

        empresa.agregarEmpleado(admin);
        empresa.agregarEmpleado(tecnico);
        empresa.agregarEmpleado(gerente);

        empresa.mostrarEmpleados();
    }
}
