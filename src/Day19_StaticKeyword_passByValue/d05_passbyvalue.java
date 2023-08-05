package Day19_StaticKeyword_passByValue;
public class d05_passbyvalue {
    public static void main(String[] args) {

        double fiyat=200;
        //fiyat uzerinde %10 indirim yapip, yeni fiyati yazdiran bir method
        //olusturun
        indirimyap(fiyat);
    }
    public static void indirimyap(double a){

        a=a*90/100;
        System.out.println("&10 idirimli fiyat: " + a);
/*
      method a yazdigimiz parametre ismi main method daki variable ile ayni olmak zorunda DEGILDIR
      ama kodun daha anlasilabilir olmasi icin biz ayni ismi vermeyi TERCIH EDERIZ.
 */

    }
}
