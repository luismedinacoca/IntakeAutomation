import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    //WebDriver with its driver
    WebDriver driver;

    //Locator variable with actual locators
    By locatorUsername = By.id("userNameInput");
    By locatorPassword = By.id("passwordInput");
    By buttonLogin = By.id("submitButton");

    //METHODS

    //Constructor  => take "driver" as a parameter
    public Login(WebDriver driver){
        this.driver = driver;
    }

    //Populate username field
    public void fillUserName(String username){
        driver.findElement(locatorUsername).sendKeys(username);
    }

    //Populate password field
    public void fillPassword(String pword){
        driver.findElement(locatorPassword).sendKeys(pword);
    }

    //click login button
    public void clickButtonLogin() throws InterruptedException{
        Thread.sleep(5000);
        driver.findElement(buttonLogin).click();
    }
}
