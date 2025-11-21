package ejercicio15direccion;

/**
 *
 * @author Usuario
 */
public class direccion {
    private String calle;
    private int numero;
    private int piso; 
    public String ciudad;

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