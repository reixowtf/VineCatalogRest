/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elcellervins;

import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.WindowConstants;

/**
 *
 * @author Reixowtf
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_principal = new javax.swing.JPanel();
        jB_editarProducte = new javax.swing.JButton();
        jB_obtenirCataleg = new javax.swing.JButton();
        jB_nouProducte = new javax.swing.JButton();
        jP_nouProducte = new javax.swing.JPanel();
        jB_tornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jB_editarProducte.setText("Editar Producte");

        jB_obtenirCataleg.setText("Obtenir Cataleg");
        jB_obtenirCataleg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_obtenirCatalegActionPerformed(evt);
            }
        });

        jB_nouProducte.setText("Nou Producte");
        jB_nouProducte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_nouProducteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_principalLayout = new javax.swing.GroupLayout(jP_principal);
        jP_principal.setLayout(jP_principalLayout);
        jP_principalLayout.setHorizontalGroup(
            jP_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_principalLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jP_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_editarProducte, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP_principalLayout.createSequentialGroup()
                        .addComponent(jB_nouProducte, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jB_obtenirCataleg, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jP_principalLayout.setVerticalGroup(
            jP_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_principalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jP_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_principalLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jB_obtenirCataleg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jB_nouProducte, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jB_editarProducte, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        getContentPane().add(jP_principal, "card3");

        jB_tornar.setText("Tornar");
        jB_tornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_tornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_nouProducteLayout = new javax.swing.GroupLayout(jP_nouProducte);
        jP_nouProducte.setLayout(jP_nouProducteLayout);
        jP_nouProducteLayout.setHorizontalGroup(
            jP_nouProducteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_nouProducteLayout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(jB_tornar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jP_nouProducteLayout.setVerticalGroup(
            jP_nouProducteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_nouProducteLayout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jB_tornar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jP_nouProducte, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_obtenirCatalegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_obtenirCatalegActionPerformed

    }//GEN-LAST:event_jB_obtenirCatalegActionPerformed

    private void jB_nouProducteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_nouProducteActionPerformed
        this.setContentPane(jP_nouProducte);
        jP_nouProducte.setVisible(true);
    }//GEN-LAST:event_jB_nouProducteActionPerformed

    private void jB_tornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_tornarActionPerformed
        jP_nouProducte.setVisible(false);
        this.setContentPane(jP_principal);
    }//GEN-LAST:event_jB_tornarActionPerformed

    private void tornar(Container c){
        c.setVisible(true);
        this.setContentPane(c);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_editarProducte;
    private javax.swing.JButton jB_nouProducte;
    private javax.swing.JButton jB_obtenirCataleg;
    private javax.swing.JButton jB_tornar;
    private javax.swing.JPanel jP_nouProducte;
    private javax.swing.JPanel jP_principal;
    // End of variables declaration//GEN-END:variables
}
