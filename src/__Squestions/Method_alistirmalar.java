package __Squestions;
import java.util.Scanner;
public class Method_alistirmalar {
    public static void main(String[] args) {
    // sayinin kendi ile carpimini donduren bir  method olusturun
    // 1-10 arasinda bulunan sayilari sirasiyla yazan bir method olusturun
    // verilen bir ismin index degerini donduren bir method olusturun
    // sayinin asal sayi olup olmadigini yazdiran bir method olusturun
   System.out.println(KendiileCarpim(5));
   Sayidizim();
   System.out.println(" ");
   System.out.println(Isimdeger("mustafa"));
   AsalmiBu();
   Substring();
   Stringyarim();
   System.out.println(Ikisayiarasindakitoplam(7, 13));
   Scanner in=new Scanner(System.in);
   int a=in.nextInt();
   int b=in.nextInt();
   System.out.println("result: "+result(a,b));
    }
    public static String Isimdeger(String isim){
        String index="";

        return index=String.valueOf(isim.length()-1);
    }
    public static void AsalmiBu(){
        System.out.println("Asal sayi kontrolu icin bir sayi giriniz");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        int sayac=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sayac++;
        } }if (sayac==0){
            System.out.println(sayi+" sayisi asal bir sayidir");
        }else {
            System.out.println(sayi+" sayisi asal bir sayi degildir");
        }
    }
    public static int KendiileCarpim(int sayi){
        sayi*=sayi;
     return sayi;
    }
    public static void Sayidizim(){
        int sayi=10;
        for (int i = 1; i <=sayi ; i++) {
            System.out.print(i+" ");

        }
    }
    public static void Substring( ) {
        //  Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters.
        //Test Data: Str1 = " "
        //Sample Output:###

        String yazi="nasilsiniz";
        String sonuc="";
          sonuc+= (yazi.length()>=3 ) ? yazi.substring( 0,3) : '#';

        System.out.println("The first three letters of the String: "+sonuc);
    }
    public static void Stringyarim(){
        //Write a Java program to extract the first half of an even string.
        //Test Data: Python
        //Sample Output:Pyt
        String yazi="Python";

        System.out.println("half of the String: "+yazi.substring(0,yazi.length()/2) );
    }
    public static int Ikisayiarasindakitoplam(int sayi1, int sayi2){
        // iki sayi arasindaki sayilari toplayan bir method dondurun
       int toplamsayi=0;
        for (int i = sayi1; i <= sayi2; i++) {
            toplamsayi+=i;
        }
        return toplamsayi;
    }
    public static int result(int x,int y){
        // Write a Java program that accepts two integer values from the user and returns
        // the largest value. however if the two values are the same, return 0 and find the
        // smallest value if the two values have the same remainder when divided by 6.
        if (x==y)
            return 0;
            if (x%6==y%6)
                return (x<y)? x : y;
                return (x>y)? x : y;
    }
}





