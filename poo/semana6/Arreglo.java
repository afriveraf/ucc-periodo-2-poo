package semana6;

public class Arreglo {
    public static void main(String[] args) {
        int[] a = {6,5,9,1,8,3,2};
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]" + " = " + a[i]);
            suma += a[i];
        }
        System.out.println("La suma es: " + suma);
    }
}
