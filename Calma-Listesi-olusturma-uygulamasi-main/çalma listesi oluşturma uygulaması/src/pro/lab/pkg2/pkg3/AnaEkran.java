package pro.lab.pkg2.pkg3;

public class AnaEkran extends javax.swing.JFrame {

    public AnaEkran() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        adminButonu = new javax.swing.JButton();
        uyeGirisiButonu = new javax.swing.JButton();
        yeniKayıtButonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        adminButonu.setText("Admin Girişi");
        adminButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButonuActionPerformed(evt);
            }
        });

        uyeGirisiButonu.setText("Üye Girişi");
        uyeGirisiButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeGirisiButonuActionPerformed(evt);
            }
        });

        yeniKayıtButonu.setText("Yeni Kayıt Oluştur");
        yeniKayıtButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniKayıtButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uyeGirisiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniKayıtButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(uyeGirisiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(yeniKayıtButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(adminButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButonuActionPerformed
        setVisible(false);
        AdminEkrani adminEkrani = new AdminEkrani();
        adminEkrani.setVisible(true);

    }//GEN-LAST:event_adminButonuActionPerformed

    private void yeniKayıtButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniKayıtButonuActionPerformed
        setVisible(false);
        KayitOlEkrani kayitOlEkrani = new KayitOlEkrani();
        kayitOlEkrani.setVisible(true);

    }//GEN-LAST:event_yeniKayıtButonuActionPerformed

    private void uyeGirisiButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeGirisiButonuActionPerformed
        setVisible(false);
        KullaniciAnaEkrani kullaniciAnaEkrani = new KullaniciAnaEkrani();
        kullaniciAnaEkrani.setVisible(true);


    }//GEN-LAST:event_uyeGirisiButonuActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButonu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton uyeGirisiButonu;
    private javax.swing.JButton yeniKayıtButonu;
    // End of variables declaration//GEN-END:variables
}
