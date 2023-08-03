package Arrays;

public class ders12_MDA3 {
    public static void main(String[] args) {

        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};

        // toplam element sayisini bulalim

        int elemanSayisi=0;

        for (int i = 0; i < arr.length ; i++) {
            elemanSayisi +=arr[i].length;
        }System.out.println("Eleman Sayisi: "+elemanSayisi);

        // tum elementlerin toplamini bulalim
        int elementlerToplami=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
               elementlerToplami+=arr[i][j];
                System.out.print( "-" + arr[i][j]);
            }
            System.out.println(""); // blok ici yazildigi icin arraylari elementlere gore yazdirdik
        }System.out.println("Elementler Toplami: " +elementlerToplami);
    }
}
