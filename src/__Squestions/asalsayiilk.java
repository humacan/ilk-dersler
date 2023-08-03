package __Squestions;           // ilk 10 asal sayi
public class asalsayiilk {
    public static void main(String[] args) {
        int sayac=0;
        int sayi=101;
        boolean flag=true;

        while(sayac<10){
            for (int i = 2; i < sayi ; i++) {
                if (sayi%i==0){
                    flag=false;
                }
            }
            if (flag){
                System.out.print(sayi+" ");
                sayac++;
            }
            sayi++;
            flag=true;
        }
    }
}
