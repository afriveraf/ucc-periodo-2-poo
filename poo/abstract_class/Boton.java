package abstract_class;

public abstract class Boton {
    
    protected boolean iluminado;
    protected boolean funcional;

    public Boton(boolean iluminado, boolean funcional){
        this.iluminado = iluminado;
        this.funcional = funcional;
    }

    public abstract boolean iluminar();
    public abstract boolean presionar();

    public String emitirSonido(){
        return "ring ring ring";
    }

    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }
    
}
