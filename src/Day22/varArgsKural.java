package Day22;

public class varArgsKural {
    public static void main(String[] args) {
        //kullanici kac tane argument verirse versin
        //ilk element haric diger elementleri toplayip
        //bulunan toplam ilk element ile carpip, sonucu yazdiran bir method olusturalim
        islemYap(3,4,5);   // 27
        islemYap(2,4,7,8,9,1); //58
    }
    public static void islemYap(int ilk, int...kalanlar) {
        int toplam=0;
        for (int x: kalanlar) {
            toplam+=x;
        }
        int sonuc=ilk*toplam;
        System.out.println("Islem sonucu: "+sonuc);
    }
    //Varargs sinirsiz sayida element alabildiginden gelen her elemani alacaktir
    //bu ozelliginden dolayi varargs bir method da  parametre olarak kullanilacaksa  SON PARAMETRE olarak yazilmalidir
    //bu kuralin dogal sonucu olarak bir method da birden fazla varargs parametre olamaz
}
