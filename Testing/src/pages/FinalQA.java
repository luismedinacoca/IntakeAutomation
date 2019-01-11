import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalQA {

    //Important Attribute
    WebDriver driver;

    //LOCATORS

    //Locator - Final QA Module Button (1)
    By locatorFinalQAModuleButton = By.linkText("Final QA");

    //Constructor
    public FinalQA(WebDriver driver){
        this.driver = driver;
    }

    //Locator - Final QA Module Button (1)
    public void clickFinalQAModuleButton(){
        driver.findElement(locatorFinalQAModuleButton).click();
    }

}
