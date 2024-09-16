
package proyecto.de.programacion;

import java.util.Random;

/**
 *
 * @author jdp14
 */
public class POLICIA {
    private int ID;

    public POLICIA(int ID) {
        this.ID = ID;
    }
    
    private int GenerarID(){
        Random rand = new Random();
        return rand.nextInt(999) + 1;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
