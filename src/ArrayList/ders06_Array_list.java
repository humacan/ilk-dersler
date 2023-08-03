package ArrayList;          //CONTAINS, CLEAR, EQUALS, REMOVEALL,
import java.util.ArrayList;
import java.util.List;
public class ders06_Array_list {
    public static void main(String[] args) {
        // uzun bir listeyi java da list olarak kaydetmek
        // bir array olusturup loop ile list e eklemek
        int [] arr = {2,3,5,4,3,6,7,5,4,3,2,5,6,8,6,5,1};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 5, 4, 3, 6, 7, 5, 4, 3, 2, 5, 6, 8, 6, 5, 1]
        System.out.println(sayilar.contains(3)); // true
        System.out.println(sayilar.contains(9)); // false
        sayilar.clear();  // list temizler
        System.out.println(sayilar);  // []



    }
}
