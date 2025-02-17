package Ejercicio10;

public class Hotel implements Reservable, Calificable {
    private String nombre;
    private String reserva;
    private int calificacion;

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reservar(String fecha) {
        this.reserva = fecha;
        System.out.println("Reserva confirmada en " + nombre + " para la fecha: " + fecha);
    }

    @Override
    public void cancelarReserva() {
        this.reserva = null;
        System.out.println("Reserva en " + nombre + " ha sido cancelada.");
    }

    @Override
    public void calificar(int estrellas) {
        this.calificacion = estrellas;
        System.out.println("El hotel " + nombre + " ha sido calificado con " + estrellas + " estrellas.");
    }
}
