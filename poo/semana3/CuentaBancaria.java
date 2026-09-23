package semana3;

public class CuentaBancaria {

    private int id;
    private double saldo;
    private String titular;
    private String numeroCuenta;
    private String tipoCuenta;
    private int clave;

    public CuentaBancaria(int id, double saldo, String titular, String numeroCuenta, String tipCuenta, int clave){
        this.id = id;
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipCuenta;
        this.clave = clave;
    }

    public double consignar(double valor){
        return this.saldo = this.saldo + valor;
    }

    public double retirar(double valor){
        return this.saldo = this.saldo - valor;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public String toString(){
        return "Cuenta Bancaria [id:" + id + ", saldo: " + saldo + ", titular: " + titular + 
        ", número de cuenta: " + numeroCuenta + ", tipo de cuenta: " + tipoCuenta + ", clave: " + "****";
    }
}
