package day34_inharitance;

public class EHayvanlar {


    /*
    bir class olusturulurken
    ilerde child class lar olabilir diye dusunuyoursaniz
    sadece child class larin ulasmasini istediginiz methodlari
    protected access modifier ile

     */

    public void hareket(){
        System.out.println("hareket ederler");
    }
    public void solunum(){
        System.out.println("akcigerlerle nefer alirlar");
    }
    public void beslenme(){
        System.out.println("beslenirler");
    }
    public void cogalma(){
        System.out.println("cogalirlar");
    }
    public void omur(){
        System.out.println("yasar ve olurler");
    }
}
