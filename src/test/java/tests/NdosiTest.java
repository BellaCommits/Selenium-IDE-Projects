package tests;

import org.testng.annotations.Test;
import pages.ContactUsPage;
import utils.Base;

public class NdosiTest extends Base {

    @Test
    public void contactUsText(){
        contactUsPage.clickContactUsButton();
        contactUsPage.contactMethodsText();
    }
}
