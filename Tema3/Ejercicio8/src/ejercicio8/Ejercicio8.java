package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner total = new Scanner(System.in);
        
        System.out.println("Por favor, indica una cantidad de dinero: ");
         
        int dinero = total.nextInt();
        int billete50 = 50;
        int billete20 = 20;
        int billete10 = 10;
        int billete5 = 5;
        int moneda2 = 2;
        int moneda1 = 1;
        int num50 = dinero / billete50;
        int resto50 = dinero % billete50;
        int num20 = resto50 / billete20;
        int resto20 = resto50 % billete20;
        int num10 = resto20 / billete10;
        int resto10 = resto20 % billete10;
        int num5 = resto10 / billete5;
        int resto5 = resto10 % billete5;
        int num2 = resto5 / moneda2;
        int resto2 = resto5 % moneda2;
        int num1 = resto2 / moneda1;
        
         if (num50 > 0) {
            System.out.println("Billetes de 50: " + num50);
        }
        if (num20 > 0) {
            System.out.println("Billetes de 20: " + num20);
        }
        if (num10 > 0) {
            System.out.println("Billetes de 10: " + num10);
        }
        if (num5 > 0) {
            System.out.println("Billetes de 5: " + num5);
        }
        if (num2 > 0) {
            System.out.println("Monedas de 2 euros: " + num2);
        }
        if (num1 > 0) {
            System.out.println("Monedas de 1 euro: " + num1);
        }
        
    }
    }
    
