package universidadejemplo.Vistas;

import static java.lang.String.valueOf;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Materia;

public class FMateria extends javax.swing.JInternalFrame {

    private MateriaData materiadata;

    public FMateria() {
        initComponents();
        materiadata = new MateriaData();
        JBbuscar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLMateria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLCod = new javax.swing.JLabel();
        jLNom = new javax.swing.JLabel();
        jLAnno = new javax.swing.JLabel();
        jLEst = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        JTC = new javax.swing.JTextField();
        jTextFieldAnno = new javax.swing.JTextField();
        jRadioButtonEst = new javax.swing.JRadioButton();
        JBsalir = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();
        JBnuevo = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLMateria.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMateria.setText("Materia");

        jLCod.setText("Código");

        jLNom.setText("Nombre");

        jLAnno.setText("Año");

        jLEst.setText("Estado");

        JTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTCKeyReleased(evt);
            }
        });

        JBsalir.setText("Salir");
        JBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirActionPerformed(evt);
            }
        });

        JBbuscar.setText("Buscar");
        JBbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBbuscarMouseClicked(evt);
            }
        });
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        JBnuevo.setText("Nuevo");
        JBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevoActionPerformed(evt);
            }
        });

        JBeliminar.setText("Eliminar");
        JBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminarActionPerformed(evt);
            }
        });

        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(JBnuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBguardar)
                        .addGap(21, 21, 21)
                        .addComponent(JBsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNom)
                            .addComponent(jLCod)
                            .addComponent(jLAnno)
                            .addComponent(jLEst))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEst)
                            .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(JBbuscar))
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCod)
                    .addComponent(JTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAnno)
                    .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEst)
                    .addComponent(jRadioButtonEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBsalir)
                    .addComponent(JBnuevo)
                    .addComponent(JBeliminar)
                    .addComponent(JBguardar))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed

        if (JTC.getText() != null) {
            int id = Integer.parseInt(JTC.getText());
            Materia materia = materiadata.buscarMateria(id);
            jTextFieldAnno.setText(valueOf(materia.getAnno()));
            jTextFieldNom.setText(materia.getNombre());
            jRadioButtonEst.setSelected(materia.isEstado());
        } else {
            JOptionPane.showMessageDialog(null, "necesitas ingresar un codigo");
        }
    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JBbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBbuscarMouseClicked

    }//GEN-LAST:event_JBbuscarMouseClicked

    private void JBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevoActionPerformed
        // TODO add your handling code here:
        jTextFieldAnno.setText("");
        jTextFieldNom.setText("");
        jRadioButtonEst.setSelected(false);
        JTC.setText("");
    }//GEN-LAST:event_JBnuevoActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_JBsalirActionPerformed

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        // TODO add your handling code here:
        CargarMateria();
    }//GEN-LAST:event_JBguardarActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JTC.getText());
        Materia materia = materiadata.buscarMateria(id);
        materiadata.eliminarMateria(id);
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void JTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTCKeyReleased
        // TODO add your handling code here:
        if (JTC.getText().isEmpty()) {
            JBbuscar.setEnabled(false);
        } else {
            JBbuscar.setEnabled(true);
        }
    }//GEN-LAST:event_JTCKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBnuevo;
    private javax.swing.JButton JBsalir;
    private javax.swing.JTextField JTC;
    private javax.swing.JLabel jLAnno;
    private javax.swing.JLabel jLCod;
    private javax.swing.JLabel jLEst;
    private javax.swing.JLabel jLMateria;
    private javax.swing.JLabel jLNom;
    private javax.swing.JRadioButton jRadioButtonEst;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldAnno;
    private javax.swing.JTextField jTextFieldNom;
    // End of variables declaration//GEN-END:variables

private void CargarMateria(){
    Materia materia = new Materia ( jTextFieldNom.getText(), Integer.parseInt(jTextFieldAnno.getText()), jRadioButtonEst.isEnabled());
    materiadata.guardarMateria(materia);
    materiadata.modificarMateria(materia);
}





}
