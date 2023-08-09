package while_do_while_loop;

public class ders04_rakamlar_toplami {
    public static void main(String[] args) {


    }
    public static int rakamlarToplami(int verilenSayi){


        int birler=0;
        int rakamlartoplami=0;

        int basamakSayisi=(verilenSayi+"").length();  // parantez icinde String ifade yazildigi icin length kullanilabildi ve basamak yazisi bulundu

        for (int i = 1; i <=basamakSayisi ; i++) { // yukarida betimlenen basamak sayisi kadar isleme sokulur

            birler=verilenSayi%10;
            rakamlartoplami +=birler;
            verilenSayi /=10;


        }
        return rakamlartoplami;
    }
}
