package scope_arrays;
import java.util.Arrays;
public class ders03_Arrays {
    public static void main(String[] args) {
        String [] isimler={"Nurefsan","Berke","Mustafa"};
        int [] sayilar={3,4,5,6,7,8,9,10,12,13,14,15};
        char[] karakter={'a','b','c','!'};
        //Array non-primitive bir data turudur
        //Eger array'i liste seklinde olusturmayip new keyword kullaniyorsak
        //UZUNLUGUNU yazmak zorundayiz
        String [] arr=new String[5];   //arr isimli String e 5 index li array degeri olusturur

        System.out.println(isimler); //[Ljava.lang.String;@15aeb7ab -referans - array direk yazdirilamazlar
        System.out.println(Arrays.toString(isimler)); // Array i yazdirma metodu
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(arr));  //null(5 kere)

        int [] a=new int[7];     // a isimli int a 7 index li array degeri olusturur
        System.out.println(Arrays.toString(a)); // int default degerini 7 kere yazdirir  - [0, 0, 0, 0, 0, 0, 0]

        a[0]=4;   // a nin birinci index ine 4 atar
        a[3]=7;   // a nin dorduncu index ine 7 atar
        //a[7]=8;   // ArrayIndexOutOfBoundsException - index 8 a da mevcut olmadigi icin hata verir

        System.out.println(Arrays.toString(a));  //  [4, 0, 0, 7, 0, 0, 0]
        System.out.println(sayilar[4]); // -7
        System.out.println(isimler[2]); // Mustafa
    }
}
