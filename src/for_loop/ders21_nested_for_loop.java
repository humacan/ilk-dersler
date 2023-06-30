package for_loop;

public class ders21_nested_for_loop {
    public static void main(String[] args) {
        int satir=6;
        int sutun=5;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun; j++) {
                System.out.print( "* ");
            }
            System.out.println("");
        }
        System.out.println("-------");
        for (int k = 1; k <=satir; k++) {   // ucgen dizilimle nested for
            for (int l = 1; l <=k ; l++){
                System.out.print(l +" ");
            }
            System.out.println("-");
        }
        System.out.println("--------");

    }
}
