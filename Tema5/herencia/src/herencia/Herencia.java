package herencia;

/**
 *
 * @author alumno
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaje personaje = new personaje();
        System.out.println(personaje);
        
        jugador jugador=new jugador(50, "palo");
        System.out.println(jugador);
        
        enemigo enemigo=new enemigo(30, "espada");
        System.out.println(enemigo);
        
        personaje.atacar();
        jugador.atacar();
        enemigo.atacar();
        //Atacar pueden hacerlo todos ya que es por defecto
        
        jugador.recoger();
        //Recoger solo puede hacerlo el jugador
        
        enemigo.crearSoldados();
        //CrearSoldados solo puede hacer el enemigo
        
        jugador.getInventario();
        jugador.getVida();
        
        System.out.println(jugador.getInventario());
        System.out.println(jugador.getVida());
        
        System.out.println(personaje.getVida());
        
        System.out.println(enemigo.getVida());
    }
    
}
