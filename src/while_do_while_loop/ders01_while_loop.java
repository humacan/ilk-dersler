package while_do_while_loop;
import java.util.Scanner;

public class ders01_while_loop {
    public static void main(String[] args) {

        Scanner tara =new Scanner(System.in);

        int toplam=0;
        int girilensayiadedi=0;


        while (toplam<500){    // 500 u bulana dek
            System.out.println("Toplama icin bir sayi giriniz");

            int  Sayigir=tara.nextInt();  // sayi girmek icin

            toplam+= Sayigir;  // toplam=toplam+girilenSayi kisa hali girilen sayi 500 ulasana dek toplama ekle
            girilensayiadedi++;     // her girilen sayi girdisi sonras "girilensayiadedi" ne bir ekle
        }
        System.out.println("Toplam "+ girilensayiadedi + " adet sayi girildi ve toplami "+ toplam );

    }

}
