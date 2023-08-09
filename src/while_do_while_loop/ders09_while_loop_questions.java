package while_do_while_loop;                  // cevaplari alana kdr donmeye devam eden emeklilik hesaplama
import java.util.Scanner;
public class ders09_while_loop_questions {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        int yas = skan.nextInt();

        while (yas < 18 || yas > 80) {
            System.out.println("Gecerli bir yas giriniz" + "\nyas 18 den buyuk 80 den kucuk olmali");
            yas = skan.nextInt();
        }
        System.out.println("Cinsiyet giriniz"+ "\nErkek icin E veya e, Kadin icin K veya k");
        char cinsiyet = skan.next().charAt(0);
        while (cinsiyet != 'e' || cinsiyet != 'E' || cinsiyet != 'k' || cinsiyet != 'K') { // uzun while sartlari


            if (cinsiyet == 'e' || cinsiyet == 'E') {
                if (yas >= 65) {
                    System.out.println("Emekli olabilirsiniz");
                } else {
                    System.out.println("Emekli olabilmek icin " + (65 - yas) + " sene gerekir");
                }break;   // erkek icin sorulacak dogru soru sonrasi  donguyu durdur
            } else if (cinsiyet == 'k' || cinsiyet == 'K') {
                if (yas >= 60) {
                    System.out.println("Emekli olabilirsiniz");
                } else {
                    System.out.println("Emekli olabilmek icin " + (60 - yas) + " sene gerekir");
                }break;
            } else {  // kadin icin sorulacak dogru soru sonrasi  donguyu durdur
                System.out.println("yanlis karakter girdiniz tekrar deneyiniz");

            }cinsiyet = skan.next().charAt(0); // eger kadin veya erkek icin dogru karakter girilmezse tekrar sormasi icin
        }
    }
}