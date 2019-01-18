import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intake{
    //An Attribute
    WebDriver driver;

    //URL
    String url = "https://intake-stage.gladson.com/";

    //Locator variable with their locator path

    //Log In Button - intake (1)
    By locatorHomeButton = By.cssSelector("#root > div > div.home.container.txt-center > button");



    //Each page should have a driver as an argument
    public Intake(WebDriver driver){
        this.driver = driver;
    }

    //Load the homepage
    public void loadIntake(){
        //Intake URL
        driver.get(url);
    }

    //Maximize the homepage web
    public void maximizePage(){
        driver.manage().window().maximize();
    }

    //Click on button Home Intake
    public void loginIntake() throws Exception{

        //Log In Button - intake (1)
        WebElement element = driver.findElement(locatorHomeButton);

        //click the button (1)
        element.click();

        //wait for 3.5 seconds
        Thread.sleep(4000);
    }

    //create a new obj from InterLogin - Gladson button
    public void clickGlad() {
        InterLogin clickGladson = new InterLogin(driver);
        clickGladson.clickToLogin();
    }


    //Create an new obj from Login
    public void enterCredentials(String user, String pass) throws Exception{

        Login log = new Login(driver);

        log.fillUserName(user);
        log.fillPassword(pass);
        log.clickButtonLogin();
    }

    //*************** SHIPMENTS ****************

    //Click on Shipments Module button
    public void goToShipments(){
        Shipments ship = new Shipments(driver);
        ship.clickShipmentModuleButton();
    }

    // Clicking on Create a Shipment button
    public void createAnEmptyShipments(){
        Shipments ship = new Shipments(driver);
        ship.createAnEmptyShipment();
    }


    public void selectCarrierDropdown(String carrier){
        Shipments ship = new Shipments(driver);
        ship.selectCarrier(carrier);
    }

    public void selectSupplierDropdown(String supplier){
        Shipments ship = new Shipments(driver);
        ship.selectSupplier(supplier);
    }

    public void selectClientDropdown(String client){
        Shipments ship = new Shipments(driver);
        ship.selectClient(client);
    }

    public void selectReceiverDropdown(String receiver){
        Shipments ship = new Shipments(driver);
        ship.selectReceiver(receiver);
    }

    public void populateTurnAroundDays(String days){
        Shipments ship = new Shipments(driver);
        ship.enterTurnAroundDays(days);
    }

    public void clickOnShipmentEditorSaveButton(){
        Shipments ship = new Shipments(driver);
        ship.clickSaveShipmentButton();
    }

    public void clickPlusLocationField(){
        Shipments ship = new Shipments(driver);
        ship.clickLocation();
    }

    public void populateUPCField(String upcNumber){
        Shipments ship = new Shipments(driver);
        ship.enterUPCnumber(upcNumber);
    }

    public void clickOnAddUPCToShipmentButton(){
        Shipments ship = new Shipments(driver);
        ship.addUPCtoShipment();
    }

    public void clickOnCompleteShipmentButton(){
        Shipments ship = new Shipments(driver);
        ship.clickCompleteShipmentButton();
    }





    //*************** SCHEDULING ****************




    //*************** MEASURING ****************




    //*************** PHOTOGRAPHY ****************




    //*************** CODING ****************





    //*************** CODING-QA ****************




    //*************** IMAGE EDITING ****************





    //*************** IMAGE EDITING-QA ****************






    //*************** FINAL QA ****************





    //*******************  JUMPING DIFFERENT MODUL - Click on Scheduling Module button *************************
    public void goToScheduling(){
        Scheduling sched = new Scheduling(driver);
        sched.clickSchedulingModuleButton();
    }

    //Click on Measuring Module Button
    public void goToMeasuring(){
        Measuring measu = new Measuring(driver);
        measu.clickMeasuringModuleButton();
    }

    //Click on Photography Module button
    public void goToPhotography(){
        Photography photo = new Photography(driver);
        photo.clickPhotographyModuleButton();
    }

    //Click on Coding Module button
    public void goToCoding(){
        Coding code = new Coding(driver);
        code.clickCodingModuleButton();
    }

    //Click on CodingQA Module Button
    public void goToCodingQA(){
        CodingQA codeQA = new CodingQA(driver);
        codeQA.clickCodingQAModuleButton();
    }

    //Click on Image Editing Module Button
    public void goToImageEditing(){
        ImageEditing imageEdit = new ImageEditing(driver);
        imageEdit.clickImageEditingButton();
    }

    //Click on Image Editing QA Module Button
    public void goToImageEditingQA(){
        ImageEditingQA imagEditQA = new ImageEditingQA(driver);
        imagEditQA.clickImageEditingQAButton();
    }

    public void goToBinMover(){
        BinMover binmove = new BinMover(driver);
        binmove.clickBinMoverButton();
    }

    public void goToFinalQA(){
        FinalQA fin = new FinalQA(driver);
        fin.clickFinalQAModuleButton();
    }

}