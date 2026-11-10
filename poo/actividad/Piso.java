package actividad;

public class Piso {
    
    private int numero;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;
    private PuertaPiso puerta;

    /** Constructor: crea los dos botones y la puerta de este piso. */
    public Piso(int numero) {
        this.numero = numero;
        this.botonSubir = new BotonPiso(numero, "SUBIENDO");
        this.botonBajar = new BotonPiso(numero, "BAJANDO");
        this.puerta = new PuertaPiso(numero);
    }

    /** Pasajero en el piso: presiona el boton de subir o bajar. */
    public void solicitar(String direccion) {
        if (direccion.equals("SUBIENDO")) {
            botonSubir.presionar();
        } else if (direccion.equals("BAJANDO")) {
            botonBajar.presionar();
        } else {
            System.out.println("Direccion no valida: " + direccion);
        }
    }

    /** Apaga los dos botones cuando el ascensor ya atendio el piso. */
    public void apagarBotones() {
        botonSubir.apagar();
        botonBajar.apagar();
    }

    /** Abre la puerta del piso. */
    public void abrirPuerta() {
        puerta.abrir();
    }

    /** Cierra la puerta del piso. */
    public void cerrarPuerta() {
        puerta.cerrar();
    }

    /** Dice si alguno de los botones del piso esta danado. */
    public boolean hayFallaBotones() {
        return !botonSubir.isFuncional() || !botonBajar.isFuncional();
    }

    /** Simula la falla de un boton del piso ("SUBIENDO" o "BAJANDO"). */
    public void reportarFallaBoton(String direccion) {
        if (direccion.equals("SUBIENDO")) {
            botonSubir.reportarFalla();
        } else if (direccion.equals("BAJANDO")) {
            botonBajar.reportarFalla();
        }
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public PuertaPiso getPuerta() {
        return puerta;
    }
}