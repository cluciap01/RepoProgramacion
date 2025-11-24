package ejercicio15direccion;

/**
 *
 * @author Usuario
 */
public class empleado {
    private String nombre;
    private int salario;
    private direccion direccion;

    //Constructor por defecto
    public empleado(){
        this.nombre="";
        this.salario=0;
        this.direccion=new direccion();
    }
    // Constructor para Empleado
    public empleado(String nombre, int salario, direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    // Método para mostrar el estado del empleado
    public void obtenerEstado() {
        System.out.println("EMPLEADO:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Dirección:");
        
        System.out.println("Calle: " + direccion.obtenerCalle()); 
        
        System.out.println("Ciudad: " + direccion.ciudad); 
    }
}

