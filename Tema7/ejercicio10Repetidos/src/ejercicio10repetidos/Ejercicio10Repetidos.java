package ejercicio10repetidos;

import java.util.Arrays;

public class Ejercicio10Repetidos {

    public static void main(String[] args) {
        int[] vector = new int[3];

        //Rellenamos el vector
        rellenarVector(vector);

        //Visualizamos el array original
        System.out.print("Se han generado los siguientes números: ");
        visualizarArray(vector);

        //Sustituimos los valores repetidos por 0
        sustituirRepetidos(vector);

        //Visualizamos el array modificado
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        visualizarArray(vector);
    }

    public static void rellenarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            //Genera aleatorios entre 1 y 8
            v[i] = (int) (Math.random() * 8) + 1;
        }
    }

    public static void visualizarArray(int[] v) {
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void sustituirRepetidos(int[] v) {
        for (int i = 0; i < v.length; i++) {
            //Si el valor ya es 0, lo saltamos
            if (v[i] == 0) continue;

            //Comparamos el elemento actual con todos los siguientes
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    v[j] = 0; //Sustituimos el valor repetido por 0
                }
            }
        }
    }
}