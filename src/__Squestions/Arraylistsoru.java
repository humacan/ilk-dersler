package __Squestions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Arraylistsoru {
public static void main(String[] args) {
    //System.out.println(mukerrlist(ar));
    //System.out.println("isim listesi: "+isimliste());
    //System.out.println("yeni liste: "+istenmeyenharf(isimliste(), "a"));
    //System.out.println(nsayi(9));// [0, 1, 1, 2, 3, 5, 8, 13, 21]
    //System.out.println(nsayikck(8));
    System.out.println(tambolen());
}
public static List<Integer> mukerrlist(int[] ar){
//Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
//elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
List<Integer> liste=new ArrayList<>();

    for (int i = 0; i < ar.length ; i++) {
        if (!liste.contains(ar[i])){
            liste.add(ar[i]);}
    }
        return liste;
}
public static List<String> isimliste(){
//Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
//liste olarak dondurecek bir method olusturun.
        Scanner x=new Scanner(System.in);
        String isimler="";
        List<String> liste=new ArrayList<>();

        do {System.out.println("liste icin isim giriniz" +
                "           \nCikmak icin  Q'ya basiniz");
            isimler=x.nextLine();
            if(!isimler.equalsIgnoreCase("q")){
                liste.add(isimler);
            }
        }while (!isimler.equalsIgnoreCase("Q"));

        return liste;
    }
public static List<String> istenmeyenharf(List<String> list, String harf){
//Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
//kismini list olarak bize donduren bir method olusturun
        List<String> yeniliste=new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
        if (!list.get(i).contains(harf)){
         yeniliste.add(list.get(i));}
        }
        return yeniliste;
    }
public static List<Integer> nsayi(int sayi){
//Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane Fibonacci
//sayisini bir list olarak donduren bir method olusturun.
        List<Integer> liste=new ArrayList<>();
         int sonraki=1;
         int onceki=0;
         int yeni=0;
        int i=1;
         while (i<=sayi){
             liste.add(onceki);
             yeni=sonraki+onceki;
             onceki=sonraki;
             sonraki=yeni;
             i++;
         }
        return liste;
    }
    public static List<Integer> nsayikck(int sayi){
//Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
//bir liste olarak bize donduren bir method olusturun.
        List<Integer> yeniliste=new ArrayList<>();
         int[] ar={0, 1, 1, 2, 3, 5, 8, 13, 21};
        for (int i = 0; i < ar.length ; i++) {
            if (ar[i]<sayi){
                yeniliste.add(ar[i]);
        }
        }
        return yeniliste;

    }
public static List<Integer> tambolen(){
    //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
//tamsayilari bir liste olarak bize donduren bir method olusturun
    List<Integer> liste2=new ArrayList<>();
    System.out.println("lutfen pozitif bir tam sayi giriniz");
    Scanner x=new Scanner(System.in);
    int sayi= x.nextInt();
    for (int i = 1; i <sayi ; i++) {
        if (sayi%i==0){
            liste2.add(i);
        }
    }
    return liste2;
}
}
