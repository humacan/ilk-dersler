package while_do_while_loop;

public class ders10_while_loop {
    public static void main(String[] args) {
        int x=0;

        while (x++<10){}  // x false degerine  donmeye devam eder while body icinden cikinca asagiya
                            // bir artarak katilir


        String message=x>10 ? "Greater than" : "Lesser than";  // Ternary kullanarak String ifadeye iki dize
                                                                //yazdirdik ve bastaki sarta bagladik
        System.out.println(message+ ", " + x);
    }
}
