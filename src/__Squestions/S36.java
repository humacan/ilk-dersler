package __Squestions;
import java.util.Arrays;
import java.util.Scanner;
public class S36 {
    int[] arr;
    Scanner scan = new Scanner(System.in);
    int uzunluk;

    public static void main(String[] args) {
        S36 s36 = new S36();
        s36.arr = s36.arrayOlustur();
        s36.ortaIndex(s36.arr);
    }
    void ortaIndex(int[] arr) {

        int ortaIndexDegeri = (arr.length - 1) / 2;

        if (arr.length % 2 == 1) {
            System.out.println(Arrays.toString(arr) + "\nArrayin ortadaki ındex degeri: " + arr[ortaIndexDegeri]);
        }else {
            System.out.println("Arrayin uzunlugu çift sayıdır.!!");
        }
    }
    int[] arrayOlustur() {

        System.out.println("Olusturmak istediğiniz array'in uzunlugunu giriniz");
        uzunluk = scan.nextInt();

        arr = new int[uzunluk];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". elemanı giriniz");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    
}
