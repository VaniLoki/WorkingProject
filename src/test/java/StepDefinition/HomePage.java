package StepDefinition;

import java.io.IOException;
import java.util.List;

import Base.BaseClass;
import PageObjects.HomePageObject;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class HomePage extends BaseClass {

	HomePageObject homePageObject;

	public void setUp() throws IOException {
		initialization();
		homePageObject = new HomePageObject();
	}

	@Then("User clicks on the below links present on home page")
	public void user_clicks_on_the_below_links_present_on_home_page(DataTable table) throws InterruptedException {

		 
		List<String> Links = table.asList();
		String linksData=Links.get(0);
		Thread.sleep(8000);
 
		homePageObject.validateLinksOnHomePage(linksData);

	}

}
