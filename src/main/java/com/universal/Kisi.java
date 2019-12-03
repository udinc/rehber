package com.universal;

import java.util.ArrayList;

/**
 * @author kcklpt
 *
 */
public class Kisi {
    private int id;
    private String ad;
    private String soy;
    private String Tel;
    
    public static int sayac;

    public Kisi(String ad, String soy, String Tel) {
        sayac++;
        this.id=sayac;
        this.ad = ad;
        this.soy = soy;
        this.Tel = Tel;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoy() {
        return soy;
    }

    public void setSoy(String soy) {
        this.soy = soy;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

 
    public int getid(){
        return id;
    }
    
    
}
