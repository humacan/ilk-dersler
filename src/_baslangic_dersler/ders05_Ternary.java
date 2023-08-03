package _baslangic_dersler;

import java.util.Scanner;

public class ders05_Ternary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        int sayi = scn.nextInt();

        System.out.println(sayi%2==0  ? "cift sayidir" : "Tek sayidir");
        //  Ternary Operator if e alternatif kullanilir kolay ve basittir


        int sayi1 = 20;
        sayi1= sayi1>0 ? 30 : sayi1*(-1); // if e alternatif olarak kullandik
        System.out.println(sayi1);

        char harf ='m';
        System.out.println(harf>='a' && harf<'z'        // a dan z ye
                          ? Character.toUpperCase(harf) // harfi buyuk yap
                          : harf);
        int a=7;
        int b=11;
        System.out.println(a>b? b : a); // a b den buyukse b yi degilse a yi yazdir
        System.out.println(a>20? a*a : ++a);  // a yi artirarak yazdir - 8
        System.out.println(a>20? a*a : a++);  // a yi yazdir sonrasinda arttir -8
                                                // sonrasinda - 9
        System.out.println(a<100 || a<0? 3*a+1 : 2+a/5);  // ilk sarti sagladigi icin
                                                        // a ya ilk islem yapildi
    }
}
