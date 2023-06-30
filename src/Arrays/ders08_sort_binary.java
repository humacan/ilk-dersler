package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ders08_sort_binary {
    public static void main(String[] args) {
        int[] arr1={3,9,6,1,7};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2={"Hasan","ali","Murat","Furkan","mehmet","sibel"};
        Arrays.sort(arr2);  // buyuk kucuk harf duyarliligina gore siralar
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.binarySearch(arr2, "ali"));
        // String array icinde ilgili aramanin index ini bize verir
    }
    }
