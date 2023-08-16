package Day33_encapsulatino_inheritance;

public class C02_Satinalma {
    public static void main(String[] args) {
        C01_pazarlama pazarlama=new C01_pazarlama();


//  eger pazarlamadaki class uyeleri default access ise
// hem deger atayabilir hem de sonuclari gorebilirim

//        pazarlama.satis=200;
//        System.out.println(pazarlama.satis);
//        pazarlama.toplamsatis=500;
//        System.out.println(pazarlama.toplamsatis);
//eger bir class uyesine, baska classlarin erisimini
// okuma (read / degeri gorme ) derecelendirmek istersek
// access modifier ile yapamayiz
    pazarlama.setSatis(100);
    pazarlama.setSatis(200);
    pazarlama.setSatis(400);

        System.out.println(pazarlama.getToplamsatis()); //700

    }


}
