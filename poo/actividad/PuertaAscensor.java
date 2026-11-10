package actividad;

public class PuertaAscensor extends Puerta  {

    public PuertaAscensor() {
        super();
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo puerta del ascensor...");
        super.abrir();
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando puerta del ascensor...");
        super.cerrar();
    }
}
