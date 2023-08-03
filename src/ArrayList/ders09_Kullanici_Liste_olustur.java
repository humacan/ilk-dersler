package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ders09_Kullanici_Liste_olustur {
    public static void main(String[] args) {
        // kullanicdan istedigi kadar isim alip,
        // Q ya basildiginda gridigi isimleri bize liste olarak
        // dondurecek bir method olusturalim
        System.out.println(kullaniciListeolusturma());
    }
    public static List<String> kullaniciListeolusturma(){  // method
        List<String> isimler=new ArrayList<>();  // Array list
        String girilenIsimler="";                // String isimler
        Scanner skan =new Scanner(System.in);

        do {
            System.out.println("Listeye eklemek icin isim giriniz"+
                             "\nBitirmek icin Q ya basiniz");
            girilenIsimler=skan.nextLine();
            if (!girilenIsimler.equalsIgnoreCase("q")){
                isimler.add(girilenIsimler);
            }
        }while (!girilenIsimler.equalsIgnoreCase("Q"));
        return isimler;
}
}
