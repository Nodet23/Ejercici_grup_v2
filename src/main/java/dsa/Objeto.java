package dsa;

/**
 * Created by nodet on 21/11/17.
 */
public class Objeto {

    private String nombre;
    private String tipo;
    private String calidad;
    private int durabilidad;


    public Objeto(){

    }

    public Objeto(String nombre, String id, String calidad, int durabilidad) {
        this.nombre = nombre;
        this.tipo = id;
        this.calidad = calidad;
        this.durabilidad = durabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }
}
