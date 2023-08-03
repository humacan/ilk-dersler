package __Squestions;

import java.util.Scanner;

public class method_hesap_makinasi_if {
    public static void main(String[] args) {

        System.out.println(hesapMakinasi());

    }
    public static double hesapMakinasi( ){

        double islem=0;

        Scanner input=new Scanner(System.in);
        System.out.println("islem icin sembol giriniz: + - / *");
        char sembol=input.next().charAt(0);
        System.out.println("ilk sayiyi giriniz");
        int sayi1=input.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int sayi2=input.nextInt();

        if (sembol=='+'){
            islem=sayi1+sayi2;
        } else if (sembol=='-') {
            islem=sayi1-sayi2;

        } else if (sembol=='*') {
            islem=sayi1*sayi2;

        } else if (sembol=='/') {
            islem=sayi1/sayi2;

        }else {
            System.out.println("yanlis girdiniz");
        }
        return islem;
    }
}
