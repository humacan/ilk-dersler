//..........SWITCH PARAMETRESI --- ELSE IF ALTERNATIFI........
package baslangic_dersler;
import java.util.Scanner;
public class ders09_SwitchParametre {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = tara.next().charAt(0);

        harf = Character.toUpperCase(harf); // GIRILEN CHAR KARAKTERINI BUYUK HARF YAPAR BOYLELIKLE BUYUK VE KUCUK
                                                // KARAKTER ICIN EKSTRA TANIMLAMAYA GEREK KALMAZ
        if (harf == 'P') {
            System.out.println("Pazartesi, Persembe veya Pazar");

        } else if (harf == 'C') {
            System.out.println("Carsamba, Cuma ve Cumartesi");

        } else if (harf == 'S') {
            System.out.println("Sali");

        } else {
            System.out.println("Yanlis girdiniz");
        }
        System.out.println("=============SWITHC KULLANIMI===============");  // switch kullanimi
        switch (harf) {
            case 'S':
                System.out.println("Sali");
                break;
            case 'P':
                System.out.println("Pazartesi, Persembe veya Pazar");
                break;
            case 'C':
                System.out.println("Carsamba, Cuma ve Cumartesi");
                break;
            default:
                System.out.println("Gecersiz harf girdiniz");
        }
    }
}