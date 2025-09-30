package com.mycompany.ejercicio16;

/**
 *
 * @author Usuario
 */
public class Ejercicio16 {

    public static void main(String[] args) {
    int totaldinero = 130;
    int billete50 = 50;
    int billete10 = 10;
    
    int num50 = totaldinero / billete50;
    int resto = totaldinero % billete50;
    int num10 = resto / billete10;
    
        System.out.println("130 euros hacen un total de: " +num50+ " billetes de 50 euros y " +num10+ " billetes de 10 euros.");
    }
}
