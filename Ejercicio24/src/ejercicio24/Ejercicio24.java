package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la nota de Programacion: ");
        
        double nota1  = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Lenguaje de Marcas: ");
        
        double nota2 = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Base de Datos: ");
        
        double nota3 = entrada.nextDouble();

        
        System.out.println("Introduzca la nota de Entornos de Desarrollos: ");
        
        double nota4 = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Sistemas Informaticos: ");
        
        double nota5 = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de FOL: ");
        
        double nota6 = entrada.nextDouble();
        double suma = nota1+nota2+nota3+nota4+nota5+nota6;
        double media = suma / 6;
        
        System.out.println("Su nota media es: " +media);
    }
    
}
