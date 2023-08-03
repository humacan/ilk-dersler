package Arrays;

public class ders14_MDA {
    public static void main(String[] args) {

        int[][] arr={{13,25,37},{41,12,23,34},{11,25},{17}};
        // 20 ile 40 arasinda olan sayilarin toplamini

        int toplam=0;

        for (int i = 0; i < arr.length; i++) { //outer array icin
            for (int j = 0; j <arr[i].length ; j++) { //inner array icin
            if (arr[i][j]>=20 && arr[i][j]<=40){
                toplam+=arr[i][j];
            }
            }System.out.println(toplam); // element element gostermek icin
        }
        System.out.println("20 ile 40 arasi toplam: "+toplam);
    }
}
