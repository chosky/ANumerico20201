package GUI;

import Parser.MathFunctionsParser;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Smith Alexis Carvajal
 */
public class RaicesMultiples extends javax.swing.JFrame {

    private double _xi;
    private double _tolerance;
    private int _n;
    private MathFunctionsParser functionFx;
    private MathFunctionsParser functionFdx;
    private MathFunctionsParser functionF2dx;
    
    /**
     * Creates new form RaicesMultiples
     */
    public RaicesMultiples() {
        functionFx = new MathFunctionsParser();
        functionFdx = new MathFunctionsParser();
        functionF2dx = new MathFunctionsParser();
        
        this.setTitle("Raíces Múltiples");
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
        graficarBtn = new javax.swing.JButton();
        functionTxt = new javax.swing.JTextField();
        calcularBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        valorInicialTxt = new javax.swing.JTextField();
        toleranciaTxt = new javax.swing.JTextField();
        iteracionesTxt = new javax.swing.JTextField();
        functionFdxLbl = new javax.swing.JLabel();
        functionF2dxLbl = new javax.swing.JLabel();
        functionFdxTxt = new javax.swing.JTextField();
        functionF2dxTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        raicesMultiplesTable = new javax.swing.JTable();

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
        titleLbl.setText("RAÍCES MÚLTIPLES");

        iteracionesLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iteracionesLbl.setForeground(new java.awt.Color(1, 1, 1));
        iteracionesLbl.setText("Cant. iteraciones (n):");

        functionLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl.setText("f(x) = ");

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

        functionTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        functionTxt.setForeground(new java.awt.Color(1, 1, 1));

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

        functionFdxLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionFdxLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionFdxLbl.setText("f'(x) = ");

        functionF2dxLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionF2dxLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionF2dxLbl.setText("f''(x) = ");

        functionFdxTxt.setForeground(new java.awt.Color(1, 1, 1));

        functionF2dxTxt.setForeground(new java.awt.Color(1, 1, 1));

        raicesMultiplesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "n", "xn", "f(x)", "f'(x)", "f''(x)", "deno", "Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        raicesMultiplesTable.setColumnSelectionAllowed(true);
        raicesMultiplesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(raicesMultiplesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(limpiarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(graficarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcularBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(functionLbl)
                                            .addComponent(functionFdxLbl)
                                            .addComponent(functionF2dxLbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(functionF2dxTxt)
                                            .addComponent(functionFdxTxt)
                                            .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(119, 119, 119))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valorInicialLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(toleranciaLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iteracionesLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLbl)
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorInicialLbl)
                        .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toleranciaLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iteracionesLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionLbl))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionFdxLbl)
                    .addComponent(functionFdxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionF2dxLbl)
                    .addComponent(functionF2dxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(limpiarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(graficarBtn)
                            .addComponent(calcularBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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
        if(controlEntradaFuncionFx()) {
            PlotterVisual graficador = new PlotterVisual(this.functionTxt.getText());
            graficador.setVisible(true);
        } else {
            showErrorMessage("Error en la función, no se pudo graficar");
        }
    }//GEN-LAST:event_graficarBtnActionPerformed

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        if(controlEntradaFuncionFx()) {
            if(controlEntradaFuncionFdx()) {
                if(controlEntradaFuncionF2dx()) {
                    if (controlEntradaDatos()) {
                        metodoRaicesMultiples(_xi, _tolerance, _n);
                    } else {
                        showErrorMessage("Error en los datos de entrada");
                    }
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
        this.functionTxt.setText("");
        this.functionFdxTxt.setText("");
        this.functionF2dxTxt.setText("");
        this.clearTable();
        this.observacionesTxt.setText("OBSERVACIONES:");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void clearTable() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) raicesMultiplesTable.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    private boolean controlEntradaFuncionFx() {
        try {
            functionFx.parserFunction(this.functionTxt.getText());
            
            functionFx.function.addVariable("x", 1);
            String result = Double.toString(functionFx.function.getValue());
        
            if (this.functionTxt.getText().equals("") || this.functionTxt.getText().equals(" ")) {
                showErrorMessage("El campo de la función f(x) está vacio");
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
    
    private boolean controlEntradaFuncionFdx() {
        try {
            functionFdx.parserFunction(this.functionFdxTxt.getText());
            
            functionFdx.function.addVariable("x", 1);
            String result = Double.toString(functionFdx.function.getValue());
        
            if (this.functionFdxTxt.getText().equals("") || this.functionFdxTxt.getText().equals(" ")) {
                showErrorMessage("El campo de la función f'(x) está vacio");
                return false;
            } else if(result.equals("NaN")) {
                showErrorMessage("Error en la lectura de la función f'(x) \n ¿La incongita buscada es x?");
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
    
    private boolean controlEntradaFuncionF2dx() {
        try {
            functionF2dx.parserFunction(this.functionF2dxTxt.getText());
            
            functionF2dx.function.addVariable("x", 1);
            String result = Double.toString(functionF2dx.function.getValue());
        
            if (this.functionF2dxTxt.getText().equals("") || this.functionF2dxTxt.getText().equals(" ")) {
                showErrorMessage("El campo de la función f''(x) está vacio");
                return false;
            } else if(result.equals("NaN")) {
                showErrorMessage("Error en la lectura de la función f''(x) \n ¿La incongita buscada es x?");
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
    
    private void fillTable (int n, double xn, double fx, double fdx, double f2dx, double deno, double err) {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) raicesMultiplesTable.getModel();
        Object[] row = new Object[7];
        row[0] = n;
        row[1] = xn;
        row[2] = fx;
        row[3] = fdx;
        row[4] = f2dx;
        row[5] = deno;
        row[6] = err;
        bisectionTableModel.addRow(row);
    }
    
    private double f(double x) {
        this.functionFx.function.addVariable("x", x);
        return functionFx.function.getValue();
    }
    
    private double fdx(double x) {
        this.functionFdx.function.addVariable("x", x);
        return functionFdx.function.getValue();
    }
    
    private double f2dx(double x) {
        this.functionF2dx.function.addVariable("x", x);
        return functionF2dx.function.getValue();
    }
    
    private void metodoRaicesMultiples(double xi, double tole, int iter) {
        if (iter <= 0) {
            this.observacionesTxt.setText("Las iteraciones deben ser positivas");
        } else if (tole < 0) {
            this.observacionesTxt.setText("La tolerancia debe ser mayor o igual a cero");
        } else {
            
            double fx = f(xi);
            double fdx = fdx(xi);
            double f2dx = f2dx(xi);
            double deno = Math.pow(fx, 2) - (fx*f2dx);
            int count = 1;
            double error = tole + 1;
            
            fillTable(0, xi, fx, fdx, f2dx, deno, error);
            double xn;
            while (fx != 0 && error > tole && deno != 0 && count < iter) {
                xn = xi - ((fx * fdx)/ deno);
                fx = f(xn);
                fdx = fdx(xn);
                f2dx = f2dx(xn);
                deno = Math.pow(fx, 2) - (fx*f2dx);
                error = Math.abs(xn - xi);
                xi = xn;
                count++;
                fillTable(count, xi, fx, fdx, f2dx, deno, error);
            }
            if(fx == 0) {
                this.observacionesTxt.setText(fx + " es una raiz");
            } else if(error < tole){
                this.observacionesTxt.setText(fx + " se aproxima a una raíz debido a que el error es menor o igual a la tolerancia");
            } else if(deno == 0) {
                this.observacionesTxt.setText("El denominador es igual a 0");
            } else {
                this.observacionesTxt.setText("Falló en "+ count + " iteraciones");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JLabel functionF2dxLbl;
    private javax.swing.JTextField functionF2dxTxt;
    private javax.swing.JLabel functionFdxLbl;
    private javax.swing.JTextField functionFdxTxt;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JTextField functionTxt;
    private javax.swing.JButton graficarBtn;
    private javax.swing.JLabel iteracionesLbl;
    private javax.swing.JTextField iteracionesTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextArea observacionesTxt;
    private javax.swing.JTable raicesMultiplesTable;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel toleranciaLbl;
    private javax.swing.JTextField toleranciaTxt;
    private javax.swing.JLabel valorInicialLbl;
    private javax.swing.JTextField valorInicialTxt;
    // End of variables declaration//GEN-END:variables
}
