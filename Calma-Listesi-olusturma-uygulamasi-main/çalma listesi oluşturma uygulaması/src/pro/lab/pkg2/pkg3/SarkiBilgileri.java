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
public class SarkiBilgileri {

    private String sarkiAd;
    private String sanatciAd;
    private String albumAd;
    private String tur;
    private int dinlenmeSayisi;
    private String tarih;

    public SarkiBilgileri(String sarkiAd, String sanatciAd, String albumAd, String tur, int dinlenmeSayisi) {

        this.sarkiAd = sarkiAd;
        this.sanatciAd = sanatciAd;
        this.albumAd = albumAd;
        this.tur = tur;
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

    public String getSarkiAd() {
        return sarkiAd;
    }

    public void setSarkiAd(String sarkiAd) {
        this.sarkiAd = sarkiAd;
    }

    public String getSanatciAd() {
        return sanatciAd;
    }

    public void setSanatciAd(String sanatciAd) {
        this.sanatciAd = sanatciAd;
    }

    public String getAlbumAd() {
        return albumAd;
    }

    public void setAlbumAd(String albumAd) {
        this.albumAd = albumAd;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getDinlenmeSayisi() {
        return dinlenmeSayisi;
    }

    public void setDinlenmeSayisi(int dinlenmeSayisi) {
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

}
