package apuntesstring;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ApuntesString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos una variable tipo String
        String nombre;
        String nombre1;
       
        //Damos valor
        nombre = "Manolo";
        nombre1= "manolo";
        //Declarar e inicializar una variable
        String apellido = "Arsenaliev";
        
        //Pedir una cadena al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cual fue el ultimo trofeo que ganaste?");
        String trofeos = entrada.nextLine();
        System.out.println("Has ganado el trofeo "+trofeos);
        
        //Comparar dos variables 
        if(nombre.equals(apellido)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }
       
        if(nombre.equalsIgnoreCase(nombre1)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }
                            
    }

        
        
}

