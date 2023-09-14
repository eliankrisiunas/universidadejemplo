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
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldAnno = new javax.swing.JTextField();
        jRadioButtonEst = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

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

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(21, 21, 21)
                        .addComponent(jButton1))
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
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed

        if (jTextFieldCod.getText() != null) {
            int id = Integer.parseInt(jTextFieldCod.getText());
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextFieldAnno.setText("");
        jTextFieldNom.setText("");
        jRadioButtonEst.setSelected(false);
        jTextFieldCod.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        CargarMateria();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jTextFieldCod.getText());
        Materia materia = materiadata.buscarMateria(id);
        materiadata.eliminarMateria(id);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLAnno;
    private javax.swing.JLabel jLCod;
    private javax.swing.JLabel jLEst;
    private javax.swing.JLabel jLMateria;
    private javax.swing.JLabel jLNom;
    private javax.swing.JRadioButton jRadioButtonEst;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldAnno;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNom;
    // End of variables declaration//GEN-END:variables

private void CargarMateria(){
    Materia materia = new Materia ( jTextFieldNom.getText(), Integer.parseInt(jTextFieldAnno.getText()), jRadioButtonEst.isEnabled());
    materiadata.guardarMateria(materia);
}





}
