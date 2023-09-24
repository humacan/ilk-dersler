package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //driver.manage().window().maximize();
        driver.get("http://www.amazon.com");

        System.out.println("Title: "+driver.getTitle());
        System.out.println("Url: "+driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());

        System.out.println("windwo handle degeri "+driver.getWindowHandle());
        System.out.println("window handle degerleri seti "+driver.getWindowHandles());

        Thread.sleep(2000);
        driver.close();


    }
}
