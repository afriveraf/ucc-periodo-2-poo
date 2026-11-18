package interfaces;

public class BotonPiso implements Boton{

    private boolean iluminado;
    private boolean presionado;

    public BotonPiso(boolean iluminado, boolean presionado) {
        this.iluminado = iluminado;
        this.presionado = presionado;
    }

    @Override
    public boolean iluminar() {
        return false;
    }

    @Override
    public boolean presionar() {
        return false;
    }

    public boolean isIluminado() {
        return iluminado;
    }

    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }

    public boolean isPresionado() {
        return presionado;
    }

    public void setPresionado(boolean presionado) {
        this.presionado = presionado;
    }
    
    @Override
    public String emitirSonido() {
        // TODO Auto-generated method stub
        return null;
    }

    public String toString() {
        return "BotonPiso [iluminado = " + iluminado + ", presionado " + presionado + "]";
    }
}
