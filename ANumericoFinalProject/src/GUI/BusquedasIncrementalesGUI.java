/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Parser.MathFunctionsParser;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class BusquedasIncrementalesGUI extends javax.swing.JFrame {

    /**
     * Creates new form BusquedasIncrementalesGUI
     */
    public BusquedasIncrementalesGUI() {
        initComponents();
    }
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
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
        functionLbl = new javax.swing.JLabel();
        functionTxt = new javax.swing.JTextField();
        valueXLbl = new javax.swing.JLabel();
        valueXTxt = new javax.swing.JTextField();
        resultLbl = new javax.swing.JLabel();
        resultTxt = new javax.swing.JTextField();
        evaluateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setText("EVALUADOR");

        functionLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl.setText("f(x) = ");

        functionTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        functionTxt.setForeground(new java.awt.Color(1, 1, 1));

        valueXLbl.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        valueXLbl.setForeground(new java.awt.Color(1, 1, 1));
        valueXLbl.setText("Valor de x:");

        valueXTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        valueXTxt.setForeground(new java.awt.Color(1, 1, 1));

        resultLbl.setFont(new java.awt.Font("Lato Black", 0, 20)); // NOI18N
        resultLbl.setForeground(new java.awt.Color(1, 1, 1));
        resultLbl.setText("Resultado");

        resultTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        resultTxt.setForeground(new java.awt.Color(1, 1, 1));

        evaluateBtn.setBackground(new java.awt.Color(0, 149, 136));
        evaluateBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        evaluateBtn.setForeground(new java.awt.Color(1, 1, 1));
        evaluateBtn.setText("EVALUAR");
        evaluateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluateBtnActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(functionLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(valueXLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valueXTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(evaluateBtn))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(titleLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(resultLbl)))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(resultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(functionLbl)
                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueXLbl)
                    .addComponent(valueXTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaluateBtn))
                .addGap(29, 29, 29)
                .addComponent(resultLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evaluateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluateBtnActionPerformed
        MathFunctionsParser function = new MathFunctionsParser();

        try {
            function.parserFunction(this.functionTxt.getText());

            double valueX = Double.parseDouble(this.valueXTxt.getText());
            function.function.addVariable("x", valueX);

            String result = Double.toString(function.function.getValue());

            if (this.valueXTxt.getText().equals("") || this.valueXTxt.getText().equals(" ")) {
                showErrorMessage("El campo está vacio");
            } else if(result.equals("NaN")) {
                showErrorMessage("Error en la lectura de la función \n ¿La incongita buscada es x?");
            } else {
                this.resultTxt.setText(result);
            }
        } catch (NumberFormatException nfe) {
            showErrorMessage(nfe.getMessage());
        } catch (Exception e) {
            showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_evaluateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton evaluateBtn;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JTextField functionTxt;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JTextField resultTxt;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel valueXLbl;
    private javax.swing.JTextField valueXTxt;
    // End of variables declaration//GEN-END:variables
}
