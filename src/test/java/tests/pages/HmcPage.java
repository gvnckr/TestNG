package tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="(//a[@class='nav-link'])[7]")
    public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//*[@class=\"page-md page-header-fixed page-quick-sidebar-over-content\"]")
    public WebElement girisyapildi;
    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadi;
    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;
    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;
    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoom;
    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy(xpath = "//*[@class='bootbox-body']")
    public WebElement roomReservationText;
    @FindBy(xpath = "//*[text()='OK']")
    public WebElement okButton;
}
