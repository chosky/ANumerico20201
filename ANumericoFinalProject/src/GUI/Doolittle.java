
package GUI;

import java.math.BigDecimal;
import java.math.MathContext;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tomas Alvarez
 */
public class Doolittle extends javax.swing.JFrame {

    private final ContenedorEcuaciones contenedor;
    BigDecimal[][]L;
    BigDecimal[][]U;
    BigDecimal[][]A;
    BigDecimal[]B;
    BigDecimal[]X;
    BigDecimal[]Z;
    /**
     * Creates new form Doolottle
     */
    public Doolittle() {
        this.setResizable(false);
        this.setTitle("Doolittle");
        initComponents();
        contenedor = ContenedorEcuaciones.getContenedor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        observations = new javax.swing.JTextPane();
        backBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        matrizL = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        matrizU = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrizA = new javax.swing.JTable();
        ecuacionesBtn1 = new javax.swing.JButton();
        calculateBtn1 = new javax.swing.JButton();
        cleanBtn1 = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        infoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        matrizL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        matrizL.setColumnSelectionAllowed(true);
        matrizL.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(matrizL);

        matrizU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        matrizU.setColumnSelectionAllowed(true);
        matrizU.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(matrizU);

        jLabel3.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("Matriz U");

        jLabel2.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("Matriz L");

        jLabel1.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Matriz A");

        matrizA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        matrizA.setColumnSelectionAllowed(true);
        matrizA.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(matrizA);

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

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("DOOLITTLE");
        titleLbl.setToolTipText("");

        infoButton.setText("?");
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(275, 275, 275)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cleanBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ecuacionesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calculateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoButton)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addComponent(titleLbl)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(infoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecuacionesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cleanBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void ecuacionesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecuacionesBtn1ActionPerformed
        TotalEcuaciones totalecuacuaciones = new TotalEcuaciones();
        totalecuacuaciones.setVisible(true);
    }//GEN-LAST:event_ecuacionesBtn1ActionPerformed

