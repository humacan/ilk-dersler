package Day21;
import java.time.LocalDateTime;
public class Local_DateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();  //simdiki
        System.out.println(tarihSaat);
        System.out.println(tarihSaat.getDayOfWeek());

        LocalDateTime baslamaZamani=LocalDateTime.now();
        int baslangicZamani=baslamaZamani.getNano();
        int toplam=0;
        for (int i = 1; i <100000 ; i++) {
            toplam+=i;
        }
        LocalDateTime bitirmeZamani=LocalDateTime.now();
        int bitisZamani=bitirmeZamani.getNano();
        System.out.println("islem suresi: "+(bitisZamani-baslangicZamani));  // pc nin islemi hesaplama hizi
    }
}
