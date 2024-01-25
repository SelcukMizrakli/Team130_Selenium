package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.testotomasyonu.com"); //get(istenenUrl) ile ayni islemi yapar

        // youtube anasayfaya gidin

        // title'in "YouTube" icerdigini test edin

        // tekrar test otomasyonu ana sayfaya donun

        // sayfa kaynaginin "Test Otomasyonu" icerdigini test edin

        // bir daha youtube anasayfaya gidin

        // url'in https://www.youtube.com/ oldugunu test edin


        driver.navigate().to("https://www.youtube.com/");
        String expectedTitleIcerik1 = "YouTube";
        String actualTitleIcerik1 = driver.getTitle();

        if (actualTitleIcerik1.contains(expectedTitleIcerik1)){
            System.out.println("Title Test PASSED");
        } else {
            System.out.println("Title Test FAILED\t Actual Title: " + actualTitleIcerik1);
        }

        driver.navigate().back();

        String actualSourceCodeIcerik1 = driver.getPageSource();
        String expectedSourceCodeIcerik1 = "Test Otomasyonu";

        if (actualSourceCodeIcerik1.contains(expectedSourceCodeIcerik1)){
            System.out.println("Source Test PASSED");
        } else {
            System.out.println("Source Test FAILED\t Actual SourceCode: " + actualSourceCodeIcerik1);
        }

        driver.navigate().forward();

        String expectedUrlIcerik1 = "https://www.youtube.com/";
        String actualUrlIcerik1 = driver.getCurrentUrl();

        if (actualUrlIcerik1.equals(expectedUrlIcerik1)){
            System.out.println("Url Test PASSED");
        } else {
            System.out.println("Url Test FAILED\t Actual Url: " + actualUrlIcerik1);
        }


        Thread.sleep(3000);
        driver.close();
    }
}
