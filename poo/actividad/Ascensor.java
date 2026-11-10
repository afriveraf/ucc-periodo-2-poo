package actividad;

import java.util.ArrayList;

public class Ascensor {
    
    private int pisoActual;
    private int totalPisos;
    private String direccion; // "SUBIENDO", "BAJANDO" o "DETENIDO"
    private ArrayList<Integer> paradasPendientes;

    // Composicion: el ascensor tiene estos objetos
    private PuertaAscensor puerta;
    private ArrayList<BotonAscensor> botonesDestino;
    private Boton botonMantenerPuertas;

    /** Constructor: crea la puerta y un boton de destino por cada piso. */
    public Ascensor(int pisoInicial, int totalPisos) {
        this.pisoActual = pisoInicial;
        this.totalPisos = totalPisos;
        this.direccion = "DETENIDO";
        this.paradasPendientes = new ArrayList<>();
        this.puerta = new PuertaAscensor();
        this.botonesDestino = new ArrayList<>();
        for (int piso = 1; piso <= totalPisos; piso++) {
            botonesDestino.add(new BotonAscensor(piso));
        }
        this.botonMantenerPuertas = new Boton();
    }

    /** Agrega un piso a la lista de paradas si es valido y no esta repetido. */
    public void agregarParada(int piso) {
        if (piso < 1 || piso > totalPisos) {
            System.out.println("Piso " + piso + " no existe.");
            return;
        }
        if (piso == pisoActual) {
            System.out.println("El ascensor ya esta en el piso " + piso + ".");
            return;
        }
        if (paradasPendientes.contains(piso)) {
            System.out.println("El piso " + piso + " ya fue solicitado.");
            return;
        }
        paradasPendientes.add(piso);
    }

    /** Pasajero dentro del ascensor: presiona el boton de un piso destino. */
    public void presionarBotonDestino(int piso) {
        if (piso < 1 || piso > totalPisos || piso == pisoActual) {
            System.out.println("Destino no valido: " + piso);
            return;
        }
        botonesDestino.get(piso - 1).presionar();
        agregarParada(piso);
    }

    /**
     * Mueve el ascensor UN piso. Sigue su direccion y solo la cambia
     * cuando ya no quedan paradas en esa direccion.
     * Devuelve true si se detuvo en una parada y false si paso de largo.
     */
    public boolean mover() {
        if (paradasPendientes.isEmpty()) {
            direccion = "DETENIDO";
            return false;
        }

        if (direccion.equals("DETENIDO")) {
            // Arranca hacia la primera solicitud
            if (paradasPendientes.get(0) > pisoActual) {
                direccion = "SUBIENDO";
            } else {
                direccion = "BAJANDO";
            }
        } else if (!hayParadasEnDireccion()) {
            cambiarDireccion();
        }

        if (direccion.equals("SUBIENDO")) {
            pisoActual++;
        } else {
            pisoActual--;
        }
        System.out.println("Ascensor " + direccion + " -> piso " + pisoActual);

        if (paradasPendientes.contains(pisoActual)) {
            llegarAPiso();
            return true; // se detuvo en una parada
        }
        return false; // paso de largo
    }

    /**
     * Cambia de direccion SOLO si ya no hay paradas en la direccion actual.
     */
    public void cambiarDireccion() {
        if (hayParadasEnDireccion()) {
            System.out.println("Aun hay paradas en la direccion actual.");
            return;
        }
        if (direccion.equals("SUBIENDO")) {
            direccion = "BAJANDO";
        } else if (direccion.equals("BAJANDO")) {
            direccion = "SUBIENDO";
        }
    }

    /** Atiende el piso actual: quita la parada, apaga el boton y abre y cierra la puerta. */
    public void llegarAPiso() {
        System.out.println("Ascensor llego al piso " + pisoActual);
        paradasPendientes.remove(Integer.valueOf(pisoActual));
        botonesDestino.get(pisoActual - 1).apagar();
        puerta.abrir();
        puerta.cerrar();
        if (paradasPendientes.isEmpty()) {
            direccion = "DETENIDO";
        }
    }

    /** Boton "Mantener puertas abiertas" dentro del ascensor. */
    public void mantenerPuertasAbiertas() {
        botonMantenerPuertas.presionar();
        puerta.mantenerAbierta();
    }

    /** En una falla: se detiene en el piso donde esta y abre la puerta. */
    public void detenerEnPisoCercano() {
        direccion = "DETENIDO";
        paradasPendientes.clear();
        puerta.abrirEmergencia();
        System.out.println("Ascensor detenido en el piso " + pisoActual + " por falla.");
    }

    /** Dice si algun boton del ascensor esta danado. */
    public boolean hayFallaBotones() {
        for (BotonAscensor boton : botonesDestino) {
            if (!boton.isFuncional()) {
                return true;
            }
        }
        return !botonMantenerPuertas.isFuncional();
    }

    /** Simula la falla del boton de un piso destino. */
    public void reportarFallaBotonDestino(int piso) {
        if (piso >= 1 && piso <= totalPisos) {
            botonesDestino.get(piso - 1).reportarFalla();
        }
    }

    /** Ayuda interna: dice si quedan paradas en la direccion actual. */
    private boolean hayParadasEnDireccion() {
        for (int parada : paradasPendientes) {
            if (direccion.equals("SUBIENDO") && parada > pisoActual) {
                return true;
            }
            if (direccion.equals("BAJANDO") && parada < pisoActual) {
                return true;
            }
        }
        return false;
    }

    // Getters
    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean hayParadasPendientes() {
        return !paradasPendientes.isEmpty();
    }

    public PuertaAscensor getPuerta() {
        return puerta;
    }
}