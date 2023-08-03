package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ders16_asList {
    public static void main(String[] args) {
        Integer[] arr={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};  // aslist icin Integer yaptik

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println("sayilar: " + sayilar);

        //asList
        List<Integer> arraydenlis= Arrays.asList(arr);

        System.out.println("Array den list: "+arraydenlis );

        sayilar.add(11);
        // arraydenlis.add(11);  // asList add yapilamaz
        System.out.println(sayilar);
        System.out.println(arraydenlis);  // !!asList hata veriyor
        // asList ekleme ve silme uzunlugu degistiren methodlar kullanilamaz
        // arka planda array den donusturdugumuz list beraber hareket eder
        //birinde yaptigimiz update ler otekine de islenir


        sayilar.remove(0);
        // arraydenlis.remove(0);   // asList remove yapilamaz
        System.out.println(sayilar);
        System.out.println(arraydenlis); // asList hata veriyor


        System.out.println("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arraydenlis);

        arr[0]=22;
        System.out.println("array degistikten sonra");
        System.out.println(Arrays.toString(arr));
        System.out.println(arraydenlis);

        // list in bir elementini degistirelim

        arraydenlis.set(1, 45);
        System.out.println("list degistikten sonra");
        System.out.println(Arrays.toString(arr));
        System.out.println(arraydenlis);

    }
}
