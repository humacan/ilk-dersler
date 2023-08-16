package Day36_inharitance_datatype_overriding;
import day34_inharitance.EHayvanlar;
import day34_inharitance.GAvcikuslar;

public class HMethodRunner {
    public static void main(String[] args) {

        GAvcikuslar avciKusKartal=new GAvcikuslar();
        //constructor ve data turu ayni ise ilk bulunan deger gecerlidir
        avciKusKartal.hareket(); // G ucarlar
        avciKusKartal.beslenme(); //G et yer
        avciKusKartal.pence(); // G penceldiir
        avciKusKartal.gaga(); // G sivri gagalidir
        avciKusKartal.kanat(); // F kanatlidirlar
        avciKusKartal.solunum(); // F Akciger
        avciKusKartal.cogalma(); // F yumurtayla
        avciKusKartal.omur();  //E yasar ve olurler


        FKuslar  kusKartal=new FKuslar();
        // constructor ve data turu ayni degil ise
        // aramaya data turu olan class dan baslanir ve bulunamazsa CTE verir
        // bulunursa bulunan class dan constructor in oldugu class a kadar
        // bu ozelligin daha guncel hali var mi diye kontrol edilir
        // ve varsa en guncel hali yazilir

        kusKartal.hareket(); // G ucarlar
        kusKartal.beslenme(); //G et yer
        //kusKartal.pence(); // F ve E de yok CTE verir
        kusKartal.gaga(); // G sivri gagalidir
        kusKartal.kanat(); // F kanatlidirlar
        kusKartal.solunum(); // F Akciger
        kusKartal.cogalma(); // F yumurtayla
        kusKartal.omur();  //E yasar ve olurler



        EHayvanlar hayvanKartal=new EHayvanlar();
        hayvanKartal.hareket(); // G ucarlar
        hayvanKartal.beslenme(); //G et yer
        //hayvanKartal.pence(); // E de yok CTE verir
        //hayvanKartal.gaga(); // E de yok CTE verir
        //hayvanKartal.kanat(); // E de yok CTE verir
        hayvanKartal.solunum(); // F Akciger
        hayvanKartal.cogalma(); // F yumurtayla
        hayvanKartal.omur();  //E yasar ve olurler

    }




}
