package Components;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Travelsection {
	
	By Email = By.id("additionalContactEmail");
	By Mobile = By.id("additionalContactMobile");
	By FirstName = By.xpath("//*[@id=\"travellerf0\"]");
	By LastName = By.xpath("//*[@id=\"travellerl0\"]");
	
	WebDriver driver;
	public Travelsection(WebDriver driver) {
		this.driver=driver;
	}
	/**
	 * This method is for reviewing and fills the traveller details
	 * @return Selected room is reviewed once and traveller fills their basic details for proceeding further process
	 */
	public void fill_Section() throws AWTException{
		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Email).sendKeys("sowmyashanmugam64@gmail.com");
		driver.findElement(Mobile).sendKeys("6383349981");
		driver.findElement(FirstName).sendKeys("Sowmya");
		driver.findElement(LastName).sendKeys("S");
		System.out.println("Testcase executed successfully");
		
	}

}
