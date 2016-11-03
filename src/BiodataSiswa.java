/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abel Bima Wiratama
 */
public class BiodataSiswa extends javax.swing.JFrame {

    /**
     * Creates new form BiodataSiswa
     */
    public BiodataSiswa() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Absen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(null);
        jPanel1.add(Absen);
        Absen.setBounds(128, 74, 210, 30);

        jLabel3.setText("Absen");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 80, 60, 14);

        jLabel1.setText("Nama");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 50, 60, 14);

        jLabel5.setText("Jurusan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(58, 120, 60, 14);

        jLabel6.setText("Hobi");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(61, 150, 40, 14);

        jLabel2.setText("Biodata Siswa");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 20, 90, 14);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        jPanel1.add(Nama);
        Nama.setBounds(128, 42, 210, 30);

        buttonGroup1.add(rd1);
        rd1.setText("RPL");
        jPanel1.add(rd1);
        rd1.setBounds(130, 110, 100, 23);

        buttonGroup1.add(rd2);
        rd2.setText("TKJ");
        jPanel1.add(rd2);
        rd2.setBounds(240, 110, 100, 23);

        cb1.setText("Programing");
        jPanel1.add(cb1);
        cb1.setBounds(130, 150, 100, 23);

        cb2.setText("Animator");
        jPanel1.add(cb2);
        cb2.setBounds(130, 170, 100, 23);

        cb4.setText("Designer");
        jPanel1.add(cb4);
        cb4.setBounds(240, 170, 100, 23);

        cb3.setText("Teknisi");
        jPanel1.add(cb3);
        cb3.setBounds(240, 150, 100, 23);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 210, 70, 23);

        Clear.setText("Exit");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(270, 210, 70, 23);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus);
        Hapus.setBounds(170, 210, 80, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 250, 270, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 440, 470);

        setBounds(0, 0, 416, 429);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String nama = Nama.getText();
        String absen = Absen.getText();
        String jurusan;
        String hobi="";
        
        if(rd1.isSelected())
            jurusan = "RPL";
        else 
            jurusan = "TKJ";
        if(cb1.isSelected())
            hobi+=cb1.getText()+" ";
        if(cb2.isSelected())
            hobi+=cb2.getText()+" ";
        if(cb3.isSelected())
            hobi+=cb3.getText()+" ";
        if(cb4.isSelected())
            hobi+=cb4.getText()+" ";
        TA.append("Nama Siswa : "+nama+"\n"+"Absen : "+absen+"\n"+"Jurusan : "+jurusan+"\n"+"Hobi : "+hobi+"\n\n\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
       dispose();
        
    }//GEN-LAST:event_ClearActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        TA.setText("");
        Nama.setText("");
        Absen.setText("");
        cb1.setSelected(false);
    }//GEN-LAST:event_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(BiodataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiodataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiodataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiodataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiodataSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextArea TA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    // End of variables declaration//GEN-END:variables
}
