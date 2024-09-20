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


    @Test(priority = 0, description = "Login with empty user email and password")
    public void loginTestCase1(){
        loginPage.login("","");
    }

    @Test(priority = 1, description = "Login with valid user name and invalid password")
    public void loginTestCase2(){
        loginPage.login("arwa","27C5B@");
    }
    @Test(priority = 2, description = "Login with invalid user name and valid password")
    public void loginTestCase3(){
        loginPage.login("ar","27C5B@fLM67zt");
    }

    @Test(priority = 3, description = "Login with valid user name and valid password")
    public void loginTestCase4(){
        String actualResult = loginPage.login("arwa","27C5B@fLM67zt");
        hardAssert.assertEquals(actualResult,expectedResult);

    }
}

