package GUI;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose David Henao Ocampo
 */
public class SplinesCubico extends javax.swing.JFrame {

    /**
     * Creates new form SplinesLineal
     */
    private DatosInterpolacion datosInterpolacion;
    private BigDecimal[]x;
    private BigDecimal[]y;
    private List<String> variables;
    private List<String> ecuaciones;
    private List<String> ecuacionesderivada1;
    private List<String> ecuacionesderivada2;
    private int valorespotenciassinderivar[]= {3,2,1,0};
    private int valorespotenciaderivada1[]= {2,1,0};
    private BigDecimal valormultiplicacionder1[]={BigDecimal.valueOf(3),BigDecimal.valueOf(2),BigDecimal.valueOf(1)};
    
    public SplinesCubico() {
        datosInterpolacion = DatosInterpolacion.getDatosInterpolacion();
        variables = new ArrayList<>();
        ecuaciones = new ArrayList<>();
        ecuacionesderivada1 = new ArrayList<>();
        ecuacionesderivada2 = new ArrayList<>();
        x = datosInterpolacion.getX();
        y = datosInterpolacion.getXn();
        initComponents();
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
    
    public void ecuacionessinderivar(BigDecimal cotinf, BigDecimal cotsup, BigDecimal valory1,BigDecimal valory2, String variable){
        String tmp1="";
        String tmp2="";
        int cont = 3;
        for(int i = 0; i < valorespotenciassinderivar.length; i++){
            if(cont == 0){
                tmp1+=" + "+ cotinf.pow(valorespotenciassinderivar[i])+variable+cont;
                tmp2+=" + "+ cotsup.pow(valorespotenciassinderivar[i])+variable+cont;
            }else{
                if(cotinf.pow(valorespotenciassinderivar[i]).signum()==1){
                    tmp1+=" + "+ cotinf.pow(valorespotenciassinderivar[i])+variable+cont;
                    tmp2+=" + "+ cotsup.pow(valorespotenciassinderivar[i])+variable+cont;
                }else{
                    tmp1+=" "+ cotinf.pow(valorespotenciassinderivar[i])+variable+cont;
                    tmp2+=" "+ cotsup.pow(valorespotenciassinderivar[i])+variable+cont;
                }
                
            }
            cont--;
        }
        tmp1+="="+valory1;
        tmp2+="="+valory2;
        ecuaciones.add(tmp1);
        ecuaciones.add(tmp2);
    }
    
    public void derivada1(BigDecimal interseccion, String var1,String var2){
        String tmp1 = "";
        String tmp2 = "";
        int cont = 3;
        for(int i = 0; i < valorespotenciaderivada1.length; i++){
            if(cont == 1){
                tmp1+= " + "+valormultiplicacionder1[i].multiply(interseccion.pow(valorespotenciaderivada1[i]))+var1+cont;
                tmp2+= " + "+valormultiplicacionder1[i].multiply(interseccion.pow(valorespotenciaderivada1[i]))+var2+cont;
            }else{
                if(interseccion.pow(valorespotenciaderivada1[i]).signum()==1){
                    tmp1+= " + "+valormultiplicacionder1[i].multiply(interseccion.pow(valorespotenciaderivada1[i]))+var1+cont;
                    tmp2+= " + "+valormultiplicacionder1[i].multiply(interseccion.pow(valorespotenciaderivada1[i]))+var2+cont;
                }else{
                    tmp1+=" "+valormultiplicacionder1[i].multiply(interseccion.pow(valorespotenciaderivada1[i]))+var1+cont;
                    tmp2+=" "+valormultiplicacionder1[i].multiply(interseccion.pow(valorespotenciaderivada1[i]))+var2+cont;
                }
                
            }
            cont--;
        }
        tmp1+=" = "+tmp2;
        ecuacionesderivada1.add(tmp1);
    }
    
    public void derivada2(BigDecimal interseccion,String var1,String var2){
        String tmp1 = "";
        String tmp2 = "";
        int cont = 3;
        for(int i = 0; i < 2; i++){
            if(cont == 2){
                tmp1+=" + "+cont+var1+cont;
                tmp2+=" + "+cont+var2+cont;
            }else{
                if(interseccion.multiply(BigDecimal.valueOf(6)).signum()==1){
                    tmp1+=" + "+interseccion.multiply(BigDecimal.valueOf(6))+var1+cont;
                    tmp2+=" + "+interseccion.multiply(BigDecimal.valueOf(6))+var2+cont;
                }else{
                    tmp1+=" "+interseccion.multiply(BigDecimal.valueOf(6))+var1+cont;
                    tmp2+=" "+interseccion.multiply(BigDecimal.valueOf(6))+var2+cont;
                } 
            }
            cont--;
        }
        tmp1+= " = " + tmp2;
        ecuacionesderivada2.add(tmp1);
    }
    
    private void ultimasecuaciones(String var1,String var2){
        String tmp1 = "";
        String tmp2 = "";
        tmp1 = x[0].multiply(BigDecimal.valueOf(6))+var1+3+"+"+2+var1+2+"="+0;
        tmp2 = x[x.length-1].multiply(BigDecimal.valueOf(6))+var2+3+"+"+2+var2+2+"="+0;
        ecuacionesderivada2.add(tmp1);
        ecuacionesderivada2.add(tmp2);
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
        calcular = new javax.swing.JButton();
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
        jLabel1.setText("SPLINES CUBICO");

        calcular.setBackground(new java.awt.Color(0, 149, 136));
        calcular.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        calcular.setForeground(new java.awt.Color(1, 1, 1));
        calcular.setText("Calcular");
        calcular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 149, 136));
        salir.setFont(new java.awt.Font("Lato Black", 1, 15)); // NOI18N
        salir.setForeground(new java.awt.Color(1, 1, 1));
        salir.setText("Salir");
        salir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingresardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(results, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        popularvariables();
        if(x==null){
            JOptionPane.showMessageDialog(dialog,"Porfavor primero ingrese los datos de la"
                    + " interpolación");
        }else{
            int totalecuaciones = x.length-1;
            for(int i = 0; i < totalecuaciones; i++){
                ecuacionessinderivar(x[i], x[i+1], y[i], y[i+1], variables.get(i));
                //System.out.println("Valor i: "+i);
                if(i%2!=0){
                    //System.out.println("Valor i: "+i);
                    derivada1(x[i], variables.get(i-1), variables.get(i));
                    derivada1(x[i+1], variables.get(i), variables.get(i+1));
                    derivada2(x[i],variables.get(i-1), variables.get(i));
                    derivada2(x[i+1],variables.get(i), variables.get(i+1));
                }
            }
        ultimasecuaciones(variables.get(0), variables.get(totalecuaciones-1));
        imprimir();
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void imprimir(){
       String tmp ="";
       String tmp2="";
       String tmp3="";
       tmp = ecuaciones.stream().map((ecuacione)->ecuacione+"\n").reduce(tmp,String::concat);
       tmp2 = ecuacionesderivada1.stream().map((ecuacione)->ecuacione+"\n").reduce(tmp2,String::concat);
       tmp3 = ecuacionesderivada2.stream().map((ecuacione)->ecuacione+"\n").reduce(tmp3,String::concat);
       results.setText(tmp+tmp2+tmp3);
    }
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(dialog, "Este metodo calculara las ecuaciones que pasan por los puntos ingresados \n"
            + "por medio de una iterpolación de datos, este metodo requiere que se le ingresen los x y los y para su debido funcionamiento");
    }//GEN-LAST:event_infoActionPerformed

    private void ingresardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresardatosActionPerformed
        // TODO add your handling code here:
        TotalDatosInterpolacion totalEcuaciones = new TotalDatosInterpolacion()
;        totalEcuaciones.setVisible(true);
    }//GEN-LAST:event_ingresardatosActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JDialog dialog;
    private javax.swing.JButton info;
    private javax.swing.JButton ingresardatos;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextArea results;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
