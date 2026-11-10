package actividad;

import java.util.ArrayList;

public class ModuloNotificaciones {

    private ArrayList<String> historialFallas;
    private ArrayList<String> registroActividad;
    private long horaInicio; // momento en que arranco el sistema (milisegundos)

    public ModuloNotificaciones() {
        this.historialFallas = new ArrayList<>();
        this.registroActividad = new ArrayList<>();
        this.horaInicio = System.currentTimeMillis();
    }

    public void registrarFalla(String componente, String mensaje) {
        String falla = componente + ": " + mensaje;
        historialFallas.add(falla);
        System.out.println("[ALERTA] Falla en " + falla);
    }

    public void notificarMantenimiento() {
        System.out.println("[MANTENIMIENTO] Se notifica al equipo. Fallas registradas: "
                + historialFallas.size());
    }

    public void registrarActividad(String evento) {
        registroActividad.add(evento);
    }

    public long tiempoFuncionamiento() {
        return System.currentTimeMillis() - horaInicio;
    }

    public void mostrarHistorial() {
        System.out.println("--- Historial de fallas ---");
        for (String falla : historialFallas) {
            System.out.println(falla);
        }
        System.out.println("--- Registro de actividad ---");
        for (String evento : registroActividad) {
            System.out.println(evento);
        }
        System.out.println("Tiempo de funcionamiento: " + tiempoFuncionamiento() + " ms");
    }

    // Getter
    public int getTotalFallas() {
        return historialFallas.size();
    }
}
