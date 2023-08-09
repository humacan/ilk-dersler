package while_do_while_loop;
import java.util.Scanner;
public class ders00_while {
    public static void main(String[] args) {

        int sifre=12345;
        int tahmin=0;
        int tekrar=1;

        Scanner tara=new Scanner(System.in);
        System.out.println("Sifreyi giriniz");
        while (tekrar<4){  //alternatif (tekrar!=4)  // sifre tekrari 4'e ulasana dek islemi tekrarla
            tahmin= tara.nextInt();
            if (sifre==tahmin){
                System.out.println("Sifre basarili");
            }else {
                System.out.println("Tekrar deneyiniz "+ (3-tekrar) +" tahmin hakkiniz kaldi ");
                tekrar++;
            }
        }System.out.println("Sistem bloke oldu!!! "+ "\n"+"Lutfen Musteri Hizmetleri ile iletisime geciniz");
    }
}