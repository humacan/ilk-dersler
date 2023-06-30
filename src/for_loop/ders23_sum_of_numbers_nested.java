package for_loop;

import java.util.Scanner;

public class ders23_sum_of_numbers_nested {
    public static void main(String[] args) {

        rakamlarToplami();
    }
    public static void rakamlarToplami(){       // rakamlarin fakoryel toplami, method olustruduk
        Scanner tara=new Scanner(System.in);

        System.out.println("Rakamlarinin faktoryel toplanmasini istediginiz bir sayi giriniz");
        int input=tara.nextInt();
        int sum=0;

        for (int i = 1; i <=input; i++)
        {
            sum=sum+i;
            System.out.println(i +" sayisi eklendikten sonra toplam: "+ sum);
        }
        System.out.println();
        System.out.println(input+" rakaminin faktoryel toplami: "+sum);

    }
}
