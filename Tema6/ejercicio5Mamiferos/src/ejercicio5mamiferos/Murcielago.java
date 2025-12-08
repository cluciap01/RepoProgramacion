/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5mamiferos;

/**
 *
 * @author Usuario
 */
public class Murcielago extends Mamifero implements Volador{
    private double alturaVuelo;
    

    //Constructores
    public Murcielago() {
        super();
        this.alturaVuelo = 0;
    }
    public Murcielago(String nombre, String sexo, String color, int edad, double alturaInicial) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaInicial;
    }

    // Implementación de Volador
    @Override
    public String obtenerMensajeVolador() {
        return "El murciélago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        this.alturaVuelo += 5; // Aumenta la altura en 5 metros
        System.out.println(this.nombre + " ha ascendido. Altura actual: " + this.alturaVuelo + " metros.");
    }

    @Override
    public void bajarAlturaVuelo() {
        this.alturaVuelo -= 5; // Disminuye la altura en 5 metros
        if (this.alturaVuelo < 0) this.alturaVuelo = 0;
        System.out.println(this.nombre + " ha descendido. Altura actual: " + this.alturaVuelo + " metros.");
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println(this.nombre + " está volando a " + this.alturaVuelo + " metros de altura.");
    }
}
