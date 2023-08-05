package __Squestions;               //ARRAY OLUSTURMA VE EKLEME METHODU (cift method)
import java.util.Arrays;
import java.util.Scanner;
public class arrayelemanekle {

    public static void main(String[] args) {
  //Verilen bir array’e istenen bir elemani ekleyip bize donduren
  // bir method yazin,
  //eski array’e yeni degeri atayin
  System.out.println(Arrays.toString(arrayelamanekle(arrayolustur(), 23)));  // iki methodu ayni satirda bulusturduk
    }
    public static int[] arrayolustur(){   // array olusturma
        System.out.println("array uzunluk giriniz");
        Scanner in=new Scanner(System.in);
        int uzunluk= in.nextInt();
        int[] ar= new int[uzunluk];
        for (int i = 0; i <ar.length ; i++) {
            System.out.println("array icin "+i+". index elemani giriniz");
             ar[i]=in.nextInt();
        }
         return ar;
    }
    public static int[] arrayelamanekle(int[] ar, int sayi){ // olusturulan array in sonuna element ekleyen method
       int[] yeniar=new int[ar.length+1];
        for (int i = 0; i <ar.length ; i++) {
            yeniar[i] = ar[i];
        }
        yeniar[yeniar.length-1]=sayi;
        return yeniar;
    }
}
