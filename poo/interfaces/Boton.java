package interfaces;

public interface Boton {
    
    boolean iluminar();
    boolean presionar();
    public void setIluminado(boolean iluminado);
    public void setPresionado(boolean presionado);
    String emitirSonido();
}
