package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class der07_kullanicidanDegerAlarakArrayOlustur {
    public static void main(String[] args) {

        Scanner tara=new Scanner(System.in);
        int girilenSayi=1;  // while dongusu baslamasi icin 0 harici bir rakam girdik
        int[] arr = new int[0]; // [0]

        while (girilenSayi!=0){   //0 tusuna basildiginda dongu duracak
            System.out.println("Arraye eklemek icin pozitif tam sayi giriniz"+
                                 "\nislemi bitirmek icin 0'a basiniz");
            girilenSayi=tara.nextInt();
            if (girilenSayi!=0){
                arr=ders06_Array_Eleman_method.arrayelementEkle(arr,girilenSayi);   // ders06 da olusturulan methodu cagirdik
            } // bir onceki dersteki methodu arr elementine atadik
        }
        System.out.println(Arrays.toString(arr));
    }
}
