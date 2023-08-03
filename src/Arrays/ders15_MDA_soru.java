package Arrays;
import java.util.Arrays;
public class ders15_MDA_soru {
    public static void main(String[] args) {
    // verilen 2 katli bir arary de
        //ayni index e sahp elementleri yazallim
        // yeni olusturulacak tek katli bir array a bu toplamlari atayalim


        int[][] arr={{3,4,5},{2,3,6,7}};

    int enKisaArrayLength=arr[0].length;    // 3
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length<enKisaArrayLength){
                enKisaArrayLength=arr[i].length;
            }
        }

        // toplamlari koymak icin yeni bir arary olusturaliim
        int[] toplamArray=new int[enKisaArrayLength];

        int indexdekiElementlerToplami=0;

        for (int i = 0; i <toplamArray.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                indexdekiElementlerToplami+=arr[j][i];


            }
            toplamArray[i]=indexdekiElementlerToplami;
            indexdekiElementlerToplami=0;

        }System.out.println(Arrays.toString(toplamArray));


    }
}
