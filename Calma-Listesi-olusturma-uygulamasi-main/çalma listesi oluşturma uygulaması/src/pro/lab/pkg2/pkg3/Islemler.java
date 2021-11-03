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

public class Islemler {

    private Connection con = null;

    private Statement statement = null;
    public PreparedStatement preparedStatement = null;

    public Islemler() {
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

    Database database = new Database();

    public void kullaniciEkle(String kullaniciAdi, String email, String sifre, String abonelikTuru, String ulke, String odendi) {
        String sorgu = "Insert Into kullanici (kullaniciAd,email,sifre,abonelikTuru,ulke,odendi) VALUES(?,?,?,?,?,?)";

        try {

            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, sifre);
            preparedStatement.setString(4, abonelikTuru);
            preparedStatement.setString(5, ulke);
            preparedStatement.setString(6, odendi);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        kullaniciIcinOtomatikCalmaListesiOlustur(kullaniciAdi, sifre);
    }

    public void kullaniciIcinOtomatikCalmaListesiOlustur(String kullaniciAdi, String sifre) {

        String sorgu2 = " CREATE TABLE " + kullaniciAdi + sifre + "Pop( turId INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY, sarkiAd TEXT NOT NULL,sanatci TEXT NOT NULL, album TEXT,dinlenmeSayisi INT(10),tur Text)";
        System.out.println(sorgu2);
        try {

            preparedStatement = con.prepareStatement(sorgu2);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sorgu3 = " CREATE TABLE " + kullaniciAdi + sifre + "Jazz( turId INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY, sarkiAd TEXT NOT NULL,sanatci TEXT NOT NULL, album TEXT,dinlenmeSayisi INT(10),tur Text)";

        try {

            preparedStatement = con.prepareStatement(sorgu3);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sorgu4 = " CREATE TABLE " + kullaniciAdi + sifre + "Klasik( turId INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY, sarkiAd TEXT NOT NULL,sanatci TEXT NOT NULL, album TEXT,dinlenmeSayisi INT(10),tur Text)";

        try {

            preparedStatement = con.prepareStatement(sorgu4);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean girisYap(String kullaniciAd, String parola) {
        String sorgu = "select * from kullanici where kullaniciAd=? and sifre = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAd);
            preparedStatement.setString(2, parola);
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public void kullaniciyaAnaSayfadanSarkiEkle(String kullaniciAdi, String sifre, String sarkiAdi, String sanatci, String album, String tur) {

        if (tur.equals("pop") || tur.equals("Pop")) {
            String sorgu2 = "select * from " + kullaniciAdi + sifre + "pop where sarkiAd=? and sanatci = ?";

            try {

                preparedStatement = con.prepareStatement(sorgu2);

                preparedStatement.setString(1, sarkiAdi);
                preparedStatement.setString(2, sanatci);

                ResultSet rs = preparedStatement.executeQuery();
                if (rs.next()) {
                    System.out.println("ekleme başarısız");
                } else {
                    sarkiEkle(kullaniciAdi, sifre, sarkiAdi, sanatci, album, tur);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (tur.equals("jazz") || tur.equals("Jazz")) {
            String sorgu2 = "select * from " + kullaniciAdi + sifre + "jazz where sarkiAd=? and sanatci = ?";

            try {

                preparedStatement = con.prepareStatement(sorgu2);

                preparedStatement.setString(1, sarkiAdi);
                preparedStatement.setString(2, sanatci);

                ResultSet rs = preparedStatement.executeQuery();
                if (rs.next()) {
                    System.out.println("ekleme başarısız");
                } else {
                    sarkiEkle(kullaniciAdi, sifre, sarkiAdi, sanatci, album, tur);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (tur.equals("Klasik") || tur.equals("klasik")) {
            String sorgu2 = "select * from " + kullaniciAdi + sifre + "klasik where sarkiAd=? and sanatci = ?";

            try {

                preparedStatement = con.prepareStatement(sorgu2);

                preparedStatement.setString(1, sarkiAdi);
                preparedStatement.setString(2, sanatci);

                ResultSet rs = preparedStatement.executeQuery();
                if (rs.next()) {
                    System.out.println("ekleme başarısız");
                } else {
                    sarkiEkle(kullaniciAdi, sifre, sarkiAdi, sanatci, album, tur);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void sarkiEkle(String kullaniciAdi, String sifre, String sarkiAdi, String sanatci, String album, String tur) {

        if (tur.equals("pop") || tur.equals("Pop")) {
            String sorgu = "INSERT INTO " + kullaniciAdi + sifre + "pop (sarkiAd,sanatci,album,dinlenmeSayisi,tur)\n"
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
            String sorgu = "INSERT INTO " + kullaniciAdi + sifre + "jazz (sarkiAd,sanatci,album,dinlenmeSayisi,tur)\n"
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
            String sorgu = "INSERT INTO " + kullaniciAdi + sifre + "klasik (sarkiAd,sanatci,album,dinlenmeSayisi,tur)\n"
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

}
