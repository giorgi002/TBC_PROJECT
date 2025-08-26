package ge.tbc.testautomation.runners;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    protected ChromeDriver driver;

    @BeforeMethod
    @Parameters({"mobile"})
    public void setUp(@Optional("false") String mobile) {
        Configuration.timeout = 10000;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");

        if (mobile.equalsIgnoreCase("true")) {
            options.addArguments("window-size=375,667");
        } else {
            options.addArguments("start-maximized");
        }

        driver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(driver);

        open("https://www.tbcbank.ge");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
