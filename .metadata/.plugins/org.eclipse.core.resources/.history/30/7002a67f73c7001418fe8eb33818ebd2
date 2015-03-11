package mobile.test;

import java.net.URL;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumiPhoneWebDriverDemo {

    private String baseUrl;
    private WebDriver driver;

    @Before
    public void setup() throws Exception
    {

        WebDriver driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability("", "");
        //cap.setCapability("browsername", "");
        //cap.setCapability("os", "iOS 6.1");
        cap.setCapability("device", "iPhone Simulator");
        cap.setCapability("app", "safari");

        driver = new RemoteWebDriver(new URL("http://192.168.2.16:4723/wd/hub"), cap);

    baseUrl = "http://www.cnn.com";

    }   

    @After
    public void tearDown() throws Exception
    {

    driver.quit();

    }


    @Test
    public void test_searchWorks() throws Exception
    {
        this.driver.get(baseUrl);

        driver.quit();
    }

  }