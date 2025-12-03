package examen1;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Christian Lucia Pulido
 */

public class metodos {
    
    // Genera el menú que el usuario verá para elegir una opción
    public static void mostrarMenu() {
        System.out.println(" MENÚ CONTROL DE NAVE ");
        System.out.println("1. Analizar");
        System.out.println("2. Ajustar");
        System.out.println("3. Calcular");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }
    // Pide un número del menú al usuario
    public static int pedirOpcion(Scanner entrada) {
        int opcion = -1;
        try {
            opcion = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe introducir un número válido.");
            entrada.next(); // Limpia buffer
        }
        return opcion;
    }
    
    public static void ajustarPotencia(){
        System.out.println("Introduce el primer número: ");
        Scanner num1 = new Scanner(System.in);
        int numero1 = num1.nextInt();
        System.out.println("Introduce el segundo número: ");
        Scanner num2 = new Scanner(System.in);
        int numero2 = num2.nextInt();
        System.out.println("Introduce el tercer número: ");
        Scanner num3 = new Scanner(System.in);
        int numero3 = num3.nextInt();
        System.out.println("Los numeros introducidos son: "+numero1+ " , " +numero2+ " , " +numero3); //Muestra los numeros que ha introducido el usuario
        mostrarOrdenCreciente(numero1, numero2, numero3);
    }
    public static void mostrarOrdenCreciente(int a, int b, int c) {
        
        // Ordenamos con un bucle sencillo
        int[] numeros = {a, b, c};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        //Mostramos por pantalla el orden de los numeros despues del bucle
        System.out.print("El orden de los números introducidos es el ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print("  ");
            }
        }
    }
    
    public static int analizarSeñal(Scanner entrada){ //
       System.out.println("Introduce un numero: ");
       int opcion = entrada.nextInt();
       int i =2;
       int resultado;
       do{
            resultado = opcion/i;
            i++;//Incrementamos el numero si el resultado de la division no en 0
        }while(resultado != 0);
        return i; 
}
    
public static double calcularVolumen(){
    System.out.println("Introduce el radio del planeta: ");
    Scanner radio = new Scanner(System.in);
    
    double radioPlaneta = radio.nextDouble();
    double radioOperacion = radioPlaneta*radioPlaneta*radioPlaneta;
    double radioFinal= 4/3 * Examen1.PI * radioOperacion;
    System.out.println("El radio final del planeta es de : " +radioFinal);
    return radioFinal;
    //Si pongo un numero decimal me salta el error de InputMismatchException del apartado pedirOpcion , no se solucionarlo :/
}
}