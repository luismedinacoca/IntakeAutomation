//import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InterLogin {
    //webdriver with its driver
    WebDriver driver;

    //Locator

    //Button - Log In at Gladson.com (1)
    By locatorLogin = By.cssSelector("#auth0-lock-container-1 > div > div.auth0-lock-center > form > div > div > div:nth-child(3) > span > div > div > div > div > div > div > div > div > button > div.auth0-lock-social-button-text");

    public InterLogin(WebDriver driver){
        this.driver = driver;
    }


    //methods
    public void clickToLogin(){
        driver.findElement(locatorLogin).click();
    }
}
