import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Shipments {

    //An Attribute
    WebDriver driver;

    //Locator variable with their locator path

    //Locator - Shipments Module Button (1)
    By LocatorShipmentButton = By.linkText("Shipments");
    //By LocatorShipmentButton = By.cssSelector("#header > div > nav > a:nth-child(1) > svg > path");

    //Create a Shipment - button (2)
    By LocatorCreateShipmentButton = By.cssSelector(".-primary");

    By LocatorCarrier = By.id("carrier");
    By LocatorSupplier = By.id("supplier");
    By LocatorClient = By.id("client");

    public Shipments(WebDriver driver){
        this.driver = driver;
    }

    //Shipments Module Button (1)
    public void clickShipmentModuleButton(){
        driver.findElement(LocatorShipmentButton).click();
    }

    //Create a Shipment - button (2)
    public void createAnEmptyShipment(){
        driver.findElement(LocatorCreateShipmentButton).click();
    }

    public void selectCarrier(String carrier){
        WebElement selectCarrier = driver.findElement(LocatorCarrier);
        Select selected = new Select(selectCarrier);
        selected.selectByVisibleText(carrier);
    }

    public void selectSupplier(String supplier){
        WebElement selectSupplier = driver.findElement(LocatorSupplier);
        Select selected = new Select(selectSupplier);
        selected.selectByVisibleText(supplier);
    }

    public void selectClient(String client){
        WebElement selectClient = driver.findElement(LocatorClient);
        Select selected = new Select(selectClient);
        selected.selectByVisibleText(client);
    }



}