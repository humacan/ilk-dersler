package Day19_StaticKeyword_passByValue;
public class _staic2 {
    static String staticV="java";
    String isimIns="Sevda";
    public static void main(String[] args) {
        _staic2 obj=new _staic2();

        System.out.println(obj.isimIns);  //Sevda
        System.out.println(obj.staticV);  //java
        obj.isimIns="akif";
        System.out.println(obj.isimIns); // akif

        _staic2 obj2=new _staic2();
        System.out.println(obj2.isimIns); //Sevda
        System.out.println(obj2.staticV);  //java

        obj2.isimIns="ayse";
        obj2.staticV="Hava";
        System.out.println(obj.isimIns); // akif
        System.out.println(obj.staticV); // Hava
        System.out.println(obj2.isimIns); //ayse
        System.out.println(obj2.staticV); //Hava
    }
//      INSTANCE VARIABLE
//-Instance variables CLASS incinde ama METHODLARI in disinda olur
//-Instance variables bir OBJE ye baglidir.Dolayisiyla bir OBJE olusturuldugunda olusur ve OBJE silinidiginda silinirler
//-Instance variables  OBJE ismi ile cagrilirlar
//-Instance variable icin ilk deger atamasi yapmak ZORUNLU DEGIL dir ilk atama yapilmazsa default deger alir
//-Her yeni obje olusturuldugunda, instance variables ilk atanan degere esit olur. (--True--)/False
//-Bir clas' i kullanarak 2 instance variable a sahip 6 obje olusturursak, 12 instance variable olusturmus oluruz.(--True--)/False

//       STATIC VARIABLE
//-Static variables class icinde ama METHOD disinda olusturulur
//-Static variables bir class a baglidir.Dolayisiyla, bir class calistirildiginda olusur ve class silindiginde silinirler
//-Static variables class ismi ile cagrilabilirler
//-Static variable icin ilk deger atamasi yapma ZORUNLU DEGIL dir.Eger ilk atama yapilmazsa default deger alir.
//-Static variable a her yeni deger atamasi oldugunda, degeri tum objeler icin degisir. (--True--)/False
//-Bur class i kullanarak 2 static varuable a sahip 6 obje olusutursak, 2 static variables olusturumus oluruz.(--True--)/False
}