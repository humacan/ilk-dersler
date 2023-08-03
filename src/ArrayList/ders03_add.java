package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ders03_add {
    public static void main(String[] args) {
        // list data turu olarak primitive kabul etmez

        List<Integer> sayilar=new ArrayList<>();  // int yerine Integer (non primitive)

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar);  //[3, 5, 2]

        // 3 ile 5 arasina element olarak 7 ekleyin

        sayilar.add(1,7);
        System.out.println(sayilar);  //[3, 7, 5, 2]

        List<Integer> ekler=new ArrayList<>();

        ekler.add(4);
        ekler.add(6);
        System.out.println(ekler);  // [4, 6]

        sayilar.addAll(ekler);

        System.out.println(sayilar); // [3, 7, 5, 2, 4, 6]

        System.out.println(sayilar.remove(3)); // 2 -- ucuncu index
        System.out.println(sayilar);        // [3, 7, 5, 4, 6]

        sayilar.remove(1);
        System.out.println(sayilar); //[3, 5, 4, 6]




    }
}
