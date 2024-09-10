
package proyecto.de.programacion;

import java.util.Random;

/**
 *
 * @author jdp14
 */
public class Personaje {
    private String nombre;
    private int edad;
    private int id;
    private double dinero;

    public Personaje(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = GenerarID();
    }
    
    private int GenerarID(){
        Random rand = new Random();
        return rand.nextInt(999) + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public double getDinero() {
        return dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    
}
