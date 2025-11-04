/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosestáticos;

/**
 *
 * @author alumno
 */
public class Calculadora {
    
    /**
     * Metodo para la suma
     * @param num1
     * @param num2
     * @return 
     */
    public static int suma(int num1 , int num2){
        return num1 + num2;
    }
    
    /**
     * Metodo para la resta
     * @param num1
     * @param num2
     * @return 
     */
    public static int resta(int num1 , int num2){
        return num1 - num2;
    }
    
    /**
     * Metodo para la multiplicacion
     * @param num1
     * @param num2
     * @return 
     */
    public static int multiplicacion(int num1 , int num2){
        return num1 * num2;
    }
    
    /**
     *Método para la division 
     * @param num1
     * @param num2
     * @return 
     */
    public static int division(int num1 , int num2){
        return num1 / num2;
    }
    
    /**
     * Método para la raiz cuadrada
     * @param num1
     * @return 
     */
    public static double sqrt (double num1){
        return Math.sqrt(num1);
    }
    
    /**
     * Método para el cuadrado
     * @param num1
     * @return 
     */
    public static int cuadrado(int num1){
        return num1*num1;
    }
    
    /**
     * Método para el cubo
     * @param num2
     * @return 
     */
    public static int cubo(int num2){
        return num2*num2*num2;
    }
    
    /**
     * Método para el logaritmo de un número
     * @param num1
     * @return 
     */
    public static double log(double num1){
        return num1;
    }
    
    /**
     * Método para sacar el máximo de dos números
     * @param num1
     * @param num2
     * @return 
     */
    public static int max(int num1, int num2){
        return Math.max(num1, num2);
    }
    
    /**
     * Método para sacar el mínimo de dos números
     * @param num1
     * @param num2
     * @return 
     */
    public static int min(int num1, int num2){
        return Math.max(num1, num2);
    }
    
    /**
     * Método para redondear al número entero más cercano por arriba
     * @param num3
     * @return 
     */
    public static double ceil(double num3){
        return Math.ceil(num3);
    }
    
    /**
     * Método para redondear al número entero más cercano por abajo
     * @param num3
     * @return 
     */
    public static double floor(double num3){
        return Math.floor(num3);
    }
    }




