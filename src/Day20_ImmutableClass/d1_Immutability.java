package Day20_ImmutableClass;
import java.util.ArrayList;
import java.util.List;

public class d1_Immutability {
    public static void main(String[] args) {
        String str="Java Candir";
        System.out.println(str.toUpperCase());  // JAVA CANDIR
        System.out.println(str);  // Java Candir

        str.replace("a","*");
        System.out.println(str);  //Java Candir
        //String de atama yoksa, calistirilan methodlar asil variable i kalici olarak degistirmez

        List<String> isimler=new ArrayList<>();
        //Collections.addAll(isimler,"ali","mehmet","mustafa","muhammed"); coklu atama
        isimler.add("Kaan");
        isimler.add("Musa");
        isimler.add("Ali");
        System.out.println(isimler); // [Kaan, Musa, Ali]
        isimler.set(1,"Ozan");
        System.out.println(isimler); //[Kaan, Ozan, Ali]
        isimler.remove(1);
        System.out.println(isimler); //[Kaan, Ali]
        //String in aksine LIST te yapilan degisiklikler kalicidir
        // bu Immutability ile ilgilidir


    }
}
