package poo.semana7;

public class Cuenta {
    
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta(){
    }

    public Cuenta(String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void consignar(double value){
        if(value < 0){
            System.out.println("No se puede consignar saldo negativo");
            return;
        }
        saldo += value;
    }

    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
    }
}
