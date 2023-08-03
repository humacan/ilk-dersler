package day18_parametreliConstructur_constructurCall;

public class Hastane {

    public  Hastane(String isim){System.out.println("isim paramatereli constructor");}

    public Hastane(){
        System.out.println("isim parametresiz constructor");
    }

    public Hastane(String isim, String adres, String telefon, String tur){
    personelIsmi=isim;
    personelAdresi=adres;
    personelTelefon=telefon;
    personelTuru=tur;
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
