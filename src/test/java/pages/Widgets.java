package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets extends HomePage {
    public Widgets() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "entry-title")
    public WebElement widgets_title;

    @FindBy(linkText = "HTML contact form")
    public WebElement htmlContact_btn;

}

