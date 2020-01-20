package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText="Interactions")
    public WebElement interactions_btn;

    @FindBy(linkText="Widgets")
    public WebElement widgets_btn;

    @FindBy(linkText = "Tooltip and Double click")
    public WebElement toolTip_btn;

}