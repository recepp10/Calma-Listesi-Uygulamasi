/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.lab.pkg2.pkg3;

/**
 *
 * @author furka
 */
public class KullaniciBilgileri {

    private String kullaniciAd;
    private String email;
    private String sifre;
    private String abonelikTuru;
    private String ulke;
    private String odendi;

    public KullaniciBilgileri(String kullaniciAd, String email, String abonelikTuru, String ulke, String odendi) {
        this.kullaniciAd = kullaniciAd;
        this.email = email;
        this.abonelikTuru = abonelikTuru;
        this.ulke = ulke;
        this.odendi = odendi;
    }

    public KullaniciBilgileri(String kullaniciAd, String email,  String abonelikTuru, String ulke, String odendi,String sifre) {
        this.kullaniciAd = kullaniciAd;
        this.email = email;
        
        this.abonelikTuru = abonelikTuru;
        this.ulke = ulke;
        this.odendi = odendi;
        this.sifre = sifre;
    }

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAbonelikTuru() {
        return abonelikTuru;
    }

    public void setAbonelikTuru(String abonelikTuru) {
        this.abonelikTuru = abonelikTuru;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getOdendi() {
        return odendi;
    }

    public void setOdendi(String odendi) {
        this.odendi = odendi;
    }
}
