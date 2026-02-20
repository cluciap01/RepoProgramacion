package ejercicio7temperaturasdia;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio7TemperaturasDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Creamos el array de 30 posiciones para objetos Día
        Dia[] mes = new Dia[3];
        String[] semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion;

        do {
            System.out.println("\n--- MENÚ TEMPERATURAS ---");
            System.out.println("1. Rellenar temperaturas (Aleatorio)");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Ver temperatura media");
            System.out.println("4. Ver día(s) más caluroso(s)");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    // El día 1 comienza en un día aleatorio de la semana
                    int indiceSemana = (int) (Math.random() * 7); 
                    for (int i = 0; i < mes.length; i++) {
                        mes[i] = new Dia(); // Instanciamos el objeto en la posición
                        mes[i].setNombreDia(semana[(indiceSemana + i) % 7]);
                        // Temperatura aleatoria entre 10 y 45 grados
                        mes[i].setTemperatura((int) (Math.random() * 36) + 10);
                    }
                    System.out.println("Mes rellenado con éxito.");
                    break;

                case 2:
                    if (mes == null) {
                        System.out.println("Primero debe rellenar los datos (Opción 1).");
                    } else {
                        for (int i = 0; i < mes.length; i++) {
                            System.out.println(mes[i].getNombreDia() + " día " + (i + 1) + ": " + mes[i].getTemperatura() + " grados.");
                        }
                    }
                    break;

                case 3:
                    int suma = 0;
                    for (Dia d : mes) {
                        suma += d.getTemperatura();
                    }
                    System.out.println("La temperatura media del mes es: " + (float) suma / 30 + " grados.");
                    break;

                case 4:
                    // Buscamos la temperatura máxima
                    int maxTemp = -100;
                    for (Dia d : mes) {
                        if (d.getTemperatura() > maxTemp) maxTemp = d.getTemperatura();
                    }
                    System.out.println("El día o días más calurosos fueron:");
                    for (int i = 0; i < mes.length; i++) {
                        if (mes[i].getTemperatura() == maxTemp) {
                            System.out.println("• El " + mes[i].getNombreDia() + " día " + (i + 1) + " con " + maxTemp + " grados.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 5);
    }
}