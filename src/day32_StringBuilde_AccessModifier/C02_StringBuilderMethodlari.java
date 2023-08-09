package day32_StringBuilde_AccessModifier;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha da guzelllesiyor");

        System.out.println(sb.reverse());//royiselllezug ad ahad avaJ
        System.out.println(sb); // StringBuilder mutable oldugu icin degisiklik kalicidir
        sb.reverse();
        System.out.println(sb); // Java daha da guzelllesiyor
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb); // Java daha da guzelllesiyo
        sb.delete(9,12);
        System.out.println(sb); //Java daha guzelllesiyo
        sb.insert(sb.length(),"r.");
        System.out.println(sb); //Java daha guzelllesiyor.

        String str="Java da bundan memnun";
        sb.insert(9,str,4,7); // 9 index den sonra str dan 4 7 arasini yerlestir
        System.out.println(sb); //Java daha da guzelllesiyor.
    }

}