    private void calculateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtn1ActionPerformed
        try {
            BigDecimal[][] ecuaciones = contenedor.getEcuaciones();
            adecuarMatrices();
            doolittle();
            Progresiva();
            Sustitucion();
            mostrarResultado(X, Z);
            mostrarMatrizA(A);
            mostrarMatrizL(L);
            mostrarMatrizU(U);
        } catch(Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_calculateBtn1ActionPerformed

    private void cleanBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtn1ActionPerformed
        this.clearMatrizA();
        this.clearMatrizL();
        this.clearMatrizU();
        this.observations.setText("OBSERVACIONES:");
    }//GEN-LAST:event_cleanBtn1ActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        JOptionPane.showMessageDialog(this, "");
    }//GEN-LAST:event_infoButtonActionPerformed

    private void clearMatrizA() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) matrizA.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    private void clearMatrizL() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) matrizL.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    private void clearMatrizU() {
        DefaultTableModel bisectionTableModel = (DefaultTableModel) matrizU.getModel();
        bisectionTableModel.setRowCount(0);
    }
    
    public void adecuarMatrices(){
        BigDecimal[][]tmp = contenedor.ecuaciones;
       if(tmp!=null){   
            L = new BigDecimal[tmp.length][tmp[0].length-1];
            U = new BigDecimal[tmp.length][tmp[0].length-1];
            A = new BigDecimal[tmp.length][tmp[0].length-1];
            B = new BigDecimal[tmp.length];
            Z = new BigDecimal[tmp.length];
            X = new BigDecimal[tmp.length];
            
            
            
            for(int filas = 0;filas<tmp.length;filas++){
                for(int columnas = 0;columnas<tmp[0].length;columnas++){
                    if(columnas==tmp[0].length-1){
                        B[filas] = tmp[filas][columnas];
                    }else {
                        A[filas][columnas] = tmp[filas][columnas];
                        if(filas == columnas){
                            U[filas][columnas] = BigDecimal.ONE;
                            L[filas][columnas] = BigDecimal.ONE;
                        }else {
                            U[filas][columnas] = BigDecimal.ZERO;
                            L[filas][columnas] = BigDecimal.ZERO;
                        }
                    }
                }
            }
            mostrar();
        }else{
            showErrorMessage("Porfavor primero ingrese los datos");
        }
    }
    
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public void doolittle(){
        int n = L.length;
        BigDecimal suma1,suma2;
        for(int d = 0 ;d<n;d++){
            for(int j = d; j< n;j++){
                suma1 = BigDecimal.ZERO;
                for(int s = 0; s < j; s++){
                    suma1 = suma1.add(L[d][s].multiply(U[s][j]));
                }
                U[d][j] = A[d][j].subtract(suma1);
            }
            for(int j = d+1;j<n;j++){
                suma2 = BigDecimal.ZERO;
                for(int p = 0; p<d; p++){
                    suma2 = suma2.add(L[j][p].multiply(U[p][d]));
                }
                L[j][d] = A[j][d].subtract(suma2).divide(U[d][d],MathContext.DECIMAL128);
            }
            
        }
        mostrar();
    }
    
    
    public void Sustitucion() {
        int n = U.length-1 ;
        if(U[n][n] == BigDecimal.ZERO){
            throw new ArithmeticException("El sistema tiene infinitas/cero soluciones");
        }
        X[n]= Z[n].divide(U[n][n], MathContext.DECIMAL128);
        System.out.println("X"+(n+1)+ "= "+ X[n]);
        for(int i = n-1; i >= 0; i--) { 
            BigDecimal sumatoria = BigDecimal.ZERO;
            for(int j = i+1; j <= n; j++){
                sumatoria = sumatoria.add(U[i][j].multiply(X[j]));
            }
            if(U[i][i] == BigDecimal.ZERO){
                throw new ArithmeticException("El sistema tiene infinitas soluciones");
            }
            X[i] = (Z[i].subtract(sumatoria)).divide(U[i][i], MathContext.DECIMAL128);
            System.out.println("X"+(i+1)+ "= "+ X[i]);
        }   
    }
    
    public void Progresiva() {
        int n = L.length-1 ;
        if(U[n][n] == BigDecimal.ZERO){
           throw new ArithmeticException("El sistema tiene infinitas/cero soluciones");
        }
        BigDecimal[] X = new BigDecimal[n+1];
        Z[0]= B[0].divide(L[0][0], MathContext.DECIMAL128);
        System.out.println("Z1 = "+ Z[0]);
        for(int i = 1; i <= n; i++) { 
            BigDecimal sumatoria = BigDecimal.ZERO;
            for(int j = 0; j < i; j++){
                sumatoria = sumatoria.add(L[i][j].multiply(Z[j]));
            }
            if(L[i][i] == BigDecimal.ZERO){
                throw new ArithmeticException("El sistema tiene infinitas soluciones");
            }
            Z[i] = (B[i].subtract(sumatoria)).divide(L[i][i], MathContext.DECIMAL128);
            System.out.println("Z"+(i+1)+ "= "+ Z[i]);
        }   
    }
    
    public void mostrarMatrizA(BigDecimal[][] A){
        int n = A.length;
        DefaultTableModel model = (DefaultTableModel) matrizA.getModel();
        model.setRowCount(n);
        model.setColumnCount(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrizA.setValueAt(A[i][j], i, j);
            }
        }
    }
    
    public void mostrarMatrizL(BigDecimal[][] L){
        int n = A.length;
        DefaultTableModel model = (DefaultTableModel) matrizL.getModel();
        model.setRowCount(n);
        model.setColumnCount(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrizL.setValueAt(L[i][j], i, j);
            }
        }
    }
    
    public void mostrarMatrizU(BigDecimal[][] U){
        int n = A.length;
        DefaultTableModel model = (DefaultTableModel) matrizU.getModel();
        model.setRowCount(n);
        model.setColumnCount(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrizU.setValueAt(U[i][j], i, j);
            }
        }
    }
    
    private void mostrarResultado(BigDecimal[] X, BigDecimal[] Z){
        String text = "Resultado: \n";
        for(int j = 0; j < Z.length; j++){
            text += "Z"+(j+1)+ "= "+ Z[j]+ "\n";
        }
        for(int i = 0; i < X.length; i++){
            text += "X"+(i+1)+ "= "+ X[i]+ "\n";
        }
        this.observations.setText(text);
    }
    
    public void mostrar(){
        //System.out.println("Estamos en mostrar. filas L:"+L.length +" Columnas L:"+L[0].length);
        String tmpL="";
        String tmpU="";
        String tmpA ="";
        String tmpB="";
        for(int i = 0;i<L.length;i++){
           // System.out.println("dentro del primer ciclo");
            for(int j = 0;j<L[0].length;j++){
               // System.out.println("dentro del segundo ciclo");
              //  System.out.println("valor L:"+L[i][j]);
                //System.out.println("Valor i:"+i+" Valor j:"+j);
                tmpL = tmpL + L[i][j]+" ";
               
               // System.out.println("valor U:"+U[i][j]);
                tmpU= tmpU+U[i][j]+" ";
                tmpA= tmpA+A[i][j]+" ";
            }
            tmpL=tmpL +"\n";
            tmpU=tmpU + "\n";
            tmpA=tmpA + "\n";
            tmpB+=B[i]+" ";
        }
       System.out.println("L: \n"+tmpL);
       System.out.println("U: \n"+tmpU);
       System.out.println("A: \n"+tmpA);
       System.out.println("B: \n"+tmpB);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn1;
    private javax.swing.JButton cleanBtn1;
    private javax.swing.JButton ecuacionesBtn1;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable matrizA;
    private javax.swing.JTable matrizL;
    private javax.swing.JTable matrizU;
    private javax.swing.JTextPane observations;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
