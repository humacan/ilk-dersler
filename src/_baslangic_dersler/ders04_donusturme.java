package _baslangic_dersler;                         //donusturme
import java.util.Scanner;                           //Data Casting
public class ders04_donusturme {
    public static void main(String[] args) {

        double db1 = 3987876765d;
        int sayi = (int)db1;                    //birim donusturme
        System.out.println("sayi : " + sayi);

        String sayi1 = "112";
        int sayi3=Integer.parseInt(sayi1);
        short sayi2 = Short.parseShort(sayi1);  //String li ifadeyi sayiya cevirme
        System.out.println(sayi2);

        System.out.println(2+3<=5);

        System.out.println("-------NOT HESAPLAMA------");
        Scanner scn = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not = scn.nextDouble(); // girilen nota gore sonuc alma

        if(not>100  && not>0){
            System.out.println("yanlils girdiniz");
        }
        else if(not>=85){
            System.out.println("Tebrikler AA aldiniz");
        }
        else if(not>=65){
            System.out.println("BB aldiniz");
        }
        else if(not>50){
            System.out.println("CC aldiniz");
        }else System.out.println("DD aldiniz");

        }
    }

