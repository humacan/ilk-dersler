package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ders10_istenmeyeni_sil {
    public static void main(String[] args) {
        // verilen String bir listed
        // istenmeyen harf iceren elementleri silip,
        // kalan kismini List olarak bize donduren bir method

        List<String> liste=ders09_Kullanici_Liste_olustur.kullaniciListeolusturma();
        // bir onceki class ta ki methodu cagirdik

        Scanner scan=new Scanner(System.in);
        System.out.println("kullanilmasini istemediginiz bir harf giriniz");

        String istenmeyenHarf=scan.next().substring(0,1); // String in ilk harfi

        List<String> ayiklanmisList=istenmeyenHarfIcerenleriSil(liste,istenmeyenHarf);
        System.out.println(ayiklanmisList);

    }
    public static List<String> istenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf) {
    //listemiz ali,veli,ayse,fatma ve istenmeyen harf a


    List<String> kalanlarListe=new ArrayList<>();
        for (int i = 0; i <liste.size() ; i++) {
            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanlarListe.add(liste.get(i));
            }

        }
        return kalanlarListe;
    }

}
