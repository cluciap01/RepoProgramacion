package testtelevision;

/**
 *
 * @author alumno
 */
public class Television implements ControlRemoto{

    private boolean encendido;
    private int canal;
    private int volumen;
    
    //Constructor por defecto
    public Television() {
        this.encendido=false;
        this.canal=1;
        this.volumen=10;
}
    public Television(boolean encendido , int canal , int volumen) {
        this.encendido=encendido;
        this.canal=canal;
        this.volumen=volumen;
}

    //GETTERS Y SETTERS
    private int getCanal(){
        return this.canal;
    }
    
    private void setCanal(int canal){
        this.canal=canal;
    }
    
    private int getVolumen(){
        return this.volumen;
    }
    
    private void setVolumen(int volumen){
        this.volumen=volumen;
    }
    @Override
    public void apagar() {
        
    }

    @Override
    public void encender() {

    }

    @Override
    public void bajarVolumen() {

    }

    @Override
    public void subirVolumen() {

    }

    @Override
    public void cambiarCanal() {

    }
    
}
