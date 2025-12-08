/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1calculadora;

/**
 *
 * @author Usuario
 */
public class Multiplicacion extends Calculadora{
    private double multiplicador;

    public Multiplicacion(double numeroBase, double multiplicador) {
        super(numeroBase);
        this.multiplicador = multiplicador;
    }


    @Override
    public void realizarOperacion() {
        double resultado = this.numero * this.multiplicador;
        System.out.println("Multiplicación de " + this.numero + " * " + this.multiplicador + " = " + resultado); // Muestra el resultado por pantalla
    }
}
