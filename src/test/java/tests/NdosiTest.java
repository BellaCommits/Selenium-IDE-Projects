package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import utils.Base;

public class NdosiTest extends Base {

    @Test
    public void contactUsText(){
        contactUsPage.clickContactUsButton();
        contactUsPage.contactMethodsText();
    }

    @Test
    public void loginTest(){
        loginPage.clickLoginMainButton();
        loginPage.enterUsername("bellabjacobs7@gmail.com");
        loginPage.enterPassword("12345@77");
        loginPage.clickLoginButton();
        landingPage.welcomeText();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
