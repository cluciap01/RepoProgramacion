package com.mycompany.ejercicio16;

/**
 *
 * @author Usuario
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        int contador = 0;

        System.out.println("Los numeros impares existentes entre el numero 20 y el 160 son:");

        // Recorremos desde 21 hasta 159, de 2 en 2
        for (int i = 20; i <= 160; i ++) {

            // Para separar con " – " excepto el último número
            if (i % 2 != 0) {
                System.out.print(i);
                contador++; // Contamos los impares
                System.out.print(" - ");//Separamos los numeros con -
            }

        }
        
        System.out.println(); // Salto de línea
        System.out.println("La cantidad de numeros impares impresos han sido: " + contador);
    }
}
