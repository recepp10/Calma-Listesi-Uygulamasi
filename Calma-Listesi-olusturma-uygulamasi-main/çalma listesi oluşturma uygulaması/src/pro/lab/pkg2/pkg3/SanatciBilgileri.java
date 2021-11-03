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
public class SanatciBilgileri {
    private String sanatciAd;
    private String ulke;

    public SanatciBilgileri(String sanatciAd, String ulke) {
        this.sanatciAd = sanatciAd;
        this.ulke = ulke;
    }

    public String getSanatciAd() {
        return sanatciAd;
    }

    public void setSanatciAd(String sanatciAd) {
        this.sanatciAd = sanatciAd;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }
   
}
