package dsa;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nodet on 20/11/17.
 */
public class Jugadores {

    HashMap<String, Jugador> mapaJugadores;

    static Jugadores intanceJugadores;

    private Jugadores()
    {
        mapaJugadores = new HashMap<String, Jugador>();
        Jugador juan = new Jugador("juan", "juan@msn.com", "123", new ArrayList<Personaje>());
        Jugador bruno = new Jugador("bruno", "bruno@msn.com", "123", new ArrayList<Personaje>());
        Personaje vidente = new Personaje("vidente", "123", 1,1,1,1);
        Personaje nodet = new Personaje("nodet", "123", 2,2,2,2);
        bruno.getPersonajes().add(nodet);
        juan.getPersonajes().add(vidente);
        mapaJugadores.put(bruno.getNombre(), bruno);
        mapaJugadores.put(juan.getNombre(), juan);
    }

    static Jugadores getDbInstancia()
    {
        if(intanceJugadores == null)
        {
            intanceJugadores = new Jugadores();
        }
        return intanceJugadores;
    }


    public HashMap<String, Jugador> getMapaJugadores() {
        return mapaJugadores;
    }

    public void setMapaJugadores(HashMap<String, Jugador> mapaJugadores) {
        this.mapaJugadores = mapaJugadores;
    }

    public static Jugadores getIntanceJugadores() {
        return intanceJugadores;
    }

    public static void setIntanceJugadores(Jugadores intanceJugadores) {
        Jugadores.intanceJugadores = intanceJugadores;
    }
}
