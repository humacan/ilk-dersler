package __Squestions;

public class method_rakamlar_toplami {
    public static void main(String[] args) {


        rakamlarToplami(23421);

    }
    public static void rakamlarToplami(int sayi){

        int girilenSayi=sayi;
        int rakamlarToplami=0;
        int birlerbasamagi=0;

        while (sayi>0){
          birlerbasamagi=sayi%10;
          rakamlarToplami+=birlerbasamagi;
          sayi/=10;

        }
        System.out.println("girilen sayi: "+ girilenSayi +" ve rakamlari toplami: "+rakamlarToplami);
    }


}
