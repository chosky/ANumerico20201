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
public class SolucionEcuacionesUnaVariableMenu extends javax.swing.JFrame {

    /**
     * Creates new form SolucionEcuacionesUnaVariableMenu
     */
    public SolucionEcuacionesUnaVariableMenu() {
        
        this.setTitle("Solución de ecuaciones de una variable");
        this.setResizable(false);
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

        plotterBtn = new javax.swing.JButton();
        busquedaIncrementalBtn = new javax.swing.JButton();
        evaluatorBtn = new javax.swing.JButton();
        biseccionBtn = new javax.swing.JButton();
        reglaFalsaBtn = new javax.swing.JButton();
        puntoFijoBtn = new javax.swing.JButton();
        newtonBtn = new javax.swing.JButton();
        secanteBtn = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        title1Lbl = new javax.swing.JLabel();
        title2Lbl = new javax.swing.JLabel();
        backgroundImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        plotterBtn.setBackground(new java.awt.Color(34, 150, 243));
        plotterBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        plotterBtn.setForeground(new java.awt.Color(1, 1, 1));
        plotterBtn.setText("GRAFICADOR");
        plotterBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        plotterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotterBtnActionPerformed(evt);
            }
        });

        busquedaIncrementalBtn.setBackground(new java.awt.Color(34, 150, 243));
        busquedaIncrementalBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        busquedaIncrementalBtn.setForeground(new java.awt.Color(1, 1, 1));
        busquedaIncrementalBtn.setText("BÚSQUEDA INC");
        busquedaIncrementalBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        busquedaIncrementalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaIncrementalBtnActionPerformed(evt);
            }
        });

        evaluatorBtn.setBackground(new java.awt.Color(34, 150, 243));
        evaluatorBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        evaluatorBtn.setForeground(new java.awt.Color(1, 1, 1));
        evaluatorBtn.setText("EVALUADOR");
        evaluatorBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        evaluatorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluatorBtnActionPerformed(evt);
            }
        });

        biseccionBtn.setBackground(new java.awt.Color(0, 149, 136));
        biseccionBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        biseccionBtn.setForeground(new java.awt.Color(1, 1, 1));
        biseccionBtn.setText("BISECCIÓN");
        biseccionBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        biseccionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biseccionBtnActionPerformed(evt);
            }
        });

        reglaFalsaBtn.setBackground(new java.awt.Color(0, 149, 136));
        reglaFalsaBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        reglaFalsaBtn.setForeground(new java.awt.Color(1, 1, 1));
        reglaFalsaBtn.setText("REGLA FALSA");
        reglaFalsaBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        puntoFijoBtn.setBackground(new java.awt.Color(0, 149, 136));
        puntoFijoBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        puntoFijoBtn.setForeground(new java.awt.Color(1, 1, 1));
        puntoFijoBtn.setText("PUNTO FIJO");
        puntoFijoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        newtonBtn.setBackground(new java.awt.Color(0, 149, 136));
        newtonBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        newtonBtn.setForeground(new java.awt.Color(1, 1, 1));
        newtonBtn.setText("NEWTON");
        newtonBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        newtonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtonBtnActionPerformed(evt);
            }
        });

        secanteBtn.setBackground(new java.awt.Color(0, 149, 136));
        secanteBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        secanteBtn.setForeground(new java.awt.Color(1, 1, 1));
        secanteBtn.setText("SECANTE");
        secanteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jButton9.setBackground(new java.awt.Color(0, 149, 136));
        jButton9.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        jButton9.setForeground(new java.awt.Color(1, 1, 1));
        jButton9.setText("RAÍCES MÚLT");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jButton10.setBackground(new java.awt.Color(0, 149, 136));
        jButton10.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        jButton10.setForeground(new java.awt.Color(1, 1, 1));
        jButton10.setText("VALOR AGG");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

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
        title1Lbl.setFont(new java.awt.Font("Lato Black", 1, 30)); // NOI18N
        title1Lbl.setForeground(new java.awt.Color(1, 1, 1));
        title1Lbl.setText("SOLUCIÓN DE ECUACIONES");

        title2Lbl.setBackground(new java.awt.Color(254, 254, 254));
        title2Lbl.setFont(new java.awt.Font("Lato Black", 1, 30)); // NOI18N
        title2Lbl.setForeground(new java.awt.Color(1, 1, 1));
        title2Lbl.setText("DE UNA VARIABLE");

        backgroundImg.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(title2Lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(plotterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newtonBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(biseccionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(secanteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(busquedaIncrementalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(reglaFalsaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(evaluatorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(puntoFijoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(title1Lbl)))
                    .addComponent(backgroundImg))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundImg)
                .addGap(10, 10, 10)
                .addComponent(title1Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2Lbl)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plotterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaIncrementalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaluatorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biseccionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reglaFalsaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntoFijoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newtonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secanteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void plotterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plotterBtnActionPerformed
        PlotterVisual fra = new PlotterVisual("");
        fra.setVisible(true);
    }//GEN-LAST:event_plotterBtnActionPerformed

    private void evaluatorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluatorBtnActionPerformed
        Evaluator evaluator = new Evaluator();
        evaluator.setVisible(true);
    }//GEN-LAST:event_evaluatorBtnActionPerformed

    private void busquedaIncrementalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaIncrementalBtnActionPerformed
        BusquedasIncrementales busquedaIncremental = new BusquedasIncrementales();
        busquedaIncremental.setVisible(true);
    }//GEN-LAST:event_busquedaIncrementalBtnActionPerformed


    private void newtonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtonBtnActionPerformed
        Newton newton = new Newton();
        newton.setVisible(true);
        System.out.println("puta llegue");

    private void biseccionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biseccionBtnActionPerformed
        Biseccion biseccion = new Biseccion();
        biseccion.setVisible(true);
    }//GEN-LAST:event_biseccionBtnActionPerformed

    private void newtonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtonBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_newtonBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JButton biseccionBtn;
    private javax.swing.JButton busquedaIncrementalBtn;
    private javax.swing.JButton evaluatorBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton newtonBtn;
    private javax.swing.JButton plotterBtn;
    private javax.swing.JButton puntoFijoBtn;
    private javax.swing.JButton reglaFalsaBtn;
    private javax.swing.JButton secanteBtn;
    private javax.swing.JLabel title1Lbl;
    private javax.swing.JLabel title2Lbl;
    // End of variables declaration//GEN-END:variables
}