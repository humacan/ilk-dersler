package tests.day02_driverMethodlari_locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkotomasyon {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("Sayfanin basligi: "+driver.getTitle());

        String expectedIcerik="Amazon";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title test basarili");

        }else {
            System.out.println("Title testi FAILED");
            System.out.println("Sayfadaki actual title "+actualTitle);

        }
        Thread.sleep(2000);
        driver.close();
    }
}
