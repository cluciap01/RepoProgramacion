package ejercicio6notaalumno;

/**
 *
 * @author Usuario
 */
public class calificacion {
     public static void notas(int suspenso, int bien, int notable, int sobresaliente) {
        int nota;
        if (suspenso <= 4){
            nota = suspenso;
            System.out.println("Suspenso");
        } else if (bien == 5 || bien == 6){
            nota = bien;
            System.out.println("Bien");
        } else if (notable == 7 || notable == 8){
            nota = notable;
            System.out.println("Notable");
        } else if (sobresaliente == 9 || sobresaliente == 10){
            nota = sobresaliente;
            System.out.println("Sobresaliente");
        } else {
            System.out.println("El numero introducido no coincide con ninguna nota");
        }
}
}
