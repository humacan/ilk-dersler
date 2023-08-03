package ArrayList;                      // GET, SIZE , CONTAINS, SET
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ders04_al_soru {
    public static void main(String[] args) {
        // verilen bi array den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donustureli
        int arr[]= {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        List<Integer> liste=new ArrayList<>();
        //list
        for (int i = 0; i < arr.length ; i++) {
            if (!liste.contains(arr[i])){
                liste.add(arr[i]);
            }
    }System.out.println(liste);  // [3, 4, 5, 6, 2, 7]
//        arr=liste;   // array bir ifadeye listi atiyamiyoruz sistem izin vermiyor

        System.out.println(Arrays.toString(arr));  // [3, 4, 5, 6, 3, 4, 2, 3, 5, 4, 6, 5, 4, 3, 5, 7]

        arr=new int[liste.size()];  // arr array ine liste nin boyutu kdr atayabiliiyoruz ama default olarak
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            arr[i] =liste.get(i);  // arr arrayine liste list in indexinde bulunan her degeri
                                    //for dongusu sayesinde atamis olduk
        }System.out.println(Arrays.toString(arr));  // [3, 4, 5, 6, 2, 7]

        System.out.println(liste.get(0));  // 3
        System.out.println(liste.get(4));  // 2
        System.out.println(liste.get(5));  // 7
        System.out.println(liste.get(liste.size() - 1)); // 7

        System.out.println(liste.set(2, 12));  // 5-- sonucta ikinci index deki degeri yazar
        System.out.println(liste);  // [3, 4, 12, 6, 2, 7]
    }
}