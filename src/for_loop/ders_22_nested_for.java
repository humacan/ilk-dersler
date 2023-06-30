package for_loop;
                        // Debug yaparak F7 tusu ile asamalari gorerek anlayabilirsiniz
public class ders_22_nested_for {
    public static void main(String[] args) {

        for (int sira=1;sira<=10 ; sira++ ){
            for (int kare=10; kare>=1 ; kare-- ){
                if (kare>=sira){                // kare sira ya esit olana dek yazdir
                    System.out.print("$");
                }else
                    System.out.print(" ");
           }
            System.out.println();
        }
    }
}
