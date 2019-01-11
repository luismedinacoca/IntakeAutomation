import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BinMover {

    //Attribute
    WebDriver driver;

    //LOCATORS

    //Locator Bin Mover Module Button (1)
    By locatorBinMoverModulebutton = By.linkText("Bin Mover");
    //By locatorBinMoverModulebutton = By.cssSelector("[href='\\/tools\\/bin-mover'] p");

    //Constructor
    public BinMover(WebDriver driver){
        this.driver = driver;
    }

    //Locator Bin Mover Module Button (1)
    public void clickBinMoverButton(){
        driver.findElement(locatorBinMoverModulebutton).click();
    }

}
