/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abel Bima Wiratama
 */
public class Lat3 extends javax.swing.JFrame {

    /**
     * Creates new form Lat3
     */
    public Lat3() {
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

        jLabel1 = new javax.swing.JLabel();
        Bil2 = new javax.swing.JTextField();
        Bil1 = new javax.swing.JTextField();
        Bagi = new javax.swing.JButton();
        Kali = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Hasil");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 190, 40, 14);
        getContentPane().add(Bil2);
        Bil2.setBounds(140, 80, 100, 30);

        Bil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bil1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bil1);
        Bil1.setBounds(140, 50, 100, 30);

        Bagi.setText(":");
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });
        getContentPane().add(Bagi);
        Bagi.setBounds(260, 140, 50, 40);

        Kali.setText("X");
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kali);
        Kali.setBounds(80, 140, 50, 40);

        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });
        getContentPane().add(Kurang);
        Kurang.setBounds(140, 140, 50, 40);

        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tambah);
        Tambah.setBounds(200, 140, 50, 40);

        jLabel2.setText("Operator");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 120, 70, 14);

        jLabel3.setText("Bilangan 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 90, 60, 14);

        jLabel4.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 30, 110, 14);

        jLabel5.setText("Bilangan 1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 60, 60, 14);

        Hasil.setEditable(false);
        getContentPane().add(Hasil);
        Hasil.setBounds(160, 210, 60, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bil1ActionPerformed

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bil1.getText()); 
        int bil2 = Integer.parseInt(Bil2.getText());
        int HasilKali = bil1 * bil2;
        
        Hasil.setText(String.valueOf(HasilKali));
        
        
    }//GEN-LAST:event_KaliActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bil1.getText()); 
        int bil2 = Integer.parseInt(Bil2.getText());
        int HasilKurang = bil1 - bil2;
        
        Hasil.setText(String.valueOf(HasilKurang));
    }//GEN-LAST:event_KurangActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bil1.getText()); 
        int bil2 = Integer.parseInt(Bil2.getText());
        int HasilTambah = bil1 + bil2;
        
        Hasil.setText(String.valueOf(HasilTambah));
    }//GEN-LAST:event_TambahActionPerformed

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
        // TODO add your handling code here:
        double bil1 = Double.parseDouble(Bil1.getText()); 
        double bil2 = Double.parseDouble(Bil2.getText());
        double HasilBagi = bil1 / bil2;
        
        Hasil.setText(String.valueOf(HasilBagi));
    }//GEN-LAST:event_BagiActionPerformed

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
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lat3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagi;
    private javax.swing.JTextField Bil1;
    private javax.swing.JTextField Bil2;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
