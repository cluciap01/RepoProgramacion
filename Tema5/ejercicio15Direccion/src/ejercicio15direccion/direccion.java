package ejercicio15direccion;

/**
 *
 * @author Usuario
 */
public class direccion {
    public String calle;
    public int numero;
    public int piso; 
    public String ciudad;
    
    //Constructor por defecto
    public direccion(){
        this.calle="";
        this.numero=0;
        this.piso=0;
        this.ciudad="";
    }

    public direccion(String calle, int numero, int piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    public String obtenerCalle() {
        return calle;
    }

    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}