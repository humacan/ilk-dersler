package scope_arrays;
import java.util.Arrays;
public class ders05_Array_tum_elementleri_arttirma {
    public static void main(String[] args) {

        int[] fiyatlar={15,25,30,10,50};
        // tum urunlere uc lira fiyat duzenlemesi yapalim

        for (int i = 0; i <fiyatlar.length ; i++) {
            fiyatlar[i]+=3;
        }
        System.out.println(Arrays.toString(fiyatlar));
    }
}
