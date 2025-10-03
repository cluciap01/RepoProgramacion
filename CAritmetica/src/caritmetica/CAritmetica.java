package caritmetica;

/**
 *
 * @author alumno
 */
public class CAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1;
        int dato2;
        int resultado;
        
        dato1 = 20;
        dato2 = 10;
        
        //Suma
        resultado = dato1 + dato2;
        System.out.println(dato1 + " + " + dato2 + " = " + resultado);
        
        //Resta
        resultado = dato1 - dato2;
        System.out.println(dato1 + " - " + dato2 + " = " + resultado);
        
        //Producto
        resultado = dato1 * dato2;
        System.out.println(dato1 + " * " + dato2 + " = " + resultado);
        
        //Cociente
        resultado = dato1 / dato2;
        System.out.println(dato1 + " / " + dato2 + " = " + resultado);
    }
    
}
