package GUI;

import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class SplinesCuadratico extends javax.swing.JFrame {

    /**
     * Creates new form SplinesLineal
     */
    private DatosInterpolacion datosInterpolacion;
    private int valorespotenciasinderivar[]= {2,1,0};
    private List<String> variables;
    private List<String> ecuaciones;
    private List<String> ecuacionesderivada;
    
    public SplinesCuadratico() {
        this.setTitle("Splines cuadratico");
        this.setResizable(true);
        this.getContentPane().setBackground(Color.WHITE);
        datosInterpolacion = DatosInterpolacion.getDatosInterpolacion();
        variables = new ArrayList<>();
        ecuaciones = new ArrayList<>();
        ecuacionesderivada = new ArrayList<>();
        initComponents();
        
    }
    
    private void calcularecuaciones(BigDecimal cotinf, BigDecimal cotsup, BigDecimal valory1,BigDecimal valory2, String variable){
        String tmp1 = "";
        String tmp2 = "";
        int cont = 2;
        for (int i = 0; i < valorespotenciasinderivar.length; i++){
            if(cont == 0){
                tmp1+=" + "+cotinf.pow(valorespotenciasinderivar[i])+variable+cont;
                tmp2+=" + "+cotsup.pow(valorespotenciasinderivar[i])+variable+cont;
            }else{
                if(cotinf.pow(valorespotenciasinderivar[i]).signum()==1){
                    tmp1+=" + "+cotinf.pow(valorespotenciasinderivar[i])+variable+cont;
                    tmp2+=" + "+cotsup.pow(valorespotenciasinderivar[i])+variable+cont;
                }else{
                    tmp1+=" "+cotinf.pow(valorespotenciasinderivar[i])+variable+cont;
                    tmp2+=" "+cotsup.pow(valorespotenciasinderivar[i])+variable+cont;
                }
            }
            cont--;
        }
        tmp1+="="+valory1;
        tmp2+="="+valory2;
        ecuaciones.add(tmp1);
        ecuaciones.add(tmp2);
        System.out.println(tmp1);
        System.out.println(tmp2);
    }
    
    private void calcularecuacionesderivada(BigDecimal interseccion, String variable1, String variable2){
        String tmp1 = "";
        String tmp2 = "";
        int cont = 2;
        for(int i = 0; i < 2; i++){
            if(cont == 1){
                tmp1+=variable1+cont;
                tmp2+=variable2+cont;
            }else{
                if(interseccion.multiply(BigDecimal.valueOf(2)).signum()==1){
                    tmp1+=" + "+interseccion.multiply(BigDecimal.valueOf(2))+variable1+cont;
                    tmp2+=" + "+interseccion.multiply(BigDecimal.valueOf(2))+variable2+cont;
                }else{
                    tmp1+=" "+interseccion.multiply(BigDecimal.valueOf(2))+variable1+cont;
                    tmp2+=" "+interseccion.multiply(BigDecimal.valueOf(2))+variable2+cont;
                }
            }
            cont--;
        }
        tmp1+="="+tmp2;
        ecuacionesderivada.add(tmp1);
        ecuacionesderivada.add("a2=0");
        System.out.println(tmp1);
        System.out.println("a2=0");
    }
    
    public void popularvariables(){
        variables.add("a");
        variables.add("b");
        variables.add("c");
        variables.add("d");
        variables.add("e");
        variables.add("f");
        variables.add("g");
        variables.add("h");
        variables.add("i");
        variables.add("j");
        variables.add("k");
    }
    
    public void imprimir(){
       String tmp ="";
       String tmp2="";
       tmp = ecuaciones.stream().map((ecuacione) -> ecuacione+"\n").reduce(tmp, String::concat);
       tmp2 = ecuacionesderivada.stream().map((ecuacione)->ecuacione+"\n").reduce(tmp2,String::concat);
       results.setText(tmp+tmp2);
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
        jLabel1 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        results = new java.awt.TextArea();
        info = new javax.swing.JButton();
        ingresardatos = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("SPLINES CUADRATICO");

        calculate.setBackground(new java.awt.Color(0, 149, 136));
        calculate.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        calculate.setForeground(new java.awt.Color(1, 1, 1));
        calculate.setText("Calcular");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 149, 136));
        salir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        salir.setForeground(new java.awt.Color(1, 1, 1));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

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

        ingresardatos.setBackground(new java.awt.Color(0, 149, 136));
        ingresardatos.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        ingresardatos.setForeground(new java.awt.Color(1, 1, 1));
        ingresardatos.setText("Ingresar Datos");
        ingresardatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ingresardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresardatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(calculate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ingresardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(results, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calculate)
                        .addComponent(ingresardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        popularvariables();
        BigDecimal x[] = datosInterpolacion.getX();
        BigDecimal y[] = datosInterpolacion.getXn();
        if(x==null){
            JOptionPane.showMessageDialog(dialog,"Porfavor primero ingrese los datos de la"
                    + " interpolación");
        }else{
            int totalecuaciones = x.length-1;
            for( int i = 0; i < totalecuaciones; i++){
                calcularecuaciones(x[i], x[i+1], y[i], y[i+1], variables.get(i));
                if(i%2!=0){
                    calcularecuacionesderivada(x[i], variables.get(i-1), variables.get(i));
                }
            }
            imprimir();            
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(dialog, "Este metodo calculara las ecuaciones que pasan por los puntos ingresados \n"
            + "por medio de una iterpolación de datos, este metodo requiere que se le ingresen los x y los y para su debido funcionamiento");
    }//GEN-LAST:event_infoActionPerformed

    private void ingresardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresardatosActionPerformed
        // TODO add your handling code here:
        TotalDatosInterpolacion totalEcuaciones = new TotalDatosInterpolacion();
        totalEcuaciones.setVisible(true);
    }//GEN-LAST:event_ingresardatosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JDialog dialog;
    private javax.swing.JButton info;
    private javax.swing.JButton ingresardatos;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextArea results;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
