package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ders15_listElementlerininYerinidegistirme {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(10);
        // 2.index deki element ile 5. indexi elementin yerini degistirelim
        System.out.println(sayilar); // [3, 5, 1, 4, 1, 7, 10]
        // once bir tanesini temp variable atayalim
        int temp=sayilar.get(2);

        sayilar.set(2,sayilar.get(5));
        // 5 indexe temp deki  degeri atayalim

        sayilar.set(5,temp);
        System.out.println(sayilar); // [3, 5, 7, 4, 1, 1, 10]

        // verilen bir listede istenen 2 index deki elementlerin yerini degistirip
        // donduren bir method olusturalim

    }
}
