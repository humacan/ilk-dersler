package Day17_Constructor;

public class HastaneRunner2 {
    public static void main(String[] args) {
        Hastane_2 per1=new Hastane_2();

        System.out.println(per1.personelIsmi);
        System.out.println(per1.personelTelefon);
        System.out.println(per1.personelAdresi);
        System.out.println(per1.personelTuru);
        System.out.println(per1.maas());
        System.out.println("");
        per1.personelIsmi="Adem";
        per1.personelAdresi="Cankaya";
        per1.personelTelefon="2125556677";
        per1.personelTuru="Doktor";
        per1.maas();

        System.out.println(per1.personelIsmi);
        System.out.println(per1.personelTelefon);
        System.out.println(per1.personelAdresi);
        System.out.println(per1.personelTuru);
        System.out.println(per1.maas());
    }
}
