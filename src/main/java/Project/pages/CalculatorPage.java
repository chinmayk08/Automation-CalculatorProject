package Project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    WebDriver driver =null;

    public CalculatorPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
    }

    @FindBy(xpath = "//span[text()='1']")
    public WebElement number1;

    @FindBy(xpath = "//span[text()='2']")
    public WebElement number2;

    @FindBy(xpath = "//span[text()='3']")
    public WebElement number3;

    @FindBy(xpath = "//span[text()='4']")
    public WebElement number4;

    @FindBy(xpath = "//span[text()='5']")
    public WebElement number5;

    @FindBy(xpath = "//span[text()='6']")
    public WebElement number6;

    @FindBy(xpath = "//span[text()='7']")
    public WebElement number7;

    @FindBy(xpath = "//span[text()='8']")
    public WebElement number8;

    @FindBy(xpath = "//span[text()='9']")
    public WebElement number9;

    @FindBy(xpath = "//span[text()='0']")
    public WebElement number0;

    @FindBy(xpath = "//span[text()='+']")
    public WebElement plus;

    @FindBy(xpath = "//span[text()='=']")
    public WebElement equals;

    @FindBy(id = "sciOutPut")
    public WebElement outputField;

    @FindBy(xpath = "//span[text()='–']")
    public WebElement minus;

    @FindBy(xpath = "//span[text()='×']")
    public WebElement multiply;

    @FindBy(xpath = "//span[text()='/']")
    public WebElement divide;

    @FindBy(xpath = "//span[text()='Back']")
    public WebElement back;


}
