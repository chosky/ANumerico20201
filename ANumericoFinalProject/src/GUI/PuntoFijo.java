package GUI;

import Parser.MathFunctionsParser;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class PuntoFijo extends javax.swing.JFrame {

    MathFunctionsParser functionFx = new MathFunctionsParser();
    MathFunctionsParser functionGx = new MathFunctionsParser();
    
    /**
     * Creates new form PuntoFijo
     */
    public PuntoFijo() {
        this.setTitle("Punto Fijo");
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        this.observacionesTxt.setEditable(false);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valorInicialLbl = new javax.swing.JLabel();
        toleranciaLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacionesTxt = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        iteracionesLbl = new javax.swing.JLabel();
        functionLbl = new javax.swing.JLabel();
        graficarFxBtn = new javax.swing.JButton();
        functionFxTxt = new javax.swing.JTextField();
        calcularBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        valorInicialTxt = new javax.swing.JTextField();
        toleranciaTxt = new javax.swing.JTextField();
        iteracionesTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        functionGxTxt = new javax.swing.JTextField();

        valorInicialLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        valorInicialLbl.setForeground(new java.awt.Color(1, 1, 1));
        valorInicialLbl.setText("Valor inicial (xi):");

        toleranciaLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        toleranciaLbl.setForeground(new java.awt.Color(1, 1, 1));
        toleranciaLbl.setText("Tolerancia:");

        observacionesTxt.setColumns(20);
        observacionesTxt.setForeground(new java.awt.Color(1, 1, 1));
        observacionesTxt.setRows(5);
        observacionesTxt.setText("OBSERVACIONES:");
        observacionesTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 187, 181)));
        jScrollPane1.setViewportView(observacionesTxt);

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

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setText("PUNTO FIJO");

        iteracionesLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iteracionesLbl.setForeground(new java.awt.Color(1, 1, 1));
        iteracionesLbl.setText("Cant. iteraciones (n):");

        functionLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl.setText("f(x) = ");

        graficarFxBtn.setBackground(new java.awt.Color(0, 149, 136));
        graficarFxBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        graficarFxBtn.setForeground(new java.awt.Color(1, 1, 1));
        graficarFxBtn.setText("GRAFICAR");
        graficarFxBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        graficarFxBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarFxBtnActionPerformed(evt);
            }
        });

        functionFxTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        functionFxTxt.setForeground(new java.awt.Color(1, 1, 1));

        calcularBtn.setBackground(new java.awt.Color(0, 149, 136));
        calcularBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        calcularBtn.setForeground(new java.awt.Color(1, 1, 1));
        calcularBtn.setText("CALCULAR");
        calcularBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setBackground(new java.awt.Color(0, 149, 136));
        limpiarBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(1, 1, 1));
        limpiarBtn.setText("LIMPIAR");
        limpiarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        valorInicialTxt.setForeground(new java.awt.Color(1, 1, 1));

        toleranciaTxt.setForeground(new java.awt.Color(1, 1, 1));

        iteracionesTxt.setForeground(new java.awt.Color(1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("g(x) = ");

        functionGxTxt.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleLbl)
                        .addGap(129, 129, 129))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limpiarBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valorInicialLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toleranciaLbl)
                            .addComponent(iteracionesLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(graficarFxBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcularBtn)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(functionLbl)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(functionGxTxt)
                    .addComponent(functionFxTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorInicialLbl)
                    .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toleranciaLbl)
                    .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iteracionesLbl))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionFxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionLbl))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(functionGxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graficarFxBtn)
                    .addComponent(calcularBtn))
                .addGap(14, 14, 14)
                .addComponent(limpiarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void graficarFxBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarFxBtnActionPerformed
        if(controlEntradaFuncionFx()) {
            PlotterVisual graficador = new PlotterVisual(this.functionFxTxt.getText());
            graficador.setVisible(true);
        } else {
            showErrorMessage("Error en la función, no se pudo graficar");
        }
    }//GEN-LAST:event_graficarFxBtnActionPerformed

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        if(controlEntradaFuncionFx()) {
            if(controlEntradaFuncionGx()) {
                if (controlEntradaDatos()) {
                    metodoPuntoFijo();
                } else {
                    showErrorMessage("Error en los datos de entrada");
                }
            } 
        } else {
            showErrorMessage("Error en la función, no se pudo graficar");
        }
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        this.valorInicialTxt.setText("");
        this.toleranciaTxt.setText("");
        this.iteracionesTxt.setText("");
        this.functionFxTxt.setText("");
        this.functionGxTxt.setText("");
        this.observacionesTxt.setText("OBSERVACIONES:");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    public boolean controlEntradaFuncionFx() {
        try {
            functionFx.parserFunction(this.functionFxTxt.getText());
            
            functionFx.function.addVariable("x", 1);
            String result = Double.toString(functionFx.function.getValue());
        
            if (this.functionFxTxt.getText().equals("") || this.functionFxTxt.getText().equals(" ")) {
                showErrorMessage("El campo de la función Fx está vacio");
                return false;
            } else if(result.equals("NaN")) {
                showErrorMessage("Error en la lectura de la función f(x) \n ¿La incongita buscada es x?");
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException nfe) {
            showErrorMessage(nfe.getMessage());
            return false;
        } catch (Exception e) {
            showErrorMessage(e.getMessage());
            return false;
        }
    }
    
    public boolean controlEntradaFuncionGx() {
        try {
            functionGx.parserFunction(this.functionGxTxt.getText());
            
            functionGx.function.addVariable("x", 1);
            String result = Double.toString(functionGx.function.getValue());
        
            if (this.functionGxTxt.getText().equals("") || this.functionGxTxt.getText().equals(" ")) {
                showErrorMessage("El campo de la función Gx está vacio");
                return false;
            } else if(result.equals("NaN")) {
                showErrorMessage("Error en la lectura de la función g(x) \n ¿La incongita buscada es x?");
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException nfe) {
            showErrorMessage(nfe.getMessage());
            return false;
        } catch (Exception e) {
            showErrorMessage(e.getMessage());
            return false;
        }
    }
    
    public boolean controlEntradaDatos() {
        if(this.valorInicialTxt.getText().isBlank() || this.valorInicialTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.valorInicialTxt.getText())) {
            showErrorMessage("El campo del valor inicial está vacio o mal escrito");
            return false;
        }
        if(this.toleranciaTxt.getText().isBlank() || this.toleranciaTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.toleranciaTxt.getText())) {
            showErrorMessage("El campo de la tolerancia está vacio o mal escrito");
            return false;
        }
        if(this.iteracionesTxt.getText().isBlank() || this.iteracionesTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.iteracionesTxt.getText())) {
            showErrorMessage("El campo de las iteraciones está vacio o mal escrito");
            return false;
        }
        return true;
    }
    
    public boolean valorTieneCaracterNoValido(String cadena) {
        char[] chars = cadena.toCharArray();
        boolean letra = false;
        int contPunto = 0;
        for(char c : chars) {
            if(Character.isDigit(c)) {
                letra = false;
            } else if (c == '.') {
                contPunto++;
            } else {
                return true;
            }
        }
        if (contPunto > 1) {
            return true;
        }
        return letra;
    }
    
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public void metodoPuntoFijo() {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntoFijo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JTextField functionFxTxt;
    private javax.swing.JTextField functionGxTxt;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JButton graficarFxBtn;
    private javax.swing.JLabel iteracionesLbl;
    private javax.swing.JTextField iteracionesTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextArea observacionesTxt;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel toleranciaLbl;
    private javax.swing.JTextField toleranciaTxt;
    private javax.swing.JLabel valorInicialLbl;
    private javax.swing.JTextField valorInicialTxt;
    // End of variables declaration//GEN-END:variables
}
