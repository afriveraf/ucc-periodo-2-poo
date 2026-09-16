package semana3;

public class Vehiculo {
    //atributos de la clase vehiculo
    private int modelo;
    private String marca;
    private String color;
    private double peso;
    private String linea;

    // constructor de la clase - permite inicializar la clase
    public Vehiculo(){}

    public Vehiculo(int modelo, String marca, String color, double peso, String linea){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.linea =linea;
    }

    public int calcularAntiguedadVehiculo(int anioActual){
        return anioActual - modelo;
    }



    // metodo toString sirve para mostrar cómo está creado el objeto
    public String toString(){
        return "{ modelo : " + this.modelo + ", marca: " + marca +
        ", color: " + color + ", peso: " + peso + ", linea: " + linea + " }";
    }
}
