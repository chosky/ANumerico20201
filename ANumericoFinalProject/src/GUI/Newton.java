/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Parser.MathFunctionsParser;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhenaoo
 */
public class Newton extends javax.swing.JFrame {

    /**
     * Creates new form BusquedasIncrementales
     */
    
    MathFunctionsParser function = new MathFunctionsParser();
    MathFunctionsParser derivatefunction = new MathFunctionsParser();
    ContenedorEcuacion contenedor = ContenedorEcuacion.getContenedor();
    
    public Newton() {
        
        this.setTitle("Newton");
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        DefaultTableModel model = new DefaultTableModel();
        Object[] columns = {"N","X","f(x)","f1(x)","Error"};
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        if(contenedor.getEcuacion()!=null){
            functionTxt.setText(contenedor.ecuacion);
       }
        
       if(contenedor.derivada1 != null){
           derivatefunctiontxt.setText(contenedor.derivada1);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        functionLbl = new javax.swing.JLabel();
        functionTxt = new javax.swing.JTextField();
        initialValueLbl = new javax.swing.JLabel();
        initialValueTxt = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        cleanBtn = new javax.swing.JButton();
        deltaLbl = new javax.swing.JLabel();
        iterLbl = new javax.swing.JLabel();
        toleranciaTxt = new javax.swing.JTextField();
        iterTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        functionLbl1 = new javax.swing.JLabel();
        derivatefunctiontxt = new javax.swing.JTextField();
        observations = new java.awt.TextArea();
        info = new javax.swing.JButton();

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setText("Newton");

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

        functionLbl.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl.setText("f(x) = ");

        functionTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        functionTxt.setForeground(new java.awt.Color(1, 1, 1));

        initialValueLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        initialValueLbl.setForeground(new java.awt.Color(1, 1, 1));
        initialValueLbl.setText("Valor inicial (xi):");

        initialValueTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        initialValueTxt.setForeground(new java.awt.Color(1, 1, 1));
        initialValueTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialValueTxtActionPerformed(evt);
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

        cleanBtn.setBackground(new java.awt.Color(0, 149, 136));
        cleanBtn.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        cleanBtn.setForeground(new java.awt.Color(1, 1, 1));
        cleanBtn.setText("LIMPIAR");
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });

        deltaLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        deltaLbl.setForeground(new java.awt.Color(1, 1, 1));
        deltaLbl.setText("Tolerancia");

        iterLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iterLbl.setForeground(new java.awt.Color(1, 1, 1));
        iterLbl.setText("Cant. iteraciones (n):");

        toleranciaTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        toleranciaTxt.setForeground(new java.awt.Color(1, 1, 1));

        iterTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iterTxt.setForeground(new java.awt.Color(1, 1, 1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        functionLbl1.setFont(new java.awt.Font("Lato Black", 1, 20)); // NOI18N
        functionLbl1.setForeground(new java.awt.Color(1, 1, 1));
        functionLbl1.setText("f'(x) = ");

        derivatefunctiontxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        derivatefunctiontxt.setForeground(new java.awt.Color(1, 1, 1));

        info.setBackground(new java.awt.Color(0, 149, 136));
        info.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        info.setForeground(new java.awt.Color(1, 1, 1));
        info.setText("?");
        info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(initialValueLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(initialValueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deltaLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(iterLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(iterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(functionLbl1)
                                        .addComponent(functionLbl))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(derivatefunctiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(cleanBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(observations, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deltaLbl)
                    .addComponent(toleranciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iterLbl)
                    .addComponent(initialValueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialValueLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionLbl1)
                    .addComponent(derivatefunctiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cleanBtn)
                        .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(observations, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        Object[] columns = {"N","X","f(x)","f1(x)","Error"};
        table.setModel(new DefaultTableModel(null,columns)); 
        observations.setForeground(Color.black);
        observations.setText("OBSERVACIONES:");
        String func = functionTxt.getText();
        String derivadafun = derivatefunctiontxt.getText();
        if((evaluarfuncion(func, "f(x)")) && (evaluarfuncion(derivadafun, "f'(x)"))){
            function.parserFunction(func);
            derivatefunction.parserFunction(derivadafun);
            double valorinicial = Double.valueOf(initialValueTxt.getText());
            double tolerancia = Double.valueOf(toleranciaTxt.getText());
            int totaliteraciones = Integer.valueOf(iterTxt.getText());
            newton(valorinicial,totaliteraciones,tolerancia);
        } else {
            showErrorMessage("Porfavor verificar los datos de entrada");
        }
        
        if(contenedor.ecuacion.equalsIgnoreCase(func) == false){
            contenedor.setEcuacion(func);
        }
        if(contenedor.derivada1.equalsIgnoreCase(derivadafun) == false){
            contenedor.setDerivada1(derivadafun);
        }
        
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void initialValueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialValueTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialValueTxtActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        // TODO add your handling code here:
            Object[] columns = {"N","X","f(x)","f1(x)","Error"};
            table.setModel(new DefaultTableModel(null,columns));    
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(dialog, "Este metodo necesita como parametros: \n 1.Un valor inicial \n 2.Una tolerancia \n 3.Un numero de iteraciones \n 4.Una funcion y su correspondiente derivada");
    }//GEN-LAST:event_infoActionPerformed
    
    public void newton(double x0, int iteraciones, double tolerancia){
        function.function.addVariable("x", x0);
        double fx = function.function.getValue();
        derivatefunction.function.addVariable("x", x0);
        double dfx = derivatefunction.function.getValue();
        
        if(fx == 0){
            observations.setText(x0 + " Es una raiz");
        } else if (dfx ==0){
            observations.setText(x0 + " Es una posible raiz multiple");
        } else if (tolerancia < 0){
            observations.setText(tolerancia + " Mala entrada  de la tolerancia");
        } else if (iteraciones <1){
            observations.setText(iteraciones + " Mal iterador");
        } else {
            int contador = 0;
            double error = tolerancia + 1;
            double xn;
            pintartabla(contador, x0, fx, dfx, 0);
            while ( (error >= tolerancia) && (fx != 0) && (dfx != 0) && (contador < iteraciones)){
                xn = x0 - (fx/dfx);
                function.function.addVariable("x", xn);
                fx = function.function.getValue();
                derivatefunction.function.addVariable("x", xn);
                dfx = derivatefunction.function.getValue();
                error = Math.abs(xn - x0);
                x0 = xn;
                contador++;
                pintartabla(contador, x0, fx, dfx, error);
            }
            if (fx == 0){
                observations.setText(x0 + " es una raiz y se hallo en:" + contador + " iteraciones");
            } else if (dfx == 0){
                observations.setText(x0 + " es una posible raiz multiple");
            } else if (error <  tolerancia){
                //pintartabla(contador+1, x0, fx, dfx, error);
                observations.setText(x0 + " se aproxima a la tolerancia en un total de :" +contador +" Iteraciones");
            } else {
                observations.setText("El metodo fracaso en " + iteraciones + " iteraciones");
            }
        }
        
    }
    
    public boolean evaluarfuncion(String func,String fun){
        MathFunctionsParser temp = new MathFunctionsParser();
         try{
             temp.parserFunction(func);
             temp.function.addVariable("x", 1);
             String tmp = Double.toString(temp.function.getValue());
             if (this.functionTxt.getText().equals("") || this.functionTxt.getText().equals(" ")) {
                showErrorMessage("El campo de la función está vacio");
                return false;
            } else if(tmp.equals("NaN")) {
                showErrorMessage("Error en la lectura de la función " + fun + " \n ¿La incongita buscada es x?");
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
    
    public void pintartabla(int n, double xn, double fx,double f1x, double error ){
        NumberFormat numFormat = new DecimalFormat("0.##E0");
        DefaultTableModel buscinc = (DefaultTableModel)table.getModel();
        Object [] row = new Object[5];
        row[0] = n;
        row[1] = numFormat.format(xn);
        row[2] = numFormat.format(fx);
        row[3] = numFormat.format(f1x);
        row[4] = numFormat.format(error);
        buscinc.addRow(row);
    }
    
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JLabel deltaLbl;
    private javax.swing.JTextField derivatefunctiontxt;
    private javax.swing.JDialog dialog;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JLabel functionLbl1;
    private javax.swing.JTextField functionTxt;
    private javax.swing.JButton info;
    private javax.swing.JLabel initialValueLbl;
    private javax.swing.JTextField initialValueTxt;
    private javax.swing.JLabel iterLbl;
    private javax.swing.JTextField iterTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.TextArea observations;
    private javax.swing.JTable table;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField toleranciaTxt;
    // End of variables declaration//GEN-END:variables
}
