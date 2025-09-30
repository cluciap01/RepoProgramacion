package caritmetica2;

/**
 *
 * @author alumno
 */
public class Caritmetica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1;
        int dato2;
        int dato3;
        int resultado;
        
        dato1 = 20;
        dato2 = 10;
        dato3 = 40;
        
        //Suma
        resultado = dato1 + dato2 + dato3;
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);
        
        //Resta
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);
        
        //Producto
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);
        
        //Cociente
        resultado = dato1 / dato2;
        System.out.println(dato1 + " / " + dato2 + " = " + resultado);
    }
    
}
