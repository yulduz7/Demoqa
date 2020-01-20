package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InteractionsPage;
import utils.SeleniumUtils;

public class InteractionsPageTest extends TestBase {

    InteractionsPage interactions;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        initializer();
        interactions = new InteractionsPage();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }


    @Test
    public void testInteractionBtn() {
        SeleniumUtils.click(interactions.interactions_btn);
        String expectedTitle = "Interactions";
        Assert.assertEquals(interactions.interactionsTitle.getText(), expectedTitle);
    }


}