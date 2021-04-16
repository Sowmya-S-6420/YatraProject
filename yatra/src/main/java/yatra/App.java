package yatra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Components.BookHotel;
import Components.Homepage;
import Components.HotelDescription;
import Components.Hotelsection;
import Components.Travelsection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class App {
	
	WebDriver driver;
	String homeurl = "https://www.yatra.com/";
	Homepage home;
	Hotelsection hotel;
	BookHotel book;
	HotelDescription desc;
	Travelsection travel;
	
	/**
	 * This method is used to launch browser and navigates to yatra home page
	 * @return chrome browser is launched and navigated to home page
	 */
	
	@Given("User navigates to the yatra home page")
	public void user_navigates_to_the_yatra_home_page() throws AWTException {
		
		System.out.println("Launching Chrome Browser");
		String driverPath = "C:\\Users\\sowmya\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homeurl);
		
		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
				
		

	}
	
	/**
	 * This method is to verify yatra home logo is displayed or not
	 * @return returns whether logo is displayed or not
	 */
	

	@Then("Verify the logo displayed")
	public void verify_the_logo_displayed() {
		home = new Homepage(driver);
		boolean outcome = home.verifyYatraLogo();
		Assert.assertTrue(outcome);
	}
	
	/**
	 * This method is to navigate to hotels tab
	 * @return hotel tab will appear
	 */
	

	@When("User navigates to hotel tab")
	public void user_navigates_to_hotel_tab() {
	   home.navigateToHotelsSection();
	}
	
	/**
	 * This method is for choosing destination
	 * @return Destination place is chosen
	 */
	
	@And("User selects the destination")
	public void user_selects_the_destination() {
		hotel = new Hotelsection(driver);
		hotel.destination();
	}
	
	/**
	 * This method is for hotel search process
	 * @return Hotel search will get started for the destination
	 */

	@Then("Should navigate to the list of hotels section")
	public void should_navigate_to_the_list_of_hotels_section() {
	    hotel.search_Hotel();
	      
	}
	
	/**
	 * This method is used to select the minimum price
	 * @return Based on price selected, hotel list will repopulated
	 */
	
	

	@When("User selects the minimum price")
	public void user_selects_the_minimum_price() throws AWTException{
	    book = new BookHotel(driver);
	    book.selectMinimumprice();
	    
	}
	
	/**
	 * This method is used to select the maximum star rating
	 * @return Based on rating selected, hotel list will repopulated
	 */
	
	@And("Selects the maximum star rating")
	public void selects_the_maximum_star_rating(){
	    book.selectMaximumRating();
	}
	
	/**
	 * This method selects the first room displayed
	 * @return First room on the list is selected for room booking
	 */

	@Then("User should be able to select the room for the first hotel displayed")
	public void user_should_be_able_to_select_the_room_for_the_first_hotel_displayed(){
		book.selectFirstRoomDisplayed();
	}
	
	/**
	 * This method shows the brief description about the room and is used to book the room
	 * @return Room is booked 
	 */

	@When("User clicks on choose room button")
	public void user_clicks_on_choose_room_button() throws AWTException{
	    desc = new HotelDescription(driver);
	    desc.booksRoom();
	}
	
	/**
	 * This method is for reviewing and fills the traveller details
	 * @return Selected room is reviewed once and traveller fills their basic details for proceeding further process
	 */

	@Then("User is navigated to review screen and fills traveller section")
	public void user_is_navigated_to_review_screen_and_fills_traveller_section() throws AWTException{
		travel = new Travelsection(driver);
		travel.fill_Section();
		try {
			Thread.sleep(5000);
			}
	    catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
			}
		
	}

}
