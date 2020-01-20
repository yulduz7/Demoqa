package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TooltipPage extends HomePage {
    public TooltipPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "entry-title")
    public WebElement toolTip_Title;

    @FindBy (id="doubleClickBtn")
    public WebElement doubleClick_Btn;

    @FindBy(id="rightClickBtn")
    public WebElement rightClick_Btn;

    @FindBy(id="tooltipDemo")
     public WebElement tooltipDemo_btn;
}
