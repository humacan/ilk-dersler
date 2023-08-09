package day32_StringBuilde_AccessModifier;

import java.util.Date;

public class C01_String_builder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();

        System.out.println(sb.length());    // StringBuilder uzunluk =>  0
        System.out.println(sb.capacity()); // StringBuilder karakterlik kapasite => 16

        StringBuilder sb2=new StringBuilder("Java Candir.");

        System.out.println(sb2); // Java Candir
        System.out.println(sb2.length());  //12
        System.out.println(sb2.capacity()); // 16+12

        StringBuilder sb3=new StringBuilder(9);
        System.out.println(sb3.length()); //0
        System.out.println(sb3.capacity()); //9

        sb3.append("Java Candir.");
        System.out.println(sb3);
        System.out.println(sb3.length());   //12
        System.out.println(sb3.capacity()); //2*9+2 =20

        sb3.trimToSize();    // length i capacity ile esitlemek icin
        System.out.println(sb3);
        System.out.println(sb3.length());   //12
        System.out.println(sb3.capacity()); //12
    }
}
