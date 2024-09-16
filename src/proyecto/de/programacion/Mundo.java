
package proyecto.de.programacion;

/**
 *
 * @author jdp14
 */
public class Mundo extends javax.swing.JFrame {

    private Personaje personaje;
    
    
    public Mundo(Personaje personaje) {
        this.personaje = personaje;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Banco = new javax.swing.JButton();
        Tienda = new javax.swing.JButton();
        Casa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Banco.setText("Banco");
        Banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BancoActionPerformed(evt);
            }
        });

        Tienda.setText("Tienda");

        Casa.setText("Casa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(Banco)
                .addGap(132, 132, 132)
                .addComponent(Tienda)
                .addGap(119, 119, 119)
                .addComponent(Casa)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Banco)
                    .addComponent(Tienda)
                    .addComponent(Casa))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BancoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Banco;
    private javax.swing.JButton Casa;
    private javax.swing.JButton Tienda;
    // End of variables declaration//GEN-END:variables
}
