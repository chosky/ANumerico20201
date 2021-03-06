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
public class BusquedasIncrementales extends javax.swing.JFrame {

    /**
     * Creates new form BusquedasIncrementales
     */
    
    MathFunctionsParser function = new MathFunctionsParser();
    ContenedorEcuacion contenedor = ContenedorEcuacion.getContenedor();
    
    public BusquedasIncrementales() {
        
        this.setTitle("Búsquedas Incrementales");
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
        DefaultTableModel model = new DefaultTableModel();
        Object[] columns = {"N","X","f(x)"};
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        if(contenedor.getEcuacion()!=null){
            functionTxt.setText(contenedor.getEcuacion());
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
        deltaTxt = new javax.swing.JTextField();
        iterTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
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

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setText("BÚSQUEDAS INCREMENTALES");

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
        deltaLbl.setText("Delta:");

        iterLbl.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iterLbl.setForeground(new java.awt.Color(1, 1, 1));
        iterLbl.setText("Cant. iteraciones (n):");

        deltaTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        deltaTxt.setForeground(new java.awt.Color(1, 1, 1));

        iterTxt.setBackground(new java.awt.Color(255, 255, 255));
        iterTxt.setFont(new java.awt.Font("Lato Black", 0, 15)); // NOI18N
        iterTxt.setForeground(new java.awt.Color(1, 1, 1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(initialValueLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(initialValueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deltaLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deltaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(iterLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(iterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addComponent(functionLbl)
                                    .addGap(2, 2, 2)
                                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(cleanBtn)
                                .addGap(18, 18, 18)
                                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 115, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(observations, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(deltaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iterLbl)
                    .addComponent(initialValueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialValueLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanBtn)
                    .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(observations, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    
    
    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        observations.setForeground(Color.black);
        observations.setText("OBSERVACIONES:");
        Object[] columns = {"N","X","f(x)"};
        table.setModel(new DefaultTableModel(null,columns));
        String func = functionTxt.getText();
        if(evaluarfuncion(func)){
            double valorinicial = Double.valueOf(initialValueTxt.getText());
            double incremento = Double.valueOf(deltaTxt.getText());
            int totaliteraciones = Integer.valueOf(iterTxt.getText());
            busquedasIncrementales(valorinicial,incremento,totaliteraciones);
        } else {
            showErrorMessage("Favor corregir los datos ingresados");
        }
        if(func.equalsIgnoreCase(contenedor.getEcuacion())==false){
            contenedor.setEcuacion(func);
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void initialValueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialValueTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialValueTxtActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        // TODO add your handling code here:
        Object[] columns = {"N","X","f(x)"};
        table.setModel(new DefaultTableModel(null,columns));
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(dialog, "Busquedas incrementales necesita: \n 1.Un punto de inicio \n 2.Un valor en el cual dicho punto se va a incrementar\n 3.Un total de iteraciones \n 4.Una funcion en la cual evaluar los valores\n tener en cuenta que si la funcion tiene un exponente con mas de 1 variable favor encerrarlo entre parentesis");
    }//GEN-LAST:event_infoActionPerformed
    
    public void busquedasIncrementales(double valorinicial,double incremento,int totaliteraciones){
        function.function.addVariable("x", valorinicial);
        double fx0 = function.function.getValue();
        if(totaliteraciones <= 0){
            observations.setText("La cantidad de iteraciones debe ser mayor a 0");
        } else if(fx0 == 0){
            observations.setText(valorinicial + "es una raiz");
        } else {
            double x1 = valorinicial + incremento;
            int contador = 1;
            function.function.addVariable("x", x1);
            double fx1=function.function.getValue();
            pintartabla(contador, x1, fx1);
            while((fx0*fx1 > 0) && (contador < totaliteraciones)){
                valorinicial = x1;
                fx0 = fx1;
                x1 = valorinicial + incremento;
                function.function.addVariable("x", x1);
                fx1 = function.function.getValue();
                contador++;
                pintartabla(contador, x1, fx1);
            }
            if(fx1 == 0){
                observations.setText(x1 + " es raiz");
            } else if(fx0*fx1<0){
                observations.setText("Hay una raiz en el intervalo: [" + valorinicial + "," + x1+"]");
            } else {
                observations.setText("No se encuentran intervalos ni raices en " + totaliteraciones + " iteraciones");
            }
        }        
    }
    
    public boolean evaluarfuncion(String func){
         try{
             function.parserFunction(func);
             function.function.addVariable("x", 1);
             String tmp = Double.toString(function.function.getValue());
             if (this.functionTxt.getText().equals("") || this.functionTxt.getText().equals(" ")) {
                showErrorMessage("El campo de la función está vacio");
                return false;
            } else if(tmp.equals("NaN")) {
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
    
    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public void pintartabla(int n, double xn, double fx ){
        NumberFormat numFormat = new DecimalFormat("0.##E0");
        DefaultTableModel buscinc = (DefaultTableModel)table.getModel();
        Object [] row = new Object[3];
        row[0] = n;
        row[1] = numFormat.format(xn);
        row[2] = numFormat.format(fx);
        buscinc.addRow(row);
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JLabel deltaLbl;
    private javax.swing.JTextField deltaTxt;
    private javax.swing.JDialog dialog;
    private javax.swing.JLabel functionLbl;
    private javax.swing.JTextField functionTxt;
    private javax.swing.JButton info;
    private javax.swing.JLabel initialValueLbl;
    private javax.swing.JTextField initialValueTxt;
    private javax.swing.JLabel iterLbl;
    private javax.swing.JTextField iterTxt;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.TextArea observations;
    private javax.swing.JTable table;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
