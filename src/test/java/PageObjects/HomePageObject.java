package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

import junit.framework.Assert;

public class HomePageObject extends BaseClass {

	// Page Factory - OR:

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	WebElement amazonLogo;

	// Initializing the Page Objects:
	public HomePageObject()  {
		 
		PageFactory.initElements(driver, this);
		
	}

//
//	By hamburgerMenuLink = By.xpath("//a[@id='nav-hamburger-menu']");
//	By todaysDeal = By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']");
//	By customerService = By.xpath("//a[@data-csa-c-content-id='nav_cs_customerservice']");
//	By registry = By.xpath("//a[@data-csa-c-content-id='nav_cs_nav_cs_registry']");
//	By giftCard = By.xpath("//a[@data-csa-c-content-id='nav_cs_nav_cs_gc']");
//	By amazonLogo=By.xpath("//a[@id='nav-logo-sprites']");

	// Actions
	public void validateLinksOnHomePage(String text) {
     System.out.println("TEXT"+text);
		boolean b = false;
		switch (text.toLowerCase().trim()) {

		case "accounts and list link":
			b = amazonLogo.isDisplayed();
			break;

		/*
		 * case "Today's Deals": b = validateElementIsDisplayed(todaysDeal); break; case
		 * "Customer Service": b = validateElementIsDisplayed(customerService); break;
		 * case "Registry": b = validateElementIsDisplayed(registry); break; case
		 * "Gift Cards": b = validateElementIsDisplayed(giftCard); break;
		 */
		}

	}

}
