package Day17_Constructor;

public class hastane {
    static String hastaneAdi="Yildiz Hastanesi";
    static String hastaneTelefon="02125556677";

    String personelIsmi="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmed";
    String personelTelefon="Telefon belirtilmedi";
    String personelTuru="Personel turu belirtilmedi";

    public int maas(String personelTuru){
        switch (personelTuru){
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
