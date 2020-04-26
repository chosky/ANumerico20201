package GUI;

import java.awt.Color;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class Inicio extends javax.swing.JFrame {

    /** Creates new form Inicio */
    public Inicio() {
        
        this.setTitle("Práctica Clásica Análisis Numérico");
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        solEcuOneVarBtn = new javax.swing.JButton();
        solSisEcuBtn = new javax.swing.JButton();
        interpolationBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        yearLbl = new javax.swing.JLabel();
        informationBtn = new javax.swing.JButton();
        backgroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 1, 1));
        setLocation(new java.awt.Point(0, 0));

        solEcuOneVarBtn.setBackground(new java.awt.Color(77, 181, 171));
        solEcuOneVarBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        solEcuOneVarBtn.setForeground(new java.awt.Color(1, 1, 1));
        solEcuOneVarBtn.setText("SOLUCIÓN DE ECUACIONES DE UNA VARIABLE");
        solEcuOneVarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solEcuOneVarBtnActionPerformed(evt);
            }
        });

        solSisEcuBtn.setBackground(new java.awt.Color(77, 181, 171));
        solSisEcuBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        solSisEcuBtn.setForeground(new java.awt.Color(1, 1, 1));
        solSisEcuBtn.setText("SOLUCIÓN DE SISTEMAS DE ECUACIONES");
        solSisEcuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solSisEcuBtnActionPerformed(evt);
            }
        });

        interpolationBtn.setBackground(new java.awt.Color(77, 181, 171));
        interpolationBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        interpolationBtn.setForeground(new java.awt.Color(1, 1, 1));
        interpolationBtn.setText("INTERPOLACIÓN");

        exitBtn.setBackground(new java.awt.Color(26, 118, 210));
        exitBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(5, 0, 0));
        exitBtn.setText("SALIR");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        yearLbl.setBackground(new java.awt.Color(1, 1, 1));
        yearLbl.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        yearLbl.setForeground(new java.awt.Color(254, 254, 254));
        yearLbl.setText("2020-1");

        informationBtn.setBackground(new java.awt.Color(1, 1, 1));
        informationBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        informationBtn.setForeground(new java.awt.Color(0, 14, 255));
        informationBtn.setText("info");
        informationBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        informationBtn.setBorderPainted(false);
        informationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationBtnActionPerformed(evt);
            }
        });

        backgroundImg.setBackground(new java.awt.Color(0, 0, 0));
        backgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoInicio.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backgroundImg)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(solEcuOneVarBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(solSisEcuBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(interpolationBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yearLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(informationBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solEcuOneVarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(solSisEcuBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(interpolationBtn)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yearLbl)
                        .addComponent(exitBtn)
                        .addComponent(informationBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void solSisEcuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solSisEcuBtnActionPerformed
        
    }//GEN-LAST:event_solSisEcuBtnActionPerformed

    private void solEcuOneVarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solEcuOneVarBtnActionPerformed
        SolucionEcuacionesUnaVariableMenu solEcuVar = new SolucionEcuacionesUnaVariableMenu();
        solEcuVar.setVisible(true);
    }//GEN-LAST:event_solEcuOneVarBtnActionPerformed

    private void informationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationBtnActionPerformed
        Informacion info = new Informacion();
        info.setVisible(true);
    }//GEN-LAST:event_informationBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton informationBtn;
    private javax.swing.JButton interpolationBtn;
    private javax.swing.JButton solEcuOneVarBtn;
    private javax.swing.JButton solSisEcuBtn;
    private javax.swing.JLabel yearLbl;
    // End of variables declaration//GEN-END:variables

}
