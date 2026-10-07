package poo.semana6;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int a = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        int b = sc.nextInt();   

        System.out.println("La suma es: " + (a + b));

        System.out.println("La resta es: " + (a - b));
        System.out.println("La multiplicación es: " + (a * b));
        System.out.println("La division es: " + (a / b));
    }
}
