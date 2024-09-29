package registerForm;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterFormPage;

import java.io.FileNotFoundException;

public class RegisterTests extends BaseTests {


    @Test(priority = 1)
    public void testRegisterFormElementsIsVisible(){

        Assert.assertTrue(homePage.clickOnTestScenarioLink().
                clickOnRegisterFormLink().
                getAllElementsRegisterFormIsDisplayed() , "All Registration Form Elements are displayed");

    }

    @Test(priority = 2)
    public void testRegisterFormWithInvalidData() throws FileNotFoundException {

        RegisterFormPage register = homePage.clickOnTestScenarioLink().clickOnRegisterFormLink();
        register.registrationFormFeatureField(dataModel().RegisterForm.InvalidCredentials.InvalidUserId.UserId
                ,dataModel().RegisterForm.ValidCredentials.Password
                ,dataModel().RegisterForm.ValidCredentials.Name
                ,dataModel().RegisterForm.ValidCredentials.Address
                ,dataModel().RegisterForm.ValidCredentials.Country
                ,dataModel().RegisterForm.ValidCredentials.ZIPCode
                ,dataModel().RegisterForm.InvalidCredentials.InvalidEmail.Email
                ,dataModel().RegisterForm.ValidCredentials.About);

        Assert.assertTrue(register.getRegisterUserCurrentUrl() , "https://testing.todorvachev.com/register-form/");

    }

    @Test(priority = 3)
    public void testRegisterFormWithValidData() throws FileNotFoundException {

        RegisterFormPage registerSuccess = homePage.clickOnTestScenarioLink().clickOnRegisterFormLink();
        registerSuccess.registrationFormFeatureSuccessful(dataModel().RegisterForm.ValidCredentials.UserId
                ,dataModel().RegisterForm.ValidCredentials.Password
                ,dataModel().RegisterForm.ValidCredentials.Name
                ,dataModel().RegisterForm.ValidCredentials.Address
                ,dataModel().RegisterForm.ValidCredentials.Country
                ,dataModel().RegisterForm.ValidCredentials.ZIPCode
                ,dataModel().RegisterForm.ValidCredentials.Email
                ,dataModel().RegisterForm.ValidCredentials.About);

        Assert.assertTrue(registerSuccess.getAllElementsRegisterFormIsDisplayed() , "All Registration Form Elements are displayed but it is Empty");
    }
}