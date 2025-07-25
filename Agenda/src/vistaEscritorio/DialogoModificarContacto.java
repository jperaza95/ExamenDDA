/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistaEscritorio;

import controlador.ControladorEditarContacto;
import controlador.VistaEditarContacto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Contacto;
import modelo.TipoTelefono;

/**
 *
 * @author peraza
 */
public class DialogoModificarContacto extends javax.swing.JDialog implements VistaEditarContacto{

    private ControladorEditarContacto controlador;
    /**
     * Creates new form DialogoModificarContacto
     */
    public DialogoModificarContacto(java.awt.Frame parent, boolean modal, Contacto c) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorEditarContacto(this, c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bModificar = new javax.swing.JButton();
        comboTiposTelefono = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Numero:");

        jLabel2.setText("Tipo:");

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bModificar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNumero)
                            .addComponent(comboTiposTelefono, 0, 130, Short.MAX_VALUE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboTiposTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(bModificar)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        setBounds(0, 0, 359, 284);
    }// </editor-fold>//GEN-END:initComponents

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        controlador.modificar(tfNumero.getText(), (TipoTelefono)comboTiposTelefono.getSelectedItem());
    }//GEN-LAST:event_bModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bModificar;
    private javax.swing.JComboBox comboTiposTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cargarTiposTelefono(ArrayList<TipoTelefono> tiposTelefono) {
        
        comboTiposTelefono.removeAll();
        for(TipoTelefono t: tiposTelefono){
            comboTiposTelefono.addItem(t);
        }
    }

    @Override
    public void mostrarNombre(String nombre) {
        setTitle("CONTACTO: "+nombre.toUpperCase());
    }

    @Override
    public void mostrarTipoTelefono(TipoTelefono tipo) {
        comboTiposTelefono.setSelectedItem(tipo);

    }

    @Override
    public void mostrarNumero(String numero) {
        tfNumero.setText(numero);
    }

    @Override
    public void mostrarMensajeModificadoCorrectamente() {
        JOptionPane.showMessageDialog(this, "Contacto modificado.");
    }

    @Override
    public void mostrarError(String message) {
        JOptionPane.showMessageDialog(this, message);

    }
    
    
}
