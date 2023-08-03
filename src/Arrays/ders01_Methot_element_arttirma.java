package Arrays;
import java.util.Arrays;
public class ders01_Methot_element_arttirma {
    public static void main(String[] args) {
    //verilen bir int array in tum elemanlarini 2 arttirip donduren bir metor
    // eski array i yeni haliyle kaydedin

    int[] arr={3,4,5,6};
    System.out.println(Arrays.toString(arrayElementArttir(arr, 2))); // asagidaki methodu cagirdi,icine
    // arr Arrayi ve artis miktarini girdik
    System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayElementArttir(int[] ilkArr,int artis){
        for (int i = 0; i <ilkArr.length ; i++) {
            ilkArr[i]+=artis;
        }
        return ilkArr;
    }
}
