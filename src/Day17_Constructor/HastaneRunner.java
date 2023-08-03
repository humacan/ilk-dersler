package Day17_Constructor;

public class HastaneRunner {
    public static void main(String[] args) {
        /*
        biz bir obje olusuturdugumuzda java once bu constructer un varligin teyit eder
        constructor varsa istenen objeyi olusturu obje olusturulunca instance
        olan butun vaiable larin birer kopyalarini olusutur
        ve bu objeye iliskilendirilir

        Objeye yeni bir oatam yapmadigim muddete
        objenin olusturuldugu calla saki ilk degerleri kullanir

        static variable lar class a baglidir ve degistirilirse tum objeler
        icin degisiklik gecerli olur
        * */

    hastane per1=new hastane(); // bir onceki class dan obje olusturduk
        System.out.println(per1.personelIsmi);  // Isim belirtilmedi
        per1.personelTuru="Doktor";
        System.out.println(per1.maas("Doktor")); // 5000

        hastane per2=new hastane();
        System.out.println(per2.personelTuru); // Personel turu belirtilmedi

        System.out.println(per1.hastaneAdi);
        per2.hastaneAdi="Java Hastanesi";
        System.out.println(per1.hastaneAdi);




    }
}
