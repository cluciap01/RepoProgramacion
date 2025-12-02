package testtelevision;

/**
 *
 * @author alumno
 */
public class Radio implements ControlRemoto{

    private boolean encendido;
    private float emisora;
    private int volumen;
    
    //Constructor por defecto
    public Radio() {
        this.encendido=false;
        this.emisora=80.0f;
        this.volumen=15;
}
    public Radio(boolean encendido , float emisora , int volumen) {
        this.encendido=encendido;
        this.emisora=emisora;
        this.volumen=volumen;
}
 //GETTERS Y SETTERS
    private float getEmisora(){
        return this.emisora;
    }
    
    private void setCanal(float emisora){
        this.emisora=emisora;
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
        return ;
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
