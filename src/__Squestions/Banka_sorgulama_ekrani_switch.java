package __Squestions;
import java.util.Scanner;
public class Banka_sorgulama_ekrani_switch {
 public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int bakiye=0;
    while (true){
            System.out.println("Banka Uygulamasina hosgeldiniz");
            System.out.println("1. Bakiye Sorgulama");
            System.out.println("2. Para Yatirma");
            System.out.println("3. Para Cekme");
            System.out.println("4. Cikis");
            System.out.println("Seciminizi yapiniz");
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
                    if (cekilenMiktar>bakiye) System.out.println("Yetersiz bakiye tekrar deneyiniz");

                   if (cekilenMiktar<=bakiye){
                         bakiye-=cekilenMiktar;
                        System.out.println(cekilenMiktar+ " TL cekildi. Guncel bakiyeniz: "+ bakiye+ " TL");
                        break;
                    }
                case 4:
                    System.out.println("Banka Uygulamasindan cikiliyor...");
                    System.exit(0);
                default:
                    System.out.println("Gecersiz secim. Tekrar deneyiniz");
                    break;
            }
        }
    }
}
