package poo.semana7;

public class EjecutarBanco {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("1121323", "Jonyer Santiga", 0);
        Cliente cliente = new Cliente(12144, "Jonyer Santiago");
        Banco uccBank = new Banco("UCC Banco", "Carrera 76 #2-5", cuenta);

        System.out.println(uccBank);
    }
}
