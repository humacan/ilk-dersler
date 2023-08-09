package __Squestions;
import java.util.Scanner;
public class student {
    static String ogrenciisim="ali";
    static String ogrencisoyisim="cino";
    static int ogrenciyas=15;
    public static void main(String[] args) {

    changename("Musa","Cino",14);
    changesurname();
        System.out.println("gecerli ogrenci soyisim: "+ogrencisoyisim);
//Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.     //Soru 43-)
//Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve methodda
// tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
//Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
//Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
// Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
    }
    public static void changename(String ogrenciisim,String ogrencisoyisim, int ogrenciyas){
        System.out.println("isim: "+ogrenciisim+
        "\nsoyisim: "+ogrencisoyisim+
                "\nogrenci yas: "+ ogrenciyas);
    }
    public static void changesurname(){
        System.out.println("yeni ogrenci soyismi giriniz");
        student obj=new student();
        Scanner x=new Scanner(System.in);
        obj.ogrencisoyisim=x.nextLine();

        System.out.println("yeni ogrenci soyismi: "+ ogrencisoyisim);

    }
}
