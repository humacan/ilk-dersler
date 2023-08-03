package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ders08_indexof {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");

        System.out.println(isimler.get(2)); // Emre
        // Ferhat in indexi
        System.out.println(isimler.indexOf("Ferhat")); // 3

        System.out.println(isimler.lastIndexOf("Ferhat")); // 3
        System.out.println(isimler.lastIndexOf("Hilal"));  // -1
        System.out.println(isimler.indexOf("Hilal"));         // -1

        isimler.add("Mustafa");

        System.out.println(isimler);
        System.out.println(isimler.indexOf("Mustafa"));         // 1
        System.out.println(isimler.lastIndexOf("Mustafa"));  // 5


    }
}
