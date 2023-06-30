package method;
import java.util.Scanner;
public class ders_method_03 {
    public static void main(String[] args) {

        Scanner tara=new Scanner(System.in);
        System.out.println("10 dan kucuk 2 adet pozitif tam sayi giriniz");

        int sayi1=tara.nextInt();
        int sayi2=tara.nextInt();

        int sonuc= ders_method_02_faktoryel.faktoryelHesapla(sayi1)
                + ders_method_02_faktoryel.faktoryelHesapla(sayi2);
        System.out.println(sonuc);
    }
}
