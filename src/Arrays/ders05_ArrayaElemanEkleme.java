package Arrays;

import java.util.Arrays;

public class ders05_ArrayaElemanEkleme {
    public static void main(String[] args) {

    int[] arr={4,5,6};
    int eklenecekElement=10;

    // arr=new int[5];  //-> [0,0,0,0,0]

    int[] yeniarr=new int[arr.length+1]; // [0,0,0,0]
        for (int i = 0; i <arr.length ; i++) {
            yeniarr[i]=arr[i];
        }
        yeniarr[yeniarr.length-1]=eklenecekElement;
        System.out.println(Arrays.toString(yeniarr));

        arr=yeniarr;
        System.out.println(Arrays.toString(arr));
    }
}
