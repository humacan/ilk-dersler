package __Squestions;
import java.util.Arrays;
import java.util.Scanner;

public class Alistirma_sorulari {
    public static void main(String[] args) {
    // Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.
    //Sample Output:  Test Data: array = 10, -20, 0, 30, 40, 60, 10
        int[] num={10, -20, 0, 30, 40, 60, 10};
        System.out.println(num[0]==10 || num[num.length-1]==10); // true

    //Write a Java program to create an array of length 2 from two integer arrays
    // with three elements. The newly created array will contain the first and
    // last elements from the two arrays.
        int[] sayi1={1,2,3};
        int[] sayi2={1,2,3};
        int[] yeni={sayi1[0],sayi2[2]};
        System.out.println(Arrays.toString(yeni));

    //Write a Java program to rotate an array (length 3) of integers
    // in the left direction.
        int[] number={1,2,3};
        System.out.println(Arrays.toString(number));
        int[] number2={number[1],number[2],number[0]};
        number =number2;
        System.out.println(Arrays.toString(number));

    //Write a Java program to get the largest value between the first and
    // last elements of an array (length 3) of integers.
        int[] num1={10,20,55};
        System.out.println(Arrays.toString(num1));
        int max_num= num1[0];
        if (num1[2]>=max_num)   // eger max dan buyukse ona bu degeri ata ve yazdir
            max_num=num1[2];
            System.out.println("Larger value between first and last element: "+max_num);
    //Write a Java program to swap the first and last elements of an array
    // (length must be at least 1) and create another array.
        int[] num2={1,2,3};
        System.out.println(Arrays.toString(num2)); // first state
        int x=num2[0];  // assigned to x element of num2[0]  (spare)
        num2[0]=num2[num2.length-1]; // assigned to num2[0]  last element of num2
        num2[num2.length-1]=x;      //  assigned to  last element of num2 x(firts element)
        System.out.println(Arrays.toString(num2)); //last state

    // find the largest element between the first,
    // last, and middle values in an array of integers (even length).
        int[] num3={77, 30, 89, 50, 67};

        if (num3[num3.length-1]>num3[0]){
            if (num3[num3.length-1]>num3[num3.length/2]){
                System.out.println("Largest number is last element in array: "+ num3[num3.length-1]);
            }
        } else if (num3[0]>num3[num3.length/2]) {
            System.out.println("Largest number is first element in array: "+ num3[0]);
        }else {
            System.out.println("Largest number is middle element in array: "+ num3[num3.length/2]);
        }
        //Write a Java program to find the penultimate (next to the last)
        //word in a sentence.
        String yazi="kedi citin yaninda duran kopegin ustunden zipladi";
        String[] words=yazi.split("[ ]"); // to divide betweeen strings with space
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-2]);
        String []ifade2= { };
        String ifade="naber! kardess";
        ifade2=ifade.split("!");
        System.out.println(Arrays.toString(ifade2)); // [naber,  kardess]

    }
}
