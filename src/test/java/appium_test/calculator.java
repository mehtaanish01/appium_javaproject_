package appium_test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class calculator {

	static AppiumDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			opencalcy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}

	}
	
	public static void opencalcy() throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Note 11");
		cap.setCapability("udid", "");
		cap.setCapability("platformName", "Android");
		//cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("uiautomator2ServerLaunchTimeout", "5000");
		cap.setCapability("platformVersion", "13.0.2");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, cap);
		
		System.out.println("Anish! swhatsapp started");
		
		WebElement  five = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout"));
		five.click();
	}

}
