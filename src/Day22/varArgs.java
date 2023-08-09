package Day22;

public class varArgs {
    public static void main(String[] args) {
        toplam(3,4,5,6,7); //25
        toplam(1,2,3,4,5,6,7,8,9); //45

    }
    public static void toplam(int...sayi){
        int toplam=0;
        for (int x:sayi) {
            toplam+=x;

        }
        System.out.println("verilen sayilarin toplami: "+ toplam);
    }
}
