package Arrays;
import java.util.Arrays;
public class arrayAsal {
    public static void main(String[] args) {
    String yazi="";

            for (int i = 100; i < 200; i++) {
                if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    continue;
                } else {
                     yazi+= +i + " ";
                }
            }System.out.println(yazi.substring(0,40));


    }
}
