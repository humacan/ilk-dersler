package ArrayList;
public class ders19_karelerin_toplami {
    public static void main(String[] args) {
        // verilen int array deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun


        int[] arr ={2,3,5,6};
        karelerToplaminiYazdir(arr); // 74
    }
    public static void karelerToplaminiYazdir(int[] arr){
        int karelerToplam=0;

        for (int each:arr
             ) {
            karelerToplam+=each*each;
        }
        System.out.println("verilen array deki elementlerin karelerin toplami: "+karelerToplam);
    }

}
