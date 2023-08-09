package Day21;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);

       // program calisitigi zamandaki tarih gun ay yil seklinde yazdirin

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd / MM / YYYY");  // tarih formatini seklini degistirdik
        // dd: tek haneli gunleeri 01 gibi yazar
        //DDD: yilin kacinci gunu oldugunu yazar
        //E,EE,EEE gun isminin ilk 3 harfi   EEE gun isminin tamami
        // ay icin M , dakika icin m kullanilir.  MM tek haneli aylar(01) gibi, MMM ay isminin ilk 3 harfi, MMMMM ay isminin tamami
        //YY yilin son iki rakami YYYY yilin tamami
        //HH saatin tamami, H tek rakamli saatleri
        System.out.println(tarihSaat.format(dtf));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("HH: mm a"); // a => pm veya am
        System.out.println(tarihSaat.format(dtf2));  // 16: 44 PM
    }
}
