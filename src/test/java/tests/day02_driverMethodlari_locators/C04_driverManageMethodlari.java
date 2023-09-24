package tests.day02_driverMethodlari_locators;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C04_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // YUKARIDAKI DORT SATIR MAHSERIN DORT ATLISI OLARAK KULLANILACAK
        System.out.println("maximize size "+driver.manage().window().getSize());
        System.out.println("maximize konum "+driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen size "+driver.manage().window().getSize());
        System.out.println("fullscreen konum "+driver.manage().window().getPosition());

        //window un baslangic konumun (200,300) ve boyutunu (500,500) yapalim

        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(200,300));
        System.out.println("customize size "+driver.manage().window().getSize());
        System.out.println("customize konum "+driver.manage().window().getPosition());



        Thread.sleep(3000);
        driver.close();
    }
}
