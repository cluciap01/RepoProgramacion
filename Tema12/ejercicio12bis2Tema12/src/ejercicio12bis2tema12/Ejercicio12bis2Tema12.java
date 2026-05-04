package ejercicio12bis2tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio12bis2Tema12 {
    // Escriba un programa en JAVA que 
    //contenga un método, de nombre 
    //escribirCadenasEnArchivo, que reciba un array de 4
    //cadenas de caracteres (previamente relleno por el 
    //usuario) y vuelque su contenido a un archivo cuyo
    //nombre también se recibirá por parámetro.
    //Las cadenas quedarán separadas en el archivo por un
    //asterisco.
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void rellenarArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Por favor introduzca la cadena de caracteres número " + (i+1) + ": ");
            array[i] = pedirString();
        }
    }
    
    public static void volcarArray(String[] array, String nombreFichero){
        String resultado = "";
        try (
            FileWriter fw = new FileWriter(nombreFichero + ".txt");
            PrintWriter pw = new PrintWriter(fw);
        ) {
            for (int i = 0; i < array.length; i++) {
                resultado = resultado.concat(array[i]);
                if (i < array.length - 1) {
                    resultado = resultado.concat("*");
                }
            }
            pw.print(resultado);
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo");
        }
    }
    
    public static void mostrarFichero(String nombreFichero) {
        String linea;
        System.out.println("El contenido del fichero es:\n");
        try (
            FileReader fr = new FileReader(nombreFichero + ".txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] array = new String[4];
        rellenarArray(array);
        
        System.out.print("Por favor introduzca el nombre del fichero a crear: ");
        String nombreFichero = pedirString();
        
        volcarArray(array, nombreFichero);
        mostrarFichero(nombreFichero);
    }
    
}
