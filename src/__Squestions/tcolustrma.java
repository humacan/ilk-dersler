package __Squestions;
public class tcolustrma {
    /*    TC kimlik no 11 haneli rakamlardan oluşur.
    İlk rakam sıfır (0) olamaz.
    1, 3, 5, 7 ve 9. hanelerin toplamının 7 katı ile 2, 4, 6 ve 8. hanelerin toplamı çıkartılır,
    sonucun 10'a bölümünden kalanı 10. haneyi verir.
    İlk 10 hanenin toplamının 10'a bölümünden kalan, son haneyi verir.     */
    public static void main(String[] args) {
        String tcNo = "";
        System.out.println(tcNoOlusturma());
        tcKontrol(tcNoOlusturma());
    }
    public static String tcNoOlusturma (){
        int[] arr = new int[11];
        boolean flag = true;
        while (flag){//ilk harf
            int eleman = (int)(Math.random()*10);// 0 ile 9 arasinda rakam alıyoruz
            if (eleman != 0){// İlk rakam sıfır (0) olamaz.
                arr[0] = eleman;
                flag = false;
            }
        }
        /*  TC kimlik no 11 haneli rakamlardan oluşur.
        İlk rakam sıfır (0) olamaz.
        1, 3, 5, 7 ve 9. hanelerin toplamının 7 katı ile 2, 4, 6 ve 8. hanelerin toplamı çıkartılır,
        sonucun 10'a bölümünden kalanı 10. haneyi verir.
        İlk 10 hanenin toplamının 10'a bölümünden kalan, son haneyi verir.  */
        for (int i = 1; i <9 ; i++) {//
            int eleman = (int) (Math.random() * 10);//Tc numarasinin 9. hanesine kadar (9 dahil) rakamlarini aldik
            arr[i] = eleman;
        }
        int tekHanelerinToplami = 0;
        for (int i = 0; i < 9; i += 2) {//0 2 4 6 8 indexlerin karsılıgi ---> 1, 3, 5, 7 ve 9. haneler
            tekHanelerinToplami += arr[i];
        }
        int ciftHanelerinToplami = 0;
        for (int i = 1; i < 8 ; i += 2) {// 1 3 5 7 indexlerin karsılıgı ---> 2, 4, 6 ve 8. haneler
            ciftHanelerinToplami += arr[i];
        }/*   1, 3, 5, 7 ve 9. hanelerin toplamının 7 katı ile 2, 4, 6 ve 8. hanelerin toplamı çıkartılır,
        sonucun 10'a bölümünden kalanı 10. haneyi verir.   */
        int sonuc = (tekHanelerinToplami * 7) - ciftHanelerinToplami;
        arr[9] = sonuc % 10;
        //İlk 10 hanenin toplamının 10'a bölümünden kalan, son haneyi verir.
        int sonToplam = 0;
        for (int i = 0; i <10 ; i++) {
            sonToplam += arr[i];
        }
        arr[10] = sonToplam % 10;
        String tcNo= "";
        for (int i = 0; i <arr.length ; i++) {
            tcNo += arr[i];
        }
        return tcNo;
    }
    public static void tcKontrol (String tc){
        String[] arr1 = tc.split("");//String olan tc numarasini String bir array'e atadık
        int[] sayisalTc = new int[arr1.length];//Sayısal verilerle işlem yapacagımız icin int array olusturmamız gerek
        for (int i = 0; i < sayisalTc.length ; i++) {
            sayisalTc[i] = Integer.parseInt(arr1[i]);//String olan array'in icindeki elemanlar da string oldugu icin
            //int olan array'e atayabilmek icin sayısal türe cevirmemiz gerekli
        }
        /* TC kimlik no 11 haneli rakamlardan oluşur.
        İlk rakam sıfır (0) olamaz.
        1, 3, 5, 7 ve 9. hanelerin toplamının 7 katı ile 2, 4, 6 ve 8. hanelerin toplamı çıkartılır,
        sonucun 10'a bölümünden kalanı 10. haneyi verir.
        İlk 10 hanenin toplamının 10'a bölümünden kalan, son haneyi verir.  */
        int toplamVeriTekHaneler = 0;
        for (int i = 0; i < 9 ; i += 2) {//0 2 4 6 8 index --->  1, 3, 5, 7 ve 9. haneler
            toplamVeriTekHaneler += sayisalTc[i];
        }
        int toplamVeriCiftHaneler = 0;
        for (int i = 1; i < 9 ; i += 2) {//1 3 5 7 index ---> 2, 4, 6 ve 8. haneler
            toplamVeriCiftHaneler += sayisalTc[i];
        }
        int onuncuHane = ((toplamVeriTekHaneler * 7) - toplamVeriCiftHaneler) % 10;
        int ilkOnHaneToplam = 0;
        for (int i = 0; i <10 ; i++) {
            ilkOnHaneToplam += sayisalTc[i];
        }
        int sonHane = ilkOnHaneToplam % 10;
         /* TC kimlik no 11 haneli rakamlardan oluşur.
        İlk rakam sıfır (0) olamaz.
        1, 3, 5, 7 ve 9. hanelerin toplamının 7 katı ile 2, 4, 6 ve 8. hanelerin toplamı çıkartılır,
        sonucun 10'a bölümünden kalanı 10. haneyi verir.
        İlk 10 hanenin toplamının 10'a bölümünden kalan, son haneyi verir.      */
        if (sayisalTc.length != 11){
            System.out.println("Tc numarasi 11 haneli olmalidir!");
        }
        if (sayisalTc[0] == 0){
            System.out.println("İlk hane 0 olamaz");
        }
        if (onuncuHane != sayisalTc[9]){
            System.out.println("10. hane şartına uymuyor");
        }
        if (sonHane != sayisalTc[10]){
            System.out.println("Son hane şartı hatali");
        }if (sayisalTc.length == 11 && sayisalTc[0] != 0 && onuncuHane == sayisalTc[9] && sonHane == sayisalTc[10]){
            System.out.println("Gecerli TC numarasi");
        }
    }
}
