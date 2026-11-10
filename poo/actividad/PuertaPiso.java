package actividad;

public class PuertaPiso extends Puerta {

    private int numeroPiso;

    public PuertaPiso(int numeroPiso) {
        super();
        this.numeroPiso = numeroPiso;
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo puerta del piso " + numeroPiso + "...");
        super.abrir();
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando puerta del piso " + numeroPiso + "...");
        super.cerrar();
    }

    // Getter
    public int getNumeroPiso() {
        return numeroPiso;
    }
}
