package Arrays;
import java.util.Arrays;

public class ders04_Sag_kaydirma {
    public static void main(String[] args) {
        // verilen int bir array in tum elementleri bir saga kaydirararak sondakini basa almak

    int[] arr={3,4,5,6,7};

    int temp=arr[arr.length-1];

        for (int i = 0; i <arr.length-1 ; i++) {  // son indexe kadar >(4.index ->7)
            arr[arr.length-1-i]=arr[arr.length-2-i]; // her dongude sondakine bir oncekini atadik
                                                     // i son index e kdr dondukce islem sonuna kdr gider
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
