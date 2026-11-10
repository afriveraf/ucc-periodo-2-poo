package actividad;

import java.util.ArrayList;

public class EjecutarSistemaControl {

    public static void main(String[] args) {
        // Se crean los objetos por separado (agregacion)
        Ascensor ascensor = new Ascensor(1, 5);
        ArrayList<Piso> pisos = new ArrayList<>();
        for (int numero = 1; numero <= 5; numero++) {
            pisos.add(new Piso(numero));
        }
        ModuloNotificaciones notificaciones = new ModuloNotificaciones();
        SistemaControl sistema = new SistemaControl(ascensor, pisos, notificaciones);

        System.out.println("===== Prueba 1: solicitudes normales =====");
        sistema.solicitarAscensor(3, "SUBIENDO");
        sistema.seleccionarDestino(5);
        sistema.solicitarAscensor(2, "BAJANDO");
        sistema.procesarSolicitudes();

        System.out.println("\n===== Prueba 2: falla en el sensor de la puerta =====");
        ascensor.getPuerta().reportarFallaSensor();
        sistema.seleccionarDestino(1);
        sistema.procesarSolicitudes();

        System.out.println("\n===== Resumen =====");
        notificaciones.mostrarHistorial();
    }
}
