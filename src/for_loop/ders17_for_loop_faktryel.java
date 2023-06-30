package for_loop;

public class ders17_for_loop_faktryel {
    public static void main(String[] args) {

        int sayi =5;
        int faktryel=1;

        for (int i = sayi; i >= 1; i--) { // 5 den 1 e kdr olan sayiari birer eksilt
            faktryel *=i;                 // devaminda carparak devam et
            System.out.println(sayi + "! = "+ faktryel);
        }
        System.out.println("----------------");
        System.out.println(sayi + "! = "+ faktryel);
    }
}
