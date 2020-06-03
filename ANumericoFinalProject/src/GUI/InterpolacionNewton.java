package GUI;

import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amboraes 
 */
public final class InterpolacionNewton extends javax.swing.JFrame {

    DatosInterpolacion datosInterpolacion;
    String print = "";
    
    public InterpolacionNewton() {
        this.setTitle("Interpolacion Newton");
        this.setResizable(true);
        this.getContentPane().setBackground(Color.WHITE);
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

        dialog = new javax.swing.JDialog();
        titleLbl = new javax.swing.JLabel();
        infoButton = new javax.swing.JButton();
        ecuacionesBtn1 = new javax.swing.JButton();
        calculateBtn1 = new javax.swing.JButton();
        cleanBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gaussTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        observations = new javax.swing.JTextPane();
        backBtn = new javax.swing.JButton();

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setText("Interpolación Newton");

        backBtn.setBackground(new java.awt.Color(26, 118, 210));
        backBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        backBtn.setForeground(new java.awt.Color(1, 1, 1));
        backBtn.setText("ATRAS");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        ecuacionesBtn1.setBackground(new java.awt.Color(0, 149, 136));
        ecuacionesBtn1.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        ecuacionesBtn1.setForeground(new java.awt.Color(1, 1, 1));
        ecuacionesBtn1.setText("INGRESAR DATOS");
        ecuacionesBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ecuacionesBtn1.setFocusable(false);
        ecuacionesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecuacionesBtn1ActionPerformed(evt);
            }
        });

        calculateBtn1.setBackground(new java.awt.Color(0, 149, 136));
        calculateBtn1.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        calculateBtn1.setForeground(new java.awt.Color(1, 1, 1));
        calculateBtn1.setText("CALCULAR");
        calculateBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calculateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtn1ActionPerformed(evt);
            }
        });

        cleanBtn1.setBackground(new java.awt.Color(0, 149, 136));
        cleanBtn1.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        cleanBtn1.setForeground(new java.awt.Color(1, 1, 1));
        cleanBtn1.setText("LIMPIAR");
        cleanBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cleanBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtn1ActionPerformed(evt);
            }
        });

        gaussTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        gaussTable.setColumnSelectionAllowed(true);
        gaussTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(gaussTable);

        observations.setEditable(false);
        observations.setText("OBSERVACIONES:");
        observations.setToolTipText("");
        jScrollPane3.setViewportView(observations);

        backBtn.setBackground(new java.awt.Color(26, 118, 210));
        backBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        backBtn.setForeground(new java.awt.Color(1, 1, 1));
        backBtn.setText("ATRAS");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(infoButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cleanBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addComponent(ecuacionesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(calculateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGap(15, 15, 15)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleLbl)
                        .addComponent(infoButton))
                    .addGap(57, 57, 57)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ecuacionesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calculateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(cleanBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(backBtn))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addGap(6, 6, 6)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "");
    }//GEN-LAST:event_infoButtonActionPerformed

    private void ecuacionesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecuacionesBtn1ActionPerformed
        TotalEcuaciones totalecuacuaciones = new TotalEcuaciones();
        totalecuacuaciones.setVisible(true);
    }//GEN-LAST:event_ecuacionesBtn1ActionPerformed

    private void calculateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtn1ActionPerformed
        try {
           
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_calculateBtn1ActionPerformed

    private void cleanBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtn1ActionPerformed
        this.clearTable();
        this.observations.setText("OBSERVACIONES:");
    }//GEN-LAST:event_cleanBtn1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    
    private void clearTable() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) gaussTable.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn1;
    private javax.swing.JButton cleanBtn1;
    private javax.swing.JDialog dialog;
    private javax.swing.JButton ecuacionesBtn1;
    private javax.swing.JTable gaussTable;
    private javax.swing.JButton infoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane observations;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
