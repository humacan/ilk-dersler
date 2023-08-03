package method;
import java.util.Scanner;

public class ders_method_05_Polindrom {
    public static void main(String[] args) {
        // metnin palindrome olup olmadigini kontrol ediniz
        Scanner tara=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");

        String metin=tara.nextLine();
        String tersmetin= ders_method_04_stringCevirme.tersineCevirme(metin); // baska bir class tan cagirdik

        if (metin.equals(tersmetin)){
            System.out.println("Girilen metin PALINDROMDUR");
        }else {
            System.out.println("Girilen PALINDROME degildir");
        }
    }
}
