package semana3;

public class CuentaBancaria {
    private double saldo;
    private String titular;
    private long numeroCuenta;
    private String tipoCuenta;
    private int clave;

    public CuentaBancaria(double saldo, String titular, long numeroCuenta, String tipCuenta, int clave){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.clave = clave;
    }

    public void consignar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Nuevo Saldo despues de consignar: " + this.saldo);
    }

    public void retirar(double valor){
        this.saldo = this.saldo - valor;
        System.out.println("Nuevo Saldo despues de retirar: " + this.saldo);
    }

    public String toString(){
        return "Cuenta Bancaria [saldo: " + saldo + ", titular: " + titular + 
        ", número de cuenta: " + numeroCuenta + ", tipo de cuenta: " + tipoCuenta + ", clave: " + "****";
    }
}
