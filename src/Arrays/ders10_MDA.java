package Arrays;
import java.util.Arrays;
public class ders10_MDA {
    public static void main(String[] args) {

        int[][] arr={{3,4,5},{2,3},{1}};
        // ilk[] OuterArray i kontrol eder
        // ikinci[] InnerArray i kontrol eder
        System.out.println(arr[1][0]); // 2 -- 1 index array in icindeki ikinci index
        System.out.println(arr[0][2]); // 5 --
        System.out.println(arr[2].length); //1 -- array in icindeki 2.index uzunlugu
        System.out.println(arr[1]); // [I@15aeb7ab-- referans kodu
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr)); //[[I@7b23ec81, [I@15aeb7ab, [I@6acbcfc0]
        System.out.println(Arrays.deepToString(arr)); //[[3, 4, 5], [2, 3], [1]]
        System.out.println(arr.length); // 3
        System.out.println(arr[0].length);
    }
}
