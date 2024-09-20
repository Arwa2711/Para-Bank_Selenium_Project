package iti_Parabank.Pages;


import iti_Parabank.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(name= "username")
    WebElement usernameField;

    @FindBy(name= "password")
    WebElement passwordField;

    @FindBy(css= "input.button")
    WebElement loginButton;

    @FindBy(xpath= "//div/h1[1]")
    WebElement inHomeField;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String login(String username, String password) {

        waitForElementVisibility(usernameField);

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        if (inHomeField.isDisplayed()) {
            return "Success";
        } else {
            return "fail";
        }
    }


}
