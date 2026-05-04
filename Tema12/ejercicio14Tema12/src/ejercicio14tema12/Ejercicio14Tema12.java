package ejercicio14tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */

public class Ejercicio14Tema12 {
    /**
     * Realizar un programa que partiendo del fichero “DatosBeca.txt”
     * calcule la cuantía de la beca (en caso de que la haya). El total de la beca se calcula
     * como sigue:
     * Base fija de 1500€
     * Si los ingresos anuales de la familia son menores o iguales a la media (12.000€), la beca
     * se incrementa en 500€, en caso contrario no lleva complementos.
     * Si la edad de la persona es inferior a 23 años, 200€ de gratificación, si es mayor no hay
     * gratificación.
     * Si no hay suspensos en el curso anterior, hay una gratificación de 500€, 1 suspenso
     * 200€, si hay 2 suspensos o más no hay beca.
     * Si vive de alquiler (no residencia familiar), 1000€ más de gratificación.
     * Visualizar el nombre de cada uno de los becarios y su cuantía total (sólo los que
     * tienen beca). 
     */
    public static void calcularBeca(ArrayList<String> concedidas, ArrayList<Integer> cantidades){
        String linea;
        String[] datos = new String[6];
        int recorrer = 0, beca;
        try (
            FileReader fr = new FileReader("DatosBeca.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (linea != null) {
                beca = 1500;
                datos = linea.split("#");
                if (!(Integer.parseInt(datos[3]) >= 2)) {
                    concedidas.add(datos[0]);
                    if (Integer.parseInt(datos[5]) <= 12000) {
                        beca += 500;
                    }
                    if (Integer.parseInt(datos[2]) < 23) {
                        beca += 200;
                    }
                    if (Integer.parseInt(datos[3]) == 0) {
                        beca += 500;
                    } else {
                        beca += 200;
                    }
                    if (datos[4].equalsIgnoreCase("SI")) {
                        beca += 1000;
                    }
                    cantidades.add(beca);
                    recorrer++;
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
    
    public static void mostrarConcedidas(ArrayList<String> concedidas, ArrayList<Integer> cantidades){
        for (int i = 0; i < concedidas.size(); i++) {
            System.out.println(concedidas.get(i) + ": " + cantidades.get(i) + " euros");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> concedidas = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        
        calcularBeca(concedidas, cantidades);
        mostrarConcedidas(concedidas, cantidades);
    }
    
}