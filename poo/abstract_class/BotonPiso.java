package abstract_class;

public class BotonPiso extends Boton{

    public BotonPiso(boolean iluminado, boolean funcional){
        super(iluminado, funcional);
    }

    @Override
    public boolean iluminar() {
        return false;
    }

    @Override
    public boolean presionar() {
        return false;
    }

    @Override
    public String toString() {
        return "BotonPiso [iluminado = " + iluminado + ", presionado " + funcional + "]";
    }
    
}
