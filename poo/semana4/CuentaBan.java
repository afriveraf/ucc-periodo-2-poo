package semana4;

public class CuentaBan {
    
    //Atributos
    private int id;
    private String titular;
    private String numeroCuenta;
    private double saldo;

    //Constructor de la clase --> Recuerde que tiene el mismo nombre de la clase
    public CuentaBan(int id, String titular, String numeroCuenta, double saldo){
        this.id = id;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Método consignar
    public double consignar(double valor){
        return saldo = saldo + valor;
    }

    public double retirar(double valor) throws Exception{
        if(saldo < valor){
            throw new RuntimeException("No se puede hacer el retiro");
        }
        return saldo = saldo - valor;
    }

    //metodo para consultar saldo
    public double consultarSaldo(){
        return this.saldo;
    }

    @Override
    public String toString(){
        return "CuentaBancaria [ id: " + id + " titular: " + titular + " numeroCuenta: " + 
                                         numeroCuenta + " saldo: " + saldo + "]";
    }
}
