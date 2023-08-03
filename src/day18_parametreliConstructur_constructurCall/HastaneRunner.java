package day18_parametreliConstructur_constructurCall;
public class HastaneRunner {
    public static void main(String[] args) {

        Hastane per1=new Hastane();
        System.out.println(per1);
        per1.personelIsmi="Sevda";
        per1.personelAdresi="Ankara";
        per1.personelTelefon="5552344343";
        per1.personelTuru="Hemsire";

        System.out.println(per1);
        // bir obje olusturuldugunda o objenin ozelliklerini atama yapmazsak
        //class daki ilk degerleri alacaktir
        // eger o objenin kendine ozgu degerleri olmasini istiyorsak
        //Atama yapmaliyiz

        Hastane per2=new Hastane("Adem","Cankaya","5553332211","Doktor");


        System.out.println(per2);
        Hastane per3=new Hastane("Adem","Sincan","5552123456","Hekim");
        System.out.println(per3);
    }
}
