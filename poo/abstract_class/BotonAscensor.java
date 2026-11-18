package abstract_class;

public class BotonAscensor extends Boton {

    public BotonAscensor(boolean iluminado, boolean funcional) {
        super(iluminado, funcional);
    }
    
    public boolean iluminar(){
        return false;
    }
    public boolean presionar(){
        return false;
    }
    
    public String emitirSonido(){
        return "ring ring";
    }
    
    public String toString(){
        return "BotonAscensor [iluminado: " + iluminado + " presionado: " + funcional + "]";
    }
    
}
