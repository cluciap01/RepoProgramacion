package examentemamapas;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Deporte {
    private String nombre;
    private Set<Equipo> cEquipos;
    
    public Deporte (){
    this.nombre="";
    this.cEquipos=new HashSet<>();
    }
    
    public Deporte (String nombre){
        this.nombre=nombre;
        this.cEquipos=new HashSet<>();
    }
    
    public Deporte (String nombre , Set<Equipo> cEquipos){
    this.nombre=nombre;
    this.cEquipos=new HashSet<>();
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Equipo> getcEquipos() {
        return cEquipos;
    }

    public void setcEquipos(Set<Equipo> cEquipos) {
        this.cEquipos = cEquipos;
    }
    
    private String pedirSeguir(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿Desea agregar otro equipo? (S/N)");
        return entrada.nextLine();
    }
    
    private int pedirCodigo(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Código: ");
        return entrada.nextInt();
    }
    
    private String pedirNombre(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Nombre: ");
        return entrada.nextLine();
    }
    
    private int pedirTrofeos(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Nº de trofeos ganados: ");
        return entrada.nextInt();
    }
    
    public void agregarEquipos(){
        do{
            System.out.println("Nuevo equipo: ");
            cEquipos.add(new Equipo(pedirCodigo(), pedirNombre(), pedirTrofeos()));
        } while(pedirSeguir().equalsIgnoreCase("S"));
    }
    
    
}
