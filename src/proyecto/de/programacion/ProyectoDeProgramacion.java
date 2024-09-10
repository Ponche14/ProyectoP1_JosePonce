
package proyecto.de.programacion;

/**
 *
 * @author jdp14
 */
public class ProyectoDeProgramacion {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new GUI().setVisible(true);
            }
        });
    }
    
}
