package Arrays;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);

        int[] arr1 =new int[5];
        System.out.print("Array icin deger giriniz");
        for (int i=0; i<arr1.length ;i++ ){
            arr1[i]=tara.nextInt();

        }for (int i=0; i<arr1.length ;i++ ){

            System.out.println("Array degerleri= " + arr1[i]);


        }
    }
}
