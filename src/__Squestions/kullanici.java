package __Squestions;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class kullanici {
    public static void main(String[] args) {
        printHappyUsers();
    }
// Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
// ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
// şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
//  Bunun için;
// 1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)
// 2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
// ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
// return edin.
// 3- Registration(Kayıt) classı na aynı zamanda kendine verilen
// ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
// yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.

public class  Registration{
 public static List<String> register( ){
    List<String> liste=new ArrayList<>();

     String kayitol="";

        System.out.println("isim giriniz");
        Scanner x = new Scanner(System.in);
         kayitol=x.nextLine();

         LocalDateTime registerDate=LocalDateTime.now();
        liste.add(kayitol);

     return liste;
 }
    }
    public static void printHappyUsers(){
        System.out.println(Registration.register());

        LocalDateTime registerDate=LocalDateTime.now();
        if ( registerDate.getSecond()>10){
            System.out.println("uzgunum kaybettiniz "+ registerDate.getSecond());
        }
        else{
            System.out.println("sansli kazanansiniz " +registerDate.getSecond());
        }
    }

}
