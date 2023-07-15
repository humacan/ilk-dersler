//..........TERNARY OPERATOR (?)-----IF'E ALTERNATIF OLARAK KULLANILIR ...........

package _baslangic_dersler;
import java.util.Scanner;
public class ders08_Ternary {
    public static void main(String[] args) {

        Scanner tara=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi =tara.nextInt();

        if (sayi%2==0) {                          // hem if hem de ternary ayni "body" de kullanilmistir karsilastirma icin
            System.out.println("cif sayidir");
        }else{
            System.out.println("Tek sayidir");
        }
        System.out.println(sayi%2==0 ? "cift sayi bu ": "Tek sayi kardes" ); // TERNARY SADECE ATAMA VE PRINT CIKTISI
                                                                            //ILE KULLANILIR...

    }
}
