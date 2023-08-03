package __Squestions;

public class method_mini_hesap {
    public static void main(String[] args) {

        System.out.println(Minihesapmakinasi(5, 6, '+'));
    }
    public static  double Minihesapmakinasi(int sayi1, int sayi2, char sembol){

        double sonuc=0;

        switch (sembol) {
            case '+':
                sonuc=sayi1+sayi2;
                break;
            case '/':
                sonuc=sayi1/sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case  '*':
                sonuc=sayi1*sayi2;
                break;
            default:
                System.out.println("islem sembolu yanlis. ");
        }
        return sonuc;
    }
}
