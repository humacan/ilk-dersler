//..........CHARAT...LENGTH...SUBSTRING...KULLANIMI......INDEX OF
package _baslangic_dersler;
public class java11_Substring_Indexof_Length {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";
        System.out.println(str.length());                               // str variable in uzunluk karakter sayisi -"30"
        System.out.println(str.charAt(str.length() - 3));               // str variable in uzunlugundan uc index eksik yaz - "y"
        System.out.println(str.substring(10));                // str variable in 10. index inden itibaren yaz - "ectikce guzellesiyor"
        System.out.println(str.substring(str.length() - 9));  //str variable in uzunlugundan eksi 9 index inden itibaren yaz - "ellesiyor"
        System.out.println(str.substring(0, (str.length() - 3)));       // str variable in son 3 indexine kadar yaz - "Java gun gectikce guzellesi"
        System.out.println(str.substring(0, 9));                        // str variable 0 ile 9 arasindaki indexe kdr yaz(9 dahil degil) - "Java gun"
        System.out.println(str.indexOf("c"));                           // c nin index degeri - "11"
        System.out.println(str.indexOf("gun"));                         // gun kelimesinin ilk harfinin index degeri - "5"
        System.out.println(str.indexOf("gec", 6));         // 6 dan sonra "gec" kelimesinin ilk harfinin index degeri - "9"
        System.out.println(str.lastIndexOf("e",22));        // e nin indexini 22 index den sondan arar
        ////////////////////////// CUMLE ICINDE AYNI KELIMENIN SAYISINI OGRENME  //////////////////////////////////////////
        String cumle = "Yasasin java, iyi ki java ogreniyorum,";
        String kelime = "java";

        if (cumle.indexOf(kelime)==(-1)) {
            System.out.println("Aradiginiz kelime bulunamadi");
        } else {
            int kelimeIlk = cumle.indexOf(kelime);  // kelimenin bir defa gectigini teyit icin yeni bir value olusturduk
            if (cumle.indexOf(kelime, (kelimeIlk + 1)) == (-1)) {                     //==>cumle icinde gecen kelime str si birden fazla degilse
                System.out.println("aradginiz kelime bir kere kullanilmis");
            } else {
                int kelimeiki = cumle.indexOf(kelime, (kelimeIlk + 1));              // kelimenin ikinci defa gectigini teyit icin baska bir value olusturduk
                if (cumle.indexOf(kelime, (kelimeiki + 1)) == (-1)) {                // cumle icinde gecen kelime str si -kelimeiki- str si ile 2 den fazla gecmiyorsa
                    System.out.println("Aradiginiz kelime 2 kere kullanilmis");
                }else {
                    System.out.println("Aradiginiz kelime 2 den fazla kullanilmis"); // cumle icinde gecen kelime str si -kelimeiki- str si ile 2 den fazla geciyorsa
                }
            }

        }
    }
}