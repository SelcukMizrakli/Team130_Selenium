package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        // Acilan sayfanin Title'inda otomasyon gectigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitleIcerik = "otomasyon";

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title 'otomasyon'icermiyor, title testi FAILED");
            System.out.println("Actual title: "+actualTitle);
        }

        // acilan sayfanin url'inin otomasyon icerdigini test edin

        String expectedUrlIcerik = "otomasyon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedTitleIcerik)){
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url 'otomasyon'icermiyor, url testi FAILED");
            System.out.println("Actual Url: "+actualUrl);
        }

        //System.out.println("========= Sayfa Kaynagi ================");
        //System.out.println(driver.getPageSource());
                // Tum sayfa kaynagini dondurur,
                // sayfa kaynagi ile ilgili bir test istenirse, kaydedilip kullanilabilir

        /*
            driver.getWindowHandle(); driver'in gittigi sayfaanin Windowhandle degerini verir
            driver.getWindowHandles(); driver olusturulduktan sonra, test boyunca actigi tum sayfalarain
                                       WindowHandle degerlerini bir Set olarak verir
         */
        System.out.println(driver.getWindowHandle());   //8309B732C683CFB10B010FBC9471886D
        System.out.println(driver.getWindowHandles());  //[8309B732C683CFB10B010FBC9471886D]



        Thread.sleep(3000); // java'dan gelir kodlari yazilan milisaniye kadar bekletir
        driver.close();
    }
}
