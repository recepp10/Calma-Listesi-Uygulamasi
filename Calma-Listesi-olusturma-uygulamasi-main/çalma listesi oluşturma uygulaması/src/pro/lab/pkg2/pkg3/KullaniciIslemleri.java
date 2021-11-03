/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.lab.pkg2.pkg3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pro.lab.pkg2.pkg3.Database.db_ismi;
import static pro.lab.pkg2.pkg3.Database.host;
import static pro.lab.pkg2.pkg3.Database.kullanici_adi;
import static pro.lab.pkg2.pkg3.Database.parola;
import static pro.lab.pkg2.pkg3.Database.port;

/**
 *
 * @author furka
 */
public class KullaniciIslemleri {

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    String gonderilecekSifre;

    public KullaniciIslemleri() {

        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }

        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı Başarılı...");

        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");

        }
    }

    public void sifreGonder() {

    }

    ArrayList<KullaniciBilgileri> kullanicilariGetir() {
        ArrayList<KullaniciBilgileri> cikti = new ArrayList<KullaniciBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select * from kullanici";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String kullaniciAd = rs.getString("kullaniciAd");
                String email = rs.getString("email");
                String sifre = rs.getString("sifre");
                String abonelikTuru = rs.getString("abonelikTuru");
                String ulke = rs.getString("ulke");
                String odendi = rs.getString("odendi");
                cikti.add(new KullaniciBilgileri(kullaniciAd, email, abonelikTuru, ulke, odendi, sifre));

            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ArrayList<CalmaListeleriBilgileri> klasikCalmaListesiniGetir(String kullaniciAdi, String sifre) {
        ArrayList<CalmaListeleriBilgileri> cikti = new ArrayList<CalmaListeleriBilgileri>();

        try {
            statement = con.createStatement();
            String sorgu8 = "select * from " + kullaniciAdi + sifre + "klasik";
            //String sorgu8 = "select * from furkan12345klasik";
            System.out.println("kullanıcı işlemleri " + kullaniciAdi + "," + sifre);
            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarkiAd");
                String sanatciAd = rs.getString("sanatci");
                String albumAd = rs.getString("album");

                int dinlenmeSayisi = rs.getInt("dinlenmeSayisi");
                String tur = rs.getString("tur");
                cikti.add(new CalmaListeleriBilgileri(sarkiAd, sanatciAd, albumAd, dinlenmeSayisi, tur));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ArrayList<CalmaListeleriBilgileri> jazzCalmaListesiniGetir(String kullaniciAdi, String sifre) {
        ArrayList<CalmaListeleriBilgileri> cikti = new ArrayList<CalmaListeleriBilgileri>();

        try {
            statement = con.createStatement();
            String sorgu8 = "select * from " + kullaniciAdi + sifre + "jazz";
            //String sorgu8 = "select * from furkan12345klasik";
            System.out.println("kullanıcı işlemleri " + kullaniciAdi + "," + sifre);
            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarkiAd");
                String sanatciAd = rs.getString("sanatci");
                String albumAd = rs.getString("album");

                int dinlenmeSayisi = rs.getInt("dinlenmeSayisi");
                String tur = rs.getString("tur");
                cikti.add(new CalmaListeleriBilgileri(sarkiAd, sanatciAd, albumAd, dinlenmeSayisi, tur));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ArrayList<CalmaListeleriBilgileri> popCalmaListesiniGetir(String kullaniciAdi, String sifre) {
        ArrayList<CalmaListeleriBilgileri> cikti = new ArrayList<CalmaListeleriBilgileri>();

        try {
            statement = con.createStatement();
            String sorgu8 = "select * from " + kullaniciAdi + sifre + "pop";
            //String sorgu8 = "select * from furkan12345klasik";
            System.out.println("kullanıcı işlemleri " + kullaniciAdi + "," + sifre);
            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarkiAd");
                String sanatciAd = rs.getString("sanatci");
                String albumAd = rs.getString("album");

                int dinlenmeSayisi = rs.getInt("dinlenmeSayisi");
                String tur = rs.getString("tur");
                cikti.add(new CalmaListeleriBilgileri(sarkiAd, sanatciAd, albumAd, dinlenmeSayisi, tur));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String takipEdilenKisininSifresi() {

        return gonderilecekSifre;
    }

    void kullaniciyaTakipEttigiKisininSarkisiniEkle(String kullaniciAdi, String sifre, String sarkiAdi, String sanatci, String album, int dinlenmeSayisi, String tur) {
      
      //  System.out.println("kullanıcıtakipekle ---"+tur+sarkiAdi+sanatci);
        if (tur.equals("pop") || tur.equals("Pop")) {
               String sorgu2 = "select * from "+kullaniciAdi+sifre+"pop where sarkiAd=? and sanatci = ?";

        try {

            preparedStatement = con.prepareStatement(sorgu2);

            preparedStatement.setString(1, sarkiAdi);
            preparedStatement.setString(2, sanatci);

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                System.out.println("ekleme başarısız");
            } else {
                sarkiEkle(kullaniciAdi,sifre,sarkiAdi, sanatci, album, tur);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
          if (tur.equals("jazz") || tur.equals("Jazz")) {
               String sorgu2 = "select * from "+kullaniciAdi+sifre+"jazz where sarkiAd=? and sanatci = ?";

        try {

            preparedStatement = con.prepareStatement(sorgu2);

            preparedStatement.setString(1, sarkiAdi);
            preparedStatement.setString(2, sanatci);

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                System.out.println("ekleme başarısız");
            } else {
                sarkiEkle(kullaniciAdi,sifre,sarkiAdi, sanatci, album, tur);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
            if (tur.equals("Klasik") || tur.equals("klasik")) {
               String sorgu2 = "select * from "+kullaniciAdi+sifre+"klasik where sarkiAd=? and sanatci = ?";

        try {

            preparedStatement = con.prepareStatement(sorgu2);

            preparedStatement.setString(1, sarkiAdi);
            preparedStatement.setString(2, sanatci);

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                System.out.println("ekleme başarısız");
            } else {
                sarkiEkle(kullaniciAdi,sifre,sarkiAdi, sanatci, album, tur);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
       public void sarkiEkle(String kullaniciAdi,String sifre,String sarkiAdi, String sanatci, String album, String tur) {

        if (tur.equals("pop") || tur.equals("Pop")) {
                String sorgu = "INSERT INTO "+kullaniciAdi+sifre+"pop (sarkiAd,sanatci,album,dinlenmeSayisi,tur)\n"
                + "SELECT sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,sarki.dinlenmeSayisi,tur.turAd\n"
                + "FROM sarki,sanatci,album,tur WHERE sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and sarki.sarkiAd='" + sarkiAdi + "'";

        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
          if (tur.equals("jazz") || tur.equals("Jazz")) {
                   String sorgu = "INSERT INTO "+kullaniciAdi+sifre+"jazz (sarkiAd,sanatci,album,dinlenmeSayisi,tur)\n"
                + "SELECT sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,sarki.dinlenmeSayisi,tur.turAd\n"
                + "FROM sarki,sanatci,album,tur WHERE sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and sarki.sarkiAd='" + sarkiAdi + "'";

        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
      if (tur.equals("klasik") || tur.equals("Klasik")) {
                String sorgu = "INSERT INTO "+kullaniciAdi+sifre+"klasik (sarkiAd,sanatci,album,dinlenmeSayisi,tur)\n"
                + "SELECT sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,sarki.dinlenmeSayisi,tur.turAd\n"
                + "FROM sarki,sanatci,album,tur WHERE sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and sarki.sarkiAd='" + sarkiAdi + "'";

        try {

            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

  public void sanatciSil(String sanatciAd)
  {
      String sorgu = "Delete from sanatci where sanatciAd = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, sanatciAd);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
  }
    public void albumSil(String albumAd)
  {
      String sorgu = "Delete from album where albumAd = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, albumAd);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
  }
   public void sarkiSil(String sarkiAd)
  {
      String sorgu = "Delete from sarki where sarkiAd = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, sarkiAd);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
  }
       public void sanatciGuncelle(String yenisanatciAd,String eskiSanatciAd,String yeniUlke,String eskiUlke) {
        String sorgu =  "Update sanatci set sanatciAd = ?  where sanatciAd = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yenisanatciAd);
            preparedStatement.setString(2,eskiSanatciAd);
            
          
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        String sorgu2 =  "Update ulkeler set ulke = ?  where ulke = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu2);
            
            
            preparedStatement.setString(1,yeniUlke);
            preparedStatement.setString(2,eskiUlke);
            
          
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }
  public void albumGuncelle(String yeniAlbumAd,String eskiAlbumAd,String yenisanatciAd,String eskiSanatciAd,String yenitarih,String eskitarih,String yeniTur,String eskiTur) {
        String sorgu =  "Update album set albumAd = ?  where albumAd = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeniAlbumAd);
            preparedStatement.setString(2,eskiAlbumAd);
            
          
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
               String sorgu2 =  "Update sanatci set sanatciAd = ?  where sanatciAd = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yenisanatciAd);
            preparedStatement.setString(2,eskiSanatciAd);
            
          
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sorgu3 =  "Update sarki set tarih = ?  where tarih = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yenitarih);
            preparedStatement.setString(2,eskitarih);
            
          
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
              String sorgu4 =  "Update sarki set tur = ?  where tur = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeniTur);
            preparedStatement.setString(2,eskiTur);
            
          
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
 