package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.MethodHandles;

public class RegisterFormPage extends MethodHandles {
    public RegisterFormPage(WebDriver driver) {
        super(driver);
    }

    Select select;


    private final By userIdInput = By.cssSelector("input[name='userid']");
    private final By passwordInput = By.cssSelector("input[name='passid']");
    private final By nameInput = By.cssSelector("input[name='username']");
    private final By AddressInput = By.cssSelector("input[name='address']");
    private final By countryInput = By.cssSelector("select[name='country']");
    private final By zipCodeInput = By.cssSelector("input[name='zip']");
    private final By emailInput = By.cssSelector("form[name='registration'] input[name='email']");
    private final By genderRadioBtn = By.cssSelector("input[value='Male']");
    private final By aboutInput = By.cssSelector("#desc");
    private final By registerBtn = By.cssSelector("input[value='REGISTER']");

    private final By RegistrationFormDisplayed = By.cssSelector("form[name='registration']");



    public boolean getAllElementsRegisterFormIsDisplayed(){
        return isDisplayed(RegistrationFormDisplayed , 3);
    }


    public void insertUserId(String userId){
        tabSendKeys(userIdInput , 3 , userId ,Keys.TAB);
    }

    public void insertPasswordInput(String password){
        tabSendKeys(passwordInput , 3 , password , Keys.TAB);
    }

    public void insertNameInput(String name){

        tabSendKeys(nameInput , 3 , name ,Keys.TAB );
    }

    public void insertAddressInput(String Address){

        tabSendKeys(AddressInput , 3 ,Address, Keys.TAB );
    }

    public void insertCountry(String country){
        select = new Select(driver.findElement(countryInput));
        select.selectByVisibleText(country);
    }

    public void insertZipCodeInput(String zipCode){

        tabSendKeys(zipCodeInput , 3 , zipCode, Keys.TAB );
    }

    public void insertEmailInput(String email){
        tabSendKeys(emailInput , 3 , email, Keys.TAB );
    }

    public void clickOnGenderRadioBtn(){

        click(genderRadioBtn , 3);
    }

    public void insertAboutInput(String about){

        tabSendKeys(aboutInput , 3 , about ,Keys.TAB );
    }

    public void clickOnRegisterBtn(){
        click(registerBtn , 3);
    }

    public boolean clickOnAlertButton(){
        acceptAlert();
        return false;
    }

    public boolean getRegisterUserCurrentUrl(){
        getCurrentUrl();
        return true;
    }


    public void registrationFormFeatureField(String userId , String password , String name , String Address
                                                    , String country ,String zipCode , String email , String about ){
        insertUserId(userId);
        insertPasswordInput(password);
        insertNameInput(name);
        insertAddressInput(Address);
        insertCountry(country);
        insertZipCodeInput(zipCode);
        insertEmailInput(email);
        clickOnGenderRadioBtn();
        insertAboutInput(about);
        clickOnRegisterBtn();
        clickOnAlertButton();

    }

    public void registrationFormFeatureSuccessful(String userId , String password , String name , String Address
                                                 ,String country ,String zipCode , String email , String about ){

        insertUserId(userId);
        insertPasswordInput(password);
        insertNameInput(name);
        insertAddressInput(Address);
        insertCountry(country);
        insertZipCodeInput(zipCode);
        insertEmailInput(email);
        clickOnGenderRadioBtn();
        insertAboutInput(about);
        clickOnRegisterBtn();
    }

}