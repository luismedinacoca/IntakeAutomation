import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImageEditing {

    //Important Attribute
    WebDriver driver;

    //LOCATOR

    //Locator - Image Editing Module Button (1)
    By locatorImageEditingButton = By.linkText("Image Editing");
    //By locatorImageEditingButton = By.cssSelector("[href='\\/task-list\\/imageediting'] p");

    //Constructor
    public ImageEditing(WebDriver driver){
        this.driver = driver;
    }

    //Click on Image Editing Module Button (1)
    public void clickImageEditingButton(){
        driver.findElement(locatorImageEditingButton).click();
    }


}
