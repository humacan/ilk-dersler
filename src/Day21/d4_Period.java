package Day21;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class d4_Period {
    public static void main(String[] args) {
        LocalDate dogum= LocalDate.of(1984,01,03);
        LocalDate bgn=LocalDate.now();

        System.out.println(Period.between(dogum,bgn)); //P39Y7M3D
        System.out.println(Period.between(dogum, bgn).getYears()); //39
    }
}
