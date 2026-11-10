package actividad;

public class Puerta {

    private String estado;          // abierta o cerrada
    private boolean sensorFuncional;
    private boolean obstaculo;

    public Puerta() {
        this.estado = "CERRADA";
        this.sensorFuncional = true;
        this.obstaculo = false;
    }

    public void abrir() {
        estado = "ABIERTA";
        System.out.println("Puerta abierta.");
    }

    public void cerrar() {
        if (!sensorFuncional) {
            System.out.println("Sensor danado: no se cierra por seguridad.");
            return;
        }
        if (detectarObstaculo()) {
            System.out.println("Obstaculo detectado: la puerta no se cierra.");
            return;
        }
        estado = "CERRADA";
        System.out.println("Puerta cerrada.");
    }

    public boolean detectarObstaculo() {
        return obstaculo;
    }

    public void mantenerAbierta() {
        estado = "ABIERTA";
        System.out.println("Puerta mantenida abierta.");
    }

    public void abrirEmergencia() {
        estado = "ABIERTA";
        System.out.println("EMERGENCIA: puerta abierta automaticamente.");
    }

    public void setObstaculo(boolean obstaculo) {
        this.obstaculo = obstaculo;
    }

    public void reportarFallaSensor() {
        sensorFuncional = false;
        System.out.println("Falla detectada en el sensor de la puerta.");
    }

    // Getters
    public String getEstado() {
        return estado;
    }

    public boolean isSensorFuncional() {
        return sensorFuncional;
    }

}
