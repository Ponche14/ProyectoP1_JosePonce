
package proyecto.de.programacion;

/**
 *
 * @author jdp14
 */
public class GUI extends javax.swing.JFrame {
    
    public GUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Saludar = new javax.swing.JLabel();
        Boton_Informacion = new javax.swing.JButton();
        Boton_CrearPersonaje = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_Menu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Saludar.setText("Bienvenido");

        Boton_Informacion.setText("Informacion del programa");
        Boton_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_InformacionActionPerformed(evt);
            }
        });

        Boton_CrearPersonaje.setText("Empezar programa (Crear personaje)");
        Boton_CrearPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CrearPersonajeActionPerformed(evt);
            }
        });

        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        TextArea_Menu.setColumns(20);
        TextArea_Menu.setRows(5);
        jScrollPane1.setViewportView(TextArea_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Saludar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton_Informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton_CrearPersonaje, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Label_Saludar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton_Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_CrearPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_InformacionActionPerformed
        TextArea_Menu.setText("Informacion del programa \n\nEl programa consiste en un mundo abierto como el juego GTA, \ndonde el usuario podra interactuar con varias cosas que el programa \nofrece. Iniciara creando su personaje y una vez creado tendra la \nopcion de hacer el tutorial o ir directo al juego. Como mencionado \nantes el usuario podra hacer lo que el quiera, el personaje solamente \ntiene una vida y si es arrestado tendra que pagar una multa y si no \ntiene el dinero suficiente el personaje no podra salir de la carcel y \nterminara el programa.");
    }//GEN-LAST:event_Boton_InformacionActionPerformed

    private void Boton_CrearPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CrearPersonajeActionPerformed
        CrearPersonaje crearPersonaje = new CrearPersonaje(this);
        crearPersonaje.setLocationRelativeTo(this);
        crearPersonaje.setVisible(true);
    }//GEN-LAST:event_Boton_CrearPersonajeActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        TextArea_Menu.setText("Saliendo del programa...");
        System.exit(0);
    }//GEN-LAST:event_Boton_SalirActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_CrearPersonaje;
    private javax.swing.JButton Boton_Informacion;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JLabel Label_Saludar;
    private javax.swing.JTextArea TextArea_Menu;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
