package day18_parametreliConstructur_constructurCall;

public class Car {
    String marka="Marka belirtilmedi";
    String model="Model Belirtilmedi";
    int yil=1900;
    int fiyat;


    public Car(int fyt,String mrk){
        fiyat=fyt;
        marka=mrk;
    }
    public Car(String mrk){
        marka=mrk;
        fiyat=12000;
        model="Civic";
        yil=2000;
    }
    public Car(){

    }

    public Car(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat; // class ta yer alan ayni isimli variable lari ayirmak icin
        // basina "this." koyuyoruz
    }
    //marka ve model ile cons olusturalim
    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
