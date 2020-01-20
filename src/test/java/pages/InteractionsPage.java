package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionsPage extends HomePage {
    public InteractionsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "entry-title")
    public WebElement interactionsTitle;

    @FindBy(linkText = "Sortable")
    public WebElement sortable_btn;

    @FindBy(linkText = "https://demoqa.com/selectable/")
    public WebElement selectable_btn;

    @FindBy(linkText = "https://demoqa.com/resizable/")
    public WebElement resizable_btn;

    @FindBy(linkText = "https://demoqa.com/droppable/")
    public WebElement droppable_btn;

    @FindBy(linkText = "https://demoqa.com/draggable/")
    public WebElement draggable_btn;
}
