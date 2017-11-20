package dsa;

import java.util.ArrayList;

/**
 * Created by nodet on 20/11/17.
 */
public class Jugador {
    private String nombre;
    private String email;
    private String contraseña;

    ArrayList<Personaje> Personajes;

    public Jugador(String nombre, String email, String contraseña, ArrayList<Personaje> personajes) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        Personajes = personajes;
    }

    public Jugador(){
        Personajes = new ArrayList<Personaje>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Personaje> getPersonajes() {
        return Personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        Personajes = personajes;
    }
}
