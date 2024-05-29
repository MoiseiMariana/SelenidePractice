package utils.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void setUp() throws InterruptedException {
        Configuration.browser = "edge";
        Configuration.baseUrl = "https://demoblaze.com/";
        open("/");
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }
    @After
    public void tearDown(Scenario scenario) {
        sleep(2000);
        if (scenario.isFailed()){
            // attach screenshot
            final byte[] screenshot = ((TakesScreenshot) WebDriverRunner.getWebDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
        WebDriverRunner.getWebDriver().quit();

    }

}
//mvn clean test "-Dcucumber.filter.tags=@regressionPack"