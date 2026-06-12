import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginToNdosiWebsiteBella {

    WebDriver driver;

    @Test
    public void loginToNdosiWebsite() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
        driver.findElement(By.id("login-email")).sendKeys("bellabjacobs7@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("12345@77");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[1]")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"basic-form-requirements\"]/summary")).click();
        Thread.sleep(2000);

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
