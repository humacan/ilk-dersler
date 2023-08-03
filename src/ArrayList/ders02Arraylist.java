package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Arrays.ders06_Array_Eleman_method;
public class ders02Arraylist {
    public static void main(String[] args) {
    // Arraylist, uzunlugu esnek bir listedir
    // Array altyapisini kullanir
    //Ekleme ve silme konusunda daha avantajlidir

        int[] arr={3,4};

        arr = ders06_Array_Eleman_method.arrayelementEkle(arr, 5);  //methodu yukarida
                                        // olusturalan arr variable na atandi ve sonuna deger eklendi
                                        // [3, 4, 5]
        arr = ders06_Array_Eleman_method.arrayelementEkle(arr, 15); //[3, 4, 5, 15]
                                                        // variable her deger atandiginda sona ekliyor

        arr = ders06_Array_Eleman_method.arrayelementEkle(arr, 23); // [3, 4, 5, 15, 23]

        System.out.println(Arrays.toString(arr));

        List<String> harfler=new ArrayList<>();

        System.out.println(harfler);

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler); // [s, l, a]


        System.out.println(harfler.remove("s"));  //true
        System.out.println(harfler);  // [l, a]


    }
}
