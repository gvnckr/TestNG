package tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentacarPage {
    public BlueRentacarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement brclogin;
    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement brcMail;
    @FindBy (xpath = "//*[@id='formBasicPassword']")
    public WebElement brcPass;
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement brcLogin2;
    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariligiris;

}
