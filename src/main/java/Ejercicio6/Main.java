package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos");

        Conductor conductorTaxi = new Conductor() {
            @Override
            public void aceptarPasajero() {
                System.out.println("Conductor ha aceptado al pasajero.");
            }

            @Override
            public void finalizarViaje() {
                System.out.println("Conductor ha finalizado el viaje.");
            }
        };

        TransportePublico taxi = new Taxi(conductorTaxi);
        TransportePublico bus = new Bus();
        TransportePublico bicicleta = new BicicletaCompartida();

        usuario.solicitarViaje(taxi, "Plaza Central", "Aeropuerto");
        usuario.solicitarViaje(bus, "Estación Norte", "Centro Comercial");
        usuario.solicitarViaje(bicicleta, "Parque Central", "Universidad");
    }
}
