package ejercicio9tema9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca nombre de usuario: ");
        String usuario = s.nextLine();
        System.out.print("Introduzca contraseña: ");
        String clave = s.nextLine();
        
        int contadorDigitos = 0;
        for (int i = 0; i < clave.length(); i++) {
            if (Character.isDigit(clave.charAt(i))) {
                contadorDigitos++;
            }
        }
        
        if (clave.length() < 6) {
            System.out.println("ERROR: La contraseña debe tener al menos 6 caracteres.");
        } else if (contadorDigitos < 2) {
            System.out.println("ERROR: La contraseña debe tener al menos 2 dígitos.");
        } else if (clave.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("ERROR: El nombre de usuario no puede estar en la contraseña.");
        } else {
            System.out.println("Contraseña validada correctamente.");
        }
    }    
}