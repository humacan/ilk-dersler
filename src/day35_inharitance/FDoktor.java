package day35_inharitance;
public class FDoktor extends EMuhasebe {

    FDoktor(){
        super(3);
        System.out.println("Parametresiz Doktor calisti");
    }
    FDoktor(String str){ //super(); vardir
        System.out.println("String Parametreli Doktor Cons. calisti");

    }
    FDoktor(int sayi){
        this();
        System.out.println("Int Parametreli Doktor Cons. calisti");

    }

    public static void main(String[] args) {
        //FDoktor doktor1=new FDoktor("Java");
        //FDoktor doktor2=new FDoktor();
        FDoktor doktor2=new FDoktor(5);
    }
}
