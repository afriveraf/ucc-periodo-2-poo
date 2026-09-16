package semana3;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo(2025, "FIAT", "Azul", 980.5, "Sedan");
        System.out.println(vehiculo1);
        Vehiculo vehiculo2 = new Vehiculo(1956, "Chevrolet", "Rojo", 1300.7, "Buick");
        System.out.println(vehiculo1.calcularAntiguedadVehiculo(2026) + "año");
        System.out.println(vehiculo2.calcularAntiguedadVehiculo(2026) + "años");

    }
}
