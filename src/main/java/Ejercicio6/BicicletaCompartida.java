package Ejercicio6;

public class BicicletaCompartida implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bicicleta tomada en " + origen + " y dejada en " + destino);
    }

    @Override
    public double calcularTarifa() {
        return 1.0; // Tarifa simbólica
    }
}
