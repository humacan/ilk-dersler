package Day20_ImmutableClass;
public class d2_StringPool {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");  // new keyword ile bir String olusturmak
        String str4="Ja"+"va";
        String a="Ja";
        String b="va";
        String str5=a+b;
        String str6=a.concat(b);

        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str1==str4); //true
        System.out.println(str1==str5); //false
        System.out.println(str1==str6); //false
        System.out.println(str1=="Java");// true

        String c="";
        c+=2;
        c+='c';
        c+=false;       //c=2cfalse => havuza dahil degildir
        if (c=="2cfalse") System.out.println("==");      // true  => istenilen sonuc vermez sadece esit oldugunu gosterir
        if (c.equals("2cfalse")) System.out.println("equals");  // equals
        /*
        str1.equals(str2) => sadece metineler bakar, metinler ayni ise true doner
        str1==str2 hem metne, hem de referansa bakar. Metin ve referans ayni ise true doner
         */
        //yukaridaki orneklerdeki gibi bazi String objelerin referanslari da ayni olabilir


    }

}
