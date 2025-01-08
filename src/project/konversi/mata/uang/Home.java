/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.konversi.mata.uang;
import java.text.DecimalFormat;

/**
 *
 * @author acera
 */
public class Home extends javax.swing.JFrame {
    Tm e = new Tm();
    TabelKurs t = new TabelKurs();
    /**
     * Creates new form Home
     */
    DecimalFormat cf = new DecimalFormat("0.####");
    public Home() {
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

        jPanel2 = new javax.swing.JPanel();
        jcAs = new javax.swing.JComboBox<>();
        jcHa = new javax.swing.JComboBox<>();
        tfInput = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnCekkurs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JtA = new javax.swing.JTextField();
        JtB = new javax.swing.JTextField();
        TaTtl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");

        jcAs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Rupiah Indonesia", "Dollar Amerika", "Dollar Hong Kong", "Dollar Singapura", "Euro", "Pound Britania", "Ringgit Malaysia", "Won Korea Selatan", "Yen Jepang", "Yuan Tiongkok" }));
        jcAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAsActionPerformed(evt);
            }
        });

        jcHa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Rupiah Indonesia", "Dollar Amerika", "Dollar Hong Kong", "Dollar Singapura", "Euro", "Pound Britania", "Ringgit Malaysia", "Won Korea Selatan", "Yen Jepang", "Yuan Tiongkok" }));
        jcHa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcHaActionPerformed(evt);
            }
        });

        tfInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfInputActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnCekkurs.setText("Cek Kurs");
        btnCekkurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekkursActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right-arrow-32.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-exchange-30 (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        JtA.setText("0");
        JtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtAActionPerformed(evt);
            }
        });

        JtB.setText("0");
        JtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtBActionPerformed(evt);
            }
        });

        TaTtl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TaTtl.setForeground(new java.awt.Color(255, 255, 255));
        TaTtl.setText("Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCekkurs))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addComponent(TaTtl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JtB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcHa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcAs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JtA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcHa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jcAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCekkurs)
                    .addComponent(TaTtl))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAsActionPerformed
        // TODO add your handling code here:
        if(jcAs.getSelectedItem().equals("Rupiah Indonesia")){JtA.setText(e.nem[0]);}
        if(jcAs.getSelectedItem().equals("Dollar Amerika")){JtA.setText(e.nem[1]);}
        if(jcAs.getSelectedItem().equals("Dollar Hong Kong")){JtA.setText(e.nem[2]);}
        if(jcAs.getSelectedItem().equals("Dollar Singapura")){JtA.setText(e.nem[3]);}
        if(jcAs.getSelectedItem().equals("Euro")){JtA.setText(e.nem[4]);}
        if(jcAs.getSelectedItem().equals("Pound Britania")){JtA.setText(e.nem[5]);}
        if(jcAs.getSelectedItem().equals("Ringgit Malaysia")){JtA.setText(e.nem[6]);}
        if(jcAs.getSelectedItem().equals("Won Korea Selatan")){JtA.setText(e.nem[7]);}
        if(jcAs.getSelectedItem().equals("Yen Jepang")){JtA.setText(e.nem[8]);}
        if(jcAs.getSelectedItem().equals("Yuan Tiongkok")){JtA.setText(e.nem[9]);}
         
    }//GEN-LAST:event_jcAsActionPerformed

    private void btnCekkursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekkursActionPerformed
        // TODO add your handling code here:
        TabelKurs a = new TabelKurs();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCekkursActionPerformed

    private void JtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtAActionPerformed

    private void JtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtBActionPerformed

    private void tfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfInputActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        Double msk = Double.parseDouble(tfInput.getText());
        Double a=0.0; 
        Double b=0.0;
        Double ans=0.0;
        if(jcAs.getSelectedItem().equals("Rupiah Indonesia")){a=e.dat[0];}
        else if(jcAs.getSelectedItem().equals("Dollar Amerika")){a=e.dat[1];}
        else if(jcAs.getSelectedItem().equals("Dollar Hong Kong")){a=e.dat[2];}
        else if(jcAs.getSelectedItem().equals("Dollar Singapura")){a=e.dat[3];}
        else if(jcAs.getSelectedItem().equals("Euro")){a=e.dat[4];}
        else if(jcAs.getSelectedItem().equals("Pound Britania")){a=e.dat[5];}
        else if(jcAs.getSelectedItem().equals("Ringgit Malaysia")){a=e.dat[6];}
        else if(jcAs.getSelectedItem().equals("Won Korea Selatan")){a=e.dat[7];}
        else if(jcAs.getSelectedItem().equals("Yen Jepang")){a=e.dat[8];}
        else if(jcAs.getSelectedItem().equals("Yuan Tiongkok")){a=e.dat[9];}
        if(jcHa.getSelectedItem().equals("Rupiah Indonesia")){b=e.dat[0];}
        else if(jcHa.getSelectedItem().equals("Dollar Amerika")){b=e.dat[1];}
        else if(jcHa.getSelectedItem().equals("Dollar Hong Kong")){b=e.dat[2];}
        else if(jcHa.getSelectedItem().equals("Dollar Singapura")){b=e.dat[3];}
        else if(jcHa.getSelectedItem().equals("Euro")){b=e.dat[4];}
        else if(jcHa.getSelectedItem().equals("Pound Britania")){b=e.dat[5];}
        else if(jcHa.getSelectedItem().equals("Ringgit Malaysia")){b=e.dat[6];}
        else if(jcHa.getSelectedItem().equals("Won Korea Selatan")){b=e.dat[7];}
        else if(jcHa.getSelectedItem().equals("Yen Jepang")){b=e.dat[8];}
        else if(jcHa.getSelectedItem().equals("Yuan Tiongkok")){b=e.dat[9];}
        ans = msk/a*b;
        TaTtl.setText(String.valueOf(cf.format(ans)));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void jcHaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcHaActionPerformed
        // TODO add your handling code here:
        if(jcHa.getSelectedItem().equals("Rupiah Indonesia")){JtB.setText(e.nem[0]);}
        if(jcHa.getSelectedItem().equals("Dollar Amerika")){JtB.setText(e.nem[1]);}
        if(jcHa.getSelectedItem().equals("Dollar Hong Kong")){JtB.setText(e.nem[2]);}
        if(jcHa.getSelectedItem().equals("Dollar Singapura")){JtB.setText(e.nem[3]);}
        if(jcHa.getSelectedItem().equals("Euro")){JtB.setText(e.nem[4]);}
        if(jcHa.getSelectedItem().equals("Pound Britania")){JtB.setText(e.nem[5]);}
        if(jcHa.getSelectedItem().equals("Ringgit Malaysia")){JtB.setText(e.nem[6]);}
        if(jcHa.getSelectedItem().equals("Won Korea Selatan")){JtB.setText(e.nem[7]);}
        if(jcHa.getSelectedItem().equals("Yen Jepang")){JtB.setText(e.nem[8]);}
        if(jcHa.getSelectedItem().equals("Yuan Tiongkok")){JtB.setText(e.nem[9]);}
    }//GEN-LAST:event_jcHaActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtA;
    private javax.swing.JTextField JtB;
    private javax.swing.JLabel TaTtl;
    private javax.swing.JButton btnCekkurs;
    private javax.swing.JButton btnHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcAs;
    private javax.swing.JComboBox<String> jcHa;
    private javax.swing.JTextField tfInput;
    // End of variables declaration//GEN-END:variables
}
