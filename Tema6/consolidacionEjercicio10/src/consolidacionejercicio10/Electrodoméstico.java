package consolidacionejercicio10;

/**
 *
 * @author alumno
 */
public class Electrodoméstico implements ConsumoEnergetico{
    private float kwh;
    private float preciokwh;
    private String eficiencia;

    //Constructor por defecto
    public Electrodoméstico(){
        this.kwh = 0.0f;
        this.preciokwh = 0.0f;
        this.eficiencia = "";
    }
    
    public Electrodoméstico(float kwh , float preciokwh , String eficiencia){
        this.kwh = kwh;
        this.preciokwh = preciokwh;
        this.eficiencia = eficiencia;
    }

    //GETTERS Y SETTERS
    
    public float getKwh() {
        return kwh ;
    }

    public void setKwh(float kwh) {
        this.kwh = kwh;
    }

    public float getPreciokwh() {
        return preciokwh;
    }

    public void setPreciokwh(float preciokwh) {
        this.preciokwh = preciokwh;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }


    private float obtenerEficacia(){
        switch (eficiencia.toUpperCase()) {
            case "A++":
                return 0.5f;
            case "A+":
                return 0.7f;
            case "A":
                return 1f;
            case "B":
                return 1.2f;
            default:
                return 1.0f;
        }
    }
    @Override
    public float calcularConsumo(float horasDeUso) {
        return horasDeUso * kwh * obtenerEficacia() ;
    }

    @Override
    public float calcularFactura(float horasDeUso) {
        return calcularConsumo(horasDeUso) * preciokwh;
    }

    @Override
    public String toString() {
        return "";
    }
    
}
