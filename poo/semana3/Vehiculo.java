package semana3;

public class Vehiculo {
    //atributos de la clase vehiculo
    private String modelo;
    private String marca;
    private String color;
    private double peso;
    private String linea;

    // constructor de la clase - permite inicializar la clase
    public Vehiculo(){}

    public Vehiculo(String modelo, String marca, String color, double peso, String linea){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.linea =linea;
    }

    public String toString(){
        return "{ modelo : " + this.modelo + ", marca: " + marca +
        ", color: " + color + ", peso: " + peso + ", linea: " + linea + " }";
    }
}
