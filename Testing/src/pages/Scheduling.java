import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scheduling {

    //An Attribute
    WebDriver driver;

    //Locator variable with their locator path

    //Locator - Scheduling Module Button (1)

    By LocatorSchedulingButton = By.linkText("Scheduling");
    //By LocatorSchedulingButton = By.cssSelector("[href='\/scheduling']");



    public Scheduling(WebDriver driver){
        this.driver = driver;
    }

    //Scheduling Module Button (1)
    public void clickSchedulingModuleButton(){
        driver.findElement(LocatorSchedulingButton).click();
    }
}