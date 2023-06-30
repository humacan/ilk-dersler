package do_while_loop;              // FAKTORYEL

import java.util.Scanner;

public class ders08 {
    public static void main(String[] args) {

        int fakt=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();

        while (sayi>=1){
            fakt=fakt*sayi;
            System.out.println("Fakt "+ fakt + " sayi "+ sayi);
            sayi--;
        }
        System.out.println("faktoryel " + fakt);
    }
}
