package _baslangic_dersler;
import java.util.Scanner;
public class ders03_not_hesaplama {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        int a = 12;
        int b = 9;
        if (a>b){
            System.out.println("a b'den buyuktur");
        }
        if (a%2==0){
            System.out.println("a cift bir sayidir");
        }
        if (b%3==0){
            System.out.println("b tek bir sayidir");
        }
        boolean sonuc = b*3 > a;
        if (sonuc){
            System.out.println("b a'dan buyuktur");
        }
        System.out.println("lutfen bir sayi giriniz");

        int sayi = scn.nextInt();

        if(sayi%5==0){
            System.out.println("sayi 5 in katidir");
        }
        if(sayi%3==0){
            System.out.println("sayi 3 un katidir");
        }
        System.out.println("notunuzu giriniz");

        double not = scn.nextDouble();
        if (not>=50 && not<=100){
            System.out.println("Tebrikler sinifi gectiniz");
        }
        else{
            System.out.println("Maalesef kaldiniz");
        }
        System.out.println("yasinizi giriniz");
        double yas = scn.nextDouble();

        if (yas>=65){
            System.out.println("emekli olabilirsiniz");
        }
        else{
            System.out.println("Emeklilik icin " + (65-yas)+ " yil daha gerekiyor");
        }
        System.out.println("bir karakter giriniz");
        char krk = scn.next().charAt(0);

        if ('A'<=krk && krk<='Z'){
            System.out.println("karakter buyuk harf");
        }
        else{
            System.out.println("karakter kucuk harf");
        }
    }

}
