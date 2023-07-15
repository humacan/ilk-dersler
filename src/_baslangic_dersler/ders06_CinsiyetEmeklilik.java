//..........CINSIYET BAZ ALINARAK YAPILAN EMEKLILIK HESAPLAMASI.....
package _baslangic_dersler;
import java.util.Scanner;
public class ders06_CinsiyetEmeklilik {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        double yas = tara.nextDouble();         // yas girisi icin
             
        System.out.println("Lutfen cinsiyetinizi giriniz" +
                "\nKadin icin : K, Erkek icin : E giriniz");

        char cinsiyet = tara.next().charAt(0);      // cinsiyet girisi icin

            if (cinsiyet == 'k' || cinsiyet == 'K') {

                if (yas < 16 || yas > 80) {
                    System.out.println("Gecersiz yas girisi, tekrar deneyiniz");

                } else if (yas < 60) {
                    System.out.println("Emekli olmak icin daha " + (60 - yas) + " calismalisin");
                } else {
                    System.out.println("Emekli olabilirsiniz");
                }

            }

            else if (cinsiyet == 'e' || cinsiyet == 'E') {
                    if (yas < 16 || yas > 80) {
                        System.out.println("Gecersiz yas girisi, tekrar deneyiniz");
                    } else if (yas < 65) {
                        System.out.println("Emekli olmak icin daha " + (65 - yas) + " calismalisin");
                    } else {
                        System.out.println("Emekli olabilirsiniz");
                    }
                } else {
                    System.out.println("Gecersiz cinsiyet girisi. Lutfen yeniden deneyiniz");

                }


    }
}