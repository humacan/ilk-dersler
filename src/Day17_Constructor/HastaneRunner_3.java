package Day17_Constructor;

public class HastaneRunner_3 {
    public static void main(String[] args) {

        Hastane_3 per1=new Hastane_3();
        System.out.println("isim "+ per1.personelIsmi+
                ", adres: "+ per1.personelAdresi+
                "Telefon: "+ per1.personelTelefon+
                "Personel turu: "+per1.personelTuru);

        System.out.println(per1);

        Hastane_3 per2=new Hastane_3("Selgun");
        System.out.println(per2);



    }
}
