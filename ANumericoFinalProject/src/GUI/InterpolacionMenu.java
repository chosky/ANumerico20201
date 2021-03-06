/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author jhenaoo
 */
public class InterpolacionMenu extends javax.swing.JFrame {

    /**
     * Creates new form InterpolacionMenu
     */
    
    DatosInterpolacion datosInterpolacion;
    public InterpolacionMenu() {
        this.setResizable(false);
        this.setTitle("Interpolación");
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

        linealBtn = new javax.swing.JButton();
        lagrangeBtn = new javax.swing.JButton();
        nevilleBtn = new javax.swing.JButton();
        newtonBtn = new javax.swing.JButton();
        cuadraticoBtn = new javax.swing.JButton();
        cubicoBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        ingrasarDatosBtn = new javax.swing.JButton();
        title1Lbl = new javax.swing.JLabel();
        title1Lbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        linealBtn.setBackground(new java.awt.Color(0, 149, 136));
        linealBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        linealBtn.setForeground(new java.awt.Color(1, 1, 1));
        linealBtn.setText("LINEAL");
        linealBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        linealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linealBtnActionPerformed(evt);
            }
        });

        lagrangeBtn.setBackground(new java.awt.Color(0, 149, 136));
        lagrangeBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        lagrangeBtn.setForeground(new java.awt.Color(1, 1, 1));
        lagrangeBtn.setText("LAGRANGE");
        lagrangeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        lagrangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagrangeBtnActionPerformed(evt);
            }
        });

        nevilleBtn.setBackground(new java.awt.Color(0, 149, 136));
        nevilleBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        nevilleBtn.setForeground(new java.awt.Color(1, 1, 1));
        nevilleBtn.setText("NEVILLE");
        nevilleBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        nevilleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nevilleBtnActionPerformed(evt);
            }
        });

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

        cuadraticoBtn.setBackground(new java.awt.Color(0, 149, 136));
        cuadraticoBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        cuadraticoBtn.setForeground(new java.awt.Color(1, 1, 1));
        cuadraticoBtn.setText("CUADRÁTICO");
        cuadraticoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        cuadraticoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadraticoBtnActionPerformed(evt);
            }
        });

        cubicoBtn.setBackground(new java.awt.Color(0, 149, 136));
        cubicoBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        cubicoBtn.setForeground(new java.awt.Color(1, 1, 1));
        cubicoBtn.setText("CÚBICO");
        cubicoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        cubicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubicoBtnActionPerformed(evt);
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

        ingrasarDatosBtn.setBackground(new java.awt.Color(34, 150, 243));
        ingrasarDatosBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        ingrasarDatosBtn.setForeground(new java.awt.Color(1, 1, 1));
        ingrasarDatosBtn.setText("Ingresar Datos");
        ingrasarDatosBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ingrasarDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingrasarDatosBtnActionPerformed(evt);
            }
        });

        title1Lbl.setBackground(new java.awt.Color(254, 254, 254));
        title1Lbl.setFont(new java.awt.Font("Lato Black", 1, 30)); // NOI18N
        title1Lbl.setForeground(new java.awt.Color(1, 1, 1));
        title1Lbl.setText("SPLINES");

        title1Lbl1.setBackground(new java.awt.Color(254, 254, 254));
        title1Lbl1.setFont(new java.awt.Font("Lato Black", 1, 33)); // NOI18N
        title1Lbl1.setForeground(new java.awt.Color(1, 1, 1));
        title1Lbl1.setText("INTERPOLACIÓN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newtonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lagrangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(nevilleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(linealBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title1Lbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cuadraticoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cubicoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ingrasarDatosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title1Lbl1)
                        .addGap(76, 76, 76))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(379, 379, 379)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(title1Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ingrasarDatosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lagrangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nevilleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newtonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(title1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadraticoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cubicoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(524, 524, 524)
                    .addComponent(backBtn)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linealBtnActionPerformed
        SplinesLineal splinesLineal = new SplinesLineal();
        splinesLineal.setVisible(true);
    }//GEN-LAST:event_linealBtnActionPerformed

    private void lagrangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagrangeBtnActionPerformed
        Lagrange lagrange = new Lagrange();
        lagrange.setVisible(true);
    }//GEN-LAST:event_lagrangeBtnActionPerformed

    private void nevilleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nevilleBtnActionPerformed
        Neville neville = new Neville();
        neville.setVisible(true);
    }//GEN-LAST:event_nevilleBtnActionPerformed

    private void newtonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtonBtnActionPerformed
        NewtonInterpolacion newton = new NewtonInterpolacion();
        newton.setVisible(true);
    }//GEN-LAST:event_newtonBtnActionPerformed

    private void cuadraticoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadraticoBtnActionPerformed
        SplinesCuadratico splinesCuardado = new SplinesCuadratico();
        splinesCuardado.setVisible(true);
    }//GEN-LAST:event_cuadraticoBtnActionPerformed

    private void cubicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubicoBtnActionPerformed
        SplinesCubico splinesLinealCubico = new SplinesCubico();
        splinesLinealCubico.setVisible(true);
    }//GEN-LAST:event_cubicoBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void ingrasarDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingrasarDatosBtnActionPerformed
        TotalDatosInterpolacion totalDatosInterpolacion = new TotalDatosInterpolacion();
        totalDatosInterpolacion.setVisible(true);
    }//GEN-LAST:event_ingrasarDatosBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cuadraticoBtn;
    private javax.swing.JButton cubicoBtn;
    private javax.swing.JButton ingrasarDatosBtn;
    private javax.swing.JButton lagrangeBtn;
    private javax.swing.JButton linealBtn;
    private javax.swing.JButton nevilleBtn;
    private javax.swing.JButton newtonBtn;
    private javax.swing.JLabel title1Lbl;
    private javax.swing.JLabel title1Lbl1;
    // End of variables declaration//GEN-END:variables
}
