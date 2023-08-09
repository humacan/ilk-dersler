package while_do_while_loop;
import java.util.Scanner;
public class ders02_while_loop2 {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        String sifre = "";
        int flag = 0;
        int denemeSayisi = 0;

        while (flag != 4) {
            flag=0;
            System.out.println("Lutfen bir sifre giriniz");
            sifre = tara.nextLine();

            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
                flag++;
            } else {
                System.out.println("Ilk harf kucuk olmali");
            }
            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z'){
                flag++;
            } else {
                System.out.println("Son karakter buyuk olmali");
            }
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                flag++;
            }
            if (sifre.length() >= 8) {
                flag++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }
            denemeSayisi++;
        }
        System.out.println("Tebrikler! " + denemeSayisi+ ".denemede sifreniz kaydedildi");
    }
}