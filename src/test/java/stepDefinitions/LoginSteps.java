package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import utils.ConfigurationReader;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

//    WebDriver driver = null;
//    LoginPage login;
//    HomePage home;

//    @Before
//    public void browserSetup(){
//        System.setProperty("webdriver.chrome.driver", "/Users/hakancetin/IdeaProjects/SampleCucumberProject/src/test/java/drivers/chromedriver");
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//    }
//    @After
//    public void tearDown() throws InterruptedException {
//        driver.close();
//        driver.quit();
//    }
    @Given("user is on login page")
    public void user_is_on_login_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }
    @When("^user enters (.*) and (.*)$")
    public void userEntersUsernameAndPasswords(String username, String password) throws InterruptedException {
        LoginPage login = new LoginPage();
        login.enterUsername(username);
        Thread.sleep(2000);
        login.enterPassword(password);
        Thread.sleep(2000);

    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.clickOnLogin();
        Thread.sleep(2000);


    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        HomePage home = new HomePage();
        home.checkLogoutIsDisplayed();
        Thread.sleep(2000);


    }

}
