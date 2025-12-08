/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1calculadora;

/**
 *
 * @author Usuario
 */
public class Suma extends Calculadora{
    private double sumando;    
    
    public Suma(double numeroBase, double sumando) {
        super();
        this.sumando = sumando;
    }

    

    @Override
    public void realizarOperacion() {
        double resultado = this.numero + this.sumando;
        System.out.println("Suma de " + this.numero + " + " + this.sumando + " = " + resultado); // Muestra el resultado por pantalla
    }
}
