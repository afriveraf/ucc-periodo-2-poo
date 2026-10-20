package semana6;

public class Operario extends Trabajador {

    private double horas;

    public Operario(int cedula, String nombre, double salario, double horas) {
        super(cedula, nombre, salario);
        this.horas = horas;
    }

    public double pagar(){
        return this.getSalario() * horas;
    }
    
}
