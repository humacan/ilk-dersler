package Var_objects;

public class _Thread {       // GERI SAYAN BIR SAYAC
    public static void main(String[] args) throws InterruptedException {

        int sayi=0;

        for (int i = 1; i <=20; i++) {
            Thread.sleep(1000);
            System.out.println(sayi+i);
        }
        System.out.println("---------------------BITTI---------------");

    }
}
