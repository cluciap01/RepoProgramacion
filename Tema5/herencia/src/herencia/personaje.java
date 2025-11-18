/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author alumno
 */
public class personaje {
    private int vida;

    public personaje(){
    this.vida=100;
    }

    public personaje(int vida){
    this.vida=vida;
    }

    public int getVida(){
        return this.vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void atacar(){
        System.out.println("Atacando...");
    }
    
    @Override
    public String toString(){
        return "El PERSONAJE tiene " +this.vida+ " % de vida";
    }
}