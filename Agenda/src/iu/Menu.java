/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iu;

import vistaEscritorio.LoginAdmin;
import vistaEscritorio.LoginAgenda;

/**
 *
 * @author peraza
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemLoginAgenda = new javax.swing.JMenuItem();
        itemLoginAdministrador = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Usuario");

        itemLoginAgenda.setText("Login Agenda");
        itemLoginAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginAgendaActionPerformed(evt);
            }
        });
        jMenu1.add(itemLoginAgenda);

        itemLoginAdministrador.setSelected(true);
        itemLoginAdministrador.setText("Login Administrador");
        itemLoginAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginAdministradorActionPerformed(evt);
            }
        });
        jMenu1.add(itemLoginAdministrador);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        setBounds(0, 0, 416, 308);
    }// </editor-fold>//GEN-END:initComponents

    private void itemLoginAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginAgendaActionPerformed
        loginAgenda();
    }//GEN-LAST:event_itemLoginAgendaActionPerformed

    private void itemLoginAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginAdministradorActionPerformed
        loginAdmin();
    }//GEN-LAST:event_itemLoginAdministradorActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem itemLoginAdministrador;
    private javax.swing.JMenuItem itemLoginAgenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void loginAgenda() {
        new LoginAgenda(this, false).setVisible(true); //modal=true bloquea las otras ventanas.
    }

    private void loginAdmin() {
        new LoginAdmin(this, false).setVisible(true);
    }
}
