package Day33_encapsulatino_inheritance;

public class C01_pazarlama {
    /*
    satis degeri girecekler
    satis girebilsin ama baskalarinin girdigi satislari  goremesin

    toplam satis degerini gormesi  gerekenler gorsun ama
    toplam satis degeri goren kisiler tarafindan degistirilemesin
     */

    private int toplamsatis; //read only
    private int satis;  // write only

     /*
    yetki ayrimi yapacagimiz class larda istedigimiz islemi bizim adimiza yapacak
    public method lar olusturucagiz

    getter method lari baska class lar icin private
    variable lara ulasir ve degerini o classlara dondurur
    */

    public int getToplamsatis(){

        return toplamsatis;

    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamsatisekle();
    }
    private void toplamsatisekle(){
        toplamsatis+=satis;
    }

}
