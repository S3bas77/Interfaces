package Ejercicio8;
import java.util.ArrayList;
import java.util.List;
public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println("Cargo: " + empleado.obtenerCargo() + ", Salario: " + empleado.calcularSalario());
        }
    }
}
