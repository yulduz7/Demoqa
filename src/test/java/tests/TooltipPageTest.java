package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TooltipPage;
import pages.Widgets;
import utils.SeleniumUtils;

import static base.TestBase.initializer;

public class TooltipPageTest extends TestBase {
    TooltipPage tooltipPage;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        initializer();
        tooltipPage = new TooltipPage();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }


    @Test
    public void testInteractionBtn() {
        SeleniumUtils.click(tooltipPage.toolTip_btn);
        String expectedTitle = "Tooltip and Double click";
        Assert.assertEquals(tooltipPage.toolTip_Title.getText(), expectedTitle);
    }
}
