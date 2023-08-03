package _baslangic_dersler;
import java.util.Scanner;
public class ders02a_Rakamlar_toplami {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int toplam=0;
        System.out.println("Bir sayi Giriniz");
        int sayi=scan.nextInt();            // 123 girildi diyelim

       int rakam=sayi%10;             // modulus 3
       toplam=rakam;                  // modulusu toplama ekledik-3

       sayi=sayi/10;       // 123 sayisini 10 a bolduk >>12,3
       int onlar=sayi%10;          // ve onun modulusunu aldik >>2

       toplam+= onlar;      // 3 du 2 eklendi 5 oldu

       int yuzler=sayi/10; // sayiyi 10 a bolup

       toplam+= yuzler;   // 5 di 1 eklendi 6 oldu
        System.out.println(toplam);
    }
}
