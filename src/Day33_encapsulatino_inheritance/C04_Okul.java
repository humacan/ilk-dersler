package Day33_encapsulatino_inheritance;
public class C04_Okul {
    String okuladi="Yildiz Koleji";
    int ogrencisayisi=234;
    String okuladresi="Ankara";
    /*
    bazi dveloperlar erisim yetkisini sinirlamak icin degil
    yapilan ise vurgu olmasi icin getter ve setter
    kullaniabilir

    bu uygulamanin tek artisi yapilan isleme vurgu yapmasidir
     */

    public String getOkuladi() {
        return okuladi;
    }

    public void setOkuladi(String okuladi) {
        this.okuladi = okuladi;
    }

    public int getOgrencisayisi() {
        return ogrencisayisi;
    }

    public void setOgrencisayisi(int ogrencisayisi) {
        this.ogrencisayisi = ogrencisayisi;
    }
}
