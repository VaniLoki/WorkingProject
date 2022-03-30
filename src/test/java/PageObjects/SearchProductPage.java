package PageObjects;

 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchProductPage {
	

	WebDriver driver;
 

    private By searchLocatortext=By.xpath("//div[@class='nav-search-field ']/input");
    private By findLaptopbaglocator=By.xpath("//div[@id='nav-flyout-searchAjax']/div/div/div/div");
    
    public SearchProductPage(WebDriver driver) {
    	this.driver=driver;
    }
    
//accessing the locator cretae public methods
    
    public void EnterSearchText(String text) {
    	driver.findElement(searchLocatortext).sendKeys(text);
    	
    }
    
    public void SearchAutoSuggestiveDropdown(String text) {
	  List<WebElement>suggestiveDropdown=driver.findElements(findLaptopbaglocator);
		System.out.println(suggestiveDropdown.size());
		for(WebElement F:suggestiveDropdown) {
    		if(F.getText().contains("bag")) {
    			F.getText();
    			System.out.println(F.getText());
    			F.click();
    			break;
    		}
      }
		
   }
       
}

