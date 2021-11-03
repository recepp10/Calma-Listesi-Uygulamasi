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

public class SarkiIslemleri {

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    //select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId ORDER by sarki.dinlenmeSayisi desc
    public ArrayList<SarkiBilgileri> genelTabloSarkilariGetir() {

        ArrayList<SarkiBilgileri> cikti = new ArrayList<SarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId  ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new SarkiBilgileri(sarkiAd, sanatciAd, albumAd, tur, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    public ArrayList<SarkiBilgileri> abdTabloSarkilariGetir() {

        ArrayList<SarkiBilgileri> cikti = new ArrayList<SarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and sanatci.ulkeId=2 ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new SarkiBilgileri(sarkiAd, sanatciAd, albumAd, tur, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    public ArrayList<SarkiBilgileri> italyaTabloSarkilariGetir() {

        ArrayList<SarkiBilgileri> cikti = new ArrayList<SarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and sanatci.ulkeId=3 ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new SarkiBilgileri(sarkiAd, sanatciAd, albumAd, tur, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
        public ArrayList<SarkiBilgileri> ispanyaTabloSarkilariGetir() {

        ArrayList<SarkiBilgileri> cikti = new ArrayList<SarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and sanatci.ulkeId=4 ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new SarkiBilgileri(sarkiAd, sanatciAd, albumAd, tur, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
          public ArrayList<SarkiBilgileri> trTabloSarkilariGetir() {

        ArrayList<SarkiBilgileri> cikti = new ArrayList<SarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and sanatci.ulkeId=1 ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new SarkiBilgileri(sarkiAd, sanatciAd, albumAd, tur, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
              public ArrayList<SarkiBilgileri> popTabloSarkilariGetir() {

        ArrayList<SarkiBilgileri> cikti = new ArrayList<SarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and tur.turId=1 ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new SarkiBilgileri(sarkiAd, sanatciAd, albumAd, tur, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
                      public ArrayList<SarkiBilgileri> jazzTabloSarkilariGetir() {

        ArrayList<SarkiBilgileri> cikti = new ArrayList<SarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and tur.turId=2 ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new SarkiBilgileri(sarkiAd, sanatciAd, albumAd, tur, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
                                 public ArrayList<SarkiBilgileri> klasikTabloSarkilariGetir() {

        ArrayList<SarkiBilgileri> cikti = new ArrayList<SarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId and tur.turId=3 ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new SarkiBilgileri(sarkiAd, sanatciAd, albumAd, tur, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    public ArrayList<SanatciBilgileri> sanatcilariGetir() {

        ArrayList<SanatciBilgileri> cikti = new ArrayList<SanatciBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sanatci.sanatciAd,ulkeler.ulke from sanatci,ulkeler where sanatci.ulkeId=ulkeler.ulkeId";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String ulke = rs.getString("ulkeler.ulke");

                cikti.add(new SanatciBilgileri(sanatciAd, ulke));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public SarkiIslemleri() {

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

    ArrayList<AdminIcinSarkiBilgileri> adminIcınSarkilariGetir() {
        ArrayList<AdminIcinSarkiBilgileri> cikti = new ArrayList<AdminIcinSarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select sarki.sarkiAd,sarki.tarih,sanatci.sanatciAd,album.albumAd,tur.turAd,sarki.sure,sarki.dinlenmeSayisi from sarki,sanatci,album,tur where sarki.albumId=album.albumId and sarki.sanatciId=sanatci.sanatciId and sarki.turId=tur.turId  ORDER by sarki.dinlenmeSayisi desc";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");
                String sure = rs.getString("sarki.sure");
                String tarih = rs.getString("sarki.tarih");
                int dinlenmeSayisi = rs.getInt("sarki.dinlenmeSayisi");
                cikti.add(new AdminIcinSarkiBilgileri(sarkiAd, tarih, sanatciAd, albumAd, tur, sure, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ArrayList<AdminIcinSarkiBilgileri> albumleriGetir() {
        ArrayList<AdminIcinSarkiBilgileri> cikti = new ArrayList<AdminIcinSarkiBilgileri>();
        try {
            statement = con.createStatement();
            String sorgu8 = "select album.albumAd,sanatci.sanatciAd,sarki.sarkiAd,sarki.tarih,tur.turAd from sarki,sanatci,album,tur where sarki.sarkiId=album.sarkiId and sarki.albumId=album.albumId and album.sanatciId=sanatci.sanatciId and album.turId=tur.turId and sarki.turId=tur.turId and sarki.sanatciId=sanatci.sanatciId";

            ResultSet rs = statement.executeQuery(sorgu8);
            while (rs.next()) {

                String sarkiAd = rs.getString("sarki.sarkiAd");
                String sanatciAd = rs.getString("sanatci.sanatciAd");
                String albumAd = rs.getString("album.albumAd");
                String tur = rs.getString("tur.turAd");

                String tarih = rs.getString("sarki.tarih");

                cikti.add(new AdminIcinSarkiBilgileri(albumAd, sanatciAd, sarkiAd, tarih, tur));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(SarkiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
