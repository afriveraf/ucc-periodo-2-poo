package poo.taller;

import java.util.Arrays;

public class Impresion extends Producto{

    private String color;
    private Foto[] fotos;
    
    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    @Override
    public String toString() {
        return "Impresion [color=" + color + ", fotos=" + Arrays.toString(fotos) + "]";
    }
    
    
}
