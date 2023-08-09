package __Squestions;
import Day19_StaticKeyword_passByValue._static;
import java.util.Scanner;
public class ATM {
    static String sifre;
    public static void main(String[] args) {
        sifregir();
        islemler();
        /*ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali, */}
    public static void sifregir(){
        Scanner in=new Scanner(System.in);
        String kartnohane="0000000000000000";
        String kartnohane2="0000 0000 0000 0000";
        String sifreKontrl="000000";

        String kartno="";
        boolean sart=true;
        while (sart){
            System.out.println("16 haneli kart No giriniz");
             kartno= in.nextLine();
            if (kartno.length()==kartnohane.length() || kartno.length()==kartnohane2.length() ){
                System.out.println("karthane  girildi");
                sart=false;
            }else {
                sart=true;
            }
        }
        boolean flag=true;
        while (flag){
            System.out.println("6 haneli Sifre Giriniz");
            sifre=in.nextLine();
            if (sifre.length()==sifreKontrl.length()){
                System.out.println("sifre olusturuldu");

                flag=false;
            }else {
                flag=true;
            }
        }
        System.out.println("-----islem basarili-----");
    }
    public static void islemler(){
        Scanner input=new Scanner(System.in);
        int bakiye=0;
        while (true){
            System.out.println("======Banka Uygulamasina hosgeldiniz======");
            System.out.println("1. Bakiye Sorgulama" +
                    "\n2. Para Yatirma" +
                    "\n3. Para Cekme" +
                    "\n4. Para Gonderme" +
                    "\n5. Sifre degistirme" +
                    "\n0. Cikis" +
                    "\nSeciminizi yapiniz...");

            int secim=input.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Bakiyeniz: "+ bakiye+ " TL");
                    break;
                case 2:
                    System.out.println("Yatirmak istediginiz miktari giriniz");
                    int yatirilanMiktar=input.nextInt();
                    bakiye+=yatirilanMiktar;
                    System.out.println(yatirilanMiktar+ " TL " + "yatirildi. Guncel Bakiyeniz: "+ bakiye+ " TL" );
                    break;
                case 3:
                    System.out.println("Cekmek istediginiz miktari giriniz");
                    int cekilenMiktar=input.nextInt();
                    if (cekilenMiktar>bakiye) {
                        System.out.println("Yetersiz bakiye tekrar deneyiniz");
                        break;
                    }
                    if (cekilenMiktar<=bakiye){
                        bakiye-=cekilenMiktar;
                        System.out.println(cekilenMiktar+ " TL cekildi. Guncel bakiyeniz: "+ bakiye+ " TL");
                        break;
                    }
                case 4:
                    String ibanktrol="1234567890123456789011111111";
                    System.out.println("Iban numaranizi giriniz");
                    String iban=input.nextLine();


                        if(iban.startsWith("TR") && iban.length()==ibanktrol.length()) {


                            System.out.println("Gondermek istediginiz miktari giriniz");
                            int gonderim = input.nextInt();
                            if (gonderim > bakiye) {
                                System.out.println("bakiyeniz karsilamiyor tekrar deneyiniz");
                            }
                            if (gonderim <= bakiye) {
                                System.out.println(gonderim + "gonderildi kalani bakiye : " + (bakiye - gonderim));

                                break;
                            }

                        }else {
                            System.out.println("Iban yanlis girildi tekar giriniz");

                        }

                    break;
                case 5:
                    sifredegistir();
                    break;

                case 6:
                    System.out.println("Banka Uygulamasindan cikiliyor...");
                    System.exit(0);
                default:
                    System.out.println("Gecersiz secim. Tekrar deneyiniz");
                    break;
    }
}
    }
    public static void sifredegistir(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen gecerli sifrenizi giriniz... ");
        String parola=input.nextLine();

        boolean flag=true;
        while (flag){
            if (parola.equals(sifre)) {
                System.out.println("6 haneli yeni bir sifre giriniz");
                sifre=input.nextLine();
                System.out.println("sifre olusturma basarili");
                flag=false;
            }else{
                System.out.println("sifreyi yanlis girdiniz tekrar deneyiniz");
                flag=false;
            }
        }

    }

}