import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.BaseCalendar.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class Testing {
    @Test
    public void login() throws Exception{

        String username = "lmedina";
        String password = "Lij*76$21";


        //Driver Path
        String chromePath = "C:\\Users\\LMedina\\IdeaProjects\\Testing\\src\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();

        Intake home = new Intake(driver);
        home.loadIntake(); //load Intake page
        home.maximizePage(); //maximize Intake page
        home.loginIntake(); //click on button in Intake page
        home.clickGlad(); //click on  Gladson button
        home.enterCredentials(username, password); //login page
    }

    @Test
    public void clickOnCreateNewShipmentButton() throws Exception{
        String username = "lmedina";
        String password = "Lij*76$21";

        //Driver Path
        String chromePath = "C:\\Users\\LMedina\\IdeaProjects\\Testing\\src\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();

        Intake home = new Intake(driver);

        home.loadIntake(); //load Intake page
        home.maximizePage(); //maximize Intake page
        home.loginIntake(); //click on button in Intake page
        home.clickGlad(); //click on  Gladson button
        home.enterCredentials(username, password); //login page

        Thread.sleep(3000);

        //Go to Shipment Page
        home.goToShipments();

        Thread.sleep(3000);

        home.createAnEmptyShipments();
        Assert.assertTrue(driver.getPageSource().contains("Shipment Information"));

        System.out.println("Shipment Information box is open" );

    }
    @BeforeMethod
    public void doSomeStuff(){
        System.out.println("asdsadsa");
    }
    @Test
    public void verifyReceiveDateShipments() throws Exception{
        String username = "lmedina";
        String password = "Lij*76$21";

        //Driver Path
        String chromePath = "C:\\Users\\LMedina\\IdeaProjects\\Testing\\src\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();

        Intake home = new Intake(driver);

        home.loadIntake(); //load Intake page
        home.maximizePage(); //maximize Intake page
        home.loginIntake(); //click on button in Intake page
        home.clickGlad(); //click on  Gladson button
        home.enterCredentials(username, password); //login page

        Thread.sleep(3000);

        //Go to Shipment Page
        home.goToShipments();

        Thread.sleep(3000);

        home.createAnEmptyShipments();
        Assert.assertTrue(driver.getPageSource().contains("Shipment Information"));

        //Looking for RECEIVE DATE
        String cssVar = "#shipmentInformationForm > fieldset > div.row > div:nth-child(1) > div:nth-child(1) > div > div.react-datepicker-wrapper > div > input";
        //System.out.println(driver.findElement(By.cssSelector(cssVar)).getAttribute("value"));

        //Looking for Current Date
        final DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        //System.out.println(sdf.format(cal.getTime()));

        //Looking for the current date
        Assert.assertEquals(driver.findElement(By.cssSelector(cssVar)).getAttribute("value"), sdf.format(cal.getTime()));
    }

    @Test
    public void createAnIncompleteShipment() throws Exception{
        //Credential Constants:
        String username = "lmedina";
        String password = "Lij*76$21";

        // Variable constants:

        // Carriers options: "-- Select --" | "Common" | "DHL" | "Drop Off" | "FedEx" | "Procurement" | "UPS" | "USPS"
        String carrier = "Common";

        // Supplier options: "-- Select --" | "Daymon" | "Gladson" | "Marketing Plus" | "Shree" | "Walgreens"
        String supplier = "Gladson";

        // Some Client: "21st Century Vitamins" | "24 Hour Fitness" | "4C Foods Corp." | "7-Eleven, Inc." | "About.com"
        String client = "24 Hour Fitness";

        //Driver Path
        String chromePath = "C:\\Users\\LMedina\\IdeaProjects\\Testing\\src\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();

        Intake home = new Intake(driver);

        home.loadIntake(); //load Intake page
        home.maximizePage(); //maximize Intake page
        home.loginIntake(); //click on button in Intake page
        home.clickGlad(); //click on  Gladson button
        home.enterCredentials(username, password); //login page

        Thread.sleep(3000);

        //Go to Shipment Page
        home.goToShipments();

        Thread.sleep(3000);

        home.createAnEmptyShipments();

        // populating Carriers dropdown
        home.selectCarrierDropdown(carrier);

        // populating Supplier dropdown
        home.selectSupplierDropdown(supplier);

        // populating Some Client dropdown: "21st Century Vitamins" | "24 Hour Fitness" | "4C Foods Corp." | "7-Eleven, Inc." | "About.com"
        home.selectClientDropdown("About.com");

    }

//    @Test
//    public void verifyReceiveDateShipments() throws Exception{
//        String username = "lmedina";
//        String password = "Lij*76$21";
//
//        //Driver Path
//        String chromePath = "C:\\Users\\LMedina\\IdeaProjects\\Testing\\src\\Drivers\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromePath);
//        WebDriver driver = new ChromeDriver();
//
//        Intake home = new Intake(driver);
//
//        home.loadIntake(); //load Intake page
//        home.maximizePage(); //maximize Intake page
//        home.loginIntake(); //click on button in Intake page
//        home.clickGlad(); //click on  Gladson button
//        home.enterCredentials(username, password); //login page
//
//        Thread.sleep(3000);
//
//        //Go to Shipment Page
//        home.goToShipments();
//    }


    @Test
    public void goingModule() throws Exception{

        String username = "lmedina";
        String password = "Lij*76$21";

        //Driver Path
        String chromePath = "C:\\Users\\LMedina\\IdeaProjects\\Testing\\src\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();

        Intake home = new Intake(driver);

        home.loadIntake(); //load Intake page
        home.maximizePage(); //maximize Intake page
        home.loginIntake(); //click on button in Intake page
        home.clickGlad(); //click on  Gladson button
        home.enterCredentials(username, password); //login page

        Thread.sleep(3000);

        //Go to Shipment Page
        home.goToShipments();

        Thread.sleep(3000);

        //Go to Scheduling
        home.goToScheduling();

        Thread.sleep(3000);

        //Go to Measuring
        home.goToMeasuring();

        Thread.sleep(3000);

        //Go to Photography Page
        home.goToPhotography();

        Thread.sleep(3000);

        //Go to  Coding Page
        home.goToCoding();

        Thread.sleep(3000);

        //go to CodingQA Page
        home.goToCodingQA();

        Thread.sleep(3000);

        //go to Image Editing Page
        home.goToImageEditing();

        Thread.sleep(3000);

        //Go to Image Editing QA Page
        home.goToImageEditingQA();

        Thread.sleep(3000);

        //Go to Bin Mover Page
        home.goToBinMover();

        Thread.sleep(3000);

        //Go to Final QA page
        home.goToFinalQA();

        Thread.sleep(3000);

    }
}
