package Arrays;
import java.util.Arrays;

public class ders06_Array_Eleman_method {
    public static void main(String[] args) {

      int arr[]={2,4,7,8};

      arr=arrayelementEkle(arr,5);  //   [2,4,6,7,8,5]
        arr=arrayelementEkle(arr,3);  // [2,4,6,7,8,5,3]
        arr=arrayelementEkle(arr,34); // [2,4,6,7,8,5,3,34]
        System.out.println(Arrays.toString(arr));

    }
    public static int[] arrayelementEkle(int[] arr, int eklenecek){

        int[] yeniArr=new int[arr.length+1]; // -> [0,0,0,0,0}

        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];   // yeniArr ->> [2,4,7,8,0]
        }
        yeniArr[yeniArr.length-1]=eklenecek; // yeni array in sonuna eklenecek element
        return yeniArr;
    }
}
