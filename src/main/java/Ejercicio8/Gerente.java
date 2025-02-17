package Ejercicio8;

public class Gerente implements Empleado, Bonificable {
    private double salarioBase;
    private double porcentajeBono;

    public Gerente(double salarioBase, double porcentajeBono) {
        this.salarioBase = salarioBase;
        this.porcentajeBono = porcentajeBono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBono();
    }

    @Override
    public String obtenerCargo() {
        return "Gerente";
    }

    @Override
    public double calcularBono() {
        return salarioBase * porcentajeBono / 100;
    }
}
