
package GUI;

/**
 *
 * @author smith Alexis Carvajal 
 */
public class Informacion extends javax.swing.JFrame {

  
    public Informacion() {
        initComponents();
      this.setResizable(false);
      this.informacionTxt.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacionTxt = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setBackground(new java.awt.Color(254, 254, 254));
        titleLbl.setFont(new java.awt.Font("Lato Black", 1, 35)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(1, 1, 1));
        titleLbl.setText("INFORMACION");

        informacionTxt.setColumns(20);
        informacionTxt.setRows(5);
        informacionTxt.setText("Practica clásica Análisis Numérico.\nGrupo 6\nDictada por: Francisco Jose Correa Zabala.\nintegrantes:\n    Tomás Alavarez Gomez\n    Smith Alexis Carvajal Orozco\n    Alejandro Taborda Diaz\n    José David Henao Ocampo\n\nLo que se busca con este software es implementar los metodos nuemricos vistos en la clase\nde Analisis Numerico, y de esta manera entender su funcionamiento y manejo. \n\nEn esta primera inerfaz lo que tenemos son tres botones de como se divide el sistema \n \n     Ecuaciones de una variable\n     Soluciones de sistemas de ecuaciones \n     Interpolacion \n\nEn el apartado de ecuaciones de una varible vamos a encontras varios metodos matematicos \njunto con un graficador y un evaluador de funcines, todos estos metodos los vimos en clase y \nnos sirven para posteriormente resolver problemas en entornos reales.\n\nAhora al momento de ingresar una funcion hay varias cosas a tener en cuenta \n\n     La variable debe ser (x) no recibe variables diferentes a esta \n     Esta implementada la funcione exponencial con la letra e \n     Esta implementada las funciones trigonometris seno, coseno y tangente.\n     El elevadp en las funcones se pone con el simbolo  (^)");
        informacionTxt.setToolTipText("");
        jScrollPane1.setViewportView(informacionTxt);

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
                .addGap(159, 159, 159)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea informacionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
