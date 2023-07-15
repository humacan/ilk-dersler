//..........STRING MANIPULATION.//  equals - esit olup olmadigini kontrol eder
                                //  equalsIgnoreCase - buyuk kucuk harf duyarliligini yok sayarak esitlilgi  kontrol eder
                                //  toUpperCase - toLowerCase - (Locale.forLanguageTag("TR") harfleri kucuk yap - harfleri buyuk yap - harfleri  yerel dilde yaz
                                //  concat - string ifadeleri birlestirme
                                //  contains - string ifade icinde string olup olmadigini kontrol etme
                                //  startsWith - string in ilgili ifade ile baslayip baslamadigi kontrol eder
                                //  endsWith - string in ilgili ifade ile bitip bitmedigini kontrol eder
                                //  replace, replaceFirst, replaceAll - yer degistirme
                                //  repeat - bir stringi tekrar sayisi kadar tekrar ettirir
                                //  strim - bir stringin basinda ve sonunda bulunan boslugu siler
package _baslangic_dersler;
public class java10_StringManupulation {
    public static void main(String[] args) {
        String str="Java Candir";
        System.out.println(str.toUpperCase()); //JAVA CANDIR
        System.out.println(str);    // Java Candir
                                    // String manipulation dan sonra atama yapilmazsa variable degismez eski halini alir
        str = str.toUpperCase();    // str' ye tekrar atama yaptik
        System.out.println(str);
        System.out.println(str.toLowerCase());  //java candir
        //str=str.toLowerCase(Locale.forLanguageTag("TR")); // java candır - yerel dilde atama yaptik
        str=str.toLowerCase();
        System.out.println(str);

        String str1="Java";
        String str2="JAVA";
        String str3="java";
        String str4="JaVa";
        System.out.println(str1.equals(str2));  // false -- buyuk kucuk duyarligindan dolayi
        System.out.println(str3.equals(str4));  // false -- buyuk kucuk duyarligindan dolayi
        System.out.println(str1.equalsIgnoreCase(str2)); // true -- buyuk kucuk duyarligini gormezden geldi
        System.out.println(str3.equalsIgnoreCase(str4)); // true -- buyuk kucuk duyarligini gormezden geldi

        String str5="Java";
        String str6="Ja";
        String str7="va";
        String str8=str6.concat(str7);

        System.out.println(str8);                       // Java -- birlestirme ==> Java
        System.out.println(str1==str5);                 // true
        System.out.println(str1==str8);                 // false  //str8 farkli bir yontemle birlestirildigi icin java esitleme sorgulamasina 'false' verdi
        System.out.println(str1+str2+str3);             // string variable lari normal (concat) leme yontemi - JavaJAVAjava
        System.out.println(str.contains(str3));         // string icinde baska bir string icerip icermadigini kontrol eder - true
        System.out.println(str.startsWith("java"));     // string in ilgili ifade ile baslayip baslamadigi kontrol eder - true
        System.out.println(str.endsWith("dir"));        // string in ilgili ifade ile bitip bitmedigini kontrol eder - true
        System.out.println(str.endsWith(str.substring(str.length() - 3)));      // str uzunlugunun -3 den itibaren ile bitip bitmedigini kontrol eder - true("dir")
        System.out.println(str.replace("ja", "yayay"));                  // "java candir" yerine "yayayva candir"
        System.out.println(str.replaceFirst("c", "t"));                  // ilk "c" ifadesi yerine "t"

        str = "J1a23va34 5C54and65ir87";  // str ye yukaridan farkli olarak yeni deger atadik
        System.out.println(str);
        System.out.println(str.replaceAll("\\d",""));       // tum digitleri kaldir yerine hiclik koy - Java Candir
        System.out.println(str.replaceAll("\\D", ""));      // rakam haric herseyi kaldir -  123345546587
        System.out.println(str.replaceAll("\\w",  "+"));    // alfabetik olmayan ("W" tam tersi)
        System.out.println(str.replaceAll("\\s", "a"));     // space olan - ("S" ise olmayan)
    }
}
