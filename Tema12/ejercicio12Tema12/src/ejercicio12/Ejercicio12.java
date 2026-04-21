package ejercicio12;

import java.io.*;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos las rutas de los archivos
        String archivoPares = "pares.txt";
        String archivoImpares = "impares.txt";
        String archivoResultados = "resultados.txt";

        // Usamos try-with-resources para abrir y cerrar automáticamente los flujos
        try (
            BufferedReader brPares = new BufferedReader(new FileReader(archivoPares));
            BufferedReader brImpares = new BufferedReader(new FileReader(archivoImpares));
            PrintWriter pw = new PrintWriter(new FileWriter(archivoResultados))
        ) {
            System.out.println("Procesando archivos y calculando sumas...");

            // Leemos la primera línea de cada fichero
            String lineaPar = brPares.readLine();
            String lineaImpar = brImpares.readLine();

            // Mientras existan datos en ambos ficheros
            while (lineaPar != null && lineaImpar != null) {
                try {
                    // Convertimos las cadenas leídas a números enteros
                    int numPar = Integer.parseInt(lineaPar.trim());
                    int numImpar = Integer.parseInt(lineaImpar.trim());

                    // Calculamos la suma y la escribimos en el fichero de resultados
                    int suma = numPar + numImpar;
                    pw.println(suma); 

                } catch (NumberFormatException e) {
                    System.out.println("Error: Una de las líneas no contiene un número válido.");
                }

                // Leemos las siguientes líneas para continuar el bucle
                lineaPar = brPares.readLine();
                lineaImpar = brImpares.readLine();
            }

            System.out.println("Fichero '" + archivoResultados + "' creado con éxito.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se ha encontrado alguno de los archivos de entrada.");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura: " + e.getMessage());
        }
    }
}
