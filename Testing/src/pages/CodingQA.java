import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CodingQA {

    //An important attribute
    WebDriver driver;

    //LOCATORS

    //Locator - CodingQA Module Button (1)
    By locatorCodingQAButton = By.linkText("Coding QA");
    //By locatorCodingQAButton = By.cssSelector("[href='\\/task-list\\/codingqa'] p");

    //Constructor
    public CodingQA(WebDriver driver){
        this.driver = driver;
    }

    //
    public void clickCodingQAModuleButton(){
        driver.findElement(locatorCodingQAButton).click();
    }

}
