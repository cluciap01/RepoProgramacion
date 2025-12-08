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
    public float getEmisora(){
        return this.emisora;
    }
    
    public void setCanal(float emisora){
        this.emisora=emisora;
    }
    
    public int getVolumen(){
        return this.volumen;
    }
    
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    
    public void mostrarInformacion() {
        String estado = encendido ? "Encendida" : "Apagada";
        System.out.println("Radio - Estado: " + estado + ", Emisora: " + emisora + ", Volumen: " + volumen);
    }
    
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true; // si la radio no está encendida, se encienda
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false; // si la radio está encendida, se apague
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen = Math.max(0, volumen - 5); // se decrementa en 5
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5; // se incrementa en 5
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float nuevaEmisora) {
        if (encendido) {
            this.emisora = nuevaEmisora; // le asigna al atributo emisora el valor pasado por parámetro
            System.out.println("Emisora cambiada a: " + this.emisora);
        }
    }
}
