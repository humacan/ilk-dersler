package Day17_Constructor;

public class ConstructorRunner {
    public static void main(String[] args) {
    // Bu class dan onceki class taka variable method lara ulasmaliyiz
    System.out.println(constructors.isHappy);
    constructors.staticMethod();

    //static olmayan class uyelerine ulasmak icin o class da obje olusturulmali

    constructors  nesne   =  new constructors();  // constructrors da bir obje olusturduk
    //bastaki class adi ve objenin data turudur
    // obje==> objenin adi   new==> yeni obje olusturmak icin keyword

    // constructors()==> new constructors
    // bir objenin olusturulmasi ve ilk deger atamasinin yapilmasi icin mutlaka constructor
    // calismalidir

    // bir class olusturuldugunda o class dan obje olusturluabilmesi icin her class a
    // otomatik default bir constructor yerlestirir. default constructor gorunmez

    System.out.println(nesne.str);
    nesne.sayi=20;
    nesne.staticOlmanyanMethod();


    }
}
