package __Squestions;           //
import java.util.Scanner;
public class method2_tersten_yazdir {
    public static void main(String[] args) {
        // kelimeyi tersten donduren bir method

        System.out.println(tersYazi("merhaba"));        // dondurulen method

        System.out.println("bir kelime giriniz");
        Scanner tara=new Scanner(System.in);
        String yazi= tara.nextLine();
        tersten(yazi);                                           // yazdirilan method
    }
    public static String tersYazi(String ifade){

        String ters="";
        int index = ifade.length()-1;

        while (index>=0){
          ters+= ifade.charAt(index);
          index--;
        }
         return  ters;
    }
    // kelimeyi tersten yazan bir method yazdiralim
    public static void tersten(String yazi){
//        System.out.println("Bir kelime giriniz");
//        Scanner tara=new Scanner(System.in);
//        String yazi= tara.nextLine();

        String terscevir="";
        int index2=yazi.length()-1;

        while (index2>=0){
            terscevir+= yazi.charAt(index2);
            index2--;
        }
        System.out.println("yazi nin tersi: "+ terscevir);

    }

}
