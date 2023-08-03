package __Squestions;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

        while(true){
     System.out.println("Hesap yapmak istediginiz islem icin tiklayiniz+" +
             "\n1- toplama islemi+" +
             "\n2- cikarma islemi+" +
             "\n3- carpama islemi+" +
             "\n4- bolme islemi+" +
             "\n0- cikis icin ");
     Scanner in=new Scanner(System.in);
     int secim= in.nextInt();
     switch (secim){
         case 1:
             System.out.println("toplama islemi iki deger giriniz");
             System.out.println("ilk sayiyi giriniz");
             int a=in.nextInt();
             System.out.println("ilk sayiyi giriniz");
             int b=in.nextInt();
             System.out.println("toplami islemi "+(a+b));
             break;
         case 2:
             System.out.println("cikarma islemi iki deger giriniz");
             System.out.println("ilk sayiyi giriniz");
             a=in.nextInt();
             System.out.println("ilk sayiyi giriniz");
             b=in.nextInt();
             System.out.println("cikarma islemi "+(a-b));
             break;
         case 3:
             System.out.println("carpma islemi iki deger giriniz");
             System.out.println("ilk sayiyi giriniz");
             a=in.nextInt();
             System.out.println("ilk sayiyi giriniz");
             b=in.nextInt();
             System.out.println("carpma islemi "+(a*b));
             break;
         case 4:
             System.out.println("bolme islemi iki deger giriniz");
             System.out.println("ilk sayiyi giriniz");
             a=in.nextInt();
             System.out.println("ilk sayiyi giriniz");
             b=in.nextInt();
             System.out.println("bolme islemi "+(a/b));
             break;
         case 0:
             System.out.println("gule gule");
             System.exit(0);
         default:
             System.out.println("yanlis girildi");
     }
 }

    }
}
