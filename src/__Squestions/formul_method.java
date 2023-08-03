package __Squestions;

import java.util.Scanner;

public class formul_method {
    public static void main(String[] args) {

        SayiyikendisiyleCarp();
        System.out.println(SayiCarpan(7));
    }
    public static void SayiyikendisiyleCarp(){
        System.out.println("bir sayi giriniz");
        Scanner tara=new Scanner(System.in);

        int sayi=tara.nextInt();

        System.out.println("Verilen sayinin kendisi ile carpimi: "+sayi*sayi);

    }
    public static int SayiCarpan(int sayi){

       sayi*=sayi;
     return sayi;
    }


}
