
package proyecto.de.programacion;

import java.util.Random;

/**
 *
 * @author jdp14
 */
public class NPC {
    private String nombre;
    private int ID;

    public NPC(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = GenerarID();
    }
    
    private int GenerarID(){
        Random rand = new Random();
        return rand.nextInt(999)+1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
