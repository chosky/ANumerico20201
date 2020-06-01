/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class SolucionDeSistemaDeEcuaciones extends javax.swing.JFrame {

    /**
     * Creates new form SolucionEcuacionesUnaVariableMenu
     */
    public SolucionDeSistemaDeEcuaciones() {
        
        this.setTitle("Solucion De Sistema De Ecuaciones");
        this.setResizable(true);
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresarEcuacionesBtn = new javax.swing.JButton();
        pivoteoParcialBtn = new javax.swing.JButton();
        pivoteoTotalBtn = new javax.swing.JButton();
        gaussSimpleBtn = new javax.swing.JButton();
        escalonadoBtn = new javax.swing.JButton();
        doolittleBtn = new javax.swing.JButton();
        luSimpleBtn = new javax.swing.JButton();
        luPivoteoBtn = new javax.swing.JButton();
        croultBtn = new javax.swing.JButton();
        jacobiRelajadoBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        title1Lbl = new javax.swing.JLabel();
        title2Lbl = new javax.swing.JLabel();
        backgroundImg = new javax.swing.JLabel();
        title2Lbl1 = new javax.swing.JLabel();
        title2Lbl2 = new javax.swing.JLabel();
        title2Lbl3 = new javax.swing.JLabel();
        gaussSeidelRelajadoBtn = new javax.swing.JButton();
        choleskyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));

        ingresarEcuacionesBtn.setBackground(new java.awt.Color(34, 150, 243));
        ingresarEcuacionesBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        ingresarEcuacionesBtn.setForeground(new java.awt.Color(1, 1, 1));
        ingresarEcuacionesBtn.setText("Ingresar Ecuaciones");
        ingresarEcuacionesBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ingresarEcuacionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarEcuacionesBtnActionPerformed(evt);
            }
        });

        pivoteoParcialBtn.setBackground(new java.awt.Color(0, 149, 136));
        pivoteoParcialBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        pivoteoParcialBtn.setForeground(new java.awt.Color(1, 1, 1));
        pivoteoParcialBtn.setText("PIVOTEO PARCIAL");
        pivoteoParcialBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pivoteoParcialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pivoteoParcialBtnActionPerformed(evt);
            }
        });

        pivoteoTotalBtn.setBackground(new java.awt.Color(0, 149, 136));
        pivoteoTotalBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        pivoteoTotalBtn.setForeground(new java.awt.Color(1, 1, 1));
        pivoteoTotalBtn.setText("PIVOTEO TOTAL");
        pivoteoTotalBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pivoteoTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pivoteoTotalBtnActionPerformed(evt);
            }
        });

        gaussSimpleBtn.setBackground(new java.awt.Color(0, 149, 136));
        gaussSimpleBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        gaussSimpleBtn.setForeground(new java.awt.Color(1, 1, 1));
        gaussSimpleBtn.setText("SIMPLE");
        gaussSimpleBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        gaussSimpleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaussSimpleBtnActionPerformed(evt);
            }
        });

        escalonadoBtn.setBackground(new java.awt.Color(0, 149, 136));
        escalonadoBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        escalonadoBtn.setForeground(new java.awt.Color(1, 1, 1));
        escalonadoBtn.setText("ESCALONADO");
        escalonadoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        escalonadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escalonadoBtnActionPerformed(evt);
            }
        });

        doolittleBtn.setBackground(new java.awt.Color(0, 149, 136));
        doolittleBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        doolittleBtn.setForeground(new java.awt.Color(1, 1, 1));
        doolittleBtn.setText("DOOLITTLE");
        doolittleBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        doolittleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doolittleBtnActionPerformed(evt);
            }
        });

        luSimpleBtn.setBackground(new java.awt.Color(0, 149, 136));
        luSimpleBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        luSimpleBtn.setForeground(new java.awt.Color(1, 1, 1));
        luSimpleBtn.setText("LU SIMPLE");
        luSimpleBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        luSimpleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luSimpleBtnActionPerformed(evt);
            }
        });

        luPivoteoBtn.setBackground(new java.awt.Color(0, 149, 136));
        luPivoteoBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        luPivoteoBtn.setForeground(new java.awt.Color(1, 1, 1));
        luPivoteoBtn.setText("LU PIVOTEO");
        luPivoteoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        luPivoteoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luPivoteoBtnActionPerformed(evt);
            }
        });

        croultBtn.setBackground(new java.awt.Color(0, 149, 136));
        croultBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        croultBtn.setForeground(new java.awt.Color(1, 1, 1));
        croultBtn.setText("CROULT");
        croultBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        croultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                croultBtnActionPerformed(evt);
            }
        });

        jacobiRelajadoBtn.setBackground(new java.awt.Color(0, 149, 136));
        jacobiRelajadoBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        jacobiRelajadoBtn.setForeground(new java.awt.Color(1, 1, 1));
        jacobiRelajadoBtn.setText("JACOBI RELAJADO");
        jacobiRelajadoBtn.setToolTipText("");
        jacobiRelajadoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jacobiRelajadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jacobiRelajadoBtnActionPerformed(evt);
            }
        });

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

        title1Lbl.setBackground(new java.awt.Color(254, 254, 254));
        title1Lbl.setFont(new java.awt.Font("Lato Black", 1, 33)); // NOI18N
        title1Lbl.setForeground(new java.awt.Color(1, 1, 1));
        title1Lbl.setText("SOLUCIÓN DE SISTEMAS");

        title2Lbl.setBackground(new java.awt.Color(254, 254, 254));
        title2Lbl.setFont(new java.awt.Font("Lato Black", 1, 33)); // NOI18N
        title2Lbl.setForeground(new java.awt.Color(1, 1, 1));
        title2Lbl.setText("DE ECUACIONES");

        backgroundImg.setForeground(new java.awt.Color(1, 1, 1));

        title2Lbl1.setBackground(new java.awt.Color(254, 254, 254));
        title2Lbl1.setFont(new java.awt.Font("Lato Black", 1, 30)); // NOI18N
        title2Lbl1.setForeground(new java.awt.Color(1, 1, 1));
        title2Lbl1.setText("Iterativos");

        title2Lbl2.setBackground(new java.awt.Color(254, 254, 254));
        title2Lbl2.setFont(new java.awt.Font("Lato Black", 1, 30)); // NOI18N
        title2Lbl2.setForeground(new java.awt.Color(1, 1, 1));
        title2Lbl2.setText("Basados en eliminación Gaussiana");

        title2Lbl3.setBackground(new java.awt.Color(254, 254, 254));
        title2Lbl3.setFont(new java.awt.Font("Lato Black", 1, 30)); // NOI18N
        title2Lbl3.setForeground(new java.awt.Color(1, 1, 1));
        title2Lbl3.setText("Factorización Directa");

        gaussSeidelRelajadoBtn.setBackground(new java.awt.Color(0, 149, 136));
        gaussSeidelRelajadoBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        gaussSeidelRelajadoBtn.setForeground(new java.awt.Color(1, 1, 1));
        gaussSeidelRelajadoBtn.setText("GAUSS SEIDEL RELAJADO");
        gaussSeidelRelajadoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        gaussSeidelRelajadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaussSeidelRelajadoBtnActionPerformed(evt);
            }
        });

        choleskyBtn.setBackground(new java.awt.Color(0, 149, 136));
        choleskyBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        choleskyBtn.setForeground(new java.awt.Color(1, 1, 1));
        choleskyBtn.setText("CHOLESKY");
        choleskyBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        choleskyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choleskyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title2Lbl)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title1Lbl)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ingresarEcuacionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundImg)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(gaussSimpleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pivoteoParcialBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pivoteoTotalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(escalonadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title2Lbl2)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(title2Lbl3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(luSimpleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(luPivoteoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jacobiRelajadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gaussSeidelRelajadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(croultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title2Lbl1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doolittleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(choleskyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title1Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2Lbl)
                .addGap(18, 18, 18)
                .addComponent(ingresarEcuacionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(title2Lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gaussSimpleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pivoteoParcialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pivoteoTotalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escalonadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(title2Lbl3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luPivoteoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luSimpleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doolittleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choleskyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(croultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(title2Lbl1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jacobiRelajadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gaussSeidelRelajadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(backBtn)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void pivoteoTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pivoteoTotalBtnActionPerformed
        PivoteoTotal pivoteoTotal = new PivoteoTotal();
        pivoteoTotal.setVisible(true);
    }//GEN-LAST:event_pivoteoTotalBtnActionPerformed

    private void gaussSimpleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaussSimpleBtnActionPerformed
        GaussianaSimple gaussianaSimple = new GaussianaSimple();
        gaussianaSimple.setVisible(true);
    }//GEN-LAST:event_gaussSimpleBtnActionPerformed
                                     

    private void doolittleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doolittleBtnActionPerformed

    }//GEN-LAST:event_doolittleBtnActionPerformed

    private void croultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_croultBtnActionPerformed
        Croult croult = new Croult();
        croult.setVisible(true);
    }//GEN-LAST:event_croultBtnActionPerformed

    private void escalonadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escalonadoBtnActionPerformed
        Escalonado escalonado = new Escalonado();
        escalonado.setVisible(true);
    }//GEN-LAST:event_escalonadoBtnActionPerformed

    private void luPivoteoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luPivoteoBtnActionPerformed
        FDPivoteo fdPivoteo = new FDPivoteo();
        fdPivoteo.setVisible(true);
    }//GEN-LAST:event_luPivoteoBtnActionPerformed

    private void luSimpleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luSimpleBtnActionPerformed

    }//GEN-LAST:event_luSimpleBtnActionPerformed

    private void jacobiRelajadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jacobiRelajadoBtnActionPerformed
        JacobiRelajado jacobiRelajado = new JacobiRelajado();
        jacobiRelajado.setVisible(true);
    }//GEN-LAST:event_jacobiRelajadoBtnActionPerformed

    private void pivoteoParcialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pivoteoParcialBtnActionPerformed
        PivoteoParcial pivoteoParcial = new PivoteoParcial();
        pivoteoParcial.setVisible(true);
    }//GEN-LAST:event_pivoteoParcialBtnActionPerformed

    private void ingresarEcuacionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarEcuacionesBtnActionPerformed
        TotalEcuaciones totalecuacuaciones = new TotalEcuaciones();
        totalecuacuaciones.setVisible(true);
    }//GEN-LAST:event_ingresarEcuacionesBtnActionPerformed

    private void gaussSeidelRelajadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaussSeidelRelajadoBtnActionPerformed
        GaussSeidelRelajado gaussSeidelRelajado = new GaussSeidelRelajado();
        gaussSeidelRelajado.setVisible(true);
    }//GEN-LAST:event_gaussSeidelRelajadoBtnActionPerformed

    private void choleskyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choleskyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choleskyBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JButton choleskyBtn;
    private javax.swing.JButton croultBtn;
    private javax.swing.JButton doolittleBtn;
    private javax.swing.JButton escalonadoBtn;
    private javax.swing.JButton gaussSeidelRelajadoBtn;
    private javax.swing.JButton gaussSimpleBtn;
    private javax.swing.JButton ingresarEcuacionesBtn;
    private javax.swing.JButton jacobiRelajadoBtn;
    private javax.swing.JButton luPivoteoBtn;
    private javax.swing.JButton luSimpleBtn;
    private javax.swing.JButton pivoteoParcialBtn;
    private javax.swing.JButton pivoteoTotalBtn;
    private javax.swing.JLabel title1Lbl;
    private javax.swing.JLabel title2Lbl;
    private javax.swing.JLabel title2Lbl1;
    private javax.swing.JLabel title2Lbl2;
    private javax.swing.JLabel title2Lbl3;
    // End of variables declaration//GEN-END:variables
}
