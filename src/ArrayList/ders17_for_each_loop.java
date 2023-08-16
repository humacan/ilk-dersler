package ArrayList;
public class ders17_for_each_loop {
    public static void main(String[] args) {
    int[] arr={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};
    // bizden istenen gorevde sirlama onemsiz ise asil amaclanan tum elementleri
    // elden gecirmek ise  for loop yerine for each loop tercih edilir
    // for each loop   da
//            -index yok
//            -baslangic degeri yok
//            -bitis degeri yok
        // arr in tum elementlerinin toplamini yazdirin
        int toplam=0;
        for (int each: arr) {
            toplam+=each;
        }
        System.out.println("Elementler Toplami; "+toplam);
        // arr in elementlerinden 3 ile bolunenleri yazdirin
        for (int each: arr) {
            if (each%3==0)  System.out.print(each+ " ");
        }
        System.out.println("");
        // arr in elementlerinin icinde kac tane tek sayi oldugunu bulun

        int sayac=0;
        for (int each: arr) {
            if (each%2!=0) sayac++;
        }
        System.out.print(sayac+ "");

    }
}
