package step_definations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utlity.VideoRecorderUtil;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    private VideoRecorderUtil videoRecorder = new VideoRecorderUtil();

    static Scenario scenario;
    private String videoFileName;



    @Before(order = 1)
    public void startVideoRecording(Scenario scenario) {
        try {
            videoFileName = scenario.getName().replaceAll(" ", "_") + "";
            videoRecorder.startRecording(videoFileName);
        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }
    }

    @Before(order = 0)
    public void openBrowser(Scenario scenario) throws MalformedURLException {
        Hooks.scenario=scenario;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//driver//chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);


    }

    @After(order = 0)
    public void quit(Scenario scenario) throws Exception {

        driver.quit();

    }


    @After(order = 3)

    public void embedScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            try {

                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                //scenario.embed(screenshot, "image/png");

            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        } else {
            try {

                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                //scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }


        }


    }
    //video recording
    @After(order = 2)
    public void stopVideoRecording() throws IOException {
        try {
            videoRecorder.stopRecording();
        }catch (Exception e){}
    }


}

