package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class TestScenariosPage extends MethodHandles {
    public TestScenariosPage(WebDriver driver) {
        super(driver);
    }

    private final By registerFormLink = By.cssSelector("article[class='mh-loop-item mh-clearfix post-70 post type-post status-publish format-standard has-post-thumbnail hentry category-test-scenarios'] h3[class='entry-title mh-loop-title'] a");

    public RegisterFormPage clickOnRegisterFormLink(){
        click(registerFormLink , 3);
        return new RegisterFormPage(driver);
    }



}
