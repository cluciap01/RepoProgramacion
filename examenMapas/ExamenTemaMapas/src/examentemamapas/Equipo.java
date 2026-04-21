package examentemamapas;

/**
 *
 * @author alumno
 */
public class Equipo implements Comparable<Equipo>{
    private int codigo;
    private String nombre;
    private int trofeos;
    
    public Equipo(){
        this.codigo=0;
        this.nombre="";
        this.trofeos=0;
    }
    
    public Equipo(int codigo, String nombre, int trofeos){
        this.codigo=codigo;
        this.nombre=nombre;
        this.trofeos=trofeos;
    }
    
    //GETTERS Y SETTERS

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(int trofeos) {
        this.trofeos = trofeos;
    }
    
@Override
public int compareTo(Equipo e){
    if(e.getTrofeos()>trofeos){
        return 1;
    } else if (e.getTrofeos()== trofeos) {
        return 0;
    } else {
        return -1;
    }
}

@Override
public String toString(){
    return nombre + " (" +codigo+ ") - " +trofeos+ " trofeos ganados";
}
}