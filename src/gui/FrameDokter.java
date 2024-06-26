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
public class FrameDokter extends javax.swing.JFrame {

    /**
     * Creates new form FrameDokter
     */
    public FrameDokter() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setFocusable(false);
        SimpanDokter.setFocusable(false);
        UbahDokter.setFocusable(false);
        HapusDokter.setFocusable(false);
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

        jLabel5 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        namaDokterText = new javax.swing.JTextField();
        SimpanDokter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idRSMultiText = new javax.swing.JTextField();
        UbahDokter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        HapusDokter = new javax.swing.JButton();
        dokterIDText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        PassText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("ID Rumah Sakit Multi");

        jLabel1.setText("ID Dokter");

        SimpanDokter.setText("Simpan");
        SimpanDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanDokterActionPerformed(evt);
            }
        });

        jLabel2.setText("Username Dokter");

        UbahDokter.setText("Ubah");
        UbahDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahDokterActionPerformed(evt);
            }
        });

        jLabel3.setText("Password Dokter");

        HapusDokter.setText("Hapus");
        HapusDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusDokterActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Dokter");

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idRSMultiText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(namaDokterText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dokterIDText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SimpanDokter)
                        .addGap(18, 18, 18)
                        .addComponent(UbahDokter)
                        .addGap(18, 18, 18)
                        .addComponent(HapusDokter)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dokterIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(namaDokterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(idRSMultiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SimpanDokter)
                    .addComponent(UbahDokter)
                    .addComponent(HapusDokter))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanDokterActionPerformed
        // TODO add your handling code here:
        Database koneksiData = new Database();

        koneksiData.tambahDokter(Integer.valueOf(dokterIDText.getText()),
            usernameText.getText(),
            PassText.getText(),
            namaDokterText.getText(),
            Integer.valueOf(idRSMultiText.getText()));
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
    }//GEN-LAST:event_SimpanDokterActionPerformed

    private void UbahDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahDokterActionPerformed
        // TODO add your handling code here:
        Database koneksiData = new Database();

        koneksiData.ubahDokter(Integer.valueOf(dokterIDText.getText()),
            usernameText.getText(),
            PassText.getText(),
            namaDokterText.getText(),
            Integer.valueOf(idRSMultiText.getText()));
        JOptionPane.showMessageDialog(null, "Data berhasil di ubah");
    }//GEN-LAST:event_UbahDokterActionPerformed

    private void HapusDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusDokterActionPerformed
        // TODO add your handling code here:
        Database koneksiData = new Database();

        koneksiData.hapusDokter(Integer.valueOf(dokterIDText.getText()));
        JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
    }//GEN-LAST:event_HapusDokterActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HapusDokter;
    private javax.swing.JTextField PassText;
    private javax.swing.JButton SimpanDokter;
    private javax.swing.JButton UbahDokter;
    private javax.swing.JTextField dokterIDText;
    private javax.swing.JTextField idRSMultiText;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField namaDokterText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}