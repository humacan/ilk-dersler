package while_do_while_loop;          //
import java.util.Scanner;
public class ders06_do_while_loop {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        int girilen=1;
        int toplam=0;
        int sayiAdedi=0;

//        while (girilen!=0){               // aktiflemek iicin
//            System.out.println("toplamak uzere sayi giriniz"+
//                    "\nbitirmek icin 0'a basiniz ");
//            girilen=tara.nextInt();
//            if (girilen!=0){
//                toplam+=girilen;
//                sayiAdedi++;
//            }
//        }                                 //  ilgili yeri secip "Ctrl+/"  tuslayin

        do{
            System.out.println("toplamak uzere sayi giriniz"+
                    "\nbitirmek icin 0'a basiniz ");
            girilen=tara.nextInt();
            if (girilen!=0){
                toplam+=girilen;
                sayiAdedi++;
            }

        }while ( girilen>0);
        System.out.println("Girilen "+sayiAdedi+ " adet sayinin toplami "+ toplam);
    }
}
