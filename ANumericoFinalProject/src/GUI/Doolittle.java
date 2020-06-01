/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Amboraes 
 */
public final class Doolittle extends javax.swing.JFrame {

    
    
    BigDecimal [][]ecuaciones;
    String print = "";
    int mayoresFilas[];

    
    public Doolittle() {
        this.setTitle("Doolittle");
        this.setResizable(true);
        this.getContentPane().setBackground(Color.WHITE);
        ecuaciones = ContenedorEcuaciones.getContenedor().getEcuaciones();
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
        titleLbl.setText("Doolittle");

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
        calculateBtn.setText("Ejecutar");
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

        jScrollPane1.setViewportView(ShowSteps);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cleanBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cleanBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(dialog, "Este metodo realiza el pivoteo escalonado con la matriz ingresada en el metodo ingresar matrices");
    }//GEN-LAST:event_infoActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
 
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        ShowSteps.setText("");
    }//GEN-LAST:event_cleanBtnActionPerformed
    
     
    
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public BigDecimal[][] ordenamientoMatrizPivoteoEscalonado(BigDecimal[][] Ab, int n, int k){
        int mayorDividido[] = new int[(n-1)-k];
        for(int i = 0; i < n-1-k;i++){
            mayorDividido[i] = (int) (Math.abs(Ab[i+k][k].doubleValue())/mayoresFilas[i+k]);
        }
        int posmayor = max(mayorDividido);
        Ab = intercambiarFilas(Ab,posmayor,k);
        return Ab;
    }
    
    public int max(int[] arr){
        int max = arr[0];
        int indice = 0;
        for(int i = 1 ; i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                indice = i;
            }
        }
        return indice;
    }
   
    public BigDecimal[][] intercambiarFilas(BigDecimal[][] Ab,int posmayor, int k){
        BigDecimal[] filatemporal = Ab[posmayor];
        Ab[posmayor] = Ab[k];
        Ab[k] = filatemporal;
        return Ab;
    }
    
    public void pivoteoEscalonado(BigDecimal[][]Ab, int n){
        hallarMayoresFilas(Ab, n);
        for(int i = 0;i<n-1;i++){
            Ab= ordenamientoMatrizPivoteoEscalonado(Ab,n,i);
            Ab = reduccion(Ab,n,i);
        }
    }
    public void hallarMayoresFilas(BigDecimal[][]Ab, int n){
        mayoresFilas = new int[n-1];
        int i = 0;
        for(int r = 0; r < n-1; r++){
            for(int s = 0;s<n;s++){
                if(Math.abs(Ab[r][s].doubleValue())>mayoresFilas[i]){
                    mayoresFilas[i]=Math.abs(Ab[r][s].intValue());
                }
            }
            i++;
        }
    }
    
    public void sustitución(BigDecimal[][]Ab, int n){
        BigDecimal X[] = new BigDecimal[n];
        int acumulador;
        for( int i = n-1;i>0;i--){
           acumulador = 0;
           for(int p = i+1;p<n;p++){
               acumulador += Ab[i][p].intValue()*X[p].intValue();
           }
           X[i] = BigDecimal.valueOf((Ab[i][n+1].intValue()-acumulador)/Ab[i][i].intValue());
           imprimir("X"+(i+1)+"="+X[i]);
        }
    }
    
    public BigDecimal[][] reduccion(BigDecimal[][]Ab,int n,int p){
        double multiplicador = 0;
        for(int k = p;p<n-1;k++){
            if(Ab[k][k].intValue()==0){
                imprimir("El sistema tiene infinitas soluciones");
                break;
            }
            for(int i = k+1;i<n;i++){
                multiplicador = Ab[i][k].doubleValue()/Ab[k][k].doubleValue();
                for(int j = k;j<n+1;j++){
                    Ab[i][j] = BigDecimal.valueOf(Ab[i][j].doubleValue()-multiplicador*Ab[k][j].intValue());
                }
            }
        }
        return Ab;
    }
    
    public void imprimir(String str){
        print = ShowSteps.getText();
        print+=str;
        ShowSteps.setText(print);
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PanelContainer;
    private javax.swing.JTextPane ShowSteps;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JDialog dialog;
    private javax.swing.JButton info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
