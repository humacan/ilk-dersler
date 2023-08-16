package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ders14_FibonacciDizisi {
    public static void main(String[] args) {
            // verilen  pozitif br n tamsyai alarak
            // bize ilk n tane tane fibonacci sayisini bir list olarak donduren bir method
        System.out.println(istenenSayidaFibonacciListele(2));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
        System.out.println(istenenSayidaFibonacciListele(15));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610]
        System.out.println(istenenSayidaFibonacciListele(25));
        //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025]
    }
    public static List<Integer> istenenSayidaFibonacciListele(int sayiAdedi){
        List<Integer> fibonacciSerisi=new ArrayList<>();
        if (sayiAdedi<=0){
            System.out.println("Yanlis giris");
        }else if (sayiAdedi==1){
            fibonacciSerisi.add(0);
        } else if (sayiAdedi==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else {
            int ilkSayi=0;
            fibonacciSerisi.add(ilkSayi);
            int ikinciSayi=1;
            fibonacciSerisi.add(ikinciSayi);
            int yeniSayi=ilkSayi+ikinciSayi;
            fibonacciSerisi.add(yeniSayi);
            while (fibonacciSerisi.size()<=sayiAdedi){
                ilkSayi=ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi=ilkSayi+ikinciSayi;
                fibonacciSerisi.add(yeniSayi);
            }
        }
        return fibonacciSerisi;
    }
}
