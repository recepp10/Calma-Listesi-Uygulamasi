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
public class CalmaListeleriBilgileri {

    private String sarkiAd;
    private String sanatciAd;
    private String album;

    private int dinlenmeSayisi;
    private String tur;

    public CalmaListeleriBilgileri(String sarkiAd, String sanatciAd, String album, int dinlenmeSayisi, String tur) {
        this.sarkiAd = sarkiAd;
        this.sanatciAd = sanatciAd;
        this.album = album;
        this.dinlenmeSayisi = dinlenmeSayisi;
        this.tur = tur;
    }

    public CalmaListeleriBilgileri(String sarkiAd, String sanatciAd, String album, int dinlenmeSayisi) {
        this.sarkiAd = sarkiAd;
        this.sanatciAd = sanatciAd;
        this.album = album;
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDinlenmeSayisi() {
        return dinlenmeSayisi;
    }

    public void setDinlenmeSayisi(int dinlenmeSayisi) {
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
    
}
