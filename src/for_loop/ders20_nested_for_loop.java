package for_loop;           // verilen bir rakam icin carpim tablosu olusturun
public class ders20_nested_for_loop {
    public static void main(String[] args) {
        int sayi=4;
        /*      1  2  3  4   ==> 1*1  1*2 1*3 1*4
                2  4  6  8   ==> 2*1  2*2 2*3 2*4
                3  6  9  12  ==> 3*1  3*2 3*3 3*4
                4  8  12 16  ==> 4*1  4*2 4*3 4*4     */
        for (int i = 1; i <=sayi; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 1; i <=sayi; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println("");
        for (int i = 1; i <=sayi; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println("");
        for (int i = 1; i <=sayi; i++) {
            System.out.print(4 * i + " ");
        }
        System.out.println("");
        System.out.println("----------------------");

        for (int k= 1; k <=sayi; k++) {                // <== yukaridaki ifadelerin en kisa hali
            for (int i = 1; i <=sayi ; i++) {
                System.out.print(k*i+" ");
            }
            System.out.println("");
        }
    }
}
