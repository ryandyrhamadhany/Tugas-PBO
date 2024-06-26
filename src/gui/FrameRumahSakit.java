/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import CRUD.Database;
import javax.swing.JOptionPane;

/**
 *
 * @author ryand
 */
public class FrameRumahSakit extends javax.swing.JFrame {

    /**
     * Creates new form FrameRumahSakit
     */
    public FrameRumahSakit() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        SimpanRS.setFocusable(false);
        UbahRS.setFocusable(false);
        HapusRS.setFocusable(false);
        jButton4.setFocusable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SimpanRS = new javax.swing.JButton();
        UbahRS = new javax.swing.JButton();
        HapusRS = new javax.swing.JButton();
        RSidText = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        AlamatRSText = new javax.swing.JTextField();
        namaRSText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SimpanRS.setText("Simpan");
        SimpanRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanRSActionPerformed(evt);
            }
        });

        UbahRS.setText("Ubah");
        UbahRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahRSActionPerformed(evt);
            }
        });

        HapusRS.setText("Hapus");
        HapusRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusRSActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Rumah Sakit");

        jLabel2.setText("Nama Rumah Sakit");

        jLabel3.setText("Alamat Rumah Sakit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AlamatRSText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(namaRSText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RSidText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SimpanRS)
                        .addGap(18, 18, 18)
                        .addComponent(UbahRS)
                        .addGap(18, 18, 18)
                        .addComponent(HapusRS)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RSidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(namaRSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(AlamatRSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SimpanRS)
                    .addComponent(UbahRS)
                    .addComponent(HapusRS))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanRSActionPerformed
        // TODO add your handling code here:
        Database koneksiData = new Database();

        koneksiData.tambahRS(Integer.valueOf(RSidText.getText()),
            namaRSText.getText(),
            AlamatRSText.getText());
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
    }//GEN-LAST:event_SimpanRSActionPerformed

    private void UbahRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahRSActionPerformed
        // TODO add your handling code here:
        Database koneksiData = new Database();

        koneksiData.ubahRS(Integer.valueOf(RSidText.getText()),
            namaRSText.getText(),
            AlamatRSText.getText());
        JOptionPane.showMessageDialog(null, "Data berhasil di ubah");
    }//GEN-LAST:event_UbahRSActionPerformed

    private void HapusRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusRSActionPerformed
        // TODO add your handling code here:
        Database koneksiData = new Database();

        koneksiData.hapusRS(Integer.valueOf(RSidText.getText()));
        JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
    }//GEN-LAST:event_HapusRSActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRumahSakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatRSText;
    private javax.swing.JButton HapusRS;
    private javax.swing.JTextField RSidText;
    private javax.swing.JButton SimpanRS;
    private javax.swing.JButton UbahRS;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField namaRSText;
    // End of variables declaration//GEN-END:variables
}