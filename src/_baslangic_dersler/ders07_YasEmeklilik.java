//..........YAS BAZ ALINARAK YAPILAN EMEKLILIK HESAPLAMASI......NESTED STATEMENTS
package _baslangic_dersler;
import java.util.Scanner;
public class ders07_YasEmeklilik {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        double yas = tara.nextDouble();
        System.out.println("Lutfen cinsiyetinizi giriniz..." +
                "\nKadin icin : K, Erkek icin : E giriniz");

        char cinsiyet = tara.next().charAt(0);

        if (yas < 16 || yas > 80) {
            System.out.println("Gecersiz yas girisi");
        } else if (yas<60) {
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("Emekli olmak icin "+ (60-yas)+" yil daha calismalisin");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olmak icin "+ (65-yas)+" yil daha calismalisin");
            }else{
                System.out.println("Gecersiz cinsiyet");
            }
        } else if (yas<65) {
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("Emekli olabilirsiniz");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olmak icin "+ (65-yas)+" yil daha calismalisin");
            }else{
                System.out.println("Gecersiz cinsiyet");
            }
        } else{
            System.out.println("Emekli olabilirisiniz");
        }
    }
}