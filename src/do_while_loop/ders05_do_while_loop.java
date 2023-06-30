package do_while_loop;

public class ders05_do_while_loop {
    public static void main(String[] args) {
        int sayi=-10;
        int toplam=0;

        while (sayi>0){
            toplam+=sayi*sayi;
            sayi--;           // ilk dongude toplam 9. ikincide 13, ucuncude 14#
        }
        System.out.println("while toplam: "+toplam);
        sayi=-10;
        toplam=0;
        do{
            toplam+=sayi*sayi;
            sayi--;
        }while (sayi>0);
        System.out.println("do while toplam: "+toplam);
    }
}
