package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToNdosiWebsiteBella {

    WebDriver driver;

    @BeforeTest
    public void LaunchBrowser() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }

    @Test
    public void clickLoginTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
    }

    @Test(dependsOnMethods = "clickLoginTest")
     public void enterUsernameTest() {
        driver.findElement(By.id("login-email")).sendKeys("bellabjacobs7@gmail.com");
    }

    @Test(dependsOnMethods = "enterUsernameTest")
    public void enterPasswordTest() {
        driver.findElement(By.id("login-password")).sendKeys("12345@77");
    }

    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickSubmitButtonTest() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "clickSubmitButtonTest")
    public void verifyLoginSuccess() {
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[1]")).isDisplayed();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickLearnButtonTest() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
    }

    @Test(dependsOnMethods = "clickLearnButtonTest")
    public void clickLearningMaterialButtonTest() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
    }

    @Test(dependsOnMethods = "clickLearningMaterialButtonTest")
    public void clickBasicFormButtonTest() {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
    }

    @Test(dependsOnMethods = "clickBasicFormButtonTest")
    public void verifyBasicFormDisplay() {
        driver.findElement(By.xpath("//*[@id=\"basic-form-requirements\"]/summary")).isDisplayed();
    }

    @Test(dependsOnMethods = "verifyBasicFormDisplay")
    public void enterNameTest() {
        driver.findElement(By.id("name")).sendKeys("Bulelwa Bella");
    }

    @Test(dependsOnMethods = "enterNameTest")
    public void enterEmailTest() {
        driver.findElement(By.id("email")).sendKeys("jacobsbulelwa61@gmail.com");
    }

    @Test(dependsOnMethods = "enterEmailTest")
    public void enterAgeTest() {
        driver.findElement(By.id("age")).sendKeys("32");
    }

    @Test(dependsOnMethods = "enterAgeTest")
    public void clickGenderTest() {
        driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
    }

    @Test(dependsOnMethods = "clickGenderTest")
    public void clickSelectGenderTest() {
        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[3]")).click();
    }

    @Test(dependsOnMethods = "clickSelectGenderTest")
    public void clickCountryTest() {
        driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
    }

    @Test(dependsOnMethods = "clickCountryTest")
    public void clickSelectCountryTest() {
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[5]")).click();
    }

    @Test(dependsOnMethods = "clickSelectCountryTest")
    public void clickExperienceTest() {
        driver.findElement(By.xpath("//*[@id=\"experience\"]")).click();
    }

    @Test(dependsOnMethods = "clickExperienceTest")
    public void clickSelectExperienceTest() {
        driver.findElement(By.xpath("//*[@id=\"experience\"]/option[2]")).click();
    }

    @Test(dependsOnMethods = "clickSelectExperienceTest")
    public void verifyFormDisplayTest() {
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[2]/label")).isDisplayed();
    }

    @Test(dependsOnMethods = "verifyFormDisplayTest")
    public void clickLabelTest() {
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[2]/div/label[1]")).click();
    }

    @Test(dependsOnMethods = "clickLabelTest")
    public void clickSecondLabelTest() {
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[2]/div/label[4]")).click();
    }

    @Test(dependsOnMethods = "clickSecondLabelTest")
    public void clickThirdLabelTest() {
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[2]/div/label[5]")).click();
    }

    @Test(dependsOnMethods = "clickThirdLabelTest")
    public void enterCommentTest() {
        driver.findElement(By.id("comments")).sendKeys("This is my first automation test.");
    }

    @Test(dependsOnMethods = "enterCommentTest")
    public void verifyTextTest() {
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[3]")).isDisplayed();
    }

    @Test(dependsOnMethods = "verifyTextTest")
    public void clickSubscribeButtonTest() {
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[3]/label[1]")).click();
    }

    @Test(dependsOnMethods = "clickSubscribeButtonTest")
    public void clickNewsletterButtonTest() {
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/div[3]/label[2]")).click();
    }

    @Test(dependsOnMethods = "clickNewsletterButtonTest")
    public void clickSubmitFormTest() {
        driver.findElement(By.id("submit-btn")).click();
    }

    @Test(dependsOnMethods = "clickSubmitFormTest")
    public void verifySubmissionsSuccessTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"submissions-toggle-btn\"]")).isDisplayed();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "verifySubmissionsSuccessTest")
    public void clickResetButtonTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"reset-btn\"]")).click();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "clickResetButtonTest")
    public void clickValidateButtonTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"validate-btn\"]")).click();
        Thread.sleep(8000);
    }

    @Test(dependsOnMethods = "clickValidateButtonTest")
    public void clickAlertButtonTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"alert-btn\"]")).click();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "clickAlertButtonTest")
    public void clickSuccessAlertButtonTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"success-alert-btn\"]")).click();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "clickSuccessAlertButtonTest")
    public void clickErrorAlertButtonTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"error-alert-btn\"]")).click();
        Thread.sleep(5000);
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}