package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverNavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        //amazona git
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        String expTitleIcerik="smile more";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expTitleIcerik)) {
            System.out.println("Amazon title PASSED");
        }else {
            System.out.println("Amazon title FAILED");
        }
        //youtube yonlendir
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);

        String expUrlIcerik="youtube";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expUrlIcerik)){
            System.out.println("Youtube url testi PASSED");
        }else {
            System.out.println("Youtube Url testi FAILED");
        }
        //amazona geri yonlendir
        driver.navigate().back(); // amazona geri don
        Thread.sleep(2000);
        String unExpUrlIcerik="amazon";
        actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(unExpUrlIcerik)){
            System.out.println("Amazon url testi PASSED");
        }else {
            System.out.println("Amazon url testi FAILED");
        }
        //tekrar ileri yonlendir(youtube)
        driver.navigate().forward();
        Thread.sleep(2000);
        String expSayfaIcerik="music";
        String actSayfaKaynakkod=driver.getPageSource();

        if (actSayfaKaynakkod.contains(expSayfaIcerik)){
            System.out.println("Youtube kaynak kodu testi PASSED");
        }else {
            System.out.println("Youtube kaynak kodu testi FAILED");
        }
        driver.close();
    }
}
