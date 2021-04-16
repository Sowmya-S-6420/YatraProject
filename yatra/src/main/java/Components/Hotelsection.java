package Components;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Hotelsection {
	
	By Destination = By.id("BE_hotel_destination_city");
	By Search_button = By.id("BE_hotel_htsearch_btn");
	
	WebDriver driver;
	public Hotelsection(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is for choosing destination
	 * @return Destination place is chosen
	 */
	public void destination() {
		driver.findElement(Destination).click();
		//driver.findElement(Destination).sendKeys("Goa"); 
		//driver.findElement(Destination).sendKeys(Keys.ENTER);		
		    try {
		Thread.sleep(1000);
		}
		    catch (InterruptedException ie) {
		    	Thread.currentThread().interrupt();
		    }
		}
	
	/**
	 * This method is for hotel search process
	 * @return Hotel search will get started for the destination
	 */
	public void search_Hotel(){
		
		driver.findElement(Search_button).click();
		System.out.println("Search started");
		
		try {
			Thread.sleep(1000);
			}
	    catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
			}

	}
}
