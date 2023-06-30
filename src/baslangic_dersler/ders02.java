package baslangic_dersler;
import java.util.Scanner;
public class ders02 {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    System.out.println("3 basamakli bir sayi giriniz");

    int sayi = scn.nextInt();   // sayi girdisi ===> 156 girdik diyelim

    int rakam = sayi % 10;      //  girilen sayinin modulusunu al ==> 6

    int rakamlarToplami= rakam; // rakami rakamlar toplamina al   ==> 6
    //
    sayi = sayi / 10;            // 15.6 ==> 15

    rakam = sayi % 10;           // 15 in modulusu ==> 5

    rakamlarToplami = rakamlarToplami + rakam;  // rakamlar toplamini, rakamlar
                                     // toplami ve rakam olarak guncelle ==> 5+6=11
    //
    sayi = sayi / 10;            // 1.5 ==> 1

    rakam = sayi % 10;           // 1 in modulusu ==>1

    rakamlarToplami = rakamlarToplami + rakam;  // rakamlar toplamini ikinci kez
                                                // ayni islemle guncelle ==>1+5+6=12
    System.out.println(rakamlarToplami);
    }

}
