package __Squestions;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class fibonaccimethod {
    public static void main(String[] args) {
        System.out.println(fibonaccidizi(10)); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
    }
    public static List<Integer> fibonaccidizi(int sayimiktr){
        List<Integer> fibonacci=new ArrayList<>();

        if (sayimiktr<=0) {
            System.out.println("yanlis giris");
        } else if (sayimiktr==1) {
            fibonacci.add(0);
        } else if (sayimiktr==2) {
            fibonacci.add(0);
            fibonacci.add(1);
        } else  {
            int ilk=0;
            fibonacci.add(ilk);
            int ikinci=1;
            fibonacci.add(ikinci);
            int yeni=ilk+ikinci;
            fibonacci.add(yeni);
            while (fibonacci.size()<=sayimiktr){
                ilk=ikinci;
                ikinci=yeni;
                yeni=ilk+ikinci;
                fibonacci.add(yeni);
            }
        }
        return fibonacci;
    }
}
