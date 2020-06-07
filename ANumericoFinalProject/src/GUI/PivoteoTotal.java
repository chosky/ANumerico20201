package GUI;

import SolucionDeSistemas.GaussMethods;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class PivoteoTotal extends javax.swing.JFrame {

    private final ContenedorEcuaciones contenedor;
    BigDecimal [][] _ecuaciones;
    /**
     * Creates new form PivoteoTotal
     */
    public PivoteoTotal() {
        this.setResizable(false);
        this.setTitle("Pivoteo Total");
        initComponents();
        contenedor = ContenedorEcuaciones.getContenedor();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        observations = new javax.swing.JTextPane();
        infoButton = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gaussTable = new javax.swing.JTable();
        ecuacionesBtn1 = new javax.swing.JButton();
        calculateBtn1 = new javax.swing.JButton();
        cleanBtn1 = new javax.swing.JButton();
        titleLbl2 = new javax.swing.JLabel();

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

        observations.setEditable(false);
        observations.setText("OBSERVACIONES:");
        observations.setToolTipText("");
        jScrollPane3.setViewportView(observations);

        infoButton.setText("?");
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoButton.setFocusable(false);
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("ELIMINACIÓN GAUSSIANA");
        titleLbl.setToolTipText("");

        gaussTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        gaussTable.setColumnSelectionAllowed(true);
        gaussTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(gaussTable);

        ecuacionesBtn1.setBackground(new java.awt.Color(0, 149, 136));
        ecuacionesBtn1.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        ecuacionesBtn1.setForeground(new java.awt.Color(1, 1, 1));
        ecuacionesBtn1.setText("INGRESAR ECUACIONES");
        ecuacionesBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ecuacionesBtn1.setFocusable(false);
        ecuacionesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecuacionesBtn1ActionPerformed(evt);
            }
        });

        calculateBtn1.setBackground(new java.awt.Color(0, 149, 136));
        calculateBtn1.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        calculateBtn1.setForeground(new java.awt.Color(1, 1, 1));
        calculateBtn1.setText("CALCULAR");
        calculateBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calculateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtn1ActionPerformed(evt);
            }
        });

        cleanBtn1.setBackground(new java.awt.Color(0, 149, 136));
        cleanBtn1.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        cleanBtn1.setForeground(new java.awt.Color(1, 1, 1));
        cleanBtn1.setText("LIMPIAR");
        cleanBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cleanBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtn1ActionPerformed(evt);
            }
        });

        titleLbl2.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl2.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl2.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl2.setText("POR PIVOTEO TOTAL");
        titleLbl2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cleanBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(ecuacionesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(calculateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(infoButton)))
                .addGap(2, 2, 2)
                .addComponent(titleLbl2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecuacionesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cleanBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "");
    }//GEN-LAST:event_infoButtonActionPerformed

    private void ecuacionesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecuacionesBtn1ActionPerformed
        TotalEcuaciones totalecuacuaciones = new TotalEcuaciones();
        totalecuacuaciones.setVisible(true);
    }//GEN-LAST:event_ecuacionesBtn1ActionPerformed

    private void calculateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtn1ActionPerformed
        //try {
            this._ecuaciones = contenedor.getEcuaciones();
            initTable();
            BigDecimal[][] Ub = GaussMethods.pivoteoTotal(_ecuaciones, _ecuaciones.length - 1, gaussTable);
            BigDecimal[] X = GaussMethods.Sustitucion(Ub, _ecuaciones.length - 1);
            mostrarResultado(X);
        //} catch(Exception e) {
          //  this.observations.setText(e.toString());
        //}
    }//GEN-LAST:event_calculateBtn1ActionPerformed

    private void cleanBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtn1ActionPerformed
        this.clearTable();
        this.observations.setText("OBSERVACIONES:");
    }//GEN-LAST:event_cleanBtn1ActionPerformed

    private void clearTable() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) gaussTable.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    private void initTable() {
        String[] columnNames = new String[_ecuaciones.length + 1];
        columnNames[0] = "n";
        for(int i =1; i <= this._ecuaciones.length; i++){
            columnNames[i] = "X"+i;
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        this.gaussTable.setModel(model);
    }
    
    private void mostrarResultado(BigDecimal[] X){
        String text = "Resultado: \n";
        for(int i = 0; i < X.length; i++){
            text += "X"+(i+1)+ "= "+ X[i]+ "\n";
        }
        this.observations.setText(text);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn1;
    private javax.swing.JButton cleanBtn1;
    private javax.swing.JButton ecuacionesBtn1;
    private javax.swing.JTable gaussTable;
    private javax.swing.JButton infoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane observations;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel titleLbl2;
    // End of variables declaration//GEN-END:variables
}
