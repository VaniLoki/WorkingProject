package StepDefinition;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class searchProduct {
	
 
	static WebDriver driver;

	static String searchLocatortext= "//div[@class='nav-search-field ']/input";
    static String findLaptopbaglocator="//div[@id='nav-flyout-searchAjax']/div/div/div/div"; 
    
    
    Actions actions;
    PageObjects.SearchProductPage SearchProductPage =null;
    
	@Given("Launch Amazon Website")
	public void launch_amazon_website() {
		 System.setProperty("webdriver.chrome.driver","c:/chromedriver_win32/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		  
		 
	  }
	@When("User focus on Search textbox")
	public void user_focus_on_search_textbox() {
		actions=new Actions(driver);
		WebElement xpathSearch=driver.findElement(By.xpath("//div[@class='nav-search-field ']/input"));
		 actions.moveToElement(xpathSearch).click().build().perform();
 
	}

	@When("User enters {string} in search Field")
	public void user_enters_in_search_field(String productName) throws InterruptedException {
		PageObjects.SearchProductPage S=new PageObjects.SearchProductPage(driver);
		S.EnterSearchText(productName);
//		WebElement searchText=driver.findElement(By.xpath(searchLocatortext));
//  	    searchText.sendKeys(productName);
  	    Thread.sleep(3000);
	}

	@Then("User selects {string} from autosuggestivedropdown")
	public void user_selects_from_autosuggestivedropdown(String specificProduct) throws InterruptedException {
		
		PageObjects.SearchProductPage S=new PageObjects.SearchProductPage(driver);
		S.SearchAutoSuggestiveDropdown(specificProduct);
		Thread.sleep(3000);
//		WebElement searchText=driver.findE
//		 List<WebElement> suggestiveDropdown_1=driver.findElements(By.xpath(findLaptopbaglocator));
//	 		System.out.println(suggestiveDropdown_1.size());
//	 		for(WebElement F:suggestiveDropdown_1) {
//	     		if(F.getText().contains("bag")) {
//	     			
//	     			F.getText();
//	     			System.out.println(F.getText());
//	     			F.click();
//	     			System.out.println("Clicked");
//	     			break;
//	     		}
//	     }
	     
	}
	@Then("User clicks on {string} from the dropdown")
	public void user_clicks_on_from_the_dropdown(String laptopBrand) throws InterruptedException {
		Thread.sleep(8000);
		 String selectBrand ="//a[contains(@href,'"+laptopBrand+"')]";
		 driver.findElement(By.xpath(selectBrand)).click();
		 
    		
	}
}
