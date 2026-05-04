package ejercicio13tema12;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio13Tema12 {
    /**
     * Realizar un programa que lea de teclado (la entrada estándar) los
     * siguientes datos:
     * Nombre y apellido de un supuesto becario.
     * Sexo (H-M)
     * Edad (20-60)
     * Número de suspensos del curso anterior (0-4).
     * Residencia familiar (SI-NO)
     * Ingresos anuales de la familia.
     * Los datos se almacenan en un fichero llamado “DatosBeca.txt”.
     * Cuando vuelvas a ejecutar el programa no se sobrescribirá el fichero, sino que se
     * seguirán añadiendo posibles becarios al final del fichero. 
     */
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void rellenarBecario(){
        String resultado = "";
        String entrada = "a";
        int num = 0;
        try (
            FileWriter fw = new FileWriter("DatosBeca.txt", true);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            System.out.print("Introduzca el nombre y apellido(s) del becario: ");
            resultado = resultado.concat(pedirString());
            
            while(!(entrada.equals("H") || entrada.equals("M"))){
                System.out.print("Introduzca el sexo del becario (H: Hombre, M: Mujer): ");
                entrada = pedirString().toUpperCase();
                if (!(entrada.equals("H") || entrada.equals("M"))) {
                    System.out.println("Entrada no válida, inténtelo de nuevo");
                }
            }
            resultado = resultado.concat("#").concat(entrada);
            
            while(!(num >= 20 && num <= 60)){
                System.out.print("Introduzca la edad del becario (20 - 60): ");
                num = pedirNum();
                if (!(num >= 20 && num <= 60)) {
                    System.out.println("Entrada no válida, inténtelo de nuevo");
                }
            }
            resultado = resultado.concat("#").concat(Integer.toString(num));
            
            while(!(num >= 0 && num <= 4)){
                System.out.print("Introduzca el número de suspensos del año anterior (0 - 4): ");
                num = pedirNum();
                if (!(num >= 0 && num <= 4)) {
                    System.out.println("Entrada no válida, inténtelo de nuevo");
                }
            }
            resultado = resultado.concat("#").concat(Integer.toString(num));
            
            while(!(entrada.equals("SI") || entrada.equals("NO"))){
                System.out.print("¿Vive el becario en residencia familiar? (S: Sí, N: No): ");
                entrada = pedirString().toUpperCase();
                if (entrada.equals("S")) {
                    entrada = "SI";
                } else if (entrada.equals("N")){
                    entrada = "NO";
                } else{
                    System.out.println("Entrada no válida, inténtelo de nuevo");
                }
            }
            resultado = resultado.concat("#").concat(entrada);
            
            System.out.print("Cantidad de ingresos anuales de la familia del becario: ");
            num = pedirNum();
            resultado = resultado.concat("#").concat(Integer.toString(num));
            pw.println(resultado);
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo");
        } catch (InputMismatchException e){
            System.out.println("Entrada no válida");
            num = -1;
        }
    }
    
    public static void mostrarFichero() {
        String linea;
        String[] datos = new String[6];
        String[] campos = {"Nombre y apellidos", "Sexo", "Edad", "Suspensos el año anterior", "Residencia familiar", "Ingresos anuales de la familia"};
        System.out.println("El contenido del fichero es:\n");
        try (
            FileReader fr = new FileReader("DatosBeca.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (linea != null) {
                datos = linea.split("#");
                for (int i = 0; i < datos.length; i++) {
                    System.out.println(campos[i] + ": " + datos[i]);
                }
                System.out.println("");
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarBecario();
        mostrarFichero();
    }
    
}