package tests.day03_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C01_ilkotomasyon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        //arama kutusan "nutella" yazip aratalim
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //arama sonuclarini "Nutella" icerdigini test edelim

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        WebElement aramasonucElement=driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
        System.out.println(aramasonucElement.getText());
        //
        Thread.sleep(3000);
        driver.close();
    }
}
