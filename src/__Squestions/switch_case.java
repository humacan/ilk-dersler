package __Squestions;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        while (true){
            System.out.println("yapmak istediginiz islemi giriniz"+
                    "\n1 - Toplama islemi"+
                    "\n2 - Cikarma islemi" +
                    "\n3 - Carpma islemi" +
                    "\n4 - Bolme islemi"+
                    "\n0 - Cikis icin ");
            Scanner in=new Scanner(System.in);
            int secim= in.nextInt();
            switch (secim){
                case 1:
                    System.out.println("toplamak istediginiz iki sayiyi giriniz");
                    int sayi1= in.nextInt();
                    int sayi2=in.nextInt();
                    System.out.println(sayi1+sayi2);
                    break;
                case 2:
                    System.out.println("cikarmak istediginiz iki sayi giriniz");
                        sayi1= in.nextInt();
                        sayi2=in.nextInt();
                    System.out.println(sayi1-sayi2);
                    break;
                case 3:
                    System.out.println("carpmak istediginiz iki sayi giriniz");
                    sayi1= in.nextInt();
                    sayi2=in.nextInt();
                    System.out.println(sayi1*sayi2);
                    break;
                case 4:
                    System.out.println("bolmek istediginiz iki sayi giriniz");
                    sayi1= in.nextInt();
                    sayi2=in.nextInt();
                    System.out.println(sayi1/sayi2);
                    break;
                case 5:
                        default:
                            System.out.println("yanlis secim yaptiniz, tekrar deneyiniz");
                            break;
                case 0:
                    System.out.println("gule gule");
                    System.exit(0);

            }
        }
    }

}
