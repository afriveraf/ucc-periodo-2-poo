package poo.semana6;

public class Trabajador {
    //atributos
    private int cedula;
    private String nombre;
    private double salario;

    public Trabajador(int cedula, String nombre, double salario){
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double pagar (){
        return salario * 1.10;
    }

}
