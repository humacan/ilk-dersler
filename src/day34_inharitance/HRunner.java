package day34_inharitance;

import java.util.Map;

public class HRunner {
    public static void main(String[] args) {
        GAvcikuslar avciKusKartal=new GAvcikuslar();

        // Avci  kuslar class indan aldigi ozellikler
        avciKusKartal.hareket();
        avciKusKartal.beslenme();
        avciKusKartal.pence();
        avciKusKartal.gaga();

        //kuslar class indan aldigi ozellikler
        avciKusKartal.kanat();
        avciKusKartal.solunum();
        avciKusKartal.cogalma();

        // hayvanlar class indan aldigi ozellikler
        avciKusKartal.omur();

        avciKusKartal.toString();





    }
}

