package Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	By logo_yatra = By.xpath("//div[@class='header-left-menu ftL']//i[@class='ico-newHeaderLogo']");
	By hotel_tab = By.xpath("//*[@id=\"booking_engine_hotels\"]");
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is to verify yatra home logo is displayed or not
	 * @return returns whether logo is displayed or not
	 */
	
	public boolean verifyYatraLogo() {
		System.out.println("Gonna to verify");
		boolean verify = driver.findElement(logo_yatra).isDisplayed();
		return verify;
	}
	
	/**
	 * This method is to navigate to hotels tab
	 * @return hotel tab will appear
	 */
	
	public void navigateToHotelsSection() {
		driver.findElement(hotel_tab).click();
		System.out.println("Navigated");	

	}

}
