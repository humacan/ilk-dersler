package method;
import java.util.Scanner;

public class ders_method_01_ana {
    public static void main(String[] args) {

    ikiSayiTopla();             // method main kisminda cagrilmadan calismaz !!!
    ikiSayiTopla();

    }
    public static void ikiSayiTopla(){
        Scanner tara=new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        double sayi1=tara.nextDouble();
        System.out.println("Ikinci bir sayi giriniz");
        double sayi2=tara.nextDouble();
        System.out.println("sayi toplamlari= "+ (sayi1+sayi2));
    }
}
