package method;
public class ders_method_06_asalsayi_method {
    public static void main(String[] args) {

    asalSayimi(11);
    asalSayimi(30);
    asalSayimi(35);
    asalSayimi(43);
    asalSayimi(53);
    asalSayimi(63);
    asalSayimi(67);
    asalSayimi(71);
    asalSayimi(77);
    asalSayimi(83);
    asalSayimi(6);
    }
    public static void asalSayimi(int sayi){
        int flag=0;                             // for dongosu sonrasi denetim icin baska bir variable olusturduk
        for (int i = 2; i < sayi; i++) {    // i nin degeri sayi degerinden bir kucuk degere kdr donguye girer
            if (sayi%i==0){   // eger sayi i'nin yukaridaki kurala gore aldigi degerleri kalansiz bolerse

                flag++;         // flag kismina bir ekler ve else bloguna gecer
                break;
            }
        }if (flag==0){
            System.out.println("girilen sayi "+ sayi +" asal bir sayidir");
        }else{
            System.out.println("girilen sayi "+sayi+" asal bir sayi degildir");
        }
    }
}
