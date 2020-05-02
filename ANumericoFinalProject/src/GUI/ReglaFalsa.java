package GUI;

import Parser.MathFunctionsParser;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.NumberFormat;

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
        javax.swing.JButton infoButton = new javax.swing.JButton();

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

        infoButton.setText("?");
        infoButton.setFocusable(false);
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(limpiarBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toleranciaLbl)
                                .addGap(5, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(iteracionesLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(titleLbl)
                                        .addGap(117, 117, 117)))
                                .addGap(82, 82, 82)
                                .addComponent(infoButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valorInicialLbl)
                                .addGap(18, 18, 18)
                                .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(valorFinalLbl)
                                .addGap(49, 49, 49)
                                .addComponent(valorFinalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLbl)
                    .addComponent(infoButton))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorInicialLbl)
                    .addComponent(valorFinalLbl)
                    .addComponent(valorInicialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorFinalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iteracionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iteracionesLbl)
                        .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toleranciaLbl))
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
     
    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
         JOptionPane.showMessageDialog(null,  " Para que el método de Regla falsa se deben asegurar dos cosas:\n \n" +
                                              " La función debe de ser continua\n" +
                                              " El intervalo que se va a usar debe de contener un cambio de signo\n\n" +
                                              " Una vez este esto asegurado el método de regla falsa lo que busca \n es a partir de rectas secantes entre los puntos comienza a buscar \n la raíz convergiendo a esta a partir de la ecuación:\n" +
                                              "\n" +
                                              "            xm = xi - (f(xi)(xi-xu))/(f(xi)-f(xu))\n" +
                                              "\n" +
                                              " teniendo e cuenta que xi en la primera iteración es el valor inicial \n del intervalo [a] y xu el final del intervalo [b] pero posteriormente \n estas constantes cambian según el cambio de signo \n que se pueda encontrar en los nuevos intervalos.");
    }//GEN-LAST:event_infoButtonActionPerformed

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
        if(this.valorInicialTxt.getText().equals(" ") || this.valorInicialTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.valorInicialTxt.getText())) {
            showErrorMessage("El campo del valor inicial está vacio o mal escrito");
            return false;
        }
        if(this.valorFinalTxt.getText().equals(" ") || this.valorFinalTxt.getText().isEmpty() || 
           valorTieneCaracterNoValido(this.valorFinalTxt.getText())) {
            showErrorMessage("El campo del valor final está vacio o mal escrito");
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
    
    private void fillTable(int n, double xi, double xs, double xm, double ym, double err) {
        NumberFormat numFormat = new DecimalFormat("0.##E0");
        DefaultTableModel bisectionTableModel = (DefaultTableModel) reglaFalsaTable.getModel();
        Object[] row = new Object[6];
        row[0] = n;
        row[1] = xi;
        row[2] = xs;
        row[3] = xm;
        row[4] = numFormat.format(ym);
        row[5] = numFormat.format(err);
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
                this.observacionesTxt.setText(ym + " es una raiz");
            } else if(error <= tole){
                this.observacionesTxt.setText(ym + " se aproxima a una raíz debido a que el error es menor o igual a la tolerancia");
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
