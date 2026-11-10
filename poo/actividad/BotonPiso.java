package actividad;

public class BotonPiso extends Boton{

    private int numeroPiso;
    private String direccion; // subiendo o bajando

    public BotonPiso(int numeroPiso, String direccion) {
        super();
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
    }

    @Override
    public void presionar() {
        super.presionar();
        if (isFuncional()) {
            System.out.println("Solicitud en piso " + numeroPiso + " hacia: " + direccion);
        }
    }

    // Getters
    public int getNumeroPiso() {
        return numeroPiso;
    }

    public String getDireccion() {
        return direccion;
    }
}   
