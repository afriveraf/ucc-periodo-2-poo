package actividad;

public class Boton {

    private boolean iluminado;
    private boolean funcional;

    public Boton() {
        this.iluminado = false;
        this.funcional = true;
    }

    public void presionar() {
        if (!funcional) {
            System.out.println("El boton esta danado y no responde.");
            return;
        }
        iluminar();
        emitirSonido();
    }

    public void iluminar() {
        iluminado = true;
        System.out.println("Boton iluminado.");
    }

    public void apagar() {
        iluminado = false;
        System.out.println("Boton apagado.");
    }

    public void emitirSonido() {
        System.out.println("Beep.");
    }

    public void reportarFalla() {
        funcional = false;
        System.out.println("Falla detectada en el boton.");
    }

    public boolean isIluminado() {
        return iluminado;
    }

    public boolean isFuncional() {
        return funcional;
    }
}