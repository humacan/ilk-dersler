package do_while_loop;
import java.util.Scanner;
public class ders03_while_loop_scope {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Rakamlari toplanacak bir sayi giriniz");
        int sayiGir=tara.nextInt();

        int sayi=sayiGir;
        int birler=0;
        int rakamToplam=0;



        while (sayi>0){
            birler=sayi%10;             //sayi nin birler basamagi alinir
            rakamToplam+=birler;        // yukaridaki sayi rakmlarToplami na eklenir
            sayi/=10;                   //sayi 10 a bolunur ve 0 degerine ulasana dek yukaridaki
                                        // islemlerden tekrar gecer ve ulasilan her rakam toplama eklenir
        }
        System.out.println("Girilen sayi "+sayiGir  +" nin Rakamlar toplami: "+rakamToplam + " dir" );
        System.out.println( "Girilen rakamlarin toplami: "+ders04_rakamlar_toplami.rakamlarToplami(sayiGir)); // baska bir clas tan
                                                                            // cagirdigimiz for dongusu ile ayni islem
        
    }
}
