package method;
public class ders_method_08_overloading {
    public static void main(String[] args) {
    topla(2,3);
    topla(223,2323);
    topla(23,45.3);
    topla(23.7,54);
    topla('a','z');
    topla(3f,5);
    }
    public static void topla(int a, int b){
        System.out.println("iki sayi toplami:  "+(a+b));
    }
    public static void topla(int a, double b){  // ilk sayi int ikinci double aldik
        System.out.println("iki sayi toplami; "+(a+b));
    }
    public static void topla(double a, int b){  // ilk sayi double ikinci int
        System.out.println("iki sayi toplami: "+(a+b));
    }
    public static void topla(double a, double b){
        System.out.println("iki sayi toplami: "+(a+b));
    }
}
