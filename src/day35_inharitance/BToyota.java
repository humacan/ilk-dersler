package day35_inharitance;

public class BToyota extends Araba {
    BToyota(){ // super cons. call
        System.out.println("Toyota parametresi constructer");
    }
    //parent class daki bazi ozellikleri update edebiliriz
    String marka="Toyota";
    String uretimYeri="Toyota araclar japonya ve Turkiye de uretilir";
    //parent class da olmayan yeni ozellikler ekleyebiliriz

    String lastik="Tum toyota araclar pirelli lastik kullanir";
    String guvenlik="Tum Toyota araclar extra guvenlik icerir";
    String fren="Toyota araclr abs fren sistemi kullanir";


}
