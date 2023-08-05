package Day19_StaticKeyword_passByValue;

import java.util.Arrays;

public class d09Passbyvalue_pasbyreference {
    public static void main(String[] args) {

        int[] ar={10,20,30};

        System.out.println(Arrays.toString(arrayeYenideger(ar))); //[40, 50, 60]
        System.out.println(Arrays.toString(ar));  //[10, 20, 30]   => deger atamasi gecici

        System.out.println(Arrays.toString(arrayElementdegistir(ar))); //[80, 90, 30]
        System.out.println(Arrays.toString(ar));  //  [80, 90, 30] => element atamasi kalici hale geldi
    }
    public static int[] arrayeYenideger(int[] ar){
        int[] yeniar={40,50,60};
        ar=yeniar;
        return ar;
    }
    public static int[] arrayElementdegistir(int[] ar){
        ar[0]=80;
        ar[1]=90;
        return ar;

    }

}
