package pagespractis;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuPage {
    public HerOkuPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='onblur']")
    public WebElement onblur;

    @FindBy (xpath = "//*[@id='onclick']")
    public WebElement onclick;

    @FindBy(xpath = "//*[@id='oncontextmenu']")
    public WebElement oncontext;

    @FindBy(xpath = "//*[@id='ondoubleclick']")
    public WebElement doubleclick;

    @FindBy(xpath = "//*[@id='onfocus']")
    public WebElement focus;
    @FindBy (xpath = "//button[@id='onkeydown']")
    public WebElement KeyDown;
    @FindBy (xpath = "//button[@id='onkeyup']")
    public WebElement KeyUp;
    @FindBy (xpath = "//button[@id='onkeypress']")
    public WebElement KeyPress;
    @FindBy (xpath = "//button[@id='onmouseover']")
    public WebElement MouseOver;
    @FindBy (xpath = "//button[@id='onmouseleave']")
    public WebElement MouseLeave;
    @FindBy (xpath = "//button[@id='onmousedown']")
    public WebElement MouseDown;

   @FindBy (xpath = "//*[text()='Event Triggered']")
    public List<WebElement> Events;

}
