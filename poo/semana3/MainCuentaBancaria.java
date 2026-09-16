package semana3;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria objCuentaBancaria = new CuentaBancaria(0, "Andres Rivera", 1234, "Ahorros", 4321);
        System.out.println(objCuentaBancaria);
        objCuentaBancaria.consignar(500);
        objCuentaBancaria.retirar(300);
    }
}
