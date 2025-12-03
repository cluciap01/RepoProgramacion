package ejercicio32;

import java.util.Scanner;

public class Ejercicio32 {

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
        
        System.out.println( +dinero+" Euros se descomponen en " +num50+ " billetes de 50, " 
                +num20+ " billetes de 20, " +num10+ " billetes de 10, " +num5+ " billetes de 5, " 
                +num2+ " monedas de 2 y " +num1+ " monedas de 1");    
    }
    
}
