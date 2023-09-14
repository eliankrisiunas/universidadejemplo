/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author iarak
 */
public class ManejoInscripciones extends javax.swing.JInternalFrame {

    private AlumnoData alumnodata;
    private MateriaData materiadata;
    private DefaultTableModel modelotabla = new DefaultTableModel();

    public ManejoInscripciones() {
        initComponents();
        alumnodata = new AlumnoData();
        materiadata = new MateriaData();
        cargarCombo();
        armarCabecera();
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JRBmateriasInscr = new javax.swing.JRadioButton();
        JRBmateriasNoInscr = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();
        JBinscribir = new javax.swing.JButton();
        JBanularInscr = new javax.swing.JButton();
        JBsalir = new javax.swing.JButton();
        JCBalumnos = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manejo de Inscripciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione un alumno: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Listado de Materias");

        JRBmateriasInscr.setText("Materias inscriptas ");

        JRBmateriasNoInscr.setText("Materias no inscriptas");
        JRBmateriasNoInscr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBmateriasNoInscrActionPerformed(evt);
            }
        });

        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTabla);

        JBinscribir.setText("Inscribir");

        JBanularInscr.setText("Anular Inscripcion");

        JBsalir.setText("Salir");

        JCBalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBalumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(65, 65, 65)
                                .addComponent(JCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JBinscribir)
                                    .addGap(78, 78, 78)
                                    .addComponent(JBanularInscr)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBsalir))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JRBmateriasInscr)
                                    .addGap(141, 141, 141)
                                    .addComponent(JRBmateriasNoInscr))))
                        .addContainerGap(69, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBmateriasInscr)
                    .addComponent(JRBmateriasNoInscr))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBinscribir)
                    .addComponent(JBanularInscr)
                    .addComponent(JBsalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBalumnosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JCBalumnosActionPerformed

    private void JRBmateriasNoInscrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBmateriasNoInscrActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel)JTabla.getModel()).setRowCount(0);
        for (Materia materia : materiadata.listarMaterias()) {
            modelotabla.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnno()});
        }
    }//GEN-LAST:event_JRBmateriasNoInscrActionPerformed

    private void cargarCombo() {
        for (Alumno alumno : alumnodata.listarAlumnos()) {
            JCBalumnos.addItem(alumno);
        }

    }

    private void armarCabecera() {
        modelotabla.addColumn("ID");
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Año");
        JTabla.setModel(modelotabla);
    }

    private void cargarDatos() {
        for (Materia materia : materiadata.listarMaterias()) {
            modelotabla.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnno()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBanularInscr;
    private javax.swing.JButton JBinscribir;
    private javax.swing.JButton JBsalir;
    private javax.swing.JComboBox<Alumno> JCBalumnos;
    private javax.swing.JRadioButton JRBmateriasInscr;
    private javax.swing.JRadioButton JRBmateriasNoInscr;
    private javax.swing.JTable JTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
