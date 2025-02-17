package Ejercicio10;

public class CasaVacacional implements Reservable {
    private String ubicacion;
    private String reserva;

    public CasaVacacional(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void reservar(String fecha) {
        this.reserva = fecha;
        System.out.println("Casa vacacional en " + ubicacion + " reservada para la fecha: " + fecha);
    }

    @Override
    public void cancelarReserva() {
        this.reserva = null;
        System.out.println("Reserva en la casa vacacional de " + ubicacion + " ha sido cancelada.");
    }
}
