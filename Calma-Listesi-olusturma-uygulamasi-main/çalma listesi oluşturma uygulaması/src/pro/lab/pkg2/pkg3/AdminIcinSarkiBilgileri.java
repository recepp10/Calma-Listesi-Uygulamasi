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
public class AdminIcinSarkiBilgileri {

    private String sarkiAd;
    private String tarih;
    private String sanatci;
    private String album;
    private String tur;
    private String sure;
    private int dinlenmeSayisi;

    public AdminIcinSarkiBilgileri(String album,String sanatci,String sarkiAd , String tarih  ,String tur) {
        this.sarkiAd = sarkiAd;
        this.tarih = tarih;
        this.sanatci = sanatci;
        this.album = album;
        this.tur = tur;
    }

    public AdminIcinSarkiBilgileri(String sarkiAd, String tarih, String sanatci, String album, String tur, String sure, int dinlenmeSayisi) {
        this.sarkiAd = sarkiAd;
        this.tarih = tarih;
        this.sanatci = sanatci;
        this.album = album;
        this.tur = tur;
        this.sure = sure;
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

 

    public String getSarkiAd() {
        return sarkiAd;
    }

    public void setSarkiAd(String sarkiAd) {
        this.sarkiAd = sarkiAd;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSanatci() {
        return sanatci;
    }

    public void setSanatci(String sanatci) {
        this.sanatci = sanatci;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public int getDinlenmeSayisi() {
        return dinlenmeSayisi;
    }

    public void setDinlenmeSayisi(int dinlenmeSayisi) {
        this.dinlenmeSayisi = dinlenmeSayisi;
    }
    
}
