package tests.day01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverObjesi {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //Thread.sleep(3000);    // 3 saniye sonra kapat


        //driver.close();


    }
}
