package semana4;

public class MainCuentaBan {
    public static void main(String[] args){

        CuentaBan objCuenta1 = new CuentaBan(279836, "Andres", "100-34566 54", 0.0);

        //Mostrar el objeto en su estado inicial
        System.out.println(objCuenta1);
        //Consignando 1000.0 a la cuenta 
        System.out.println("Total de la cuenta: " + objCuenta1.consignar(1000.0));
        //Mostrar el objeto después de la consignación
        System.out.println(objCuenta1);
        try{
            objCuenta1.retirar(1500.0);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(objCuenta1);
        System.out.println("su saldo es: " + objCuenta1.consultarSaldo());

}
}
