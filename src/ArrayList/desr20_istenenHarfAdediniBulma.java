package ArrayList;

import java.util.Arrays;

public class desr20_istenenHarfAdediniBulma {
    public static void main(String[] args) {
    // kullanicidan bir cumle ve bir harf alin
    // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
    // kullanilmadiysa "harf cumlede kullanilmamis" yazdirin

    String cumle="Yatin kalkin Java calisin";
    String istenilenHarf="x";

    String [] karakterler =cumle.split("");

        System.out.println(Arrays.toString(karakterler));
        int sayac=0;
        for (String each:karakterler
             ) {
            if (each.equalsIgnoreCase(istenilenHarf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("istenen harf cumlede kullanilmamis");
        }else {
            System.out.println("istenen harf "+ sayac +" kullanilmis");
        }

    }
}
