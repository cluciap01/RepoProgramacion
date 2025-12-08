package testtelevision;

/**
 *
 * @author alumno
 */
public class Television implements ControlRemoto{

    private boolean encendido; 
    private int canal;
    private int volumen;

    //Constructores
    public Television() {
        this.encendido= false;
        this.canal= 1;
        this.volumen= 10;
    }
    public Television(boolean encendido , int canal , int volumen) {
        this.encendido=encendido;
        this.canal=canal;
        this.volumen=volumen;
    }

    //GETTERS Y SETTERS
    public int getCanal(){
        return this.canal;
    }
    
    public void setCanal(int canal){
        this.canal=canal;
    }
    
    public int getVolumen(){
        return this.volumen;
    }
    
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    
    public void mostrarInformacion() {
        String estado = encendido ? "Encendido" : "Apagado";
        System.out.println("TV - Estado: " + estado + ", Canal: " + canal + ", Volumen: " + volumen);
    }

    @Override
    public void encender() {
        if (!encendido) {
            encendido = true; // si la tv no está encendida, se encienda 
            System.out.println("TV Encendida. Canal actual: " + canal); // y muestre el canal actual 
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("La TV se apagará en 10s"); 
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen = Math.max(0, volumen - 1); // se decrementa en 1
            System.out.println("Volumen actual: " + volumen); // y muestra el volumen actual
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen++; // se incrementa en 1
            System.out.println("Volumen actual: " + volumen); // y muestra el volumen actual 
        }
    }

    @Override
    public void cambiarCanal(float nuevoCanal) {
        if (encendido) {
            // Asignamos al atributo canal (int) el valor float pasado por parámetro 
            this.canal = (int) nuevoCanal; 
            System.out.println("Canal cambiado a: " + this.canal); // y muestra por pantalla el canal actual 
        }
    }
}
