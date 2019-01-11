import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Measuring {

    //An Attribute
    WebDriver driver;

    //Locator variables with their locator path

    //Locator - Measuring Module Button (1)
    By LocatorMeasuringButton = By.linkText("Measuring");
    //By LocatorMeasuringButton = By.cssSelector("[href='\\/task-list\\/measuring'] p");


    public Measuring(WebDriver driver){
        this.driver = driver;
    }

    //Measuring Module Button (1)
    public void clickMeasuringModuleButton(){
        driver.findElement(LocatorMeasuringButton).click();
    }

}
