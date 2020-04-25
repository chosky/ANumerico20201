package GUI;

import Parser.MathFunctionsParser;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Smith Alexis Carvajal
 */
public class ReglaFalsa extends javax.swing.JFrame {

    private double _xi;
    private double _xs;
    private double _tolerance;
    private int _n;
    private MathFunctionsParser function;
    
    /**
     * Creates new form ReglaFalsa
     */
    public ReglaFalsa() {
        this.function = new MathFunctionsParser();
        this.setTitle("Regla Falsa");
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        this.observacionesTxt.setEditable(false);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        functionLbl = new javax.swing.JLabel();
        functionTxt = new javax.swing.JTextField();
        valorInicialLbl = new javax.swing.JLabel();
        toleranciaLbl = new javax.swing.JLabel();
        valorFinalLbl = new javax.swing.JLabel();
        iteracionesLbl = new javax.swing.JLabel();
        graficarBtn = new javax.swing.JButton();
        calcularBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        valorInicialTxt = new javax.swing.JTextField();
        toleranciaTxt = new javax.swing.JTextField();
        valorFinalTxt = new javax.swing.JTextField();
        iteracionesTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacionesTxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        reglaFalsaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        titleLbl.setText("REGLA FALSA");

        functionLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl.setText("f(x) = ");

        functionTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        functionTxt.setForeground(new java.awt.Color(1, 1, 1));

        valorInicialLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        valorInicialLbl.setForeground(new java.awt.Color(1, 1, 1));
        valorInicialLbl.setText("Valor inicial (xi):");

        toleranciaLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        toleranciaLbl.setForeground(new java.awt.Color(1, 1, 1));
        toleranciaLbl.setText("Tolerancia:");

        valorFinalLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        valorFinalLbl.setForeground(new java.awt.Color(1, 1, 1));
        valorFinalLbl.setText("Valor final (xu):");

        iteracionesLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iteracionesLbl.setForeground(new java.awt.Color(1, 1, 1));
        iteracionesLbl.setText("Cant. iteraciones (n):");

        graficarBtn.setBackground(new java.awt.Color(0, 149, 136));
        graficarBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        graficarBtn.setForeground(new java.awt.Color(1, 1, 1));
        graficarBtn.setText("GRAFICAR");
        graficarBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        graficarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarBtnActionPerformed(evt);
            }
        });

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

        observacionesTxt.setColumns(20);
        observacionesTxt.setForeground(new java.awt.Color(1, 1, 1));
        observacionesTxt.setRows(5);
        observacionesTxt.setText("OBSERVACIONES:");
        observacionesTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 187, 181)));
        jScrollPane1.setViewportView(observacionesTxt);

        reglaFalsaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "n", "xi", "xs", "xm", "f(xm)", "Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reglaFalsaTable.setColumnSelectionAllowed(true);
        reglaFalsaTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(reglaFalsaTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpiarBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(toleranciaLbl)
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(iteracionesLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(titleLbl)
                                                .addGap(117, 117, 117)))
                                        .addGap(129, 129, 129))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(valorInicialLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(valorFinalLbl)
                                        .addGap(49, 49, 49)
                                        .addComponent(valorFinalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(functionLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(graficarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcularBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorInicialLbl)
                    .addComponent(valorFinalLbl)
                    .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorFinalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toleranciaLbl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iteracionesLbl)
                        .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcularBtn)
                    .addComponent(graficarBtn))
                .addGap(13, 13, 13)
                .addComponent(limpiarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
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

    private void graficarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarBtnActionPerformed
        if(controlEntradaFuncion()) {
            PlotterVisual graficador = new PlotterVisual(this.functionTxt.getText());
            graficador.setVisible(true);
        } else {
            showErrorMessage("Error en la función, no se pudo graficar");
        }
    }//GEN-LAST:event_graficarBtnActionPerformed

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        if(controlEntradaFuncion()) {
            if (controlEntradaDatos()) {
                metodoReglaFalsa(_xi, _xs, _tolerance, _n);
            } else {
                showErrorMessage("Error en los datos de entrada");
            }
        } else {
            showErrorMessage("Error en la función, no se pudo graficar");
        }
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        this.valorInicialTxt.setText("");
        this.valorFinalTxt.setText("");
        this.toleranciaTxt.setText("");
        this.iteracionesTxt.setText("");
        this.functionTxt.setText("");
        this.clearTable();
        this.observacionesTxt.setText("OBSERVACIONES:");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void clearTable() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) reglaFalsaTable.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    private boolean controlEntradaFuncion() {
        try {
            function.parserFunction(this.functionTxt.getText());
            
            function.function.addVariable("x", 1);
            String result = Double.toString(function.function.getValue());

            if (this.functionTxt.getText().equals("") || this.functionTxt.getText().equals(" ")) {
                showErrorMessage("El campo de la función está vacio");
                return false;
            } else if(result.equals("NaN")) {
                showErrorMessage("Error en la lectura de la función \n ¿La incongita buscada es x?");
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
    
    private boolean controlEntradaDatos() {
        if(this.valorInicialTxt.getText().isBlank() || this.valorInicialTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.valorInicialTxt.getText())) {
            showErrorMessage("El campo del valor inicial está vacio o mal escrito");
            return false;
        }
        if(this.valorFinalTxt.getText().isBlank() || this.valorFinalTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.valorFinalTxt.getText())) {
            showErrorMessage("El campo del valor final está vacio o mal escrito");
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
        
        this._xi = Double.parseDouble(this.valorInicialTxt.getText());
        this._xs = Double.parseDouble(this.valorFinalTxt.getText());
        this._tolerance = Double.parseDouble(this.toleranciaTxt.getText());
        this._n = Integer.parseInt(this.iteracionesTxt.getText());
        
        return true;
    }
    
    private boolean valorTieneCaracterNoValido(String cadena) {
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
    
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    private void fillTable(int n, double xi, double xs, double xm, double ym, double err) {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) reglaFalsaTable.getModel();
        Object[] row = new Object[6];
        row[0] = n;
        row[1] = xi;
        row[2] = xs;
        row[3] = xm;
        row[4] = ym;
        row[5] = err;
        bisectionTableModel.addRow(row);
    }
    
    private double f(double x) {
        this.function.function.addVariable("x", x);
        return function.function.getValue();
    }
    
    private void metodoReglaFalsa(double xi, double xs, double tole, int n) {
        double yi = f(xi);
        double ys = f(xs);
        if(yi == 0) {
            this.observacionesTxt.setText(xi + " es una raiz");
        } else if(ys == 0){
            this.observacionesTxt.setText(xs + " es una raiz");
        } else if (yi * ys > 0) {
            this.observacionesTxt.setText("Intervalo incorrecto");
        } else if (n <= 0) {
            this.observacionesTxt.setText("Las iteraciones deben ser positivas");
        } else if (tole < 0) {
            this.observacionesTxt.setText("La tolerancia debe ser mayor o igual a cero");
        } else {
            double xm = xi-((yi*(xi-xs))/(yi-ys));
            double ym = f(xm);
            int count = 1;
            double error = tole + 1;
            fillTable(0, xi, xs, xm, ym, error);
            
            while (ym != 0 && error > tole && count < n) {
                if (yi * ym < 0) {
                  xs = xm;
                } else {
                  xi = xm;
                  yi = ym;
                }
                double lastXm = xm;
                xm = xi-((yi*(xi-xs))/(yi-ys));
                ym = f(xm);
                error = Math.abs(xm - lastXm);
                count++;
                fillTable(count, xi, xs, xm, ym, error);
            }
            if(ym == 0) {
                this.observacionesTxt.setText(xm + " es una raiz");
            } else if(error < tole){
                this.observacionesTxt.setText(xm + " se aproxima a una raíz debido a que el error es menor o igual a la tolerancia");
            } else {
                this.observacionesTxt.setText("Falló en "+ count + " iteraciones");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JTextField functionTxt;
    private javax.swing.JButton graficarBtn;
    private javax.swing.JLabel iteracionesLbl;
    private javax.swing.JTextField iteracionesTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextArea observacionesTxt;
    private javax.swing.JTable reglaFalsaTable;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel toleranciaLbl;
    private javax.swing.JTextField toleranciaTxt;
    private javax.swing.JLabel valorFinalLbl;
    private javax.swing.JTextField valorFinalTxt;
    private javax.swing.JLabel valorInicialLbl;
    private javax.swing.JTextField valorInicialTxt;
    // End of variables declaration//GEN-END:variables
}
