package Ejercicio8;

public class Tecnico implements Empleado {
    private double salarioBase;
    private double horasExtras;
    private double pagoPorHoraExtra;

    public Tecnico(double salarioBase, double horasExtras, double pagoPorHoraExtra) {
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * pagoPorHoraExtra);
    }

    @Override
    public String obtenerCargo() {
        return "Técnico";
    }
}

