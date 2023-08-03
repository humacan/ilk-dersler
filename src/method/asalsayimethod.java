package method;

public class asalsayimethod {
    public static void main(String[] args) {
    Asalsayi(100,150);

    }
    public static int Asalsayi(int x, int y){

        int Asalsayilar=0;
        for (int i = x; i <y ; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        return Asalsayilar;
    }
}
