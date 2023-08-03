package day18_parametreliConstructur_constructurCall;
public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        System.out.println(car1);
    // mecburi alan olarak fiyat ve marka doldurulsun

        Car car2=new Car(120,"Toyota");
        System.out.println(car2);

        Car car3=new Car(10000,"Opel");
        System.out.println(car3);

        Car car4=new Car("Honda");
        System.out.println(car4);

        Car car5=new Car("Volvo");
        System.out.println(car5);

        Car car6=new Car("Nissan");
        System.out.println(car6);
    }
}
