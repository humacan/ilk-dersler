package day32_StringBuilde_AccessModifier;

public class C03_StringBuilder_StringBuilderMethodlari {
    public static void main(String[] args) {

        String str="Java Candir";
        StringBuilder sb=new StringBuilder();
         //sb=str;
        //Non-primitive data turlerinde farkli data turleri arainda  atama
        //yapabilmek icin  bu iki non-primitive dat turu arasinda Parent-Child iliskisi
        //olmalidir
        sb=new StringBuilder(str);
        System.out.println(sb); //Java Candir
        System.out.println(sb.substring(0, 4));//Java
        System.out.println(sb); //Java Candir
        System.out.println(sb); //Java Candir
        //sb J harfi iceriyor mu?

        System.out.println(sb.toString().contains("J")); // true
        // StringBuilder da olmayip, String de olan metholdari kullanmak icin
        // oncelikle .toSTring() kullanmaliyiz
        // bu durumda calisan method larin StringBuilder variable kalici olarak
        // degismeyecegini UNUTMAMALIYIZ
    }
}
