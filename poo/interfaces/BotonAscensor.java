package interfaces;

public class BotonAscensor implements Boton {
    
    private boolean iluminado;
    private boolean presionado;
    
    public BotonAscensor(boolean iluminado, boolean presionado) {
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

    public String emitirSonido(){
        return "ring ring";
    }

    public String toString(){
        return "BotonAscensor [iluminado: " + iluminado + " presionado: " + presionado + "]";
    }
}
