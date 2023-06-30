package for_loop;        // faktoryel islemini adim adim gostermek

public class ders18_faktoryel {
    public static void main(String[] args) {
        int sayi =7;
        int faktryel=1;

        System.out.print(sayi+"! = ");      // tum ciktilarin ayni satirda olmasi icin "print" komutu kullanildi

        for (int i = sayi; i >= 1; i--) {
            faktryel *=i;

            if (i!=1){                          // ciktida 1 yanindaki carpi olmamasi icin if kullandik
                System.out.print(i + " * ");
            }else {
                System.out.print(i + "  ");
            }
        }
        System.out.println("=  "+faktryel);
    }
}
