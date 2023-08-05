package Day19_StaticKeyword_passByValue;

public class d06_PassBy_value {
    public static void main(String[] args) {
    double fiyat=200;

    //sadece indirimli fiyati yazdirmak istersek
        System.out.println(indirimYap10(fiyat)); //180
        System.out.println("indirimli fiyat yazdiktan sonra: "+fiyat);      // 200.0
        //indirimli fiyati kalici hale getirmek istersek
        // main method icin atama yapmaliyiz
        fiyat=indirimYap10(fiyat);
        System.out.println("indirimli fiyati kayit yaptiktan sonra: "+ fiyat); //180
        System.out.println(indirimYap10(500));

    }
    public static double indirimYap10(double fiyat){
      fiyat=fiyat*90/100;
      return fiyat;



    }
}
