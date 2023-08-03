package ArrayList;
public class ders13_baskaClassdankullanma {
    public static void main(String[] args) {
        // verilen sayinin pozitif tam bolenleri sayisi 10 dan cok is
        // "guzel" yoksa "kotu" yazdirin

        int sayi=100;

        int pozitifTambolenlerSayisi= ders12_TamBolenlerListesi.pozitifBolenleriListele(sayi).size();

        if (pozitifTambolenlerSayisi>10){
            System.out.println("Guzel");
        }else {
            System.out.println("Kotu");
        }
    }
}
