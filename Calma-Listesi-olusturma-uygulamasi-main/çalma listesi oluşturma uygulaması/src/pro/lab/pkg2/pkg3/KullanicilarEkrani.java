package pro.lab.pkg2.pkg3;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class KullanicilarEkrani extends javax.swing.JFrame {

    String takipEdilenkullaniciAdi;
    String takipEdilenSifre;
    String gelenKullaniciAdi_;
    String gelenSifre_;
    DefaultTableModel kullaniciModel;
    DefaultTableModel gizliModel;
    KullaniciIslemleri kullaniciIslemleri = new KullaniciIslemleri();
    DefaultTableModel secilenKullanicininPopListesiModel;
    DefaultTableModel secilenKullanicininJazzListesiModel;
    DefaultTableModel secilenKullanicininKlasikListesiModel;
    DefaultTableModel kullanicininPopListesiModel;
    DefaultTableModel kullanicininJazzListesiModel;
    DefaultTableModel kullanicininKlasikListesiModel;

    public KullanicilarEkrani() {
        initComponents();
        calmaListesiPaneli.setVisible(false);
gizliSifreAlani.setVisible(false);
        calmaListesiniGoruntuleButonu.setVisible(false);
        kullaniciModel = (DefaultTableModel) kullaniciTablosu.getModel();
        secilenKullanicininJazzListesiModel = (DefaultTableModel) secilenKullanicininJazzListesiTablosu.getModel();
        secilenKullanicininKlasikListesiModel = (DefaultTableModel) secilenKullanicininKlasikListesiTablosu.getModel();
        secilenKullanicininPopListesiModel = (DefaultTableModel) secilenKullanicininPopListesiTablosu.getModel();
        kullanicininJazzListesiModel = (DefaultTableModel) kullanicininJazzListesiTablosu.getModel();
        kullanicininKlasikListesiModel = (DefaultTableModel) kullanicininKlasikListesiTablosu.getModel();
        kullanicininPopListesiModel = (DefaultTableModel) kullanicininPopListesiTablosu.getModel();
        kullanicininPopListesiniGoruntule();
        kullanicininKlasikListesiniGoruntule();
        kullanicininJazzListesiniGoruntule();
        kullanicilariGoruntule();

    }

    public KullanicilarEkrani(String gelenKullaniciAdi, String gelenSifre) {
        initComponents();
        calmaListesiPaneli.setVisible(false);
        gelenKullaniciAdi_ = gelenKullaniciAdi;
        gelenSifre_ = gelenSifre;
        calmaListesiniGoruntuleButonu.setVisible(false);
        kullaniciModel = (DefaultTableModel) kullaniciTablosu.getModel();
        secilenKullanicininJazzListesiModel = (DefaultTableModel) secilenKullanicininJazzListesiTablosu.getModel();
        secilenKullanicininKlasikListesiModel = (DefaultTableModel) secilenKullanicininKlasikListesiTablosu.getModel();
        secilenKullanicininPopListesiModel = (DefaultTableModel) secilenKullanicininPopListesiTablosu.getModel();
        kullanicininJazzListesiModel = (DefaultTableModel) kullanicininJazzListesiTablosu.getModel();
        kullanicininKlasikListesiModel = (DefaultTableModel) kullanicininKlasikListesiTablosu.getModel();
        kullanicininPopListesiModel = (DefaultTableModel) kullanicininPopListesiTablosu.getModel();
        kullanicininPopListesiniGoruntule();
        kullanicininKlasikListesiniGoruntule();
        kullanicininJazzListesiniGoruntule();
        kullanicilariGoruntule();
        gizliSifreAlani.setVisible(false);

    }

    public void secilenKullanicininKlasikListesiniGoruntule() {
        secilenKullanicininKlasikListesiModel.setRowCount(0);

        ArrayList<CalmaListeleriBilgileri> calmaListeleri = new ArrayList<CalmaListeleriBilgileri>();

        calmaListeleri = kullaniciIslemleri.klasikCalmaListesiniGetir(takipEdilenkullaniciAdi, takipEdilenSifre);
        if (calmaListeleri != null) {
            for (CalmaListeleriBilgileri calmaListesi : calmaListeleri) {
                Object[] eklenecek = {calmaListesi.getSarkiAd(), calmaListesi.getSanatciAd(), calmaListesi.getAlbum(), calmaListesi.getDinlenmeSayisi(), calmaListesi.getTur()};
                secilenKullanicininKlasikListesiModel.addRow(eklenecek);

            }

        }
    }

    public void secilenKullanicininJazzListesiniGoruntule() {
        secilenKullanicininJazzListesiModel.setRowCount(0);

        ArrayList<CalmaListeleriBilgileri> calmaListeleri = new ArrayList<CalmaListeleriBilgileri>();

        calmaListeleri = kullaniciIslemleri.jazzCalmaListesiniGetir(takipEdilenkullaniciAdi, takipEdilenSifre);
        if (calmaListeleri != null) {
            for (CalmaListeleriBilgileri calmaListesi : calmaListeleri) {
                Object[] eklenecek = {calmaListesi.getSarkiAd(), calmaListesi.getSanatciAd(), calmaListesi.getAlbum(), calmaListesi.getDinlenmeSayisi(), calmaListesi.getTur()};
                secilenKullanicininJazzListesiModel.addRow(eklenecek);

            }

        }
    }

    public void secilenKullanicininPopListesiniGoruntule() {
        secilenKullanicininPopListesiModel.setRowCount(0);

        ArrayList<CalmaListeleriBilgileri> calmaListeleri = new ArrayList<CalmaListeleriBilgileri>();

        calmaListeleri = kullaniciIslemleri.popCalmaListesiniGetir(takipEdilenkullaniciAdi, takipEdilenSifre);
        if (calmaListeleri != null) {
            for (CalmaListeleriBilgileri calmaListesi : calmaListeleri) {
                Object[] eklenecek = {calmaListesi.getSarkiAd(), calmaListesi.getSanatciAd(), calmaListesi.getAlbum(), calmaListesi.getDinlenmeSayisi(), calmaListesi.getTur()};
                secilenKullanicininPopListesiModel.addRow(eklenecek);

            }

        }
    }

    public void kullanicininKlasikListesiniGoruntule() {
        kullanicininKlasikListesiModel.setRowCount(0);

        ArrayList<CalmaListeleriBilgileri> calmaListeleri = new ArrayList<CalmaListeleriBilgileri>();

        calmaListeleri = kullaniciIslemleri.klasikCalmaListesiniGetir(gelenKullaniciAdi_, gelenSifre_);
        if (calmaListeleri != null) {
            for (CalmaListeleriBilgileri calmaListesi : calmaListeleri) {
                Object[] eklenecek = {calmaListesi.getSarkiAd(), calmaListesi.getSanatciAd(), calmaListesi.getAlbum(), calmaListesi.getDinlenmeSayisi(), calmaListesi.getTur()};
                kullanicininKlasikListesiModel.addRow(eklenecek);

            }

        }
    }

    public void kullanicininJazzListesiniGoruntule() {
        kullanicininJazzListesiModel.setRowCount(0);

        ArrayList<CalmaListeleriBilgileri> calmaListeleri = new ArrayList<CalmaListeleriBilgileri>();

        calmaListeleri = kullaniciIslemleri.jazzCalmaListesiniGetir(gelenKullaniciAdi_, gelenSifre_);
        if (calmaListeleri != null) {
            for (CalmaListeleriBilgileri calmaListesi : calmaListeleri) {
                Object[] eklenecek = {calmaListesi.getSarkiAd(), calmaListesi.getSanatciAd(), calmaListesi.getAlbum(), calmaListesi.getDinlenmeSayisi(), calmaListesi.getTur()};
                kullanicininJazzListesiModel.addRow(eklenecek);

            }

        }
    }

    public void kullanicininPopListesiniGoruntule() {
        kullanicininPopListesiModel.setRowCount(0);

        ArrayList<CalmaListeleriBilgileri> calmaListeleri = new ArrayList<CalmaListeleriBilgileri>();

        calmaListeleri = kullaniciIslemleri.popCalmaListesiniGetir(gelenKullaniciAdi_, gelenSifre_);
        if (calmaListeleri != null) {
            for (CalmaListeleriBilgileri calmaListesi : calmaListeleri) {
                Object[] eklenecek = {calmaListesi.getSarkiAd(), calmaListesi.getSanatciAd(), calmaListesi.getAlbum(), calmaListesi.getDinlenmeSayisi(), calmaListesi.getTur()};
                kullanicininPopListesiModel.addRow(eklenecek);

            }

        }
    }

    public void kullanicilariGoruntule() {
        kullaniciModel.setRowCount(0);

        ArrayList<KullaniciBilgileri> kullanicilar = new ArrayList<KullaniciBilgileri>();
        kullanicilar = kullaniciIslemleri.kullanicilariGetir();
        if (kullanicilar != null) {
            for (KullaniciBilgileri kullanici : kullanicilar) {
                Object[] eklenecek = {kullanici.getKullaniciAd(), kullanici.getEmail(), kullanici.getAbonelikTuru(), kullanici.getUlke(), kullanici.getOdendi(), kullanici.getSifre()};
                kullaniciModel.addRow(eklenecek);

            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calmaListesiniGoruntuleButonu = new javax.swing.JButton();
        takipButonu = new javax.swing.JButton();
        secilenKullaniciBilgileriPaneli = new javax.swing.JPanel();
        abonelikAlani = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        kullaniciAdiAlani = new javax.swing.JTextField();
        emailAlani = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        calmaListesiPaneli = new javax.swing.JPanel();
        secilenSarkiBilgileriPaneli = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        secilenSarkiAdiAlani = new javax.swing.JTextField();
        secilenSarkiSanatciAlani = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        secilenSarkiAlbumAlani = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        sarkiEkleButonu = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        secilenSarkiDinlenmeSayisiAlani = new javax.swing.JTextField();
        secilenSarkiTuruAlani = new javax.swing.JTextField();
        dinleButonu = new javax.swing.JButton();
        popListesiniEkleButonu = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        secilenKullanicininPopListesiTablosu = new javax.swing.JTable();
        klasikListesiniEkleButonu = new javax.swing.JButton();
        jazzListesiniEkleButonu = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        secilenKullanicininKlasikListesiTablosu = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        secilenKullanicininJazzListesiTablosu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        uyariAlani = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        kullaniciTablosu = new javax.swing.JTable();
        gizliSifreAlani = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        kullanicininJazzListesiTablosu = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        kullanicininPopListesiTablosu = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        kullanicininKlasikListesiTablosu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 50, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calmaListesiniGoruntuleButonu.setText("çalma listesini görüntüle");
        calmaListesiniGoruntuleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calmaListesiniGoruntuleButonuActionPerformed(evt);
            }
        });
        getContentPane().add(calmaListesiniGoruntuleButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 156, 44));

        takipButonu.setText("takip");
        takipButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takipButonuActionPerformed(evt);
            }
        });
        getContentPane().add(takipButonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 127, 30));

        abonelikAlani.setText(" ");

        jTextField11.setEditable(false);
        jTextField11.setText("Abonelik :");

        jTextField1.setEditable(false);
        jTextField1.setText("Kullanıcı Adı :");

        kullaniciAdiAlani.setText(" ");

        emailAlani.setText(" ");

        jTextField9.setEditable(false);
        jTextField9.setText("Email :");

        javax.swing.GroupLayout secilenKullaniciBilgileriPaneliLayout = new javax.swing.GroupLayout(secilenKullaniciBilgileriPaneli);
        secilenKullaniciBilgileriPaneli.setLayout(secilenKullaniciBilgileriPaneliLayout);
        secilenKullaniciBilgileriPaneliLayout.setHorizontalGroup(
            secilenKullaniciBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secilenKullaniciBilgileriPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secilenKullaniciBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(secilenKullaniciBilgileriPaneliLayout.createSequentialGroup()
                        .addGroup(secilenKullaniciBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11)
                            .addComponent(jTextField9))
                        .addGap(18, 18, 18)
                        .addGroup(secilenKullaniciBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abonelikAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(secilenKullaniciBilgileriPaneliLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secilenKullaniciBilgileriPaneliLayout.setVerticalGroup(
            secilenKullaniciBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secilenKullaniciBilgileriPaneliLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(secilenKullaniciBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(secilenKullaniciBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(abonelikAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(secilenKullaniciBilgileriPaneliLayout.createSequentialGroup()
                        .addGroup(secilenKullaniciBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        getContentPane().add(secilenKullaniciBilgileriPaneli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, 150));

        jTextField12.setEditable(false);
        jTextField12.setText("seçilen şarkı :");

        jTextField14.setEditable(false);
        jTextField14.setText("Dinlenme Sayisi ");

        secilenSarkiAdiAlani.setText(" ");

        secilenSarkiSanatciAlani.setText(" ");

        jTextField4.setEditable(false);
        jTextField4.setText("sanatçı :");

        secilenSarkiAlbumAlani.setText(" ");

        jTextField6.setEditable(false);
        jTextField6.setText("Album :");

        sarkiEkleButonu.setText("şarkıyı ekle");
        sarkiEkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarkiEkleButonuActionPerformed(evt);
            }
        });

        jTextField15.setEditable(false);
        jTextField15.setText("Türü :");

        secilenSarkiDinlenmeSayisiAlani.setText(" ");

        secilenSarkiTuruAlani.setText(" ");

        dinleButonu.setText("Dinle");
        dinleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinleButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout secilenSarkiBilgileriPaneliLayout = new javax.swing.GroupLayout(secilenSarkiBilgileriPaneli);
        secilenSarkiBilgileriPaneli.setLayout(secilenSarkiBilgileriPaneliLayout);
        secilenSarkiBilgileriPaneliLayout.setHorizontalGroup(
            secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secilenSarkiBilgileriPaneliLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(secilenSarkiBilgileriPaneliLayout.createSequentialGroup()
                        .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secilenSarkiAlbumAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secilenSarkiSanatciAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secilenSarkiAdiAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, secilenSarkiBilgileriPaneliLayout.createSequentialGroup()
                        .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(secilenSarkiBilgileriPaneliLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                            .addGroup(secilenSarkiBilgileriPaneliLayout.createSequentialGroup()
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(48, 48, 48)))
                        .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secilenSarkiDinlenmeSayisiAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secilenSarkiTuruAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
            .addGroup(secilenSarkiBilgileriPaneliLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(sarkiEkleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dinleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secilenSarkiBilgileriPaneliLayout.setVerticalGroup(
            secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secilenSarkiBilgileriPaneliLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secilenSarkiAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secilenSarkiSanatciAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secilenSarkiAlbumAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secilenSarkiDinlenmeSayisiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secilenSarkiTuruAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(secilenSarkiBilgileriPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sarkiEkleButonu)
                    .addComponent(dinleButonu))
                .addContainerGap())
        );

        popListesiniEkleButonu.setText("Çalma Listesini Ekle");
        popListesiniEkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popListesiniEkleButonuActionPerformed(evt);
            }
        });

        secilenKullanicininPopListesiTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şarkı", "Albüm", "Sanatçı ", "Dinlenme Sayısı", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        secilenKullanicininPopListesiTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secilenKullanicininPopListesiTablosuMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(secilenKullanicininPopListesiTablosu);
        if (secilenKullanicininPopListesiTablosu.getColumnModel().getColumnCount() > 0) {
            secilenKullanicininPopListesiTablosu.getColumnModel().getColumn(0).setResizable(false);
            secilenKullanicininPopListesiTablosu.getColumnModel().getColumn(1).setResizable(false);
            secilenKullanicininPopListesiTablosu.getColumnModel().getColumn(2).setResizable(false);
            secilenKullanicininPopListesiTablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        klasikListesiniEkleButonu.setText("Çalma Listesini Ekle");
        klasikListesiniEkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klasikListesiniEkleButonuActionPerformed(evt);
            }
        });

        jazzListesiniEkleButonu.setText("Çalma Listesini Ekle");
        jazzListesiniEkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jazzListesiniEkleButonuActionPerformed(evt);
            }
        });

        secilenKullanicininKlasikListesiTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şarkı", "Albüm", "Sanatçı ", "Dinlenme Sayısı", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        secilenKullanicininKlasikListesiTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secilenKullanicininKlasikListesiTablosuMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(secilenKullanicininKlasikListesiTablosu);
        if (secilenKullanicininKlasikListesiTablosu.getColumnModel().getColumnCount() > 0) {
            secilenKullanicininKlasikListesiTablosu.getColumnModel().getColumn(0).setResizable(false);
            secilenKullanicininKlasikListesiTablosu.getColumnModel().getColumn(1).setResizable(false);
            secilenKullanicininKlasikListesiTablosu.getColumnModel().getColumn(2).setResizable(false);
            secilenKullanicininKlasikListesiTablosu.getColumnModel().getColumn(3).setResizable(false);
            secilenKullanicininKlasikListesiTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        secilenKullanicininJazzListesiTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şarkı", "Albüm", "Sanatçı ", "Dinlenme Sayısı", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        secilenKullanicininJazzListesiTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secilenKullanicininJazzListesiTablosuMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(secilenKullanicininJazzListesiTablosu);
        if (secilenKullanicininJazzListesiTablosu.getColumnModel().getColumnCount() > 0) {
            secilenKullanicininJazzListesiTablosu.getColumnModel().getColumn(0).setResizable(false);
            secilenKullanicininJazzListesiTablosu.getColumnModel().getColumn(1).setResizable(false);
            secilenKullanicininJazzListesiTablosu.getColumnModel().getColumn(2).setResizable(false);
            secilenKullanicininJazzListesiTablosu.getColumnModel().getColumn(3).setResizable(false);
            secilenKullanicininJazzListesiTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout calmaListesiPaneliLayout = new javax.swing.GroupLayout(calmaListesiPaneli);
        calmaListesiPaneli.setLayout(calmaListesiPaneliLayout);
        calmaListesiPaneliLayout.setHorizontalGroup(
            calmaListesiPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calmaListesiPaneliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(secilenSarkiBilgileriPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(calmaListesiPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(calmaListesiPaneliLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(671, 671, 671))
                    .addGroup(calmaListesiPaneliLayout.createSequentialGroup()
                        .addGroup(calmaListesiPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(calmaListesiPaneliLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(popListesiniEkleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202)
                                .addComponent(jazzListesiniEkleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(291, 291, 291)
                                .addComponent(klasikListesiniEkleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(calmaListesiPaneliLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        calmaListesiPaneliLayout.setVerticalGroup(
            calmaListesiPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calmaListesiPaneliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(calmaListesiPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secilenSarkiBilgileriPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(calmaListesiPaneliLayout.createSequentialGroup()
                        .addGroup(calmaListesiPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(calmaListesiPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(klasikListesiniEkleButonu)
                            .addComponent(jazzListesiniEkleButonu)
                            .addComponent(popListesiniEkleButonu))
                        .addGap(127, 127, 127)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(203, 203, 203))
        );

        getContentPane().add(calmaListesiPaneli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1450, 290));

        uyariAlani.setText(" ");
        getContentPane().add(uyariAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 270, 40));

        kullaniciTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı Adı", "E-mail", "Abonelik Türü ", "ulke", "Ödendi", "Şifre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullaniciTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciTablosuMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(kullaniciTablosu);
        if (kullaniciTablosu.getColumnModel().getColumnCount() > 0) {
            kullaniciTablosu.getColumnModel().getColumn(0).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(1).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(2).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(3).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(4).setResizable(false);
            kullaniciTablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 125, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 370, 380, 310));

        gizliSifreAlani.setText(" ");
        getContentPane().add(gizliSifreAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 160, 70));

        kullanicininJazzListesiTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şarkı", "Albüm", "Sanatçı ", "Dinlenme Sayısı", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullanicininJazzListesiTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanicininJazzListesiTablosuMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(kullanicininJazzListesiTablosu);
        if (kullanicininJazzListesiTablosu.getColumnModel().getColumnCount() > 0) {
            kullanicininJazzListesiTablosu.getColumnModel().getColumn(0).setResizable(false);
            kullanicininJazzListesiTablosu.getColumnModel().getColumn(1).setResizable(false);
            kullanicininJazzListesiTablosu.getColumnModel().getColumn(2).setResizable(false);
            kullanicininJazzListesiTablosu.getColumnModel().getColumn(3).setResizable(false);
            kullanicininJazzListesiTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 250, 160));

        kullanicininPopListesiTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şarkı", "Albüm", "Sanatçı ", "Dinlenme Sayısı", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullanicininPopListesiTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanicininPopListesiTablosuMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(kullanicininPopListesiTablosu);
        if (kullanicininPopListesiTablosu.getColumnModel().getColumnCount() > 0) {
            kullanicininPopListesiTablosu.getColumnModel().getColumn(0).setResizable(false);
            kullanicininPopListesiTablosu.getColumnModel().getColumn(1).setResizable(false);
            kullanicininPopListesiTablosu.getColumnModel().getColumn(2).setResizable(false);
            kullanicininPopListesiTablosu.getColumnModel().getColumn(3).setResizable(false);
            kullanicininPopListesiTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 250, 160));

        kullanicininKlasikListesiTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şarkı", "Albüm", "Sanatçı ", "Dinlenme Sayısı", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullanicininKlasikListesiTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanicininKlasikListesiTablosuMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(kullanicininKlasikListesiTablosu);
        if (kullanicininKlasikListesiTablosu.getColumnModel().getColumnCount() > 0) {
            kullanicininKlasikListesiTablosu.getColumnModel().getColumn(0).setResizable(false);
            kullanicininKlasikListesiTablosu.getColumnModel().getColumn(1).setResizable(false);
            kullanicininKlasikListesiTablosu.getColumnModel().getColumn(2).setResizable(false);
            kullanicininKlasikListesiTablosu.getColumnModel().getColumn(3).setResizable(false);
            kullanicininKlasikListesiTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 250, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calmaListesiniGoruntuleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calmaListesiniGoruntuleButonuActionPerformed
        calmaListesiPaneli.setVisible(true);
    }//GEN-LAST:event_calmaListesiniGoruntuleButonuActionPerformed

    private void takipButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takipButonuActionPerformed
        if (abonelikAlani.getText().equals("Premium")) {
            calmaListesiniGoruntuleButonu.setVisible(true);
            uyariAlani.setText("Takip Başarılı");
        } else {
            uyariAlani.setText("Sadece Premium Hesaplar Takip Edilebilir");
        }
        System.out.println("kullanıcılar ekranıı--  " + gelenKullaniciAdi_ + "," + gelenSifre_);

    }//GEN-LAST:event_takipButonuActionPerformed

    private void kullaniciTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciTablosuMouseClicked
        int selectedRow = kullaniciTablosu.getSelectedRow();
        calmaListesiPaneli.setVisible(false);
        calmaListesiniGoruntuleButonu.setVisible(false);
        kullaniciAdiAlani.setText(kullaniciModel.getValueAt(selectedRow, 0).toString());
        emailAlani.setText(kullaniciModel.getValueAt(selectedRow, 1).toString());
        abonelikAlani.setText(kullaniciModel.getValueAt(selectedRow, 2).toString());
        gizliSifreAlani.setText(kullaniciModel.getValueAt(selectedRow, 5).toString());
        takipEdilenkullaniciAdi = kullaniciAdiAlani.getText();
        takipEdilenSifre = gizliSifreAlani.getText();
        secilenKullanicininPopListesiniGoruntule();
        secilenKullanicininKlasikListesiniGoruntule();
        secilenKullanicininJazzListesiniGoruntule();
    }//GEN-LAST:event_kullaniciTablosuMouseClicked

    private void secilenKullanicininPopListesiTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secilenKullanicininPopListesiTablosuMouseClicked
        int selectedRow = secilenKullanicininPopListesiTablosu.getSelectedRow();
        secilenSarkiAdiAlani.setText(secilenKullanicininPopListesiModel.getValueAt(selectedRow, 0).toString());
        secilenSarkiAlbumAlani.setText(secilenKullanicininPopListesiModel.getValueAt(selectedRow, 2).toString());
        secilenSarkiSanatciAlani.setText(secilenKullanicininPopListesiModel.getValueAt(selectedRow, 1).toString());
        secilenSarkiDinlenmeSayisiAlani.setText(secilenKullanicininPopListesiModel.getValueAt(selectedRow, 3).toString());
        secilenSarkiTuruAlani.setText(secilenKullanicininPopListesiModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_secilenKullanicininPopListesiTablosuMouseClicked

    private void secilenKullanicininJazzListesiTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secilenKullanicininJazzListesiTablosuMouseClicked
        int selectedRow = secilenKullanicininJazzListesiTablosu.getSelectedRow();
//          int selectedRow = secilenKullanicininJazzListesiTablosu.getRowCount();
//        System.out.println("selected row="+selectedRow);
        secilenSarkiAdiAlani.setText(secilenKullanicininJazzListesiModel.getValueAt(selectedRow, 0).toString());
        secilenSarkiAlbumAlani.setText(secilenKullanicininJazzListesiModel.getValueAt(selectedRow, 2).toString());
        secilenSarkiSanatciAlani.setText(secilenKullanicininJazzListesiModel.getValueAt(selectedRow, 1).toString());
        secilenSarkiDinlenmeSayisiAlani.setText(secilenKullanicininJazzListesiModel.getValueAt(selectedRow, 3).toString());
        secilenSarkiTuruAlani.setText(secilenKullanicininJazzListesiModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_secilenKullanicininJazzListesiTablosuMouseClicked

    private void secilenKullanicininKlasikListesiTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secilenKullanicininKlasikListesiTablosuMouseClicked
        int selectedRow = secilenKullanicininKlasikListesiTablosu.getSelectedRow();
//        System.out.println("selected row="+selectedRow);
        secilenSarkiAdiAlani.setText(secilenKullanicininKlasikListesiModel.getValueAt(selectedRow, 0).toString());
        secilenSarkiAlbumAlani.setText(secilenKullanicininKlasikListesiModel.getValueAt(selectedRow, 2).toString());
        secilenSarkiSanatciAlani.setText(secilenKullanicininKlasikListesiModel.getValueAt(selectedRow, 1).toString());
        secilenSarkiDinlenmeSayisiAlani.setText(secilenKullanicininKlasikListesiModel.getValueAt(selectedRow, 3).toString());
        secilenSarkiTuruAlani.setText(secilenKullanicininKlasikListesiModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_secilenKullanicininKlasikListesiTablosuMouseClicked

    private void sarkiEkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarkiEkleButonuActionPerformed
        String sarkiAdi = secilenSarkiAdiAlani.getText();
        String sanatci = secilenSarkiSanatciAlani.getText();
        String album = secilenSarkiAlbumAlani.getText();
        int dinlenmeSayisi = Integer.parseInt(secilenSarkiDinlenmeSayisiAlani.getText());
        String tur = secilenSarkiTuruAlani.getText();

        int selectedRow = secilenKullanicininPopListesiTablosu.getSelectedRow();
        int selectedRow2 = secilenKullanicininJazzListesiTablosu.getSelectedRow();
        int selectedRow3 = secilenKullanicininKlasikListesiTablosu.getSelectedRow();
        if (selectedRow == -1 && selectedRow2 == -1 && selectedRow3 == -1) {
            if (secilenKullanicininPopListesiModel.getRowCount() == 0) {
//                    mesajYazisi.setText("çalışanlar tablosu şuanda boş ");
            } else {
//                mesajYazisi.setText("lütfen güncellenecek bir çalışan seçin");
            }
        } else {

            kullaniciIslemleri.kullaniciyaTakipEttigiKisininSarkisiniEkle(gelenKullaniciAdi_, gelenSifre_, sarkiAdi, sanatci, album, dinlenmeSayisi, tur);

        }
    }//GEN-LAST:event_sarkiEkleButonuActionPerformed

    private void popListesiniEkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popListesiniEkleButonuActionPerformed
        for (int i = 0; i < secilenKullanicininPopListesiTablosu.getRowCount(); i++) {

            secilenSarkiTuruAlani.setText(secilenKullanicininPopListesiModel.getValueAt(i, 4).toString());
            String sarkiAdi = secilenKullanicininPopListesiModel.getValueAt(i, 0).toString();
            String sanatci = secilenKullanicininPopListesiModel.getValueAt(i, 1).toString();
            String album = secilenKullanicininPopListesiModel.getValueAt(i, 2).toString();
            String dinlenme = secilenKullanicininPopListesiModel.getValueAt(i, 3).toString();
            int dinlenmeSayisi = Integer.parseInt(dinlenme);
            String tur = secilenKullanicininPopListesiModel.getValueAt(i, 4).toString();
            kullaniciIslemleri.kullaniciyaTakipEttigiKisininSarkisiniEkle(gelenKullaniciAdi_, gelenSifre_, sarkiAdi, sanatci, album, dinlenmeSayisi, tur);
        }

    }//GEN-LAST:event_popListesiniEkleButonuActionPerformed

    private void jazzListesiniEkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jazzListesiniEkleButonuActionPerformed
        for (int i = 0; i < secilenKullanicininJazzListesiTablosu.getRowCount(); i++) {

            secilenSarkiTuruAlani.setText(secilenKullanicininJazzListesiModel.getValueAt(i, 4).toString());
            String sarkiAdi = secilenKullanicininJazzListesiModel.getValueAt(i, 0).toString();
            String sanatci = secilenKullanicininJazzListesiModel.getValueAt(i, 1).toString();
            String album = secilenKullanicininJazzListesiModel.getValueAt(i, 2).toString();
            String dinlenme = secilenKullanicininJazzListesiModel.getValueAt(i, 3).toString();
            int dinlenmeSayisi = Integer.parseInt(dinlenme);
            String tur = secilenKullanicininJazzListesiModel.getValueAt(i, 4).toString();
            kullaniciIslemleri.kullaniciyaTakipEttigiKisininSarkisiniEkle(gelenKullaniciAdi_, gelenSifre_, sarkiAdi, sanatci, album, dinlenmeSayisi, tur);
        }
    }//GEN-LAST:event_jazzListesiniEkleButonuActionPerformed

    private void klasikListesiniEkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klasikListesiniEkleButonuActionPerformed
        for (int i = 0; i < secilenKullanicininKlasikListesiTablosu.getRowCount(); i++) {

            secilenSarkiTuruAlani.setText(secilenKullanicininKlasikListesiModel.getValueAt(i, 4).toString());
            String sarkiAdi = secilenKullanicininKlasikListesiModel.getValueAt(i, 0).toString();
            String sanatci = secilenKullanicininKlasikListesiModel.getValueAt(i, 1).toString();
            String album = secilenKullanicininKlasikListesiModel.getValueAt(i, 2).toString();
            String dinlenme = secilenKullanicininKlasikListesiModel.getValueAt(i, 3).toString();
            int dinlenmeSayisi = Integer.parseInt(dinlenme);
            String tur = secilenKullanicininKlasikListesiModel.getValueAt(i, 4).toString();
            kullaniciIslemleri.kullaniciyaTakipEttigiKisininSarkisiniEkle(gelenKullaniciAdi_, gelenSifre_, sarkiAdi, sanatci, album, dinlenmeSayisi, tur);
        }
    }//GEN-LAST:event_klasikListesiniEkleButonuActionPerformed

    private void dinleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinleButonuActionPerformed

        
    }//GEN-LAST:event_dinleButonuActionPerformed

    private void kullanicininJazzListesiTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanicininJazzListesiTablosuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanicininJazzListesiTablosuMouseClicked

    private void kullanicininPopListesiTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanicininPopListesiTablosuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanicininPopListesiTablosuMouseClicked

    private void kullanicininKlasikListesiTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanicininKlasikListesiTablosuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanicininKlasikListesiTablosuMouseClicked

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
            java.util.logging.Logger.getLogger(KullanicilarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullanicilarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullanicilarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullanicilarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullanicilarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abonelikAlani;
    private javax.swing.JPanel calmaListesiPaneli;
    private javax.swing.JButton calmaListesiniGoruntuleButonu;
    private javax.swing.JButton dinleButonu;
    private javax.swing.JTextField emailAlani;
    private javax.swing.JTextField gizliSifreAlani;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jazzListesiniEkleButonu;
    private javax.swing.JButton klasikListesiniEkleButonu;
    private javax.swing.JTextField kullaniciAdiAlani;
    private javax.swing.JTable kullaniciTablosu;
    private javax.swing.JTable kullanicininJazzListesiTablosu;
    private javax.swing.JTable kullanicininKlasikListesiTablosu;
    private javax.swing.JTable kullanicininPopListesiTablosu;
    private javax.swing.JButton popListesiniEkleButonu;
    private javax.swing.JButton sarkiEkleButonu;
    private javax.swing.JPanel secilenKullaniciBilgileriPaneli;
    private javax.swing.JTable secilenKullanicininJazzListesiTablosu;
    private javax.swing.JTable secilenKullanicininKlasikListesiTablosu;
    private javax.swing.JTable secilenKullanicininPopListesiTablosu;
    private javax.swing.JTextField secilenSarkiAdiAlani;
    private javax.swing.JTextField secilenSarkiAlbumAlani;
    private javax.swing.JPanel secilenSarkiBilgileriPaneli;
    private javax.swing.JTextField secilenSarkiDinlenmeSayisiAlani;
    private javax.swing.JTextField secilenSarkiSanatciAlani;
    private javax.swing.JTextField secilenSarkiTuruAlani;
    private javax.swing.JButton takipButonu;
    private javax.swing.JTextField uyariAlani;
    // End of variables declaration//GEN-END:variables
}
