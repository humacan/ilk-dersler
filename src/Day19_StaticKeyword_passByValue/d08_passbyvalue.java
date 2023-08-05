package Day19_StaticKeyword_passByValue;

import java.util.Arrays;

public class d08_passbyvalue {
    public static void main(String[] args) {
        int[] ar={3,5,7};

        //verilen array e 4.bir element olarak
        // 10 ekleyip, o halini yazidran bir method
        elemanEkle(ar);
        System.out.println("method call dan once ar: "+Arrays.toString(ar));
        /*
        birden fazla eleman barindiran array, list gibi java objelerinde java method a yollarken

         */

    }
    public static void elemanEkle(int[] ar){
        int[] yeniar=new int[4];

        for (int i = 0; i <ar.length ; i++) {
            yeniar[i]=ar[i];
        }
        yeniar[yeniar.length-1]=10;
        ar=yeniar;
        System.out.println(Arrays.toString(ar));  //[3, 5, 7, 10]
    }

}
