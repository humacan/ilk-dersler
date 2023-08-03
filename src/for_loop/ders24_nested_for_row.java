package for_loop;                   //ORACLE TEST SORUSU
public class ders24_nested_for_row {
    public static void main(String[] args) {

        int count=0;

            Row_Loop: for (int row = 1; row <= 3; row++) {   // for
                for (int col = 1; col <=2 ; col++) {
                if (row*col%2==0) continue Row_Loop;    // nested for dongusunun sonuna sartli if sartini sagladigi surace devam etmesi gereken yonerge eklendi
                count++;
            }
        }System.out.println(count);
    }
}
