package Components;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	By Checkbox = By.xpath("//*[@id=\"mega-filter-open-close-price\"]/div/div/div/div/div[1]/ul/li[2]/label/span[1]/i");
	By Rating = By.xpath("//*[@id=\"mega-filter-open-close-price\"]/div/div/div/div/div[1]/div/ul/li[3]/label");
	WebDriver driver;
	public BookHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method is used to select the minimum price
	 * @return Based on price selected, hotel list will repopulated
	 */
	
	public void selectMinimumprice() throws AWTException{
		System.out.println("im on new page");
		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Checkbox).click();
		System.out.println("Checkbox selected");
		try {
			Thread.sleep(1000);
			}
	    catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
			}
	}
		
	
	/**
	 * This method is used to select the maximum star rating
	 * @return Based on rating selected, hotel list will repopulated
	 */

	public void selectMaximumRating(){
		driver.findElement(Rating).click();
		System.out.println("Rating selected");
		try {
			Thread.sleep(1000);
			}
	    catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
			}
	}
	
	/**
	 * This method selects the first room displayed
	 * @return First room on the list is selected for room booking
	 */

	public void selectFirstRoomDisplayed(){
		try {
			Thread.sleep(1000);
			}
	    catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
			}
		driver.findElement(By.cssSelector("#result0 > div.result-details-wrapper.full > div.result-details-right.show-gt-768.pr > div")).click();
		System.out.println("Room selected");
	}
	
	
}

