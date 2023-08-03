package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ders05_sublist {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(53);
        sayilar.add(22);

        System.out.println(sayilar); // [3, 5, 2, 13, 53, 22]

        System.out.println(sayilar.subList(2, 5));  // 2 index den 5 e kdr -- [2, 13, 53]
                                                    // 5 dahil degil
        System.out.println(sayilar);
        List<Integer> yeniliste=sayilar.subList(3,5); // [13, 53]

        System.out.println(yeniliste);


    }
}
