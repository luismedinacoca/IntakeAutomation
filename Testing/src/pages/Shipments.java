import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    By LocatorReceiver = By.id("receivedBy");
    By LocatorTurnAroundDay = By.id("turnAroundDays");
    By LocatorSaveShipmentButton = By.cssSelector ("fieldset .-primary");
    By LocatorPlusLocations = By.xpath("//div[@class='input-group']//select[@id='locationBinLookup']/following-sibling::*");
    By LocatorUPCField = By.id("upc");
    By LocatorAddUPCtoShipment = By.cssSelector("#root > div > div.container > fieldset:nth-child(5) > div > div.column.-span4 > div.button-group.-right > button.button.-primary");
    By LocatorCompleteShipmentButton = By.xpath("//*[@id=\"task-nav-wrapper\"]/div/div/button[2]");

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



    // ************************* SHIPMENT EDITOR *************************

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

    public void selectReceiver(String receiver){
        WebElement selectReceiver = driver.findElement(LocatorReceiver);
        Select selected = new Select(selectReceiver);
        selected.selectByVisibleText(receiver);
    }

    public void enterTurnAroundDays(String days){
        WebElement enterTAD = driver.findElement(LocatorTurnAroundDay);
        enterTAD.sendKeys(days);
    }

    public void clickSaveShipmentButton(){
        WebElement clickOn = driver.findElement(LocatorSaveShipmentButton);
        clickOn.click();
    }

    // end ************************* SHIPMENT EDITOR *************************

    public void clickLocation(){
        //scroll the page
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(LocatorPlusLocations));
        WebElement clickPlus = driver.findElement(LocatorPlusLocations);
        clickPlus.click();
    }

    public void enterUPCnumber(String upcCode) {
        WebElement enterUPC = driver.findElement(LocatorUPCField);
        enterUPC.sendKeys(upcCode);
    }

    public void addUPCtoShipment(){
        WebElement clickAddUPCbutton = driver.findElement(LocatorAddUPCtoShipment);
        clickAddUPCbutton.click();
    }

    public void clickCompleteShipmentButton(){
        WebElement completeShipmentButton = driver.findElement(LocatorCompleteShipmentButton);
        completeShipmentButton.click();
    }


}