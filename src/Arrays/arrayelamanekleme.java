package Arrays;                 //ARRAY yeni array le eleman ekleme method
import java.util.Arrays;
import java.util.Scanner;
public class arrayelamanekleme {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        System.out.println("eklenecek sayiyi giriniz");
        Scanner in=new Scanner(System.in);

        int eklenecek=in.nextInt();
        arr=arrayeelemanekle(arr,eklenecek);  //methodu cagirdik ve eklenecek sayiyi scanner ile girdik
        System.out.println(Arrays.toString(arr));

        arr=arrayeelemanekle(arr,21); // methodu ikinci kez cagirdik ve elle ekledik
        System.out.println(Arrays.toString(arr));

    }
    public static int[] arrayeelemanekle(int[] eski,int eklenecek){
        int[] yeniarr=new int[eski.length+1];
        for (int i = 0; i <eski.length ; i++) {
            yeniarr[i]=eski[i];
        }
            yeniarr[yeniarr.length-1]= eklenecek;
            eski=yeniarr;
    return yeniarr;
        }
}
