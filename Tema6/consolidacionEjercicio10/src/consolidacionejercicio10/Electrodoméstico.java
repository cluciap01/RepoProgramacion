package consolidacionejercicio10;

/**
 *
 * @author alumno
 */
public class Electrodoméstico implements ConsumoEnergetico{
    private float kwh;
    private float preciokwh;
    private float eficiencia;
    private float consumo;

    //Constructor por defecto
    public Electrodoméstico(){
        this.kwh = 0.0f;
        this.preciokwh = 0.0f;
        this.eficiencia = 0.0f;
        this.consumo = 0.0f;
    }
    
    public Electrodoméstico(float kwh , float preciokwh , float eficiencia , float consumo){
        this.kwh = kwh;
        this.preciokwh = preciokwh;
        this.eficiencia = eficiencia;
        this.consumo = consumo;
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

    public float getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(float eficiencia) {
        this.eficiencia = eficiencia;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    
    @Override
    public float calcularConsumo(float horasDeUso) {
        return consumo= horasDeUso * kwh * eficiencia ;
    }

    @Override
    public float calcularFactura(float horasDeUso) {
        return consumo * preciokwh;
    }
    
}
