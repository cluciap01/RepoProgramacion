
package metodosestáticos;

/**
 *
 * @author alumno
 */
public class MetodosEstáticos {
    //Método que imprime un saludo --> tipo void
    public static void saludo() {
        System.out.println("Hola mundo");
    }
    
    //Metodo que imprime un mensaje con un dato que recibe por parametro --> tipo void
    public static void saludoConParametros(int num) {
        System.out.println("Hola mundo" + num);
    }
    
    //Metodo que muestra la suma de dos numeros que recibe por parametro --> tipo void
    public static void suma(int num1, int num2){
        System.out.println("El suma de " +num1+ " y " +num2+ " es = " +(num1+num2));
    }
    
    //Metodo que devuelve la suma de dos numeros que recibe por parametro --> tipo int
    public static int sumados(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1 = 5;
       int num2 = 7;
       int resultado;
       //saludo(); //Para llamar al metodo saludo
       //saludoConParametros(4); //Saludo con parametro
       //suma(num1,num2);//Suma de dos parametros
       //resultado= sumados(num1, num2);//Devuelve el resultado de la suma
       //System.out.println(resultado);
        //Llamamos a la calculadora
        System.out.println(Calculadora.suma(num1 , num2));
        System.out.println(Calculadora.resta(num1 , num2));
       //Si queremos importar otra clase o paquete deberiamos de expecificar arriba con un import y el nombre del paquete
    }
    
}
