package day35_inharitance;
public class EMuhasebe extends DHastane{
    EMuhasebe(){
        System.out.println("Parametresiz Muhasebe calisti");

    }
    EMuhasebe(String str){
        System.out.println("String Parametreli Muhasebe Cons. calisti");

    }
    EMuhasebe(int sayi){
        this("yusuf");
        System.out.println("Int Parametreli Doktor Cons. calisti");

    }
}
