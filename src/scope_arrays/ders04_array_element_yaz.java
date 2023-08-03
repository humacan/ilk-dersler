package scope_arrays;
import java.util.Arrays;
public class ders04_array_element_yaz {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length; i++) {     // 0 index den arr nin uzunluguna kadar elementleri dongule
            System.out.print(arr[i]+" "); //(1 2 3 4 5 6 7)  - aralara bosluk atarak arr nin elementlerini yazdir

        }
    }
}
