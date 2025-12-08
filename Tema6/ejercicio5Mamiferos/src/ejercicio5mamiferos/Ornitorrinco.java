package ejercicio5mamiferos;

/**
 *
 * @author Usuario
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    private int numeroDeHuevos;

    //Constructores
    public Ornitorrinco() {
        super();
        this.numeroDeHuevos = 0;
    }
    public Ornitorrinco(String nombre, String sexo, String color, int edad, int numHuevosInicial) {
        super(nombre, sexo, color, edad);
        this.numeroDeHuevos = numHuevosInicial;
    }

    // Implementación de Oviparo [6]
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo";
    }

    @Override
    public void ponerHuevo() {
        this.numeroDeHuevos++; // Aumenta el número de huevos en una unidad
        System.out.println(this.nombre + " ha puesto un huevo. Total actual: " + this.numeroDeHuevos);
    }

    @Override
    public void incubarHuevo() {
        if (this.numeroDeHuevos > 0) {
            this.numeroDeHuevos--; // Disminuye el número de huevos en una unidad
            System.out.println(this.nombre + " ha incubado un huevo. Total restante: " + this.numeroDeHuevos);
        } else {
            System.out.println(this.nombre + " no tiene huevos para incubar.");
        }
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println(this.nombre + " tiene " + this.numeroDeHuevos + " huevos.");
    }
}
