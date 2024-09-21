package tests;

import iti_Parabank.Pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        loginPage= new LoginPage(driver);
    }
    String expectedResult;

    @Test(priority = 0, description = "Login with empty user email and password")
    public void loginTestCase1(){
        expectedResult="Error!";
        String actualResult = loginPage.login("","");
        hardAssert.assertEquals(actualResult,expectedResult);
    }

    @Test(priority = 1, description = "Login with valid user name and invalid password")
    public void loginTestCase2(){
        expectedResult="Error!";
        String actualResult = loginPage.login("arwa","27C5B@");
        hardAssert.assertEquals(actualResult,expectedResult);
    }
    @Test(priority = 2, description = "Login with invalid user name and valid password")
    public void loginTestCase3(){
        expectedResult="Error!";
        String actualResult = loginPage.login("ar","27C5B@fLM67zt");
        hardAssert.assertEquals(actualResult,expectedResult);
    }

    @Test(priority = 3, description = "Login with valid user name and valid password")
    public void loginTestCase4(){
        expectedResult="Accounts Overview";

        String actualResult = loginPage.login("arwa","27C5B@fLM67zt");
        hardAssert.assertEquals(actualResult,expectedResult);

    }
}

