
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moklet
 */
public class lain extends javax.swing.JFrame {

    String str, str1;
    int choice, z, pin = 1122, a = 3;
    int t, s, tab = 500000;
    public lain() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pilih = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 0, 0, 0);

        pilih.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "Info Saldo", "Petunjuk" }));
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        jPanel1.add(pilih);
        pilih.setBounds(160, 230, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Pilihan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 180, 90, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(210, 300, 90, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bri.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-10, 0, 530, 150);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 380);

        setSize(new java.awt.Dimension(535, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        // TODO add your handling code here:

        setpilih();
    }//GEN-LAST:event_pilihActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        JOptionPane.showConfirmDialog(null,"Anda yakin ingin keluar?","ATM BRI",JOptionPane.YES_NO_OPTION, 3);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(lain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> pilih;
    // End of variables declaration//GEN-END:variables

    private void setpilih() {
        if (pilih.getSelectedItem().equals("Info Saldo"))
        {
            this.setVisible(true);
            JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " + tab); //informasi saldo
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BRI",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BRI");
                System.exit(0);
            }
        }
        else if (pilih.getSelectedItem().equals("Petunjuk")) {
            z=JOptionPane.showConfirmDialog(null,"Cara Menggunakan Aplikasi ATM BRI\n[1] Masukkan PIN Anda (4 digit) \n[2] Pilihlah transaksi yang sesuai dengan kebutuhan Anda \n[3] Jika sudah selesai, maka tutup aplikasi ATM BRI","INFO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BRI.");
                System.exit(0);
            }
        }
    }
}