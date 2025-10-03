package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero de 4 cifras: ");
        
        int numero = entrada.nextInt();
        int cifra1 = numero /1000;
        int resto1 = numero % 1000;
        int cifra2 = resto1 / 100;
        int resto2 = resto1 % 100;
        int cifra3 = resto2 / 10;
        int resto = resto2 % 10;
        
        System.out.println("Tu numero es: " +numero);
        System.out.println("Tu primera cifra es: " +cifra1);
        System.out.println("Tu segunda cifra es: " +cifra2);
        System.out.println("Tu tercera cifra es: " +cifra3);
        System.out.println("Tu cuarta cifra es: " +resto);
    }
    
}