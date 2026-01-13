package ejercicio15menumesesarrays;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15MenuMesesArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] ventas = new int[12];
        String[] meses = {
            "Enero" , "Febrero" , "Marzo" , "Abril" , "Mayo" , "Junio" ,
            "Julio" , "Agosto" , "Septiembre" , "Octubre" , "Noviembre" , "Diciembre"};
        int opcion;

        do{
            System.out.println("========");
            System.out.println("/nMENÚ");
            System.out.println("========");
            System.out.println("1. Ventas aleatorias");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al revés");
            System.out.println("4. Mostrar suma total de ventas al año");
            System.out.println("5. Mostrar ventas totales en los meses pares");
            System.out.println("6. Mostrar el nombre del mes con más ventas");
            System.out.println("7. Salir del programa");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    rellenarVentas(ventas);
                    System.out.println("¡Ventas listas!");
                    break;
                case 2:
                    mostrarVentas(ventas,meses);
                    break;
                case 3:
                    mostrarVentasAlReves(ventas);
                    break;
                case 4:
                    System.out.println("La suma total del año es:");
                    break;
                case 5:
                    mostrarVentasMesesPares(ventas , meses);
                    System.out.println("Las ventas totales en los meses pares es:");
                    break;
                case 6:
                    mostrarMesMasVentas(ventas , meses);
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
            }
        }while (opcion != 7);
    }
    
    //Opción 1
    
    
    
    //Opción 2
    
    
    
    //Opción 3
    
    
    
    //Opción 4
    
    
    
    //Opción 5
    
    
    
    //Opción 6
    
    
    
    //Opción 7
    
    
    
}
