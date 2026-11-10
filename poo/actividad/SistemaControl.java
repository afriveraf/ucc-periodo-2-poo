package actividad;

import java.util.ArrayList;

public class SistemaControl {

    private Ascensor ascensor;
    private ArrayList<Piso> pisos;
    private ModuloNotificaciones notificaciones;

    public SistemaControl(Ascensor ascensor, ArrayList<Piso> pisos,
                          ModuloNotificaciones notificaciones) {
        this.ascensor = ascensor;
        this.pisos = pisos;
        this.notificaciones = notificaciones;
    }

    public void solicitarAscensor(int numeroPiso, String direccion) {
        Piso piso = buscarPiso(numeroPiso);
        if (piso == null) {
            System.out.println("Piso " + numeroPiso + " no existe.");
            return;
        }
        if (numeroPiso == ascensor.getPisoActual()) {
            System.out.println("El ascensor ya esta en el piso " + numeroPiso + ".");
            ascensor.getPuerta().abrir();
            atenderPiso(numeroPiso);
            ascensor.getPuerta().cerrar();
            return;
        }
        piso.solicitar(direccion);
        ascensor.agregarParada(numeroPiso);
        notificaciones.registrarActividad("Solicitud en piso " + numeroPiso + " hacia " + direccion);
    }

    public void seleccionarDestino(int numeroPiso) {
        ascensor.presionarBotonDestino(numeroPiso);
        notificaciones.registrarActividad("Destino seleccionado: piso " + numeroPiso);
    }

    public void procesarSolicitudes() {
        while (ascensor.hayParadasPendientes()) {
            if (verificarFallas()) {
                manejarEmergencia();
                return;
            }
            boolean sedetuvo = ascensor.mover();
            if (sedetuvo) {
                atenderPiso(ascensor.getPisoActual());
            }
        }
    }

    /** El ascensor llego a un piso: abre y cierra su puerta y apaga sus botones. */
    public void atenderPiso(int numeroPiso) {
        Piso piso = buscarPiso(numeroPiso);
        if (piso == null) {
            return;
        }
        piso.abrirPuerta();
        piso.cerrarPuerta();
        piso.apagarBotones();
        notificaciones.registrarActividad("Piso " + numeroPiso + " atendido");
    }

    /**
     * Revisa botones y sensores de puertas.
     * Devuelve true si encontro alguna falla (y la registra).
     */
    public boolean verificarFallas() {
        boolean hayFalla = false;

        if (!ascensor.getPuerta().isSensorFuncional()) {
            notificaciones.registrarFalla("Puerta del ascensor", "sensor danado");
            hayFalla = true;
        }
        if (ascensor.hayFallaBotones()) {
            notificaciones.registrarFalla("Botones del ascensor", "boton danado");
            hayFalla = true;
        }
        for (Piso piso : pisos) {
            if (!piso.getPuerta().isSensorFuncional()) {
                notificaciones.registrarFalla("Puerta del piso " + piso.getNumero(), "sensor danado");
                hayFalla = true;
            }
            if (piso.hayFallaBotones()) {
                notificaciones.registrarFalla("Botones del piso " + piso.getNumero(), "boton danado");
                hayFalla = true;
            }
        }
        return hayFalla;
    }

    /** Ante una falla: detiene el ascensor, abre puertas y avisa a mantenimiento. */
    public void manejarEmergencia() {
        System.out.println("*** EMERGENCIA ***");
        ascensor.detenerEnPisoCercano();
        Piso piso = buscarPiso(ascensor.getPisoActual());
        if (piso != null) {
            piso.abrirPuerta();
        }
        notificaciones.notificarMantenimiento();
        notificaciones.registrarActividad("Emergencia en el piso " + ascensor.getPisoActual());
    }

    /** Ayuda interna: busca un piso por su numero (null si no existe). */
    private Piso buscarPiso(int numero) {
        for (Piso piso : pisos) {
            if (piso.getNumero() == numero) {
                return piso;
            }
        }
        return null;
    }
}
