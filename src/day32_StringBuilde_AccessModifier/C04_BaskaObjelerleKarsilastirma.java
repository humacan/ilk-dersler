package day32_StringBuilde_AccessModifier;

public class C04_BaskaObjelerleKarsilastirma {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2  =new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); //false
        //SB da equals methodu yerine compareTo() kullanilir
        System.out.println(sb1.compareTo(sb2)); // 0

        //System.out.println(sb == str);
        System.out.println(sb1.equals(str));// false
        //equals sasdece objenin kendisi ile karsilastirildinda true doner

        System.out.println(sb1.equals(sb1));//true

        StringBuilder sb=new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb); //abbaccca



    }
}
