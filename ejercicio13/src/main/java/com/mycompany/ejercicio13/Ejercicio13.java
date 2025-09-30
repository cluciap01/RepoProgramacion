package com.mycompany.ejercicio13;

/**
 *
 * @author Usuario
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int aux = num1;
        System.out.println("La variable num1 contiene el valor " +num1+ " y la variable num2 contiene el valor " +num2);
        num1 = num2;
        num2 = aux;
        System.out.println("La variable num1 contiene el valor " +num1+ " y la variable num2 contiene el valor " +num2);
        
    }
}
