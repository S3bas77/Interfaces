package Ejercicio10;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void hacerReserva(Reservable reservable, String fecha) {
        reservable.reservar(fecha);
    }

    public void cancelarReserva(Reservable reservable) {
        reservable.cancelarReserva();
    }
}
