package for_loop;
import java.util.Scanner;
public class ders16_for_loop {
    public static void main(String[] args) {
        int bas=2;
        int bit=8;
        int toplam=0;

        if (bit<bas){
                System.out.println("yanlis girdi");
        }else {
            for (int i = bas; i <=bit ; i++) {
                toplam +=i;
            }
            }
        System.out.println(toplam + " ");  // 2 den 8 e  birer birer sayilari toplayarak sonuca ulasir.
        System.out.println("--------------------------------------------------------------------------");
        //-------------------------kullanicidan bsl ve bts degerleri alip bu degerleri toplama islemi------------------
        Scanner tara= new Scanner(System.in);

        System.out.println("basangic icin bir deger girinizi");
        int bsl= tara.nextInt();

        System.out.println("bitis icin bir deger girinizi");
        int bts= tara.nextInt();
        int toplama=0;

        if (bsl<bts){
            for (int i = bsl; i <=bts; i++)         // bsl dan bitise kdr birer arttir
                toplama +=i;
            }else {
                for (int i = bsl; i >=bts; i--) {   // bsl dan bts (bsl dan kucuk olarak) kdr birer eksilt
                    toplama +=i;
            }
        }
        System.out.println("degerler toplami: " + toplama);
    }
}

