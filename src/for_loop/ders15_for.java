package for_loop;         // FOR LOOP KULLANIMI

public class ders15_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i+"-nabersin");
        }
        for (int i = 50; i <=100 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 3; i <=99; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 100; i <1000 ; i++) {
            if (i%23==0){                       // 100 ile 1000 arasinda 23'e tam bolunenler varsa dondur
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        for (int i = 100; i>=20 ; i-=7) {      // 100 den 20 kadar 7 ser eksilterek dondur
            System.out.print(i+" ");
        }
    }
}
