package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ders21_ortakElementleriBulma {
    public static void main(String[] args) {

        // verilen bir array in elementlerin karsilastirip,
        // ikisinde ortak olan elementleri
        // ayri bir liste olarak verne bir program yazin

        Integer[] arr1={2,3,6,7,4};
        Integer[] arr2={1,3,5,7,9};

        List<Integer> ortakElementlerListesi=new ArrayList<>();

        for (Integer each1: arr1) {
            for (Integer each2: arr2) {
                if (each1==each2 && !ortakElementlerListesi.contains(each1)){
                    ortakElementlerListesi.add(each1);
                }
            }
        }
        System.out.println(ortakElementlerListesi);
    }
}
