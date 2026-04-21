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
    
    public void mostrarEquipos(){
        cEquipos.forEach(System.out::println);
    } 
    
    public boolean buscarEquipoPorNombre(String nombre){
    Iterator<Equipo> it = cEquipos.iterator();
    Equipo aux;
    boolean enc = false;
    
    while(it.hasNext() && !enc){
        aux = it.next();
        
        if(aux.getNombre().equalsIgnoreCase(nombre)){
            enc = true;
        }
    }
    return enc;
    }
    
    public Map<Integer, Equipo> pasarEquiposAMapa(){
        Map<Integer, Equipo> mEquipo = new TreeMap<>();
        for (Equipo equipo : cEquipos){
            mEquipo.put(equipo.getCodigo(), equipo);
        }
            return mEquipo;
        }
    
    public void mostrarEquipoConMasTrofeos(Map<Integer, Equipo> mEquipos, int cantidadTrofeosFiltro){
        Iterator <Integer> it = mEquipos.keySet().iterator();
        Equipo aux = null;
        Integer clave;
        int numTrofeos = 99999;
        
        while (it.hasNext()){
            clave = it.next();
            aux = mEquipos.get(clave);
            numTrofeos = aux.getTrofeos();  
        if(numTrofeos >= cantidadTrofeosFiltro){
            System.out.println("");
        }
        }
    }
}