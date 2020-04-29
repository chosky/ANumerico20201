package GUI;

import Parser.MathFunctionsParser;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class PuntoFijo extends javax.swing.JFrame {

    private double _xi;
    private double _tolerance;
    private int _n;
    private MathFunctionsParser functionFx;
    private MathFunctionsParser functionGx;
    
    /**
     * Creates new form PuntoFijo
     */
    public PuntoFijo() {
        this.functionFx = new MathFunctionsParser();
        this.functionGx = new MathFunctionsParser();
        
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
        functionGxLbl = new javax.swing.JLabel();
        functionGxTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        puntoFijoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        functionGxLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionGxLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionGxLbl.setText("g(x) = ");

        functionGxTxt.setForeground(new java.awt.Color(1, 1, 1));

        puntoFijoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "n", "xn", "f(xn)", "Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        puntoFijoTable.setColumnSelectionAllowed(true);
        puntoFijoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(puntoFijoTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limpiarBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(titleLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 135, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(functionLbl)
                                                    .addComponent(functionGxLbl))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(functionGxTxt)
                                                    .addComponent(functionFxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(valorInicialLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(toleranciaLbl)
                                                    .addComponent(iteracionesLbl)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(graficarFxBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(calcularBtn)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(108, 108, 108))
                                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorInicialLbl)
                    .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toleranciaLbl)
                    .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iteracionesLbl))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionFxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionLbl))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionGxLbl)
                    .addComponent(functionGxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(309, 309, 309)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(139, Short.MAX_VALUE)))
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
                    metodoPuntoFijo(_xi, _tolerance, _n);
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
        this.clearTable();
        this.observacionesTxt.setText("OBSERVACIONES:");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void clearTable() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) puntoFijoTable.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    private boolean controlEntradaFuncionFx() {
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
    
    private boolean controlEntradaFuncionGx() {
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
    
    private boolean controlEntradaDatos() {
        if(this.valorInicialTxt.getText().equals(" ") || this.valorInicialTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.valorInicialTxt.getText())) {
            showErrorMessage("El campo del valor inicial está vacio o mal escrito");
            return false;
        }
        if(this.toleranciaTxt.getText().equals(" ") || this.toleranciaTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.toleranciaTxt.getText())) {
            showErrorMessage("El campo de la tolerancia está vacio o mal escrito");
            return false;
        }
        if(this.iteracionesTxt.getText().equals(" ") || this.iteracionesTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.iteracionesTxt.getText())) {
            showErrorMessage("El campo de las iteraciones está vacio o mal escrito");
            return false;
        }
        
        this._xi = Double.parseDouble(this.valorInicialTxt.getText());
        this._tolerance = Double.parseDouble(this.toleranciaTxt.getText());
        this._n = Integer.parseInt(this.iteracionesTxt.getText());
        
        return true;
    }
    
    private boolean valorTieneCaracterNoValido(String cadena) {
        char[] chars = cadena.toCharArray();
        boolean letra = false;
        int contPunto = 0;
        for(char c : chars) {
            if(Character.isDigit(c) || c == '-') {
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
    
    private void fillTable(int n, double xn, double fxn, double err) {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) puntoFijoTable.getModel();
        Object[] row = new Object[4];
        row[0] = n;
        row[1] = xn;
        row[2] = fxn;
        row[3] = err;
        bisectionTableModel.addRow(row);
    }
    
    private double f(double x) {
        this.functionFx.function.addVariable("x", x);
        return functionFx.function.getValue();
    }
    
    private double g(double x) {
        this.functionGx.function.addVariable("x", x);
        return functionGx.function.getValue();
    }
    
    private void metodoPuntoFijo(double x0, double tole, int iter) {
        double fx = f(x0);
        if(fx == 0) {
            this.observacionesTxt.setText(x0 + " es una raiz");
        } else if (iter <= 0) {
            this.observacionesTxt.setText("Las iteraciones deben ser positivas");
        } else if (tole < 0) {
            this.observacionesTxt.setText("La tolerancia debe ser mayor o igual a cero");
        } else {
            
            double xn;
            int count = 1;
            double error = tole + 1;
            fillTable(0, x0, fx, error);
            
            while (fx != 0 && error > tole && count < iter) {
                xn = g(x0);
                fx = f(xn);
                error = Math.abs(xn - x0);
                x0 = xn;
                count++;
                fillTable(count, xn, fx, error);
            }
            if(fx == 0) {
                this.observacionesTxt.setText(fx + " es una raiz");
            } else if(error <= tole){
                this.observacionesTxt.setText(fx + " se aproxima a una raíz debido a que el error es menor o igual a la tolerancia");
            } else {
                this.observacionesTxt.setText("Falló en "+ count + " iteraciones");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JTextField functionFxTxt;
    private javax.swing.JLabel functionGxLbl;
    private javax.swing.JTextField functionGxTxt;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JButton graficarFxBtn;
    private javax.swing.JLabel iteracionesLbl;
    private javax.swing.JTextField iteracionesTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextArea observacionesTxt;
    private javax.swing.JTable puntoFijoTable;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel toleranciaLbl;
    private javax.swing.JTextField toleranciaTxt;
    private javax.swing.JLabel valorInicialLbl;
    private javax.swing.JTextField valorInicialTxt;
    // End of variables declaration//GEN-END:variables
}
