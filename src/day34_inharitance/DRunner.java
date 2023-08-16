package day34_inharitance;

public class DRunner {
    public static void main(String[] args) {
        Corolla corolla=new Corolla(); // Corolla class indan obje olusturduk

        System.out.println(corolla.uretimYeri); //Sakarya/Turkiye
        // corolla. dedigimizde Corolla ve Corolla nin parentlarinin ozelliklerini cagirabiliyoruz
        System.out.println(corolla.model); //Corolla

        System.out.println(corolla.aku); //Inci aku

        System.out.println(corolla.sanziman); //Cvt
        //Toyota claass indaki ozellikler
        System.out.println(corolla.marka);
        System.out.println(corolla.lastik);


        //araba class inda aldigi ozellikler
        corolla.yakit="Benzin";
        System.out.println(corolla.yakit);
        System.out.println(corolla.yil);
        System.out.println(corolla.renk);





    }

}
