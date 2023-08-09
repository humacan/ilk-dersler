package while_do_while_loop;
public class ders07_class_level_variable {

    static int sayi=10;
    static String isim;         // variable lar icin deger sonradan atanabilir.
    static boolean bl;          // print komutunda bu sekilde degersiz yazdirilabilir
    static char chr;            // ama herhangi bir islemde kullanilamazlar
    static int in1;
    boolean bl2;                // static method da kullanilamaz
    int int2;                   // static method da kullanilamaz


    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String "+isim); // non prmitivle icin null
        System.out.println("boolean "+ bl); // false
        System.out.println("char "+chr);  // '' hiclik
        System.out.println("int "+ in1);  // sayisal turler icin 0
//      System.out.println(bl2);   static olmadigi icin kullanilamaz
        staticOlan(); //11
//      staticolmayan(); static olmayan method
    }

    public static void staticOlan(){
        sayi++;
        System.out.println(sayi);
//      System.out.println(bl2);   Static degil
//      System.out.println(int2);  Static degil
        }
    public void staticolmayan(){
        sayi--;
        System.out.println(sayi);
        System.out.println(bl2);    //instance
        System.out.println(int2);   //instance
    }
    }

