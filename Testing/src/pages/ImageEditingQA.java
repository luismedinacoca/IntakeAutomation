import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImageEditingQA {

    //Important Attribute
    WebDriver driver;

    //LOCATORS

    //Locator - Image Editing QA Module Button (1)
    By locatorImageEditingQAQButton = By.linkText("Image Editing QA");
    //By locatorImageEditingQAQButton = By.cssSelector("[href='\\/task-list\\/imageeditingqa'] p");

    //Constructor
    public ImageEditingQA(WebDriver driver){
        this.driver = driver;
    }

    //Click on Image Editing QA Module Button (1)
    public void clickImageEditingQAButton(){
        driver.findElement(locatorImageEditingQAQButton).click();
    }

}
