package Day36_inharitance_datatype_overriding;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class DvariableRunner {
    public static void main(String[] args) {

        Cavcikuslar avciKartal=new Cavcikuslar();
        System.out.println(avciKartal.hareket); //C class indan aldik
        System.out.println(avciKartal.beslenme);//C class indan aldik
        System.out.println(avciKartal.pence);   //C class indan aldik
        System.out.println(avciKartal.gaga);    //C class indan aldik
        System.out.println(avciKartal.kanat);   //B class indan aldik
        System.out.println(avciKartal.solunum); //B class indan aldik
        System.out.println(avciKartal.cogalma); //B class indan aldik
        System.out.println(avciKartal.omur);   // B class indan aldik


        Bkuslar kusKartal=new Bkuslar();  // B class inda oldugumuz icin Java C classina gitmez(geri vites yok)
        System.out.println(kusKartal.hareket); //A class indan aldik
        System.out.println(kusKartal.beslenme);//A class indan aldik
        //System.out.println(kusKartal.pence);   // A ve B de yok CTE
        System.out.println(kusKartal.gaga);    //B class indan aldik
        System.out.println(kusKartal.kanat);   //B class indan aldik
        System.out.println(kusKartal.solunum); //B class indan aldik
        System.out.println(kusKartal.cogalma); //B class indan aldik
        System.out.println(kusKartal.omur);   // A class indan aldik

        Ahayvan hayvankartal=new Ahayvan();
        System.out.println(hayvankartal.hareket); //A class indan aldik
        System.out.println(hayvankartal.beslenme);//A class indan aldik
        //System.out.println(hayvankartal.pence);   // A da yok CTE
        //System.out.println(hayvankartal.gaga);    //A da yok CTE
        //System.out.println(hayvankartal.kanat);   //A da yok CTE
        System.out.println(hayvankartal.solunum); //A class indan aldik
        System.out.println(hayvankartal.cogalma); //A class indan aldik
        System.out.println(hayvankartal.omur);   // A class indan aldik


        /*
        Java da en klasik obje olusturma yontemi

        Classadi obj=new ClassAdi();

        ama Child class in constructor i kullanilarak olusturulan objeler icin
        datat turu Parent class lar olarak secilebilir

        Eger constructer ve data turu farkli ise objennin ozelliklerini aramaya DATA turu olan Class tan baslanir

        Eger ozellikler variable olarak olusturuldu ise objenin ozelliklerini
        DATA turu belirler

         */
    }
}
