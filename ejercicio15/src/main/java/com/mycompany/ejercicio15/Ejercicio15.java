package com.mycompany.ejercicio15;

/**
 *
 * @author Usuario
 */
public class Ejercicio15 {

    public static void main(String[] args) {
    int tiempo = 10000;
    int segundosporhora = 3600;
    int segundosporminuto = 60;
    
    //Calculo
    int horas = tiempo / segundosporhora;
    int resto = tiempo % segundosporhora;
    int minutos = resto / segundosporminuto;
    int segundos = resto % segundosporminuto;
    
        System.out.println("10.000 segundos hacen un total de: " +horas+ " horas, " +minutos+ " minutos y " +segundos+ " segundos.");
    }
}
