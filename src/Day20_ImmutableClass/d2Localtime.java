package Day20_ImmutableClass;

import java.time.LocalTime;
import java.time.ZoneId;

public class d2Localtime {
    public static void main(String[] args) {
        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);  // 17:44:29.042071600

        System.out.println(zaman.getHour());    // sadece saati getir
        System.out.println(zaman.getMinute());  // sadece dakikayi getir
        System.out.println(zaman.minusMinutes(1000));  // 1000 dakika oncesi
        System.out.println(zaman.plusSeconds(1000));      // saniye ekle
        System.out.println(zaman.withHour(15)); //saati degistir
        System.out.println(zaman.withSecond(0));  //saniyeyi sifirlar

        LocalTime zaman1=LocalTime.of(12,35);
        LocalTime zaman2=LocalTime.of(14,34);

        System.out.println(zaman1.isBefore(zaman2)); //true
        System.out.println(zaman1.isAfter(zaman2));  //false
        LocalTime zaman3=LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("Londra saati: s"+ zaman3);
    }
}
