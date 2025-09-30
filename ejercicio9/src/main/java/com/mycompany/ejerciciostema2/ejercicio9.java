package com.mycompany.ejerciciostema2;

/**
 *
 * @author Usuario
 */
public class ejercicio9 {

    public static void main(String[] args) {
    double radio = 3.55;
    double longitud = 2 * 3.14 * radio;
    //En lugar de 3.14 se puede utilizar Math.PI y seria mas preciso
        System.out.println("La longitud de una circunferencia cuyo radio vale " +radio+ " seria igual a: " + String.format("%.2f", longitud) + " metros");
    }
}
