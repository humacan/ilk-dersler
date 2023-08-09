package Day22;

public class Varargs2 {
    public static void main(String[] args) {
    islemyap(3,4,6,7,1,0);
    islemyap(4,5,6);


    }
    public static void islemyap(int sayi1,int sayi2, int...kalanlar){
        System.out.println(kalanlar.length);
    }
}
