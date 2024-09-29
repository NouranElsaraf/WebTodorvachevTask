package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    private final By testScenarioLink = By.cssSelector("li[id='menu-item-58'] a");


    public TestScenariosPage clickOnTestScenarioLink(){
        click(testScenarioLink , 3);
        return new TestScenariosPage(driver);
    }
}
