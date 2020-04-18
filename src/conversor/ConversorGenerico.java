package conversor;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConversorGenerico extends javax.swing.JFrame {

    private List<Conversor> conversores;
    private Conversor selectedConversor;
    
    public ConversorGenerico() {
        initComponents();
        setTitle("Mi Conversor");
        
        conversores = new ArrayList<Conversor>();
        conversores.add(new CentimetrosPulgadasConversor());
        conversores.add(new MetrosKMConversor());
        conversores.add(new MiligramosGramosConversor());
        conversores.add(new SegundosMinutosConversor());
        conversores.add(new KilojouleJulioConversor());
        
        for (Conversor conversor : conversores) {
            jComboBoxConversores.addItem(conversor.toString());    
        }
        
        selectedConversor = conversores.get(0);
        jLabel1.setText(selectedConversor.getLabelValor1());      
        jLabel2.setText(selectedConversor.getLabelValor2());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldValor1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();
        jTextFieldValor2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxConversores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldValor1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValor1FocusLost(evt);
            }
        });
        jTextFieldValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldValor1KeyPressed(evt);
            }
        });

        jLabel1.setText("Valor 1");

        jButtonConvertir.setText("Convertir");
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });
        jButtonConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConvertirKeyPressed(evt);
            }
        });

        jTextFieldValor2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValor2FocusLost(evt);
            }
        });
        jTextFieldValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldValor2KeyPressed(evt);
            }
        });

        jLabel2.setText("Valor 2");

        jComboBoxConversores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxConversoresItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxConversores, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(54, 54, 54))
                                    .addComponent(jTextFieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jButtonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxConversores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButtonConvertir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
    
        if (conviertoAOtraU) {  //True focus en valor1 // False focus en valor2
            convertirAOtraUnidad(conviertoAOtraU);
        }
        else {
            convertirAOtraUnidad(conviertoAOtraU);
        }
        

    }//GEN-LAST:event_jButtonConvertirActionPerformed

    private void convertirAOtraUnidad(boolean conviertoAOtraU) throws HeadlessException {
    
    if (jTextFieldValor1.getText().isEmpty() && jTextFieldValor2.getText().isEmpty()) {  
        JOptionPane.showMessageDialog(this, "Complete alguna conversión", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldValor1.setBackground(Color.orange);
            jTextFieldValor2.setBackground(Color.orange);
            return;
    }
    
    if (conviertoAOtraU) {

        Double valor1;
        try {
            valor1 = Double.valueOf(jTextFieldValor1.getText().replace(',', '.'));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, ""+selectedConversor.getLabelValor1()+" no válidos", "ERROR "+selectedConversor.getLabelValor1()+" A "+selectedConversor.getLabelValor2()+"",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldValor1.setBackground(Color.orange);
            jTextFieldValor2.setBackground(Color.white);
            return;
        }
 
        jTextFieldValor1.setBackground(Color.white);
        jTextFieldValor2.setBackground(Color.white);
        Double valor2 = selectedConversor.convertirValor1Valor2(valor1);
        String fvalor1 = String.format("%.2f", valor1);
        String fvalor2 = String.format("%.2f", valor2);
        jTextFieldValor2.setText(fvalor2);
        JOptionPane.showMessageDialog(this,"Conversion Exitosa!\n"+fvalor1+" "+selectedConversor.getLabelValor1()+" son "+fvalor2+" "+selectedConversor.getLabelValor2());
        }
        else {
                  
                Double valor2;
                try {
                    valor2 = Double.valueOf(jTextFieldValor2.getText().replace(',', '.'));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, ""+selectedConversor.getLabelValor2()+" no válidos", "ERROR "+selectedConversor.getLabelValor2()+" A "+selectedConversor.getLabelValor1()+"",
                            JOptionPane.ERROR_MESSAGE);
                    jTextFieldValor2.setBackground(Color.orange);
                    jTextFieldValor1.setBackground(Color.white);
                    return;
                }
                
                jTextFieldValor1.setBackground(Color.white);    
                jTextFieldValor2.setBackground(Color.white);
                Double valor1 = selectedConversor.convertirValor2Valor1(valor2);
                String fvalor2 = String.format("%.2f", valor2);
                String fvalor1 = String.format("%.2f", valor1);
                jTextFieldValor1.setText(fvalor1);
                JOptionPane.showMessageDialog(this,"Conversion Exitosa!\n"+fvalor2+" "+selectedConversor.getLabelValor2()+" son "+fvalor1+" "+selectedConversor.getLabelValor1());
             }
       
    }

    private void jTextFieldValor1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValor1FocusLost
        conviertoAOtraU = true;
    }//GEN-LAST:event_jTextFieldValor1FocusLost

    private void jTextFieldValor2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValor2FocusLost
        conviertoAOtraU = false;
    }//GEN-LAST:event_jTextFieldValor2FocusLost

    private void jTextFieldValor1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValor1KeyPressed
        if (evt.getKeyChar()==KeyEvent.VK_ENTER) {
            conviertoAOtraU = true;
            convertirAOtraUnidad(conviertoAOtraU);
        }
    }//GEN-LAST:event_jTextFieldValor1KeyPressed

    private void jComboBoxConversoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxConversoresItemStateChanged
        int selectedIndex = jComboBoxConversores.getSelectedIndex();
        jLabel1.setText(conversores.get(selectedIndex).getLabelValor1());
        jLabel2.setText(conversores.get(selectedIndex).getLabelValor2());
        selectedConversor = conversores.get(selectedIndex);
    }//GEN-LAST:event_jComboBoxConversoresItemStateChanged

    private void jTextFieldValor2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValor2KeyPressed
        if (evt.getKeyChar()==KeyEvent.VK_ENTER) {
            conviertoAOtraU = false;
            convertirAOtraUnidad(conviertoAOtraU);
        }
    }//GEN-LAST:event_jTextFieldValor2KeyPressed

    private void jButtonConvertirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConvertirKeyPressed

    }//GEN-LAST:event_jButtonConvertirKeyPressed

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
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorGenerico().setVisible(true);
            }
        });
    }

    private boolean conviertoAOtraU;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JComboBox<String> jComboBoxConversores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldValor1;
    private javax.swing.JTextField jTextFieldValor2;
    // End of variables declaration//GEN-END:variables
}
