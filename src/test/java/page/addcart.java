package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclss.Main;

public class addcart extends Main {

	public void add_item_into_the_cart() {
		
		WebElement click = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		
		clickOnelement(click);
		
//		 String st = driver.getTitle();
//		 
//		 assertEquals(st,"title");
		
		
	}
	
	public void validate_added_item_into_cart() {
		
		
		
			}
	
}
