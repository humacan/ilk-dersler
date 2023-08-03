package Day17_Constructor;
public class Hastane_2 {
        /*
        bir class da gorunurde constructor yoksa default constructor vardir

        default constructor parametresiz bir constructor dir
        ve baoyd sinde hicbir kod bulunmaz

        default constructor asagida verilen construcctor a benzer
        Hastane_2(){
        }
        ancak bir constructor gorunur ise artik ona default conostructor denemez

        biz herhamgo bor constructor olusturursak java default constructor i siler
        yani bir class da gorunur bir constructor varsa DEFAULT CONSTRUCTOR yoktur,
        diyebiliriz
         */
        Hastane_2(){
            System.out.println("parametreiz kod calisti");
        }
        static String hastaneAdi="Yildiz Hastanesi";
        static String hastaneTelefon="02125556677";

        String personelIsmi="Isim belirtilmedi";
        String personelAdresi="Adres belirtilmed";
        String personelTelefon="Telefon belirtilmedi";
        String personelTuru="Personel turu belirtilmedi";


    public  int maas(){         //personelTuru method da tanimalnmamasina ragmen
        switch (personelTuru){  //method static olmadigi icin class daki non static esdegeri kullanir
            case "Doktor":
                return 5000;
            case "Hemsire":
                return 3000;
            case "Bashemsire":
                return 4000;
            default:
                return 1900;
        }

    }
}
