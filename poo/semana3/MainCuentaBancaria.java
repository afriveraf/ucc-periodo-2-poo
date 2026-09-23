package semana3;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria objCuentaBancaria = new CuentaBancaria(1, 0, "Andres Rivera", "1234", "Ahorros", 4321);
        System.out.println("saldo: "+ objCuentaBancaria.consultarSaldo());
        objCuentaBancaria.consignar(500);
        objCuentaBancaria.consignar(500);
        System.out.println("saldo: "+ objCuentaBancaria.consultarSaldo());
        objCuentaBancaria.retirar(300);
        System.out.println("saldo: " + objCuentaBancaria.consultarSaldo());
    }
}
