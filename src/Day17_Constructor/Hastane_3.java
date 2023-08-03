package Day17_Constructor;
public class Hastane_3 {
// biz gorunur bir constructor olusturdugumuzda java default const. siler
// gorunu constructor olusturdugumzda, daha once default constructor i kullanarak olusturulan
// objeler CTE verir
// cozcum icin gorunur bir constructor olusturursak default constructor islevinin yapan
//parametresiz bir constructor da olustururuz

    public  Hastane_3(String isim){
        System.out.println("isim paramatereli constructor");
    }
    public Hastane_3(){
        System.out.println("isim parametresiz constructor");
    }

    public String toString() {
        return "Hastane_3 "+
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", personelTuru='" + personelTuru + '\'';
    }

    static String hastaneAdi="Yildiz Hastanesi";
    static String hastaneTelefon="02125556677";

    String personelIsmi="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
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
