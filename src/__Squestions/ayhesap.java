package __Squestions;
import java.util.Scanner;
public class ayhesap {
    public static void main(String[] args) {
       //Bir aydaki gün sayısını bulmak için bir Java programı yazın
        //Bir ay numarası girin: 2
        //Bir yıl girin: 2016
        //Şubat 2016'da 29 gün vardır
        //Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
        //Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
        //ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        //1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
        //Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        //2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
        //Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
        System.out.println("herhangi bir ay giriniz");
        Scanner in=new Scanner(System.in);
        String ay= in.nextLine();
        switch (ay){
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case  "ekim":
            case "aralik":
                System.out.println("bu ay 31 gundur");
                break;
            case "subat":
                subatayi();
                break;
            case "nisan":
            case "haziran":
            case "eylul":
            case "kasim":
                System.out.println("bu ay 30 gundur");
                break;
        }
    }
    public static void subatayi(){
        System.out.println("lutfen subat ayi kotrolu icin yili tam olarak giriniz");
        Scanner in=new Scanner(System.in);
        int yil= in.nextInt();


        if ((yil%4==0 && yil%100!=0) || yil%100==0 && yil%400==0   ){
            System.out.println("bu yil artik yildir ve Subat ayi 29 gundur");
        }else {
            System.out.println("bu yil normal bir yildir ve Subat ayi 28 gundur");
        }

    }
}
