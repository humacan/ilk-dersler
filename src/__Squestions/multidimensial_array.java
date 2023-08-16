package __Squestions;

import java.util.Arrays;

public class multidimensial_array {
    public static void main(String[] args) {
    // verilen 2 katli bir array de ayni index sahip elementleri toplayip, yeni olusturacagimiz
    // tek katmanli bir array a bu toplamlari atayiniz
        int[][] ar={{1,2,3},{2,3,4,5},{1,2,3},{2,4,5}};
        int uzunluk=ar[0].length<ar[1].length? ar[0].length : ar[1].length;
        int[] yeniar=new int[uzunluk];

        for (int i = 0; i <ar[ar.length][ar.length]; i++) {
             yeniar[i]=ar[i][i]+ar[i][i]; // multi dimensial array de
    }
        System.out.println(Arrays.toString(yeniar));


}
}