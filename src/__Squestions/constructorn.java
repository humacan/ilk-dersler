package __Squestions;
public class constructorn {
    String isim="";
    String renk="";
    int sayi;

    public static void main(String[] args) {
    //Soru 42
    //Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
    //Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
    //Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını
    // gönderelim sonra cagırıp konsolda yazdıralım.
        constructorn obje=new constructorn();
        constructorn obje2=new constructorn("mehmet","turkuaz",21);
        System.out.println(obje2.isim+obje2.renk);
    }
    public constructorn(){
        renk="mavi";
        System.out.println(renk);
    }
    public constructorn(String isim,String renk,int sayi){


        System.out.println("isim: "+isim+
                "\nrenk: "+renk+
                "\nsayi: "+sayi);
    }
}
