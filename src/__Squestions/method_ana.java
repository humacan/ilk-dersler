package __Squestions;               // asal sayi true false

public class method_ana {
    public static void main(String[] args) {
        System.out.println(asalSayi(56));
        System.out.println(asalSayi(45));
        System.out.println(asalSayi(31));
        System.out.println(asalSayi(23));
    }

    public static boolean asalSayi(int sayi){

        boolean flag=true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi % i==0){
                flag=false  ;
                break;
            }

        }if(flag){
            return true;
        }else{
            return false;
        }

    }


}
