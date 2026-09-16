package semana3;

public class MainVehiculo {
    public static void main(String[] args) {
        // una constante es un valor que no cambia durante la ejecución debe ir en mayuscula sostenida
        final int ANIO_ACTUAL = 2026;
        Vehiculo vehiculo1 = new Vehiculo(2025, "FIAT", "Azul", 980.5, "Sedan");
        System.out.println(vehiculo1);
        Vehiculo vehiculo2 = new Vehiculo(1956, "Chevrolet", "Rojo", 1300.7, "Buick");
        System.out.println(vehiculo1.calcularAntiguedadVehiculo(ANIO_ACTUAL) + " año");
        System.out.println(vehiculo2.calcularAntiguedadVehiculo(ANIO_ACTUAL) + " años");

    }
}
