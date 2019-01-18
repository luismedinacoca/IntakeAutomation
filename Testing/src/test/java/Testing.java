import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.BaseCalendar.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;


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
    @Test
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
        String carrier = "Drop Off";

        // Supplier options: "-- Select --" | "Daymon" | "Gladson" | "Marketing Plus" | "Shree" | "Walgreens" | "AgustinOchoa"
        String supplier = "AgustinOchoa";

        // Some Client: "21st Century Vitamins" | "24 Hour Fitness" | "4C Foods Corp." | "7-Eleven, Inc." | "About.com"
        String client = "4C Foods Corp." ;

        // populating some Receiver dropdown: "Daryl Murray"  |  "Edward Brown"  |  "Gustavo Lopez"  |  "John Berry"  |  "John Doe"  |  "Kimberly Sula"  |  "Lauren Nicolai"  |  "Patrick Daly"
        String receiver = "John Doe" ;

        // enter a number into "Turn Around Days" field:
        String dayNummbers = "1";




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
        home.selectClientDropdown(client);

        // populating some Receiver dropdown: "Daryl Murray"  |  "Edward Brown"  |  "Gustavo Lopez"  |  "John Berry"  |  "John Doe"  |  "Kimberly Sula"  |  "Lauren Nicolai"  |  "Patrick Daly"
        home.selectReceiverDropdown(receiver);

        // enter a number into "Turn Around Days" field:
        home.populateTurnAroundDays(dayNummbers);

        //Click on the 1st save button:
        home.clickOnShipmentEditorSaveButton();
    }

    @Test
    public void createACompletedShipment() throws Exception{
        //Credential Constants:
        String username = "lmedina";
        String password = "Lij*76$21";

//        System.out.println(Intake.NumUPC);
//        Intake.NumUPC++;



        // ***************************** VARIABLE CONSTANTS: *****************************

        // Carriers options: "-- Select --" | "Common" | "DHL" | "Drop Off" | "FedEx" | "Procurement" | "UPS" | "USPS"
        String carrier = "FedEx";
        // Supplier options: "-- Select --" | "Daymon" | "Gladson" | "Marketing Plus" | "Shree" | "Walgreens" | "AgustinOchoa"
        String supplier = "AgustinOchoa";
        // Some Client: "21st Century Vitamins" | "24 Hour Fitness" | "4C Foods Corp." | "7-Eleven, Inc." | "About.com"
        String client ="4C Foods Corp." ;
        // populating some Receiver dropdown: "Daryl Murray"  |  "Edward Brown"  |  "Gustavo Lopez"  |  "John Berry"  |  "John Doe"  |  "Kimberly Sula"  |  "Lauren Nicolai"  |  "Patrick Daly"
        String receiver = "Patrick Daly";
        // enter a number into "Turn Around Days" field:
        String dayNummbers = "1";

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

        // ***************************** SHIPMENTS *****************************

        // ***************************** SHIPMENT EDITOR *****************************
        home.createAnEmptyShipments();

        // populating Carriers dropdown
        home.selectCarrierDropdown(carrier);

        // populating Supplier dropdown
        home.selectSupplierDropdown(supplier);

        // populating Some Client dropdown: "21st Century Vitamins" | "24 Hour Fitness" | "4C Foods Corp." | "7-Eleven, Inc." | "About.com"
        home.selectClientDropdown(client);

        // populating some Receiver dropdown: "Daryl Murray"  |  "Edward Brown"  |  "Gustavo Lopez"  |  "John Berry"  |  "John Doe"  |  "Kimberly Sula"  |  "Lauren Nicolai"  |  "Patrick Daly"
        home.selectReceiverDropdown(receiver);

        // enter a number into "Turn Around Days" field:
        home.populateTurnAroundDays(dayNummbers);

        //Click on the 1st save button:
        home.clickOnShipmentEditorSaveButton();

        // ***************************** BINS FOR SHIPMENTS *****************************
        //((JavascriptExecutor)func.driver).executeScript("arguments[0].scrollIntoView();",func.driver.findElement(LocatorPlusLocations));
        home.clickPlusLocationField();

        //Getting the UPC format:
        //Enter UPC code number
        String upcCode = "01";  //    <<<<<<<<<=========================   ENTER HERE A NUMBER *********************************


        String upcNumber = "";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMdd");
        LocalDateTime now = LocalDateTime.now();

        if (upcCode.length() == 1){
            upcNumber = "888888"+ dtf.format(now)+"0"+ upcCode;
        }else{
            upcNumber = "888888"+ dtf.format(now)+ upcCode;
        }

        home.populateUPCField(upcNumber);

        home.clickOnAddUPCToShipmentButton();

        System.out.println(upcNumber);

        home.clickOnCompleteShipmentButton();



    }

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
