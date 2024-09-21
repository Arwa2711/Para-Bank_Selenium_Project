package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import iti_Parabank.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    WebDriver driver;

    SoftAssert softAssert = new SoftAssert();
    Assertion hardAssert = new Assertion();
    String baseurl = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";
    @BeforeTest
    public void beforeTest(){

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window(). maximize();
        driver.navigate().to(baseurl);

    }
}
