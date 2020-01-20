package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InteractionsPage;
import pages.Widgets;
import utils.SeleniumUtils;

public class WidgetsTest extends TestBase {
    Widgets widgets;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        initializer();
        widgets = new Widgets();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }


    @Test
    public void testInteractionBtn() {
        SeleniumUtils.click(widgets.widgets_btn);
        String expectedTitle = "Widgets";
        Assert.assertEquals(widgets.widgets_title.getText(), expectedTitle);
    }
}
