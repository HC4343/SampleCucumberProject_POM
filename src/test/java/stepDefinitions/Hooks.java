package stepDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.Driver;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
//        if(scenario.isFailed()){
//            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot,"image/png","screenshot");
//        }

        Driver.closeDriver();
    }
}
