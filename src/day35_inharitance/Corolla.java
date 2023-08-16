package day35_inharitance;

public class Corolla extends BToyota { // Corolla yi BToyota nin child i yaptik

 Corolla() { // super cons. call
     // gorunur cons. call yok ama  gorunmeyen super cons. call
     System.out.println("Corolla parametresiz constructer");
 }
 Corolla (String str){
     // gorunmeyen super(); var
     //Java nin koydugu ve gorunur olmayan cons. call
     // her ZAMAN parametresiz olan super();
    // kodu yazanlar baska cons call yazalbiilirler
    // eger ilk satirda gorunur bir cons call varsa
    // java default olarak koydugu super(); siler
 }

    String uretimYeri="Sakarya/Turkiye";
    String model="Corolla";
    String aku="Inci aku";
    String sanziman="Cvt";

    public static void main(String[] args) {

        Corolla corolla=new Corolla();
       // extrnds keyword kullanilan bir class da
       // olusturulan her constructor in ilk
       // satirinda gorsekde gormesekde cons. call vardir
       // eger ilk satirda gorunur bir cons. call yoksa
       // java nin koydugu gorunmeyen super(); vardir
    Corolla corolla1=new Corolla("Kirmizi");


    }
}
