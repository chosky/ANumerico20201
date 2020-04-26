package GUI;

import Parser.MathFunctionsParser;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class Muller extends javax.swing.JFrame {

    private double _x0;
    private double _x1;
    private double _x2;
    private double _tolerance;
    private int _n;
    private MathFunctionsParser functionFx;
    
    /**
     * Creates new form Muller
     */
    public Muller() {
        this.functionFx = new MathFunctionsParser();
        
        this.setTitle("Müller");
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        this.observacionesTxt.setEditable(false);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mullerTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        observacionesTxt = new javax.swing.JTextPane();
        titleLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        toleranceLbl = new javax.swing.JLabel();
        toleranciaTxt = new javax.swing.JTextField();
        functionLbl = new javax.swing.JLabel();
        functionTxt = new javax.swing.JTextField();
        nitterLbl = new javax.swing.JLabel();
        iteracionesTxt = new javax.swing.JTextField();
        plotterBtn = new javax.swing.JButton();
        calculateBtn = new javax.swing.JButton();
        dato0Lbl = new javax.swing.JLabel();
        dato0Txt = new javax.swing.JTextField();
        dato1Lbl = new javax.swing.JLabel();
        dato1Txt = new javax.swing.JTextField();
        dato2Lbl = new javax.swing.JLabel();
        dato2Txt = new javax.swing.JTextField();
        cleanBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mullerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "n", "xm", "f(xm)", "deno", "a", "b", "c", "Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mullerTable.setColumnSelectionAllowed(true);
        mullerTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(mullerTable);

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

        observacionesTxt.setEditable(false);
        observacionesTxt.setText("OBSERVACIONES:");
        observacionesTxt.setToolTipText("");
        jScrollPane3.setViewportView(observacionesTxt);

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("MÜLLER");
        titleLbl.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        toleranceLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        toleranceLbl.setForeground(new java.awt.Color(1, 1, 1));
        toleranceLbl.setText("Tolerancia:");

        toleranciaTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        toleranciaTxt.setForeground(new java.awt.Color(1, 1, 1));

        functionLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl.setText("f(x) = ");

        functionTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        functionTxt.setForeground(new java.awt.Color(1, 1, 1));

        nitterLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        nitterLbl.setForeground(new java.awt.Color(1, 1, 1));
        nitterLbl.setText("Cant. iteraciones (n):");

        iteracionesTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iteracionesTxt.setForeground(new java.awt.Color(1, 1, 1));

        plotterBtn.setBackground(new java.awt.Color(0, 149, 136));
        plotterBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        plotterBtn.setForeground(new java.awt.Color(1, 1, 1));
        plotterBtn.setText("GRAFICAR");
        plotterBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        plotterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotterBtnActionPerformed(evt);
            }
        });

        calculateBtn.setBackground(new java.awt.Color(0, 149, 136));
        calculateBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        calculateBtn.setForeground(new java.awt.Color(1, 1, 1));
        calculateBtn.setText("CALCULAR");
        calculateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(plotterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(functionLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(functionTxt))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(toleranceLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(nitterLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toleranceLbl)
                    .addComponent(nitterLbl)
                    .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionLbl)
                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plotterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dato0Lbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        dato0Lbl.setForeground(new java.awt.Color(1, 1, 1));
        dato0Lbl.setText("Dato x0:");

        dato0Txt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        dato0Txt.setForeground(new java.awt.Color(1, 1, 1));
        dato0Txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        dato1Lbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        dato1Lbl.setForeground(new java.awt.Color(1, 1, 1));
        dato1Lbl.setText("Dato x1:");

        dato1Txt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        dato1Txt.setForeground(new java.awt.Color(1, 1, 1));

        dato2Lbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        dato2Lbl.setForeground(new java.awt.Color(1, 1, 1));
        dato2Lbl.setText("Dato x2:");

        dato2Txt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        dato2Txt.setForeground(new java.awt.Color(1, 1, 1));

        cleanBtn.setBackground(new java.awt.Color(0, 149, 136));
        cleanBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        cleanBtn.setForeground(new java.awt.Color(1, 1, 1));
        cleanBtn.setText("LIMPIAR");
        cleanBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dato0Lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dato0Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(dato1Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(dato1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dato2Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(dato2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLbl)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dato0Txt)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dato0Lbl)
                        .addComponent(dato1Lbl)
                        .addComponent(dato1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dato2Lbl)
                        .addComponent(dato2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        this.dato0Txt.setText("");
        this.dato1Txt.setText("");
        this.iteracionesTxt.setText("");
        this.toleranciaTxt.setText("");
        this.functionTxt.setText("");
        this.clearTable();
        this.observacionesTxt.setText("OBSERVACIONES:");
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        if(controlEntradaFuncionFx()) {
            if (controlEntradaDatos()) {
                metodoMuller(_x0, _x1, _x2, _tolerance, _n);
            } else {
                showErrorMessage("Error en los datos de entrada");
            }

        } else {
            showErrorMessage("Error en la función, no se pudo graficar");
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void plotterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plotterBtnActionPerformed
        if(controlEntradaFuncionFx()) {
            PlotterVisual graficador = new PlotterVisual(this.functionTxt.getText());
            graficador.setVisible(true);
        } else {
            showErrorMessage("Error en la función, no se pudo graficar");
        }
    }//GEN-LAST:event_plotterBtnActionPerformed

    private void clearTable() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) mullerTable.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    private boolean controlEntradaFuncionFx() {
        try {
            functionFx.parserFunction(this.functionTxt.getText());
            
            functionFx.function.addVariable("x", 1);
            String result = Double.toString(functionFx.function.getValue());
        
            if (this.functionTxt.getText().equals("") || this.functionTxt.getText().equals(" ")) {
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
    
    private boolean controlEntradaDatos() {
        if(this.dato0Txt.getText().equals(" ") || this.dato0Txt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.dato0Txt.getText())) {
            showErrorMessage("El campo del valor inicial está vacio o mal escrito");
            return false;
        }
        if(this.dato1Txt.getText().equals(" ") || this.dato1Txt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.dato1Txt.getText())) {
            showErrorMessage("El campo del valor inicial está vacio o mal escrito");
            return false;
        }
        if(this.dato2Txt.getText().equals(" ") || this.dato2Txt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.dato2Txt.getText())) {
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
        
        this._x0 = Double.parseDouble(this.dato0Txt.getText());
        this._x1 = Double.parseDouble(this.dato1Txt.getText());
        this._x2 = Double.parseDouble(this.dato2Txt.getText());
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
    
    private void fillTable(int n, double xn, double fxn, double deno, double a, double b, double c, double err) {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) mullerTable.getModel();
        Object[] row = new Object[8];
        row[0] = n;
        row[1] = xn;
        row[2] = fxn;
        row[3] = deno;
        row[4] = a;
        row[5] = b;
        row[6] = c;
        row[7] = err;
        bisectionTableModel.addRow(row);
    }
    
    private double f(double x) {
        this.functionFx.function.addVariable("x", x);
        return functionFx.function.getValue();
    }
    
    private void metodoMuller(double x0, double x1, double x2, double tole, int n) {
        double fx0 = f(x0);
        double fx1 = f(x1);
        double fx2 = f(x2);
        if (fx0 == 0) {
            this.observacionesTxt.setText(x0 + " es una raiz");
        } else if (fx1 < 0) {
            this.observacionesTxt.setText(x1 + " es una raiz");
        } else if (fx2 < 0) {
            this.observacionesTxt.setText(x2 + " es una raiz");
        } else if (tole < 0) {
            this.observacionesTxt.setText("La tolerancia debe ser mayor o igual a cero");
        } else if (n <= 0) {
            this.observacionesTxt.setText("Las iteraciones deben ser positivas");
        } else {
            int count = 1;
            int iterTabla = 3;
            double error = Math.abs(x1 - x0);
            double error1 = Math.abs(x2 - x1);
            double deno = (x0 - x2)*(x1 - x2)*(x0 - x1);
            double a = (((x1 - x2)*(fx0 - fx2)) - ((x0 - x2)*(fx1 - fx2)))/deno;
            double b = (Math.pow((x0 - x2), 2)*(fx1 - fx2) - Math.pow((x1 - x2), 2)*(fx0 - fx2))/deno;
            double c = fx2;
            fillTable(1, x0, fx0, deno, 0, 0, 0, 0);
            fillTable(2, x1, fx1, deno, 0, 0, 0, error);
            fillTable(3, x2, fx2, deno, a, b, c, error1);
            while (fx1 != 0 && error > tole && deno != 0 && count < n){
                x0 = x1;
                x1 = x2;
                x2 = x2+((-2*c)/(b+Math.signum(b)*Math.sqrt(Math.pow(b, 2)-4*a*c)));
                fx0 = f(x0);
                fx1 = f(x1);
                fx2 = f(x2);
                deno = (x0 - x2)*(x1 - x2)*(x0 - x1);
                a = ((x1 - x2)*(fx0 - fx2) - (x0 - x2)*(fx1 - fx2))/deno;
                b = ((x0*x0 - 2*x0*x2 + x2*x2)*(fx1 - fx2) - Math.pow((x1 - x2), 2)*(fx0 - fx2))/deno;
                c = fx2;
                error = Math.abs(x2 - x1);
                count++;
                iterTabla++;
                fillTable(iterTabla, x2, fx2, deno, a, b, c, error);
            }
            
            if (fx1 == 0) {
                this.observacionesTxt.setText(x1 + " es una raiz");
            } else if (error < tole) {
                this.observacionesTxt.setText(x1 + " se aproxima a una raíz debido a que el error " + error + " es menor o igual a la tolerancia " + tole);
            } else if (deno == 0) {
                this.observacionesTxt.setText("Hay una posible raíz multiple");
            } else {
                this.observacionesTxt.setText("El algoritmo fracasó en "+ count + " iteraciones");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JLabel dato0Lbl;
    private javax.swing.JTextField dato0Txt;
    private javax.swing.JLabel dato1Lbl;
    private javax.swing.JTextField dato1Txt;
    private javax.swing.JLabel dato2Lbl;
    private javax.swing.JTextField dato2Txt;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JTextField functionTxt;
    private javax.swing.JTextField iteracionesTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable mullerTable;
    private javax.swing.JLabel nitterLbl;
    private javax.swing.JTextPane observacionesTxt;
    private javax.swing.JButton plotterBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel toleranceLbl;
    private javax.swing.JTextField toleranciaTxt;
    // End of variables declaration//GEN-END:variables
}
