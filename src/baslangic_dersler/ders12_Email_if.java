package baslangic_dersler;

import java.util.Scanner;

public class ders12_Email_if {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Lutfen email giriniz");

        String email=tara.nextLine();

        if (!email.contains("@")) {                             // email '@' isareti icermiyorsa( '-!-' ye dikkat)
            System.out.println("Gecersiz e-posta girisi");
        }  else if (!email.contains("@gmail")){                  // email '@gmail' ifadesi icermiyorsa
            System.out.println("Lutfen @gmail olarak giriniz");
        }else if (!email.endsWith(".com")) {                     // email '.com' ile bitmiyorsa
            System.out.println("eksik veri girisi");
        }else{
            System.out.println("Tebrikler basari ile giris yaptiniz");
        }
    }
}
