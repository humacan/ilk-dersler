package __Squestions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Alistirma_sorulari2 {
    public static void main(String[] args) {
        //System.out.println(arrayortadeger());
        //arrayminmak();
        //System.out.println(arraysayitoplam());
        //arraybirlestir();

    String ogrenciadi="ahmet";
    int ogrencino=0;




    }
    public static void basamakToplami(){
        //Kullanicidan üc basamaklı bir sayı alin.
        //Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        //ipuclari:
        //Matematiksel Islemler konusuna bakalim.
        //Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.
        System.out.println("uc basamakli bir sayi giriniz");
        Scanner in=new Scanner(System.in);
        int say1=in.nextInt();
        int yedek=say1;
        int toplam=0;

        while (say1>0){
            yedek=say1%10;  // sayi degerini kaybetmesin diye yedek birler basamagini yedek e gonderdik
            toplam+=yedek;
            say1/=10;
        }
        System.out.println("toplam sayi: "+ toplam);
    }
    public static void Zamanhesapla(){
        //Girilen zamanı saniyeye çeviriniz.
        // Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        // Saati alıp saniyeye cevirebilirsiniz.
        System.out.println("saat giriniz");
        Scanner in=new Scanner(System.in);
        int saat= in.nextInt();
        System.out.println("dakika giriniz");
        int dakika= in.nextInt();
        System.out.println("saniye giriniz");
        int saniye= in.nextInt();

        System.out.println((((saat*60)*60+dakika*60)+saniye));
    }
    public static void Kutlehesapla(){
        //kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
        //**indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
        // Kullanıcıya aşağıdaki gibi mesaj verin:
        // Eğer VKİ 18.5'ten az ise --> zayıfsınız
        // Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        // Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        //VKİ 30'a eşit veya daha fazlaysa --> agam obezsin, diyet yap!
        System.out.println("kilonuzu giriniz");
        Scanner in=new Scanner(System.in);
        int kilo= in.nextInt();
        System.out.println("boyunuz giriniz");
        double boy= in.nextDouble();
        double vki=kilo/(boy*boy);
        if (vki< 18.5){
            System.out.println(vki+" zayifsiniz");
        } else if (vki>18.5 && vki<25) {
            System.out.println(vki+" kilo idealdir");
        } else if (vki>25 && vki<30) {
            System.out.println(vki+" biraz kilolusunuz");
        } else if (vki>=30) {
            System.out.println(vki+"  obezite durumundasiniz, diyete baslayin");
        }else {
            System.out.println("yanlis bir derger girdiniz");
        }
    }
    public static void KredikartBilgi(){
        //Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        //Ad ve soyadın baş harfleri büyük olmalıdır
        //Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        //Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
        //Ipucu: IF ile çözebilirsiniz.
        //Giriş :> Gandalf Grey 563245879632
        //Çıktı :> İsim : G****** G***
        //		 > CCN : **** **** 9632
        Scanner in=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=in.nextLine();
        System.out.println("soy isim giriniz");
         String soyisim=in.nextLine();
        System.out.println("16 haneli kart numarasini giriniz");
         String kartno=in.nextLine();

        System.out.println("isim: "+isim.substring(0,1)+isim.substring(1,isim.length()).replaceAll("\\w","#")+" soyisim: "+soyisim.substring(0,1)+soyisim.substring(1,soyisim.length()).replaceAll("\\w","#"));
        if (kartno.length()>=16){
        System.out.println(kartno.substring(0,4).replaceAll("\\d","#")+" "
        +kartno.substring(4,8).replaceAll("\\d","#")+" "+kartno.substring(8,12).replaceAll("\\d","#") +" "+kartno.substring(12,kartno.length()));
        } // 0123456789123456
        else {
            System.out.println("kart numarasini eksik girdiniz tekrar deneyin");
        }
    }
    public static void onbasamaklisayi(){
        //Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        //Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
        //Ipucu:  IF/Else kullanabilirsiniz. soru12
        //İki tamsayı girin:
        //25  veya  4567986321453
        //46   veya 123456
        //Sayıların toplamı: 71  veya  Fazla Yüklenme
        String sayi1="1111111111";
        String sayi2="9999999999";
        long bas1=sayi1.length();
        long bas2=sayi2.length();

        long toplam=bas1+bas2;
        String toplam1="" +toplam; // length methodu icin Stringe cevrildi
        if (bas1 > 10 || bas2 > 10 || toplam1.length() >10) {
            System.out.println("fazla yukleme");
        }else{System.out.println("10 basamaktan kucuk");
        }
    }
    public static void charcevap(){
        //Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        //Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        //Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        //Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
        //Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın. -soru 13
        System.out.println("harhangi bir karakter giriniz");
        Scanner in=new Scanner(System.in);
        char karakter=in.next().charAt(0);

        switch (karakter){
            case 'a':
                System.out.println("istedigiiz karakter isleniyor");
                break;
            case 'b':
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                break;
            case 'c':
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin");
                break;
        }
    }
    public static void karakterKontrol(){
    //Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
    //char ch1=            'a'
    //String name =     "Ali bakkala geç gitti."
    //Beklenen Çıktı=    a sayısı = 3
    //Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
    //Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz! -soru 14 alternatif for
        System.out.println("herhangi bir isim giriniz");
        Scanner in=new Scanner(System.in);
        String isim=in.nextLine().toLowerCase();
        System.out.println("herhangi bir karakter giriniz");
        char karakter=in.next().charAt(0);
        int sayac=0;
        for (int i =0; i <isim.length() ; i++) {
            if (isim.charAt(i)==karakter)
                    sayac++;
    }if (sayac==0){
            System.out.println("girdiginiz "+ karakter+" karakteri isim icinde hic yok");
        }else {
            System.out.println(karakter+" karakteri "+ sayac+" tane var");
        }
    }
    public static void karaktersayi(){
    //Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
    //char ch1=            'a'
    //String name =     "Ali bakkala geç gitti."
    //Beklenen Çıktı=    a sayısı = 3
    //Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
    //Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz! soru 14
        System.out.println("bir isim giriniz");
        Scanner in=new Scanner(System.in);
        String isim= in.nextLine().toLowerCase();
        System.out.println("karakter giriniz");
        char krktr=in.next().charAt(0);
        int sayac=0;
        int index=0;

        while (index<isim.length()){
            if (krktr==isim.charAt(index)){ // index her dongude bir arttigi icin ismin lengthine kdr kontrol edecek
                sayac++;
            }
            index++;
        }if (sayac==0){
            System.out.println("girdiginiz "+ krktr+ " isim icerisinde yok");
        }else {
            System.out.println("girdiginiz "+ krktr+ " isim icerisinde "+sayac+ " kadar var");
        }
    }
    public static void stringsondan(){
     //Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
     // Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
     // Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
     // Loopun içerisinde StringM methodlarından  yararlanalım!  -soru 15
        while (true){
            System.out.println("bes karakterli bir isim giriniz");
            Scanner in=new Scanner(System.in);
            String isim=in.nextLine();
            String yedek="";

            if (isim.length()<5) {
                System.out.println("en az bes karakterli bir isim giriniz");
                continue;
            }
            yedek=isim.substring(2,isim.length())+isim.substring(2,isim.length());
            System.out.println("girdiginiz ismin son uc harfin iki kere tekrari: "+yedek);
            break;
    }
}
    public static void isimtekcift(){
     //Soru 16-)
        //K  ullanıcıdan 2 isim/kelime alın: isim1 ve isim2
        //-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
        //-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        //   Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        //	 isim1= masa
        //   isim2= ali
        //	 Konsol => maalisa  - soru 16
        System.out.println("Lutfen bir isim giriniz");
        Scanner in=new Scanner(System.in);
        String isim1=in.nextLine();
        System.out.println("Lutfen ikinci bir isim giriniz");
        String isim2=in.nextLine();

        if (isim1.length()%2==0){
            System.out.println(isim1.substring(0,isim1.length()/2).concat(isim2)+isim1.substring(isim1.length()/2,isim1.length()));

        }else  {
            System.out.println("isim2, isim1'e eklenemez, cunku isim1 tek rakam");

        }
    }
    public static void dizehrfkotrol(){
    //Soru 17-)
    //Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
    //İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım
    //IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
        System.out.println("uc karakterli bir isim giriniz");
        Scanner in=new Scanner(System.in);
        String dize=in.nextLine();

        if (dize.length()<3 || dize.length()>3){
            System.out.println("lutfen uc karakterli giriniz");

        }else {
            System.out.println(dize.charAt(0) == dize.charAt(1) || dize.charAt(0) == dize.charAt(2)?"dize yenilenen karakterlere sahip" :"dize benzersiz karakterlere sahip" );

                }
        }
    public static void kmhesap(){
        //Soru 18-) Method Sorusu
        //Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım. Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim
        // ve bize varış süremizi hesaplasın
        //yol=Hız*zaman  200=50+4
            System.out.println("lutfen arac hizinizi giriniz");
            Scanner in=new Scanner(System.in);
            int hiz=in.nextInt();
            System.out.println("mesafe icin km giriniz");
            int km=in.nextInt();
            System.out.println("varis suresi: "+km/hiz+ " saat");
        }
    public static void burchesapla (){
        //Soru 19-)  Method Sorusu
        //Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        //Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
        System.out.println("lutfen dogdugunuz ayi rakam olarak giriniz");
        Scanner in=new Scanner(System.in);
        int ay= in.nextInt();
        boolean flag=true;
        while (flag) {
            switch (ay) {
                case 1:

                    System.out.println("ocak ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun = in.nextInt();

                    if (gun < 1 || gun > 31) {
                    System.out.println("yanlis girdiniz, tekrar deneyiniz");
                    String tekrer = in.nextLine();
                    flag = true;
                    break;

                    } else if (gun <= 1 || gun <= 20) {
                        System.out.println(gun + " ocak oglak burcu");
                        flag=false;

                    } else {
                        System.out.println(gun + " ocak kova burcu");
                    }flag=false;
                    break;


                case 2:
                    System.out.println("subat ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun1 = in.nextInt();

                    if (gun1 < 1 || gun1 > 29) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun1 <= 1 || gun1 <= 19) {
                        System.out.println(gun1 + " subat kova burcu");
                        flag=false;

                    } else {
                        System.out.println(gun1 + " subat balik burcu");
                    }flag=false;
                    break;
                case 3:
                    System.out.println("mart ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun2 = in.nextInt();

                    if (gun2 < 1 || gun2 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun2 <= 1 || gun2 <= 20) {
                        System.out.println(gun2 + " mart balik burcu");
                        flag=false;

                    } else {
                        System.out.println(gun2 + " mart koc burcu");
                    }flag=false;
                    break;
                case 4:
                    System.out.println("nisan ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun3 = in.nextInt();

                    if (gun3 < 1 || gun3 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun3 <= 1 || gun3 <= 20) {
                        System.out.println(gun3 + " nisan koc burcu");
                        flag=false;

                    } else {
                        System.out.println(gun3 + " nisan boga burcu");
                    }flag=false;
                    break;
                case 5:
                    System.out.println("mayis ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun4 = in.nextInt();

                    if (gun4 < 1 || gun4 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun4 <= 1 || gun4 <= 20) {
                        System.out.println(gun4 + " mayis boga burcu");
                        flag=false;

                    } else {
                        System.out.println(gun4 + " mayis ikizler burcu");
                    }flag=false;
                    break;
                case 6:
                    System.out.println("haziran ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun5 = in.nextInt();

                    if (gun5 < 1 || gun5 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun5 <= 1 || gun5 <= 21) {
                        System.out.println(gun5 + " haziran ikizler burcu");
                        flag=false;

                    } else {
                        System.out.println(gun5 + " haziran yengec burcu");
                    }flag=false;
                    break;
                case 7:
                    System.out.println("temmuz ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun6 = in.nextInt();

                    if (gun6 < 1 || gun6 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun6 <= 1 || gun6 <= 22) {
                        System.out.println(gun6 + " temmuz yengec burcu");
                        flag=false;

                    } else {
                        System.out.println(gun6 + " temmuz aslan burcu");
                    }flag=false;
                    break;
                case 8:
                    System.out.println("agustos ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun7 = in.nextInt();

                    if (gun7< 1 || gun7 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun7<= 1 || gun7 <= 23) {
                        System.out.println(gun7 + " agustos aslan burcu");
                        flag=false;

                    } else {
                        System.out.println(gun7 + " agustos basak burcu");
                    }flag=false;
                    break;
                case 9:
                    System.out.println("eylul ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun8 = in.nextInt();

                    if (gun8< 1 || gun8 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun8<= 1 || gun8 <= 23) {
                        System.out.println(gun8 + " eylul basak burcu");
                        flag=false;

                    } else {
                        System.out.println(gun8 + " eylul terazi burcu");
                    }flag=false;
                    break;
                case 10:
                    System.out.println("ekim ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun9 = in.nextInt();

                    if (gun9< 1 || gun9 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun9<= 1 || gun9 <= 23) {
                        System.out.println(gun9 + " ekim terazi burcu");
                        flag=false;

                    } else {
                        System.out.println(gun9 + " ekim akrep burcu");
                    }flag=false;
                    break;
                case 11:
                    System.out.println("kasim ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun10 = in.nextInt();

                    if (gun10< 1 || gun10 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun10<= 1 || gun10 <= 22) {
                        System.out.println(gun10 + " kasim akrep burcu");
                        flag=false;

                    } else {
                        System.out.println(gun10 + " kasim yay burcu");
                    }flag=false;
                    break;
                case 12:
                    System.out.println("aralik ayi");
                    System.out.println("dogdugunuz gunu giriniz");
                    int gun11 = in.nextInt();

                    if (gun11< 1 || gun11 > 31) {
                        System.out.println("yanlis girdiniz, tekrar deneyiniz");
                        String tekrer = in.nextLine();
                        flag = true;
                        break;

                    } else if (gun11<= 1 || gun11 <= 22) {
                        System.out.println(gun11 + " arallik yay burcu");
                        flag=false;

                    } else {
                        System.out.println(gun11 + " aralik oglak burcu");
                    }flag=false;
                    break;
                default:
                    System.out.println("yanlis sayi girdiniz");

            }
        }
    }
    public static int  ebobekok(){
    //Soru 22-)
        //Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        //Giriş :
        //30 ve 40
        //Beklenen Çıktı:
        //30 ve 40 için EBOB= 10
        //30 ve 40 için EKOK= 120
        //Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
        int ebob=0;
        System.out.println("iki tam sayi giriniz ");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int ekok=0;
        for (int i =1;  i< num1 ||   i <=num2; i++) {
            if (num1%i==0 && num2%i==0){
                ebob=i;
            }
        }ekok=((num1*num2)/ebob);
        System.out.println("En buyuk ortak bolen "+ebob);
        System.out.println("En kucuk ortak kat "+ekok);

        return ebob;
    }
    public static void faktoryelhesap(){
    //Soru 23-)
        //Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
        //Girdi: 6
        //Çıktı: 6!=65432*1=720
        //ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
        System.out.println("faktoryel hesabi icin bir rakam giriniz");
        Scanner in=new Scanner(System.in);
        int sayi=in.nextInt();
        int faktoryel=1;
        String faktrkmlr="";

        for (int i = 6; i > 1; i--) {
            faktoryel*=i;
            faktrkmlr+=i;
        }
        System.out.println(sayi+"!="+faktrkmlr+"*"+"1"+"= "+faktoryel);
    }
    public static void gerisayiim(){
        //20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.    Soru 24-)
        //20'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
        //Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir :wink:
        int sayi=20;
        int sayac=0;

        while (sayi>=0){

            System.out.print(sayi+" ");
            sayi-=2;
        }
    }
    public static void alfabe(){
    //Soru 25-)
    //Alfabeyi konsola yazdırın.
    //a b c .. .. .. .. y z
    //ipucu: char kullanmak iyi bir fikir olabilir :wink:
        char ilk='a';
        char son='z';
        String alfabe=" ";

        for (char i = ilk; i <=son ; i++) {
            System.out.print(i+ " ");

        }
    }
    public static void mukemmelsayi(){
    //Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.  soru 26
    //NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
    //Giriş :6
    //Çıkış: 6 Mükemmel Sayıdır
    //Giriş :7
    //Çıkış:7 Mükemmel Sayı Değildir
    //ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz :wink:
        System.out.println("bir pozitif tam sayi giriniz");
        Scanner in=new Scanner(System.in);
        int mkmlsayi=in.nextInt();
        int pztfblntplm=0;
        for (int i = 1; i <mkmlsayi ; i++) {
            if (mkmlsayi%i==0){
                pztfblntplm+=i;
                 }
        }if (pztfblntplm==mkmlsayi){
            System.out.println(mkmlsayi+" sayisi mukemmel bir sayidir!!!");

        }else {
            System.out.println(mkmlsayi+" sayisi mukemmel bir sayi degildir");
        }

    }
    public static void asciideger(){
    //Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
    //ipucu: For Loop ve Char kullanarak çözebilirsiniz.
    //Ascii value of a = 97
    //Ascii value of b = 98
    //Ascii value of c = 99
    //Ascii value of d = 100
        char ilk='a';
        char son='z';
        char harf=' ';
        String hrf= String.valueOf(harf);

        for (int i = ilk; i <son ; i++) {

            System.out.println("Ascii "+ (char)i +" nin aldigi deger " +i+ " ");

        }
    }
    public static void sayiterscevir(){
    //Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
    //      Sayı: 1238
    //      Sayının Tersi: 8321
    //İpucu:  Loop kullanabilirsiniz.    Soru-28)
        System.out.println("bir sayi giriniz");
        Scanner in =new Scanner(System.in);
        int sayi=in.nextInt();
        String ters="";
        int birler=0;

        while (sayi>0){
            birler=sayi%10;
            ters+=birler;
            sayi/=10;
        }
        System.out.println(ters);
    }
    public static void ardisiktoplamsayi(){
    //1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
    //İpucu: Loop kulanabilirsiniz.    Soru29-)

    int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam+=i;
             }
        System.out.println("1 den 100 e kdr olan sayilarin toplami: " +toplam);
    }
    public static void yinelenkarakter(){
    //Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
    //( mülakat sorusu )          Soru 30-)
    //String str="Javacokkolay"
    //Yinelenen karakterler : [a, o, k]
    //İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
    String str="javacokguzelbirprogram";
    char[] harf=str.toCharArray();
    System.out.println(Arrays.toString(harf));  // [j, a, v, a, c, o, k, g, u, z, e, l, b, i, r, p, r, o, g, r, a, m]

    List<String> liste=new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++)  {
                if (harf[i]==harf[j] && !liste.contains(String.valueOf(harf[i]))){
                    liste.add(String.valueOf(harf[i]));}
            }
        }System.out.println("yinelenen karakterler: "+liste); // [a, o, g, r]
    }
    public static int[] arrayelemanekle(){
    //Kullanıcıdan Arrayin uzunlugunu isteyin.         //Soru 31-)
    //Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
    //İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
        Scanner in=new Scanner(System.in);
        System.out.println("lutfen array icin uzunluk girin");
        int uzunluk=in.nextInt();
        int[] ar= new int[uzunluk];

        for (int i = 0; i <ar.length; i++) {
            in=new Scanner(System.in);
            System.out.println("Array icin eleman giriniz");
            ar[i]=in.nextInt();
        }
        return ar;
    }
    public static void arrayters(){
    //Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    //İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.
    //int[] yeniar= arrayelemanekle(); // bir onceki class taki methodu yeniar e atadik.   //Soru 32-)
        int[] arrReverse=new int[4];
        //System.out.println(Arrays.toString(yeniar));  //[1, 2, 3, 4, 5]
        int[] yeni={1,2,3,5};

        for (int i = 0; i< yeni.length; i++) {
            arrReverse[i]= yeni[yeni.length-1-i];

        }
        System.out.println(Arrays.toString(arrReverse));
    }
    public static void arraystringters(){
    //Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil)
    //String str=''Kodlama harika.''
    //String arr[]: ".etaerg si gnidoC"
    //İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın.   Soru 33-)
    String  str=".etaerg si gnidoC";

    String[] ar2=str.split("");
        System.out.println(Arrays.toString(ar2));
    String yeni="";
        for (int i = str.length()-1; i >=0; i--) {
           yeni+=ar2[i];
        }
        System.out.println(yeni);
    }
    public static void rakamtoplamarray(){
    // Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.
    // String str : ade1r4d3
    // Int toplam : 8
    // İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
    // Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz            Soru 34-)
    String yazi="ade1r4d3";

    char[] krk= (yazi.replaceAll("\\D","")).toCharArray();
    System.out.println(Arrays.toString(krk));  // [1, 4, 3]

    int toplam=0;


    for (int i = 0; i<krk.length; i++) {
    toplam+=  Integer.parseInt(String.valueOf(krk[i]));
        System.out.println(toplam);
        }
        System.out.println(toplam);
    }
    public static char[] dizileme( ){
    //Soru 35-)
    // Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
    // --> toCharArray() yöntemini kullanmayın
    // String isim:    Yakup
    // char arr[]:     [Y,a,k,u,p]
    // İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak,
    // her bir harfi, Arraye yerleştirin

    String isim="yakup";
    char[] ar= new char[isim.length()];


    for (int i = 0; i <isim.length() ; i++) {
                ar[i] = isim.charAt(i);
        }

         return ar;
    }
    public static int  arrayortadeger(){
    //Soru 36-)
    //Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın. ( Yapabilirseniz Dinamik kod
    // yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
    //inputarr[]=   {1,2,3,4,5,6,7}
    //output:         4
    //İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun cevabını
    // degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
    int[] sayi={1,2,3,4,5,6,7,8,9};
    int orta=sayi.length/2;

    return orta;
    }
    public static  int[] eliminateDuplicates(int[] list){
    // SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---       //Soru 37-)
    // (Eliminate duplicates)
    // Write a method that returns a new array by eliminating the duplicate values in the array using
    // the following method header
    // Write a test program that reads in ten integers, invokes the method, and displays the result.
    // (Tekrarlananları çıkar)
    // Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
    // On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
    // public static int[] eliminateDuplicates(int[] list)
    // On sayi giriniz:
    // 1 2 3 2 1 6 3 4 5 2
    // Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
    int fark=list[0];
    List<Integer> liste=new ArrayList<>();

    for (int i = 0; i <list.length ; i++) {
        for (int j = 0; j < list.length; j++) {
            if (list[i]==list[j]   && !liste.contains(list[i]))  {
                liste.add(list[i]);
            }
        }
     }
        int[] list2=new int[liste.size()]; // List array list  int arraye atandi
        for (int j = 0; j < liste.size() ; j++) {
            list2[j]=liste.get(j);
        }
        return list2;
    }
    public static void arrayminmak( ){
    //Soru-38)
    //Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve
    // maksimum sayıları yazdıran bir yöntem yazın
    //Örnek:
    //Input : {3,2,5,4,1,6}
    //Output :
    //min: 1
    //max: 6
    //Ipucu: sort yöntemni kullanabilirsiniz.
    int[] ar= new int[]{3, 2, 5, 4, 1, 6};
    System.out.println(Arrays.toString(ar));
    Arrays.sort(ar);
    System.out.println(Arrays.toString(ar));
    int buyuk=ar[0];
    int kucuk=0;
        for (int i = 0; i <ar.length ; i++) {
            if (ar[i]>buyuk){
                buyuk=ar[i];
            }else {
                kucuk=ar[i];
            }

        }
        System.out.println("buyuk sayi " +buyuk +" kucuk sayi " + kucuk);
    }
    public static int arraysayitoplam(){
    //Soru-39)
    //Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir
        // method yazın ve ardından sonucu main methodda yazdırın.
    //Örn:
    //girdi : {1,2,3,4,5,6,7,8}
    //çıkış: 36
    //ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
    int[] sayi={1,2,3,4,5,6,7,8};
    int toplam=0;
        for (int i = 0; i <sayi.length ; i++) {
            toplam+=sayi[i];

        }
    return toplam;
    }
    public static void arraybirlestir(){
    //Soru 40-)
    //Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen
        // ve yazdıran bir method yazın.
    //		 * Input1={1,2,3,4}
    //		 * Input2={5,6}
    //		 * Çıktı={1,2,3,4,5,6}
    int[] in1={1,2,3,4};
    int[] in2={5,6};
    int ilk=in1.length;
    int son=in2.length;
    int[] output= Arrays.copyOf(in1,in1.length+in2.length);
    System.arraycopy(in2,0,output,in1.length,in2.length);


        System.out.println(Arrays.toString(output));

    }
    public static void  sum(int...varargs){
    //Soru 41-)
        //  Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer
        //  sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        //  Method name=sum
        //  eğer metodu bu şekilde çağırırsanız
        //  toplam(1,2,3) çıktı =6
        //	toplam(1,2,3,4,5) çıktı =15
        //	sum(1,2) output=3
        //  Ipucu:  varargs sorusu, varargs olusturalım



    }
    public static void  changename(String ogrenciadi,int ogrencino){
    //Soru 43-)
    //Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
    //Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve methodda
    // tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
    //Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
    //Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
    // Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.


    }

}
































