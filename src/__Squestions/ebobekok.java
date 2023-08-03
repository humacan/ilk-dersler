package __Squestions;
import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        // Kullanıcıdan 2 tamsayı alın ve
        // EBOB (En Büyük Ortak Bölen) ve EKOK(En Küçük Ortak Kat) değerlerini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif iki tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int ebob = 0;
        for (int i = 1; i < sayi1 || i < sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        int ekok = ((sayi1*sayi2) / ebob);
        System.out.println("Girilen sayilarin EBOB'u : " + ebob);
        System.out.println("Girilen sayilarin EKOK'u : " + ekok);
    }
}
