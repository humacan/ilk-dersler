package method;

public class ders_method_07_isasal {
    public static void main(String[] args) {
        System.out.println(isAsal(23));
        System.out.println(isAsal(33));
        System.out.println(isAsal(31));
        System.out.println(isAsal(22));

    }

    public static boolean isAsal(int sayi){
        int flag=0;                             // for dongosu sonrasi denetim icin baska bir variable olusturduk
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }

        }if(flag==0){
            return true;
        }else{
            return false;
        }
    }
}
