/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conversaovalores;

/**
 *
 * @author Aluno
 */
public class formCal extends javax.swing.JFrame {

    /**
     * Creates new form formCal
     */
    public formCal() {
        initComponents();
    }
    Double resultado,valor1,valor2;
    String conversaoInicial,conversaoFinal;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboRecebe = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        comboPara = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Conversor");

        jLabel1.setText("Quero Converter:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel3.setText("Unidade de Medida");

        comboRecebe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Quilometros (Km)", "Metros (m)", "Decimetros (Dm)", "Centimetros (Cm)", "Milimetros (Mm)" }));
        comboRecebe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboRecebeItemStateChanged(evt);
            }
        });
        comboRecebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRecebeActionPerformed(evt);
            }
        });

        jLabel8.setText("Para:");

        comboPara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Quilometros (Km)", "Metros (m)", "Decimetros (Dm)", "Centimetros (Cm)", "Milimetros (Mm)" }));
        comboPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParaActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado:");

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboRecebe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtResultado)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboPara, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
            .addComponent(jSeparator4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboRecebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        txtValor.setText(txtValor.getText());
    }//GEN-LAST:event_txtValorActionPerformed

    private void comboRecebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRecebeActionPerformed
    
    }//GEN-LAST:event_comboRecebeActionPerformed

    private void comboParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParaActionPerformed
        
    }//GEN-LAST:event_comboParaActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void comboRecebeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboRecebeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRecebeItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //txtResultado.setText(String.valueOf(100000 / 1000)+" Metros");
        String conversaoInicial = (String)comboRecebe.getSelectedItem();
        String conversaoFinal   = (String)comboPara.getSelectedItem();
        
        ///Quilometros >>> Quilometros
        if(conversaoInicial == "Quilometros (Km)" && conversaoFinal == "Quilometros (Km)"){

        valor1 = Double.parseDouble(txtValor.getText());
                         
        txtResultado.setText(String.valueOf(valor1)+" Km");         
        }
        
        ///Quilometros >>> Metros
        else if(conversaoInicial == "Quilometros (Km)" && conversaoFinal == "Metros (m)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
                         
            txtResultado.setText(String.valueOf(valor1 * 1000)+" M");         
        }
        
        ///Quilometros >>> Decimetros
        else if(conversaoInicial == "Quilometros (Km)" && conversaoFinal == "Decimetros (Dm)"){
          
            valor1 = Double.parseDouble(txtValor.getText());
             
            txtResultado.setText(String.valueOf(valor1 * 10000)+" Dm");           
        }
        
        ///Quilometros >>> Centimetros
        else if(conversaoInicial == "Quilometros (Km)" && conversaoFinal == "Centimetros (Cm)"){
          
            valor1 = Double.parseDouble(txtValor.getText());
             
            txtResultado.setText(String.valueOf(valor1 * 100000)+" Cm");
        }
        
        //Quilometros >>> Milimetros
        else if(conversaoInicial == "Quilometros (Km)" && conversaoFinal == "Milimetros (Mm)"){
            valor1 = Double.parseDouble(txtValor.getText());
             
            txtResultado.setText(String.valueOf(valor1 * 1000000)+" Cm");
            
        }
        
        //Metros >>> Metros
        else if(conversaoInicial == "Metros (m)" && conversaoFinal == "Metros (m)"){
           
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1)+ " m");
        }
        
        //Metros >>> Quilometros
        else if(conversaoInicial == "Metros (m)" && conversaoFinal == "Quilometros (Km)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
             
            txtResultado.setText(String.valueOf(valor1 / 1000)+" Km");   
            
        }
        
        //Metros >>> Decimetros
        else if(conversaoInicial == "Metros (m)" && conversaoFinal == "Decimetros (Dm)"){
            valor1 = Double.parseDouble(txtValor.getText());
             
            txtResultado.setText(String.valueOf(valor1 * 10)+" Dm"); 
            
        }
        
        //Metros >>> Centimetros
        else if(conversaoInicial == "Metros (m)" && conversaoFinal == "Centimetros (Cm)"){
        
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 * 100)+" Cm"); 
            
        }
        
        //Metros >>> Milimetros
        else if(conversaoInicial == "Metros (m)" && conversaoFinal == "Milimetros (Mm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 * 1000)+" Mm");  
        }
        
        //Decimetros >>> Decimetros
        else if(conversaoInicial == "Decimetros (Dm)" && conversaoFinal == "Decimetros (Dm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1) + " Dm");
        }
        
        //Decimetros >>> Quilometros
        else if(conversaoInicial == "Decimetros (Dm)" && conversaoFinal == "Quilometros (Km)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 10000) + " Km");
        }
        
        //Decimetros >>> Metros
        else if(conversaoInicial == "Decimetros (Dm)" && conversaoFinal == "Metros (m)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 10) + " m");
        }
        
        //Decimetros >>> Centimetros
        else if(conversaoInicial == "Decimetros (Dm)" && conversaoFinal == "Centimetros (Cm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 * 10) + " Cm");
        }
        
        //Decimetros >>> Milimetros
        else if(conversaoInicial == "Decimetros (Dm)" && conversaoFinal == "Milimetros (Mm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 * 100) + " Mm");
        }
        
        //Centimetros >>> Centimetros
        else if(conversaoInicial == "Centimetros (Cm)" && conversaoFinal == "Centimetros (Cm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1) + " Cm");
        }
        
        
        //Centimetros >>> Quilometros
        else if(conversaoInicial == "Centimetros (Cm)" && conversaoFinal == "Quilometros (Km)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 100000) + " Km");
        }
        
        ///Centimetros >>> Metros 
        else if(conversaoInicial == "Centimetros (Cm)" && conversaoFinal == "Metros (m)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 100) + " m");
        }
        
        //Centimetros >>> Decimetros
        else if(conversaoInicial == "Centimetros (Cm)" && conversaoFinal == "Decimetros (Dm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 10) + " Dm");
        }
        
        //Centimetros >>> Milimetros
        else if(conversaoInicial == "Centimetros (Cm)" && conversaoFinal == "Milimetros (Mm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 * 10) + " Mm");
        }
        
        //Milimetros >>> Milimetros
        else if(conversaoInicial == "Milimetros (Mm)" && conversaoFinal == "Milimetros (Mm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1) + " Mm");            
        }
        
        //Milimetros >>> Quilometros
        else if(conversaoInicial == "Milimetros (Mm)" && conversaoFinal == "Quilometros (Km)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 1000000) + " Km");            
        }
        
        //Milimetros >>> Metros
        else if(conversaoInicial == "Milimetros (Mm)" && conversaoFinal == "Metros (m)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 1000) + " m");            
        }
        
        //Milimetros >>> Decimetros
        else if(conversaoInicial == "Milimetros (Mm)" && conversaoFinal == "Decimetros (Dm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 100) + " Dm");            
        }
        
        //Milimetros >>> Centimetros
        else if(conversaoInicial == "Milimetros (Mm)" && conversaoFinal == "Centimetros (Cm)"){
            
            valor1 = Double.parseDouble(txtValor.getText());
            
            txtResultado.setText(String.valueOf(valor1 / 10) + " Cm");            
        }
        else{
            txtResultado.setText(String.valueOf("Erro"));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        valor1 = Double.parseDouble("0");
        txtValor.setText("0");
        txtResultado.setText("0");  
        comboRecebe.setSelectedItem("Selecionar");
        comboPara.setSelectedItem("Selecionar");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPara;
    private javax.swing.JComboBox<String> comboRecebe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
