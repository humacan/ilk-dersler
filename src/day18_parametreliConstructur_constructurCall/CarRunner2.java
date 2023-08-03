package day18_parametreliConstructur_constructurCall;

public class CarRunner2 {
    public static void main(String[] args) {

        Car car1=new Car(10000,"Renault");
        System.out.println("car1");

        Car car2=new Car("Nissan","Kashgai",2010,12000);
        System.out.println(car2);

    }
}
