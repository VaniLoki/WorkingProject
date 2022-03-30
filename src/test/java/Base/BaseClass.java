package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import Utlis.TestUtlisUI;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	 
	/*
	 * public BaseClass() { try { prop = new Properties(); FileInputStream ip = new
	 * FileInputStream(System.getProperty(
	 * "C:/Users/Admin/eclipse-workspace/com.learnautomation.cucumber/src/test/resources/config.properties"
	 * )); prop.load(ip); System.out.println("SSS"); } catch (FileNotFoundException
	 * e) { e.printStackTrace(); } catch (IOException e) { e.printStackTrace();
	 * System.out.println("FILE NOT FOUND"); } }
	 */
	

    protected  String browserName = LoadProperties().getProperty("browser");
    
	public Properties LoadProperties() {

		try {
			InputStream inStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			Properties prop = new Properties();
			prop.load(inStream);
			return prop;
		}catch(Exception e) {
			System.out.println("File not found exception thrown for config.properties file.");
			return null;
		}

	}

	public static void initialization() throws IOException {
		

		String browserName = prop.getProperty("browser");
          System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","c:/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","c:/chromedriver_win32/geckodriver.exe");
			driver = new FirefoxDriver();
		}

//		e_driver = new EventFiringWebDriver(driver);
//		// Now create object of EventListerHandler to register it with
//		// EventFiringWebDriver
//		eventListener = new WebDriverEventListener();
//		e_driver.register(eventListener);
//		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(TestUtlisUI.PAGE_LOAD_TIMEOUT,
		 * TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(TestUtlisUI.IMPLICIT_WAIT,
		 * TimeUnit.SECONDS);
		 */

		driver.get(prop.getProperty("url"));

	}

}
