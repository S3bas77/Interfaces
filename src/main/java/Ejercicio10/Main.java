package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos");

        Hotel hotel = new Hotel("Gran Hotel");
        Departamento departamento = new Departamento("Av. Central 123");
        CasaVacacional casa = new CasaVacacional("Playa del Sol");

        usuario.hacerReserva(hotel, "2025-06-15");
        usuario.hacerReserva(departamento, "2025-07-01");
        usuario.hacerReserva(casa, "2025-08-10");

        hotel.calificar(5);

        usuario.cancelarReserva(hotel);
    }
}
