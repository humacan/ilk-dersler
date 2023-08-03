package Arrays;
import java.util.Arrays;
public class ders11_MDA2 {
    public static void main(String[] args) {
        String[][] siniflar={{"A","B","G","M"},{"F","P","A","V"}, {"K","D","Q"}};

        System.out.println(siniflar[0][2]);
        // Q yu Y yapin
        siniflar[2][2]="Y";
        System.out.println(siniflar[2][2]);

        // ilk sinifin mevcudunu yazin
        System.out.println(Arrays.toString(siniflar[0]));
        //siniflarda toplam kac kisi var

        System.out.println(siniflar.length); //3

        int toplamOgrenciSayisi=0;
        for (int i = 0; i <siniflar.length ; i++) {
            toplamOgrenciSayisi+=siniflar[i].length;

        }System.out.println("toplam Ogrenci Sayisi: "+toplamOgrenciSayisi);
    }
}
