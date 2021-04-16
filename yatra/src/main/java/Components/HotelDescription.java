package Components;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelDescription {
	
	By choose_room = By.xpath("//*[@id=\"choose-room-disable\"]");
	By book_room = By.xpath("//*[@id=\"roomWrapper0001015657\"]/div[2]/div[5]/button");
	WebDriver driver;
	public HotelDescription(WebDriver driver) {
		this.driver=driver;
	}
	
	/**
	 * This method shows the brief description about the room and is used to book the room
	 * @return Room is booked 
	 */

	
public void booksRoom() throws AWTException{
	String mainwindow=driver.getWindowHandle();
	Set<String> handles=driver.getWindowHandles();
	for(String handle:handles) 
	{
		if(!handle.equals(mainwindow))
		{
			driver.switchTo().window(handle);
			Robot robot = new Robot();
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			driver.findElement(choose_room).click();
			try {
				Thread.sleep(1000);
				}
		    catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
				}
			
			driver.findElement(book_room).click();
			
			try {
				Thread.sleep(1000);
				}
		    catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
				}
			System.out.println("Almost Booked");
		} 
		
}
	
}
	
	


}
