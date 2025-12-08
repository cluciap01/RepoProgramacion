/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1calculadora;

/**
 *
 * @author Usuario
 */
public abstract class Calculadora {
    public double numero;
    
// Constructores
    public Calculadora (){
        numero = 0;
    }
    public Calculadora(double numero) {
        this.numero = numero;
    }
    
    //Método abstracto
    public abstract void realizarOperacion();
}
