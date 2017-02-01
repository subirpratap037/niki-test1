import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 3Embed on 2/1/2017.
 */
public class NikiChat
{
    AndroidDriver driver;
    @BeforeClass

    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName","Appium");
        //capabilities.setCapability("BROWSER_NAME","");
        capabilities.setCapability("platformVersion","4.4.2");
        capabilities.setCapability("deviceName","3embed Software");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app","C:\\Users\\3Embed\\Desktop\\app-niki-test.apk");
        capabilities.setCapability("appPackage","com.nikiapp");
        capabilities.setCapability("appActivity","com.nikiapp.ChatActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @Test
    public void StartChat()
    {
        System.out.println("Finding the element using the UIAutomator");
        System.out.println("Enter the userName and click on start chat");
        //here we will take the screen shot
    }

    @Test(dependsOnMethods = {"StartChat"})
    public void PrivateChat()
    {
        System.out.println("Finding the element using the UIAutomator");
        System.out.println("Enter the userid/channel name to initiate the chat");
    }

    @Test(dependsOnMethods = {"StartChat"})
    public void GroupChat()
    {
        System.out.println("Finding the element using the UIAutomator");
        System.out.println("Enter the userid/channel name to initiate the chat");
    }


    @AfterClass
    public void teardown()
    {
        driver.quit();
    }
}
