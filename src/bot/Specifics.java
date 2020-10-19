package bot;
import java.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class Specifics {

	public static void Look(WebDriver chrome) {

		WebElement PickASizeTester = chrome.findElement(By.cssSelector("#buyTools > div.prl6-sm.prl0-lg > fieldset > div > div:nth-child(16)"));   //Picks a Size
		PickASizeTester.click();
		
		//Timers set so the "add to bag" registers before the page loads
		Timer TBC = new Timer();
		TBC.schedule(new TimerTask(){
			@Override
			public void run() {
				
				//Adds to bag
				WebElement AddtoCartTester = chrome.findElement(By.cssSelector("#floating-atc-wrapper > div > button.ncss-btn-primary-dark.btn-lg.css-y0myut.add-to-cart-btn")); 
				AddtoCartTester.click();
				
			}
			
			
		}, 4000);

	
		Timer TBC1 = new Timer();
		TBC1.schedule(new TimerTask(){
			@Override
			public void run() {
				
				//Clicks to cart
				WebElement ClickToCartTester = chrome.findElement(By.cssSelector("#nav-cart > a > div > span"));	
				ClickToCartTester.click();
				
			}
			
		}, 6000);
		
	
		Timer TBC2 = new Timer();
		TBC2.schedule(new TimerTask(){
			@Override
			public void run() {
				//Goest To Checkout
				WebElement ClickToCheckOutTester =chrome.findElement(By.cssSelector("#maincontent > div.ncss-row.u-full-width.css-1ykg761 > div.ncss-col-sm-12.ncss-col-lg-4.css-131o3mp > aside > div.ncss-row.css-1eovdr8 > div > button.css-1lkcnio.e16pwdtm0"));
				ClickToCheckOutTester.click();
				
			}
			
		}, 8000);
		
		
		Timer TBC3= new Timer();
		TBC3.schedule(new TimerTask(){
			@Override
			public void run() {
				
				//chooses GuestCheckout
				WebElement GuestCheckout =chrome.findElement(By.cssSelector("#qa-guest-checkout"));
				GuestCheckout.click();

				
			}
			
		}, 10000);
		
		Timer TBC4= new Timer();
				TBC4.schedule(new TimerTask(){
					@Override
					public void run() {

						//All User dependent 
						
						WebElement FirstNameCheckout = chrome.findElement(By.cssSelector("#firstName"));
						FirstNameCheckout.click();
						FirstNameCheckout.sendKeys("Fake Name");
						
						WebElement LastNameCheckout = chrome.findElement(By.cssSelector("#lastName"));
						LastNameCheckout.click();
						LastNameCheckout.sendKeys("McNotARealPerson");
						
						WebElement AddressCheckout = chrome.findElement(By.cssSelector("#search-address-input"));
						AddressCheckout.click();
						AddressCheckout.sendKeys("P Sherman 42 Wallaby Way Sydney");
						
						WebElement EmailCheckout = chrome.findElement(By.cssSelector("#email"));
						EmailCheckout.click();
						EmailCheckout.sendKeys("FakeEmailDumDum@gmail.com");
						
						WebElement PhoneNumber = chrome.findElement(By.cssSelector("#phoneNumber"));
						PhoneNumber.click();
						PhoneNumber.sendKeys("(420) 133-7690");
						
						// Confirms address 
						AddressCheckout.click();
						AddressCheckout.sendKeys(Keys.ENTER); 
						
						WebElement SaveAndCont = chrome.findElement(By.cssSelector("#shipping > div > div.ncss-container.pt5-sm > form > div > div > div > div.ncss-col-sm-12.mt2-sm.va-sm-t.ta-sm-r > button"));
						SaveAndCont.click();
						SaveAndCont.click();
						
						Timer TBC5 = new Timer();
						TBC5.schedule(new TimerTask(){
							@Override
							public void run() {
								
								//Hits continue payment, takes a second as to not overload the page
								WebElement ContinueToPayment = chrome.findElement(By.cssSelector("#shipping > div > div.ncss-row > div > button"));
								ContinueToPayment.click();
								
								//Scrolls to gather the Selectors below
								JavascriptExecutor js = (JavascriptExecutor)chrome;
								js.executeScript("window.scrollBy(0,250)");
								
								Timer TBC6 = new Timer();
								TBC6.schedule(new TimerTask(){
									@Override
									public void run() {
										
										

										//Inputs Cardinfo
										WebElement CardNumberInfo = chrome.findElement(By.cssSelector("#creditCardNumber"));
										CardNumberInfo.click();
										CardNumberInfo.sendKeys("01010101010101010");
										//Inputs Expiration Date
										WebElement ExpirationDateInfo = chrome.findElement(By.cssSelector("#expirationDate"));
										ExpirationDateInfo.click();
										ExpirationDateInfo.sendKeys("0101");
										//Inputs Secutity Code
										WebElement SecurityCode = chrome.findElement(By.cssSelector("#cvNumber"));
										SecurityCode.click();
										SecurityCode.sendKeys("010");
										
										WebElement Finish = chrome.findElement(By.cssSelector(""));
										Finish.click();
										
										
									}
									
								}, 12000);					
							}
							
						}, 6000);	
					}
					
				}, 12000);
		



				

				
	}
}

