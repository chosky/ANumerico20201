/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Amboraes
 */
public final class IngresarDatosInterpolacion extends javax.swing.JFrame {

    private BigDecimal[] x;
    private BigDecimal[]xn;
    private List<JTextField>input;
    private int totaldatos;
    private DatosInterpolacion datosInterpolacion;
    private String print = "";


    public IngresarDatosInterpolacion(int totaldata) {
        this.input = new ArrayList<>();
        this.totaldatos = totaldata;
        this.setTitle("Lectura de datos interpolacion");
        this.setResizable(true);
        this.getContentPane().setBackground(Color.WHITE);
        datosInterpolacion = DatosInterpolacion.getDatosInterpolacion();
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
        backBtn = new javax.swing.JButton();
        calculateBtn = new javax.swing.JButton();
        cleanBtn = new javax.swing.JButton();
        info = new javax.swing.JButton();
        PanelContainer = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        creartabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowSteps = new javax.swing.JTextPane();

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
        titleLbl.setText("Lector de ecuaciones");

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

        calculateBtn.setBackground(new java.awt.Color(0, 149, 136));
        calculateBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        calculateBtn.setForeground(new java.awt.Color(1, 1, 1));
        calculateBtn.setText("LEER");
        calculateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        cleanBtn.setBackground(new java.awt.Color(0, 149, 136));
        cleanBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        cleanBtn.setForeground(new java.awt.Color(1, 1, 1));
        cleanBtn.setText("LIMPIAR");
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });

        info.setBackground(new java.awt.Color(0, 149, 136));
        info.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        info.setForeground(new java.awt.Color(1, 1, 1));
        info.setText("?");
        info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        PanelContainer.setViewportView(panel);

        creartabla.setBackground(new java.awt.Color(0, 149, 136));
        creartabla.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        creartabla.setForeground(new java.awt.Color(1, 1, 1));
        creartabla.setText("Crear Tabla");
        creartabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        creartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creartablaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ShowSteps);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(creartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cleanBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(creartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cleanBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(dialog, "Porfavor ingrese los datos de x y xn, siendo x la fila primera fila y xn la segunda fila");
    }//GEN-LAST:event_infoActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed

        /*for(int i = 0;i<input.size();i++){
            ecuaciones.add(input.get(i).getText());
        }*/
        //System.out.println("total ecuaciones: "+input.size()+" tamaño matriz: "+(totaldatos*(totaldatos+1)));
        int cont = 0;
        for(int i = 0;i < totaldatos*2 ; i++){
            if(i<totaldatos){
                x[i]=BigDecimal.valueOf(Double.valueOf(input.get(cont).getText()));
            }else{
                xn[i-totaldatos] = BigDecimal.valueOf(Double.valueOf(input.get(i).getText()));
            }
        }
        datosInterpolacion.setX(x);
        datosInterpolacion.setXn(xn);
        imprimir();


    }//GEN-LAST:event_calculateBtnActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed

    }//GEN-LAST:event_cleanBtnActionPerformed

    private void creartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creartablaActionPerformed
        // TODO add your handling code here:
        creartabla();
    }//GEN-LAST:event_creartablaActionPerformed

    private void imprimir(){
        print = "| x | xn |\n";
        for(int filas = 0;filas < totaldatos ; filas++){
            print+="|"+x[filas]+"|"+xn[filas]+"|\n";
        }
        System.out.println(print);
       ShowSteps.setText(print);
    }

    private void creartabla(){
        if(input.isEmpty()){
            panel.setLayout(new GridLayout(2,totaldatos));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            for(int i = 0; i < totaldatos*2;i++){
                JTextField ecuacion = new JTextField();
                panel.add(ecuacion);
                input.add(ecuacion);
            }
            panel.updateUI();
            x = new BigDecimal[totaldatos];
            xn = new BigDecimal[totaldatos];
        }

    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PanelContainer;
    private javax.swing.JTextPane ShowSteps;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JButton creartabla;
    private javax.swing.JDialog dialog;
    private javax.swing.JButton info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
