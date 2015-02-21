package mobile.test;



import java.io.File;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

  public WebDriver driver = null;

  @BeforeMethod
  public void setUp() throws Exception {

    // set up appium

	 
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("device", "iPhone");
	  capabilities.setCapability("udid", "6a13dd1ae10a2601a27dbbe03b1bfe4d8f4bbce");
	  capabilities.setCapability("bundleid", "com.pkt.");
	 // capabilities.setCapability("ipa", "MyiOSApp.ipa");
	  driver = new RemoteWebDriver( new URL("http://192.168.2.2"), capabilities);

    System.out.println("App launched");

  }

  @AfterMethod
  public void tearDown() throws Exception {
    driver.quit();
  }

  @Test
  public void testCases() throws InterruptedException {

    String myname = "Smriti";

    driver.findElement(By.name("Add")).click();
    driver.findElement(By.xpath("//textfield[1]")).sendKeys(myname);
    driver.findElement(By.name("Save")).click();

    Thread.sleep(5000);

    // write all your tests here

  }
}