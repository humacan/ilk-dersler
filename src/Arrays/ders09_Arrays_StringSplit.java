package Arrays;
import java.util.Arrays;
public class ders09_Arrays_StringSplit {
    public static void main(String[] args) {

        String str="Java candir can herkese soyleyin";

        String[] kelimeler=str.split( " ");
        // str String ini bosluk baz alarak ayirdik ve kelimelere[] atadik
        System.out.println(Arrays.toString(kelimeler));

        int enUzunKelimeLength=kelimeler[0].length();
        for (int i = 0; i < kelimeler.length; i++) {        // for ile tum kelimeleri donguye soktuk
            if (kelimeler[i].length()>enUzunKelimeLength){  // kelimeler array in aldigi en uzun karakteri
                enUzunKelimeLength=kelimeler[i].length();   // enUzunKelimeLength ine atadik
            }//
        }
        System.out.println("En uzun kelime: "+ enUzunKelimeLength);  //ve yazdirdik

        String[] karakter=str.split( "");
        System.out.println(Arrays.toString(karakter));
        System.out.println("Cumledeki karakter sayisi: "+karakter.length);

    }
}
