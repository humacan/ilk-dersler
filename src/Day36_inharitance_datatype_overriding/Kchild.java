package Day36_inharitance_datatype_overriding;

public class Kchild extends Jparent{

    public void method1(){
        System.out.println("child class method");
    }

    @Override
    public void method2() {
        super.method2();
    }
    /*
    @overrride  notasyonu overriden method ile
    overriding method u birbirine bagalr
    eger overriden method silinirse
    CTE verir

    kullanmak zorunda degiliz
    ama iki methodu baagimli yapmak istiyorsak
    kullanilabilir

    overriding method varken overriding method
    calismaz

    Eger her iki methodu calistirmak istersek
    child class daki overriding methoda ekleyebiliriz

         */
}
