package __Squestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class foreach {
    public static void main(String[] args) {
     mukerrerkaldir();
     //System.out.println(kareal());
     arrayStringKntrl();
        System.out.println(arraykarsilastir());
    }
    public static void mukerrerkaldir(){
        //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
        int[] ar={1,2,3,4,5,6,2,3,4,6};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        List<Integer> liste=new ArrayList<>();
        for (int x: ar) {
               if (!liste.contains(x)) {
                    liste.add(x);
               }
        }
        int[] yeniar=new int[liste.size()];
        for (int i = 0; i <liste.size() ; i++) {
            yeniar[i]=liste.get(i);
        }
        System.out.println(Arrays.toString(yeniar));
    }
    public static int kareal(){
        //Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.
        int[] arr={1,2,3,4,5,6,7,8};
        int toplam=0;
        for (int x:arr) {
            toplam+=x*x;
        }
        return toplam;
    }
    public static void arrayStringKntrl(){
        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.
        String[] ar={"musa","isa","serife","yusuf","sumeyye","kadir","mustafa"};
        List<String> yeni=new ArrayList<>();
        for (String x:ar) {
            if (x.length()%2==0){
                yeni.add(x.substring(0,x.length()/2));
            }else{
                yeni.add(x.substring(x.length()/2,x.length()));
            }
        }
        System.out.println(yeni);
    }
    public static void cumleharf(){
        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
        String metin="Ali ata bak";
         char karakter='a';
         int sayac=0;
            for (char eleman: metin.toCharArray()
            ) {
                if (eleman==karakter){
                    sayac++;
                }
            }
            if (sayac==0){
                System.out.println("Aranan karakter yok");
            }else{
                System.out.println(sayac);
            }
    }
    public static List<Integer> arraykarsilastir(){
        //Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        //ayri bir liste olarak veren bir program yazin
        List<Integer> liste=new ArrayList<>();
        int[] ar= {1,2,4,5,6,7,8};
        int[] ar2={2,3,5,6,8,1,4,12,23};
        Collections.addAll(liste, 1,2,4,5,6,7,8);

        for ( int a : ar2) {
             if (!liste.contains(a)){
                 liste.add(a);
             }
        }
        return liste;
    }
}
