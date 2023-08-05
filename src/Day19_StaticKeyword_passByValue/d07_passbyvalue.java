package Day19_StaticKeyword_passByValue;

import java.util.Arrays;

public class d07_passbyvalue {
    public static void main(String[] args) {
        int[] ar={10,12,23};
        //verilen array in tum elemanlarini 3 arttirip yazdiran bir method
        elemanArttir(ar);
        System.out.println(Arrays.toString(ar));

    }
    public static void elemanArttir(int[] ar){
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=ar[i]+3;
        }
        System.out.println(Arrays.toString(ar));
    }
}
