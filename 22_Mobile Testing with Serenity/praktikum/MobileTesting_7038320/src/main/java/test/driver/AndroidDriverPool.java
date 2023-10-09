package test.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverPool {

     public static AndroidDriver create(){
         AndroidDriver<AndroidElement> driver = null;

         DesiredCapabilities caps = new DesiredCapabilities();

         String appiumUrl = "http://127.0.0.1;4723/wd/hub";

         caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
         caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "29.0");
         caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
         caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+ File.separator + "app/app.apk");

         try{
             driver = new AndroidDriver<>(new URL(appiumUrl), caps);
         } catch (MalformedURLException e) {
             e.printStackTrace();
         }
         return driver;
     }
}
