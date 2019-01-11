import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Coding {

    //An important attribute
    WebDriver driver;

    //LOCATORS

    //Locator - Coding Module Button (1)
    By locatorCodingButton = By.linkText("Coding");
    //By locatorCodingButton = By.cssSelector("[href='\\/task-list\\/coding'] p");


    //Constructor
    public Coding(WebDriver driver){
        this.driver = driver;
    }

    //Measuring Module Button (1)
    public void clickCodingModuleButton(){
        driver.findElement(locatorCodingButton).click();
    }

}
