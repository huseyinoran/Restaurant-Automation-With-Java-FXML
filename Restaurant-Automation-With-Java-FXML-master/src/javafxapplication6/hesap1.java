package javafxapplication6;
import javafxapplication6.*;
import javafx.beans.property.*;
public class hesap1 {
    private String tur,isim;
    public int adet;
    public double fiyat,hesap,toplam=0;
    public hesap1(String tur, String isim, int adet,double fiyat,double hesap)
            {
                this.tur = tur;
                this.isim = isim;
                this.fiyat = fiyat;
                this.adet = adet;
                this.hesap = hesap;
            }
    public void hesap1() {
    }
    public String getTur() {
        return tur;
    }
    public void setTur(String tur) {
        this.tur = tur;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getAdet() {
        return adet;
    }
    public void setAdet(int adet) {
        this.adet = adet;
    }
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    public double getHesap() {
        return hesap;
    }
    public void setHesap(double hesap) {
        this.hesap = hesap;
    }
    public double getToplam() {
        return toplam;
    }
    public void setToplam(double toplam) {
        this.toplam = toplam;
    }
}
