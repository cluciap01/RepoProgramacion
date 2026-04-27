package examenficheros;

/**
 *
 * @author Christian
 */
public class Producto {
    String nombre;
    int cantidad;
    double precio;
    
    //Constructor por defecto
    public Producto(){
        String nombre = "";
        int cantidad = 0;
        double precio = 0.0; 
    }
    
    //Constructor parametrizado
    public Producto(String nombre, int cantidad, double precio){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
