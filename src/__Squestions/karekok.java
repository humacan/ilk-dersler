package __Squestions;
import java.util.Scanner;
public class karekok {
    public static <sayi> void main(String[] args) {
        System.out.println(Math.sqrt(64));  // Math data si ile kisaca kok alma
        Scanner in=new Scanner(System.in);

        //for ile cozumu
        int sayi=81;
        int karekok=0;
        for (int i = 2; i < sayi; i++) {
            if (i*i==sayi){
                karekok=i;
            }
        }
        System.out.println(sayi+" sayisinin karekoku: "+karekok);
        // do while cozumu
        System.out.println("bir sayi giriniz");
        int sayi2=in.nextInt();
        int kare=2;
        int karkok=0;

        do {if (sayi2==kare*kare){
                karkok=kare;
        }kare++;

        }while (kare*kare<=sayi2);

        System.out.println(sayi2+ " nin karekoku "+karkok);
    }
}
