package GUI;

import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class NewtonInterpolacion extends javax.swing.JFrame {

    DatosInterpolacion datosInterpolacion;
    
    /**
     * Creates new form NewtonInterpolacion
     */
    public NewtonInterpolacion() {
        this.setTitle("Interpolacion Newton");
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

        titleLbl = new javax.swing.JLabel();
        calculateBtn = new javax.swing.JButton();
        ecuacionesBtn = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        cleanBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gaussTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        observations = new javax.swing.JTextPane();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("INTERPOLACIÓN POR NEWTON");
        titleLbl.setToolTipText("");

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

        ecuacionesBtn.setBackground(new java.awt.Color(0, 149, 136));
        ecuacionesBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        ecuacionesBtn.setForeground(new java.awt.Color(1, 1, 1));
        ecuacionesBtn.setText("INGRESAR DATOS");
        ecuacionesBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ecuacionesBtn.setFocusable(false);
        ecuacionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecuacionesBtnActionPerformed(evt);
            }
        });

        infoButton.setText("?");
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoButton.setFocusable(false);
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

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

        gaussTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        gaussTable.setColumnSelectionAllowed(true);
        gaussTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(gaussTable);

        observations.setEditable(false);
        observations.setText("OBSERVACIONES:");
        observations.setToolTipText("");
        jScrollPane3.setViewportView(observations);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ecuacionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titleLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLbl)
                    .addComponent(infoButton))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecuacionesBtn)
                    .addComponent(calculateBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cleanBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        try {
           BigDecimal[] xn = datosInterpolacion.getX();
           BigDecimal[] fxn = datosInterpolacion.getXn();
           int n = xn.length;
           newtonMetodo(n, xn, fxn);
           
        } catch(Exception e) {
            this.observations.setText(e.toString());
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void ecuacionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecuacionesBtnActionPerformed
        TotalDatosInterpolacion totalDatos = new TotalDatosInterpolacion();
        totalDatos.setVisible(true);
    }//GEN-LAST:event_ecuacionesBtnActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "");
    }//GEN-LAST:event_infoButtonActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        this.clearTable();
        this.observations.setText("OBSERVACIONES:");
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

        
    private void clearTable() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) gaussTable.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    private void newtonMetodo(int n, BigDecimal[] xn, BigDecimal[] fxn) {
        BigDecimal[][] matriz = new BigDecimal[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matriz[i][j] = BigDecimal.ZERO;
            }
        }
        if(n >= 1) {
            if(xn.length == n) {
                if(fxn.length == n) {
                    for(int i = 0; i < n-1; i++) {
                        for(int j = i; j < n-1; j++) {
                            if(i == 0) {
                                matriz[j][i] = fxn[j+1].subtract(fxn[j]).divide(xn[j+1].subtract(xn[j-i]));
                            } else {
                                matriz[j][i] = matriz[j][i-1].subtract(matriz[j-1][i-1]).divide(xn[j+1].subtract(xn[j-i]));
                            }
                        }
                    }
                    generarTabla(n, xn, fxn, matriz);
                    calculatPolinomio(fxn[0], matriz, xn, n);
                } else {
                    this.observations.setText("El tamaño de los puntos no corresponde con las iteraciones");
                }
            } else {
                this.observations.setText("El tamaño de los puntos no corresponde con las iteraciones");
            }
        } else {
            this.observations.setText("Las iteraciónes deben de ser mayores a 1");
        }
    }
    
    private void calculatPolinomio(BigDecimal b0, BigDecimal[][] matriz, BigDecimal[] xn, int n){
        String polinomio = "";
        polinomio += String.valueOf(b0) + " + ";
        for(int i = 0; i < n - 1; i++) {
            polinomio += String.valueOf(matriz[i][i]) + " * ";
            for(int j = 0; j < i+1; j++) {
                polinomio += "( x - " + String.valueOf(xn[j]) + ")";
                if(j == i && i != n - 2) {
                    polinomio += " + ";
                } else if ( j != i){
                    polinomio += " * ";
                }
            }
        }
        this.observations.setText("El polinomio de newton es: \n" + polinomio);
    }
    
    private void generarTabla(int n, BigDecimal[] xn, BigDecimal[] fxn, BigDecimal[][] matriz) {
        String[] columnNames = new String[matriz.length + 2];
        columnNames[0] = "n";
        columnNames[1] = "xn";
        columnNames[2] = "f(xn)";
        for(int i =1; i <= matriz.length - 1; i++){
            columnNames[i+2] = "I:" + (i);
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        int tmpX = 0;
        for(int i = 0; i < n; i++) {
            int tmpMat = 0;
            for(int j = 0; j < columnNames.length; j++) {
                if (j == 0) {
                    columnNames[j] = String.valueOf(i);
                } else if (j == 1) {
                    columnNames[j] = String.valueOf(xn[tmpX]);
                } else if (j == 2) {
                    columnNames[j] = String.valueOf(fxn[tmpX]);
                } else if (i == 0) {
                    columnNames[j] = "0";
                } else {
                    columnNames[j] = String.valueOf(matriz[i-1][tmpMat]);
                    tmpMat++;
                }
                
            }
            tmpX++;
            model.addRow(columnNames);
        }
        this.gaussTable.setModel(model);
    }
    
    public void mostrar(BigDecimal[][] matriz){
        String tmpL="";
        for(int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz[0].length;j++){
                tmpL = tmpL + matriz[i][j]+" ";
               
            }
            tmpL=tmpL +"\n";
        }
       System.out.println("L: \n"+tmpL);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JButton ecuacionesBtn;
    private javax.swing.JTable gaussTable;
    private javax.swing.JButton infoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane observations;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
