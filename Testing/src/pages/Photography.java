import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Photography {
    //An Attribute
    WebDriver driver;

    //Locator variables with their locator path

    //Locator - Photography Module Button (1)
    By LocatorMeasuringButton = By.linkText("Photography");
    //By LocatorMeasuringButton = By.cssSelector("[href='\\/task-list\\/photography'] p");

    public Photography(WebDriver driver){
        this.driver = driver;
    }

    //Measuring Module Button (1)
    public void clickPhotographyModuleButton(){
        driver.findElement(LocatorMeasuringButton).click();
    }


}
