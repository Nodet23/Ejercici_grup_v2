package dsa;

/**
 * Created by nodet on 20/11/17.
 */
public class Personaje {

    private String nombre;
    private String id;
    private int nivel;
    private int ataque;
    private int defensa;
    private int hp;

    public Personaje(String nombre, String id, int nivel, int ataque, int defensa, int hp) {
        this.nombre = nombre;
        this.id = id;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
        this.hp = hp;
    }

    public Personaje(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
