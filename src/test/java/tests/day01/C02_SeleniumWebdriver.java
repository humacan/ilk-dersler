package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_SeleniumWebdriver {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        //Selenium son versiyonlarinda kendi Webdriver class ini ekledi
        //boylece oncesinde driver.exe dosyasini tanitmasakda istedigimiz
        //browseri calistirir
        //sadece bizden driver bekledigi icin birazcik gec calisir
        //sirketler acik kaynakli driver kullanmayi tercih etmez
        //genelde kendi lisansli driverlarini kullanirlar
        //bu durumda size verdikleri driver ile ilk satiri yazmalisiniz
    }
}
