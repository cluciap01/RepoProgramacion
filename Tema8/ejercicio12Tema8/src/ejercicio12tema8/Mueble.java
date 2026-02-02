package ejercicio12tema8;

/**
 *
 * @author Christian
 */
public class Mueble {
    double precio;
    String descripcion;
    
    //Constructor por defecto
    public Mueble() {
        this.precio=0.0;
        this.descripcion="";
    }
    
    //Constructor parametrizado
    public Mueble(double precio , String descripcion){
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    //Getters Y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Precio: " +precio+ " y descripción: " +descripcion;
    }
    
}
