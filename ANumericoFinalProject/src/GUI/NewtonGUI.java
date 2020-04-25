/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Parser.MathFunctionsParser;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class NewtonGUI extends javax.swing.JPanel {

    /**
     * Creates new form NewtonGUI
     */
    public NewtonGUI() {
       //this.setTitle("Búsquedas Incrementales");
        //this.setResizable(false);
        //this.getContentPane().setBackground(Color.WHITE);
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

        titleLbl = new javax.swing.JLabel();
        iterTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        functionLbl = new javax.swing.JLabel();
        functionTxt = new javax.swing.JTextField();
        initialValueLbl = new javax.swing.JLabel();
        initialValueTxt = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        cleanBtn = new javax.swing.JButton();
        deltaLbl = new javax.swing.JLabel();
        iterLbl = new javax.swing.JLabel();
        toleranciaTxt = new javax.swing.JTextField();
        functionLbl1 = new javax.swing.JLabel();
        derivadatxt = new javax.swing.JTextField();

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setText("Newton");

        iterTxt.setBackground(new java.awt.Color(254, 254, 254));
        iterTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iterTxt.setForeground(new java.awt.Color(1, 1, 1));

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

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(table);

        functionLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl.setText("f(x) = ");

        functionTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        functionTxt.setForeground(new java.awt.Color(1, 1, 1));
        functionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                functionTxtActionPerformed(evt);
            }
        });

        initialValueLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        initialValueLbl.setForeground(new java.awt.Color(1, 1, 1));
        initialValueLbl.setText("Valor inicial (xi):");

        initialValueTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        initialValueTxt.setForeground(new java.awt.Color(1, 1, 1));
        initialValueTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialValueTxtActionPerformed(evt);
            }
        });

        calculateBtn.setBackground(new java.awt.Color(0, 149, 136));
        calculateBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        calculateBtn.setForeground(new java.awt.Color(1, 1, 1));
        calculateBtn.setText("EVALUAR");
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

        deltaLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        deltaLbl.setForeground(new java.awt.Color(1, 1, 1));
        deltaLbl.setText("Tolerancia:");

        iterLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iterLbl.setForeground(new java.awt.Color(1, 1, 1));
        iterLbl.setText("Cant. iteraciones (n):");

        toleranciaTxt.setBackground(new java.awt.Color(254, 254, 254));
        toleranciaTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        toleranciaTxt.setForeground(new java.awt.Color(1, 1, 1));

        functionLbl1.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl1.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl1.setText("f'(x) = ");

        derivadatxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        derivadatxt.setForeground(new java.awt.Color(1, 1, 1));
        derivadatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivadatxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(459, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(cleanBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(initialValueLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(initialValueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deltaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(iterLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(functionLbl1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(functionLbl)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(derivadatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deltaLbl)
                    .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iterLbl)
                    .addComponent(initialValueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialValueLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(functionLbl1)
                    .addComponent(derivadatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanBtn)
                    .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(backBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        //this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void initialValueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialValueTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialValueTxtActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        String func = functionTxt.getText();
        String derivadafun = derivadatxt.getText();
        double valorinicial = Double.valueOf(initialValueTxt.getText());
        double tolerancia = Double.valueOf(toleranciaTxt.getText());
        int totaliteraciones = Integer.valueOf(iterTxt.getText());
        DefaultTableModel model = new DefaultTableModel();
        Object[] columns = {"N","X","f(x)","f1(x)"};
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        newton(valorinicial,totaliteraciones,tolerancia,func,derivadafun);
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void functionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_functionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_functionTxtActionPerformed

    private void derivadatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivadatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_derivadatxtActionPerformed

    
    public void newton(double x0, int iteraciones, double tolerancia,String fun,String derivadafun){
        double fx = evaluarfuncion(x0, fun);
        double dfx = evaluarfuncion(x0,derivadafun);
        
        if(fx == 0){
            showErrorMessage(x0 + " Es una raiz");
        }else if (tolerancia < 0){
            showErrorMessage(tolerancia + " Mala entrada  de la tolerancia");
        }
        
    }
    
    public double evaluarfuncion(double x,String func){
         MathFunctionsParser function = new MathFunctionsParser();
         double tmp = -1;
         try{
             function.parserFunction(func);
             function.function.addVariable("x", x);
             tmp = function.function.getValue();
             if(tmp == -1){
                 showErrorMessage("Error al evaluar la funcion");
             }
         } catch (NumberFormatException nfe) {
            showErrorMessage(nfe.getMessage());
        } catch (Exception e) {
            showErrorMessage(e.getMessage());
        }
         
         return tmp;
    }
    
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JLabel deltaLbl;
    private javax.swing.JTextField derivadatxt;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JLabel functionLbl1;
    private javax.swing.JTextField functionTxt;
    private javax.swing.JLabel initialValueLbl;
    private javax.swing.JTextField initialValueTxt;
    private javax.swing.JLabel iterLbl;
    private javax.swing.JTextField iterTxt;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField toleranciaTxt;
    // End of variables declaration//GEN-END:variables
}
