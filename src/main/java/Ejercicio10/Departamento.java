package Ejercicio10;

public class Departamento implements Reservable {
    private String direccion;
    private String reserva;

    public Departamento(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void reservar(String fecha) {
        this.reserva = fecha;
        System.out.println("Departamento en " + direccion + " reservado para la fecha: " + fecha);
    }

    @Override
    public void cancelarReserva() {
        this.reserva = null;
        System.out.println("Reserva en el departamento de " + direccion + " ha sido cancelada.");
    }
}

