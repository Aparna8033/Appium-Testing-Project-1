package WebApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class NewTest {
  @Test
  public void f() throws MalformedURLException, InterruptedException {
	  DesiredCapabilities capability= new DesiredCapabilities();
      capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Aparna");
      capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
      capability.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
      AndroidDriver driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("https://account.magento.com/customer/account/login");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
      driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Aleha");
      driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("P");
      driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("AlehaSdet2020@gmail.com");
      driver.hideKeyboard();
      driver.findElement(By.xpath("//*[@id=\"company_type\"]/option[6]")).click();
      driver.findElement(By.xpath("//*[@id=\"individual_role\"]/option[3]")).click();
      driver.findElement(By.xpath("//*[@id=\"country\"]/option[228]")).click();
      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sdet2020Aleha");
      driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Sdet2020Aleha");
      driver.hideKeyboard();
      driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
      driver.findElement(By.xpath("//input[contains(@id,'agree_terms')]")).click();
      driver.findElement(By.xpath(" //button[@type='submit'][contains(.,'Save')]")).click();
      
      
      
      
  }
}
