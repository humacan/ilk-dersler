package __Squestions;           // 100 den sonra ilk 10 asal sayi
public class Asalsayisinirlama {
    public static void main(String[] args) {
        int sayi=101;
        int sayac=0;
        boolean bayrak=true;
        while (sayac<10) {
            for (int i = 100; i < sayi; i++) {
                if (sayi%2==0 || sayi%3==0 || sayi%5==0 || sayi%7==0  || sayi%11==0) {
                bayrak=false;
                }
            }if (bayrak){
                System.out.print(sayi+" ");
                sayac++;
            }
                sayi++;
               bayrak=true;
        }
    }
}

