/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1calculadora;

/**
 *
 * @author Usuario
 */
public class Potencia extends Calculadora{
    private double exponente;

    public Potencia(double numeroBase, double exponente) {
        super(numeroBase);
        this.exponente = exponente;
    }


    @Override
    public void realizarOperacion() {
        // Cálculo de la potencia de numero elevado a exponente [5]
        double resultado = Math.pow(this.numero, this.exponente); 
        System.out.println("Potencia de " + this.numero + " elevado a " + this.exponente + " = " + resultado); // Muestra el resultado por pantalla [5]
    }
}
