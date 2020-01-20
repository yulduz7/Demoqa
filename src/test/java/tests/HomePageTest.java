package tests;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InteractionsPage;
import utils.SeleniumUtils;

import static base.TestBase.driver;
import static base.TestBase.initializer;

public class HomePageTest extends TestBase {

    HomePage homePage;
    InteractionsPage interactions;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        initializer();
        homePage = new HomePage();
        interactions = new InteractionsPage();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }

    @Test
    public void verifyTitle() {
        String expectedTitle = "ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

}
