package actividad;

public class BotonAscensor extends Boton{

    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        super();
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void presionar() {
        super.presionar();
        if (isFuncional()) {
            System.out.println("Destino seleccionado: piso " + pisoDestino);
        }
    }

    public int getPisoDestino() {
        return pisoDestino;
    }
}
