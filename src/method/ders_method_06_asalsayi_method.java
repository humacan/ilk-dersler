package method;

public class ders_method_06_asalsayi_method {
    public static void main(String[] args) {
    asalSayimi(23);
    asalSayimi(30);
    asalSayimi(35);
    asalSayimi(43);
    asalSayimi(53);
    asalSayimi(63);
    asalSayimi(67);
    asalSayimi(71);
    asalSayimi(77);
    asalSayimi(83);
    }
    public static void asalSayimi(int sayi){
        int flag=0;                             // for dongosu sonrasi denetim icin baska bir variable olusturduk
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }

        }if (flag==0){
            System.out.println("girilen sayi "+ sayi +" asal bir sayidir");
        }else{
            System.out.println("girilen sayi "+sayi+" asal bir sayi degildir");
        }

    }



}
